package com.shopflow.product.config;

import jakarta.annotation.PostConstruct;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class MongoCheck {

    private final MongoTemplate mongoTemplate;

    public MongoCheck(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @PostConstruct
    public void check() {
        System.out.println("=================================");
        System.out.println("DATABASE = " + mongoTemplate.getDb().getName());
        System.out.println("=================================");
    }
}