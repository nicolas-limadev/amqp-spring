package com.amqp.example.model;

import java.io.Serializable;

public class ProdutorMessage implements Serializable {
    private String message;

    public ProdutorMessage(){

    }

    public ProdutorMessage(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    
}
