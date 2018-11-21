package com.demo.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class GreetingsServiceRestController {
    @GetMapping(path = "/hello")
    public String greetings() {
        return "Hello, it's " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("hh:mm"));
    }
}
