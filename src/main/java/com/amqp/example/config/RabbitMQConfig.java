package com.amqp.example.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
    
    @Bean
    public Queue queue(){
        return new Queue("my-row");
    }

    @Bean
    public DirectExchange exchange(){
        return new DirectExchange("my-Exchange");
    }

    @Bean
    public Binding binding(Queue rowQueue, DirectExchange exchange){
        return BindingBuilder.bind(rowQueue).to(exchange).with("my-route");
    }
}
