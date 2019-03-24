package com.example.demo;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.Message;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@SpringBootApplication
@EnableBinding(Sink.class)
public class DemoSinkApplication {

	public static void main(String[] args) { SpringApplication.run(DemoSinkApplication.class, args); }
//
//	@Autowired
//	RestTemplateBuilder restTemplateBuilder;
//
//	URI uri;

	@StreamListener(Sink.INPUT)
	public void httpClient(Message<ObjectNode> message) {
//		RestTemplate restTemplate = restTemplateBuilder.build();
//		HttpHeaders httpHeaders = new HttpHeaders();
//		httpHeaders.add("User-Agent", "hogeclient");
//		httpHeaders.add("Content-Type", "application/json; charset=utf-8");
//
//		ObjectMapper mapper = new ObjectMapper();
//		ObjectNode objectNode = mapper.createObjectNode();
//		objectNode.put("message", message.getPayload());
//
//		try {
//			uri = new URI("http://172.28.128.4:8081");
//		} catch (URISyntaxException e) {
//			e.printStackTrace();
//		}
//
//		RequestEntity<?> requestEntity = new RequestEntity<>(httpHeaders, HttpMethod.POST, uri);
//
//		ResponseEntity<?> responseEntity = restTemplate.exchange(requestEntity, String.class);
//
//		return responseEntity;
		System.out.println(message.getPayload());
	}

}
