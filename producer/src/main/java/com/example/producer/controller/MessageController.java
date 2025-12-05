package com.example.producer.controller;

import com.example.producer.service.MessageProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    private final MessageProducer producer;


    public MessageController(MessageProducer producer) {
        this.producer = producer;
    }


    @PostMapping("/produce")
    public ResponseEntity<String> produce(@RequestParam String message) {
        producer.send(message);
        return ResponseEntity.ok("Message sent: " + message);
    }
}
