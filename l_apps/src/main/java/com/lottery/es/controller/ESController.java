package com.lottery.es.controller;

import java.util.List;
import java.util.Map;

import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.lottery.es.domain.Medicine;
import com.lottery.es.service.ESService;

@RestController
@RequestMapping("/api/es")
public class ESController {

	@Autowired
	private ESService esService;

	@Value("${elasticsearch.index.prod}")
	private String indexName;

	@Value("${elasticsearch.type.product}")
	private String typeName;

	/**
	 * 根据ID查询商品信息
	 * 
	 * @param prod
	 * @return
	 */
	@RequestMapping("/query/prod/{id}")
	public Map<String, Object> searchProd(@PathVariable("id") String prodId) {
		QueryBuilder qb = QueryBuilders.idsQuery(typeName).ids(prodId);
		return esService.search(qb, indexName, typeName);
	}

	@RequestMapping("/query/prod/jsonp/{id}")
	public String searchProdJsonp(@RequestParam(required = false) String fun, @PathVariable("id") String prodId) {
		QueryBuilder qb = QueryBuilders.idsQuery(typeName).ids(prodId);
		Map<String, Object> map = esService.search(qb, indexName, typeName);
		return fun.concat("(").concat(JSONObject.toJSONString(map)).concat(")");
	}

	@RequestMapping("/query/all")
	public List<Medicine> searchAll(Integer page, Integer rows, String sort, String order) {
		QueryBuilder qb = QueryBuilders.matchAllQuery();
		return esService.search(qb, indexName, typeName, page, rows, sort, order);
	}
}
