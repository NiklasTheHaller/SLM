package com.example.slm;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SetMessage {
    public String message = "Everything works as expected";


    /**
     * Set a message.
     *
     * @param  m new message
     *
     */
    @RequestMapping("api/message/set")
    public String setMsg(@RequestParam String m) {

        message = m;
        return "ok";
    }

}
