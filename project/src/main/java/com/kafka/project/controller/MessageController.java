package com.kafka.project.controller;

import com.kafka.project.kafka.kafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {

    public MessageController(kafkaProducer kproducer) {
        this.kproducer = kproducer;
    }

    private kafkaProducer kproducer;

    //http:localhost:8080/api/v1/kafka/publish?message="hello world"
    @GetMapping("/publish")
    public ResponseEntity<String> publish(@RequestParam("message") String message){
        kproducer.sendMessage(message);
        return ResponseEntity.ok("Message sent to the topic");
    }
}
