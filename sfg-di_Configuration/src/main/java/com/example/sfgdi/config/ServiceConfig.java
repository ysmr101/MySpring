package com.example.sfgdi.config;


import com.example.sfgdi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class ServiceConfig {
    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }
    @Bean
    SetterGreetingService setterGreetingService(){
        return new SetterGreetingService();
    }@Bean
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }
    @Profile("EN")
    @Bean
    I18nEnglish i18nEnglish(){
        return new I18nEnglish();
    }
    @Profile({"IT","default"})
    @Bean
    I18nItallian i18nItallian(){
        return new I18nItallian();
    }
}
