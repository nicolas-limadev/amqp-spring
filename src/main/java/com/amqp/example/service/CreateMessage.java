package com.amqp.example.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

import com.amqp.example.model.ProdutorMessage;

@Service
public class CreateMessage {
    private final AmqpTemplate amqpTemplate;

    public CreateMessage(AmqpTemplate amqpTemplate){
        this.amqpTemplate = amqpTemplate;
    }
    
    public void send(ProdutorMessage message){
        amqpTemplate.convertAndSend("my-Exchange", "my-route", message);
    }
}
