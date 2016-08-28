package com.lottery.es.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.elasticsearch.action.bulk.BulkRequestBuilder;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.lottery.es.domain.Medicine;

@Service
public class ESService {

	@Autowired
	private Client client;

	public IndexResponse createIndexResponse(String indexName, String type, String json) {
		String id = JSONObject.parseObject(json).getString("id");
		IndexResponse response = this.client.prepareIndex(indexName, type).setId(id).setSource(json).execute()
				.actionGet();
		return response;
	}

	public List<Medicine> search(QueryBuilder queryBuilder, String indexName, String type, int page, int rows,
			String sort, String order) {
		SortOrder sortOrder = SortOrder.ASC;
		if (order.equals("desc"))
			sortOrder = SortOrder.DESC;
		else
			sortOrder = SortOrder.ASC;
		SearchResponse searchResponse = this.client.prepareSearch(indexName).setTypes(type).setQuery(queryBuilder)
				.addSort(sort, sortOrder).setFrom(page).setSize(rows).execute().actionGet();
		SearchHits hits = searchResponse.getHits();
		System.out.println(hits.getTotalHits());
		SearchHit[] searchHists = hits.getHits();
		List<Medicine> list = new ArrayList<Medicine>();
		if (searchHists.length > 0) {
			for (SearchHit hit : searchHists) {
				System.out.println(hit.getSource());
				Integer id = (Integer) hit.getSource().get("id");
				Integer participate = (Integer) hit.getSource().get("participate");
				Integer limitPerson = (Integer) hit.getSource().get("limitPerson");
				String productImg = (String) hit.getSource().get("productImg");
				Integer isNew = (Integer) hit.getSource().get("isNew");
				String categoryCode = (String) hit.getSource().get("categoryCode");
				Integer residuePerson = (Integer) hit.getSource().get("residuePerson");
				String productName = (String) hit.getSource().get("productName");
				Integer isShow = (Integer) hit.getSource().get("isShow");
				String typeCode = (String) hit.getSource().get("typeCode");
				Integer totalPerson = (Integer) hit.getSource().get("totalPerson");
				Integer periods = (Integer) hit.getSource().get("periods");
				Integer state = (Integer) hit.getSource().get("state");
				Double productPrice = (Double) hit.getSource().get("productPrice");
				Integer isHot = (Integer) hit.getSource().get("isHot");
				String createAt = (String) hit.getSource().get("createAt");
				Medicine m = new Medicine();
				m.setId(id);
				m.setParticipate(participate);
				m.setLimitPerson(limitPerson);
				m.setProductImg(productImg);
				m.setIsNew(isNew);
				m.setCategoryCode(categoryCode);
				m.setResiduePerson(residuePerson);
				m.setProductName(productName);
				m.setIsShow(isShow);
				m.setTypeCode(typeCode);
				m.setTotalPerson(totalPerson);
				m.setPeriods(periods);
				m.setState(state);
				m.setProductPrice(productPrice);
				m.setIsHot(isHot);
				m.setCreateAt(createAt);
				list.add(m);
			}
		}
		return list;
	}

	/**
	 * 删除索引
	 * 
	 * @param indexName
	 * @param type
	 * @param id
	 */
	public void delIndexResponse(String indexName, String type, String id) {
		this.client.prepareDelete(indexName, type, id).execute().actionGet();
	}

	/**
	 * 删除所有索引库
	 * 
	 * @param indexName
	 */
	public void delAllIndexResponse(String indexName) {
		this.client.admin().indices().prepareDelete(indexName).execute().actionGet();
	}

	public BulkResponse batchCreateIndex(String indexName, String type, List<Map<String, Object>> list) {
		this.delAllIndexResponse(indexName);
		BulkRequestBuilder bulkRequest = this.client.prepareBulk();
		BulkResponse bulkResponse = null;
		if (!list.isEmpty()) {
			for (Map<String, Object> map : list) {
				bulkResponse = bulkRequest
						.add(this.client.prepareIndex(indexName, type, map.get("id").toString()).setSource(map))
						.execute().actionGet();
				System.out.println(bulkResponse.buildFailureMessage());
				if (bulkResponse.hasFailures()) {
					return bulkResponse;
				}
			}
		}
		return bulkResponse;
	}
}
