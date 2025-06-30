package com.jsun.kafka.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/kafka")
public class ProducerController {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping("/send")
    public String sendMessage(@RequestParam String message) {
        kafkaTemplate.send("jtest", message);
        log.info("发送消息={}", message);
        return "发送消息=" + message;
    }
}
