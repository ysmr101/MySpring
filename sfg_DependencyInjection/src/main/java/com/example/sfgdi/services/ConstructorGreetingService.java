package com.example.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService {

    @Override
    public String sayGreeting() {
        return "Constructor ";
    }
}
