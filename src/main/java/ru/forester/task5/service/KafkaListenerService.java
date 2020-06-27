package ru.forester.task5.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaListenerService {

    @KafkaListener(topics = "RAW_PAYMENTS")
    public void listen(String message) {
        System.out.println("Received Messasge in group foo: " + message);
    }
}
