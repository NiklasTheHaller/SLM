package com.example.slm;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
public class DisplayMessage {
    public String message = "Everything works as expected";
    /**

     Display a message.*
     message new message**/

    @RequestMapping("api/message")
    public String displayMsg() {

        return message;
    }
}
