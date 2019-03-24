package com.example.demo;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.integration.annotation.Transformer;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

@SpringBootApplication
@EnableBinding(Processor.class)
@EnableIntegration
public class DemoProcessorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoProcessorApplication.class, args);
	}

	@Transformer(inputChannel = Processor.INPUT, outputChannel = Processor.OUTPUT)
	public Object transFormer(Message<String> message) {
		ObjectMapper objectMapper = new ObjectMapper();
		ObjectNode payload = objectMapper.createObjectNode();
		payload.put("message", message.getPayload());
		return MessageBuilder.withPayload(payload).build();
	}

}
