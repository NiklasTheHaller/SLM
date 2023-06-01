package com.example.slm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SetMessage {


    @Autowired
    private Message message;

    /**
     * Set a message.
     *
     * @param  m new message
     *
     */
    @RequestMapping("api/message/set")
    public String setMsg(@RequestParam String m) {

        message.setMessage(m);
        return "ok";
    }


}
