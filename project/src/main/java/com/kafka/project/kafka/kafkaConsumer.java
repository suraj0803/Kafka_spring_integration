package com.kafka.project.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class kafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(kafkaConsumer.class);

    @KafkaListener(topics="myTopic",groupId = "myGroup")
    public void consume(String message){
        LOGGER.info(String.format("Message received %s ",message));
    }
}
