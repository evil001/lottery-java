package com.lottery.es.cfg;

import java.net.InetAddress;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:elasticsearch.properties")
public class ElasticsearchConfiguration {

	@Value("${elasticsearch.http.host}")
	private String host;

	@Value("${elasticsearch.http.port}")
	private int port;

	@Bean
	public synchronized Client client() {
		Client client = null;
		try {
			client = TransportClient.builder().build()
					.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(host), port));
		} catch (Exception e) {
			client.close();
			e.printStackTrace();
		}
		return client;
	}

}