//package com.example.demo;
//
//import org.springframework.cloud.stream.annotation.EnableBinding;
//import org.springframework.cloud.stream.messaging.Source;
//import org.springframework.integration.support.MessageBuilder;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@EnableBinding(Source.class)
//public class Controller {
//
//    private final Source source;
//
//    public Controller(Source source) {
//        this.source = source;
//    }
//
//    @PostMapping
//    public void tweet(@RequestBody String tweet) {
//        source.output().send(MessageBuilder.withPayload(tweet).build());
//        System.out.println(tweet);
////        return tweet;
//    }
//
//    public static class Tweet {
//        public String text;
//
//        public void setText(String text) {
//            this.text = text;
//        }
//
//        public String getText() {
//            return this.text;
//        }
//    }
//}
