package com.demo.controller;


import com.demo.config.MessageUtils;
import com.demo.constant.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class exampleController {

    @Autowired
    private MessageUtils messageUtils;
    @GetMapping("/hello")
    public String hello() {

        System.out.println(messageUtils.populate(Message.HELLO.getMessage()));
        return messageUtils.populate(Message.HELLO.getMessage());
    }

    @GetMapping("/bye")
    public String bye() {
        System.out.println(messageUtils.populate(Message.BYE.getMessage()));
        return messageUtils.populate(Message.BYE.getMessage());
    }
}

