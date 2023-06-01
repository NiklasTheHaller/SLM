package com.example.slm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
class SlmApplicationTests {

    @Autowired
    private DisplayMessage displayMessage;

    @Autowired
    private SetMessage setMessage;

    @Autowired
    private ResetMessage resetMessage;

    @MockBean
    private Message message;

    @Test
    void displayMsgTest(){
        String expectedMessage = "Test Message";

        when(message.getMessage()).thenReturn(expectedMessage);

        String result = displayMessage.displayMsg();

        assertEquals( expectedMessage, result);
    }

    @Test
    void setMsgTest(){
        String newMessage = "Test Message";

        message.setMessage(newMessage);

        verify(message).setMessage(newMessage);

    }

    @Test
    void resetMsgTest(){
        resetMessage.resetMsg();

        verify(message).setMessage("Everything works as expected");

    }



}
