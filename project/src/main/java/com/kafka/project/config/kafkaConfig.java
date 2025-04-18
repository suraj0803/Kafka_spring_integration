package com.kafka.project.config;

import org.apache.kafka.clients.KafkaClient;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class kafkaConfig {

    @Bean
    public NewTopic myTopic(){
        return TopicBuilder.name("myTopic").build();
    }
    @Bean
    public NewTopic myTopic1(){
        return TopicBuilder.name("myTopic1").build();
    }
}
