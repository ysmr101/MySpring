package com.example.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
//@Profile("EN")
//@Service("i18nService")
public class I18nEnglish implements GreetingService{

    @Override
    public String sayGreeting() {
        return "HEY--English";
    }
}
