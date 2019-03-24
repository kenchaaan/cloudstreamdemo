package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableBinding(Source.class)
public class DemoSourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSourceApplication.class, args);
    }

    private final Source source;

    public DemoSourceApplication(Source source) {
        this.source = source;
    }

    @PostMapping
    public void gateway(@RequestBody String message) {
        source.output().send(MessageBuilder.withPayload(message).build());
    }

}
