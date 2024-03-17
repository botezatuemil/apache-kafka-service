package com.kafka.kafka;

import org.apache.kafka.common.protocol.Message;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "mytopic", groupId = "groupId")
    void listener(MessageRequest data) {
        System.out.println("Listener received: " + data);
    }
}
