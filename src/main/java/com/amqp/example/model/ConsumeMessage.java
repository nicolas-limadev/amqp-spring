package com.amqp.example.model;

import java.io.Serializable;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumeMessage implements Serializable {
    

    @RabbitListener(queues = "my-row")
    public void consumeMessage(ProdutorMessage message){
        System.out.println("Message received: " + message.getMessage());
    }
}
