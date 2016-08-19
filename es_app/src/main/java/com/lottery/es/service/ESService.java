package com.lottery.es.service;

import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

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
}
