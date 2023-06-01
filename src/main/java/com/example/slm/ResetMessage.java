package com.example.slm;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ResetMessage {
    public String message = "Everything works as expected";
    /**
     * Reset the message.
     *
     * message reset to default
     *
     */
    @RequestMapping("api/message/reset")
    public String resetMsg() {

        message = "Everything works as expected";
        return "ok";
    }

}
