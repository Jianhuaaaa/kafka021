package com.jsun.kafka.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
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
@Tag(name = "Kafka Producer Controller", description = "APIS for generating Kafka message for specific topic")
public class ProducerController {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping("/send")
    @Operation(
            summary = "Send Kafka message to topic 'jtest'",
            description = "Mock message",
            parameters = {
                    @Parameter(
                            name = "message",
                            description = "Content to send",
                            required = true,
                            example = "Hello there"
                    )
            },
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Send message to topic `jtest` successfully",
                            content = @Content(
                                    mediaType = "text/plain",
                                    schema = @Schema(implementation = String.class)
                            )
                    )
            }
    )
    public String sendMessage(@RequestParam String message) {
        kafkaTemplate.send("jtest", message);
        log.info("发送消息={}", message);
        return "发送消息=" + message;
    }
}
