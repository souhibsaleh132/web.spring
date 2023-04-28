package com.example.web;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.HtmlUtils;

@RestController
@MessageMapping

public class GreetingController {

    // the path will be /app/hello
    @MessageMapping("/hello")
    @SendTo("/topic/Greetings")// where the client will be connected
    public Greeting Greeting(HelloMessage message)
        {
              return new Greeting("Hello World !"+ HtmlUtils.htmlEscape(message.getName()));
        }
}
