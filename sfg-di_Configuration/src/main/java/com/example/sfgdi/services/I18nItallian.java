package com.example.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
//@Profile({"IT","default"})
//@Service("i18nService")
public class I18nItallian implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Sfortunato";
    }
}
