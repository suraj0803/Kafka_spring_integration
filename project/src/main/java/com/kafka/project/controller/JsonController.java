package com.kafka.project.controller;

import com.kafka.project.kafka.JsonKafkaProducer;
import com.kafka.project.payload.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonController {

    public JsonController(JsonKafkaProducer jsonKafkaProducer) {
        this.jsonKafkaProducer = jsonKafkaProducer;
    }

    private JsonKafkaProducer jsonKafkaProducer;

    @PostMapping("/publish")
    public ResponseEntity<String> publish(User user){
        jsonKafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Message published successfully");
    }
}
