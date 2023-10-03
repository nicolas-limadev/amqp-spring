package com.amqp.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.amqp.example.model.ProdutorMessage;
import com.amqp.example.service.CreateMessage;

@SpringBootApplication
public class AmqpSpringApplication implements CommandLineRunner{

	@Autowired
	private CreateMessage createMessage;

	public static void main(String[] args) {
		SpringApplication.run(AmqpSpringApplication.class, args);

	}
	
	@Override
	public void run(String... args) throws Exception {

		ProdutorMessage message = new ProdutorMessage("Hello World");
		createMessage.send(message);
	}

	
}
