package com.example.lab2.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MessageService implements IMessageService {
    @Override
    public String formatMessage(String message) {
        return "Hello : " + message;
    }
}
