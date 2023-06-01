package com.example.slm;

import org.springframework.stereotype.Service;

@Service
public class Message {

    private String message = "Everything works as expected";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
