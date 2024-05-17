package com.example.lab2.controllers;


import com.example.lab2.services.IMessageService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Message", description = "The message api")
@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private IMessageService messageService;

    @GetMapping
    public String getMessages() {
        return messageService.formatMessage("Bright Edem Gawu");
    }
}
