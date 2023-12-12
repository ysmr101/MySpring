package com.example.quotes.config;

import com.example.quotes.services.NorisImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.BeanProperty;

@Configuration
public class NorrisConfig {
    @Bean
    NorisImpl norris(){
        return new NorisImpl();
    }
}
