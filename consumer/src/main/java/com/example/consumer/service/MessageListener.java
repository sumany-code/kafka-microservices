package com.example.consumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageListener {
    @KafkaListener(topics = "demo-topic", groupId = "my-consumer-group")
    public void listen(String message) {
        System.out.println("Consumed message: " + message);
    }
}
