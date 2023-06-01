package com.example.slm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DisplayMessage {

    @Autowired
    private Message message;

    /**
     * Display a message.*
     * message new message
     **/

    @RequestMapping("api/message")
    public String displayMsg() {

        return message.getMessage();
    }

}