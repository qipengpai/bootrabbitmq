package com.qpp.bootrabbitmq.controller;

import com.qpp.bootrabbitmq.operation.CustomMessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitTest {
    @Autowired
    private CustomMessageSender customMessageSender;

    @GetMapping("/hello/{hello}")
    public void hello(@PathVariable("hello")String hello) {
        customMessageSender.sendMessage2(hello);
    }
}
