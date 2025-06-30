package com.jsun.kafka.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ConsumerListener {

    @KafkaListener(topics = "jtest", groupId = "jtest-group")
    public void listen(String message) {
        log.info("接收消息={}", message);
    }
}
