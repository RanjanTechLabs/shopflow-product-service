package com.shopflow.product.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProductEventProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public ProductEventProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendEvent(String message) {
        kafkaTemplate.send("product-created", message);
    }
}
