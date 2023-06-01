package com.example.slm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ResetMessage {

    @Autowired
    private Message message;

    /**
     * Reset the message.
     *
     * message reset to default
     *
     */
    @RequestMapping("api/message/reset")
    public String resetMsg() {

        message.setMessage("Everything works as expected");
        return "ok";
    }

}
