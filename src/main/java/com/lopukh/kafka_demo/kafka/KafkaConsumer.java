package com.lopukh.kafka_demo.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class KafkaConsumer {

    @KafkaListener(topics = "kafka_test", groupId = "my_consumer")
    public void listen(String message){
        System.out.println("Received message: " + message);
    }
}
