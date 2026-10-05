package com.shopflow.product.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ProductEventConsumer {

    @KafkaListener(
        topics = "order-created",
        groupId = "product-service-group"
    )
    public void consume(String message) {
        System.out.println("[Kafka] product-service received: " + message);
    }
}
