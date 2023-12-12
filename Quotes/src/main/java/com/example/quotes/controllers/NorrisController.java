package com.example.quotes.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import com.example.quotes.services.Noris;
@Controller
public class NorrisController {
    private final Noris noris;

    public NorrisController(Noris noris) {
        this.noris = noris;
    }
    public String quote(){
        return noris.getQuote();
    }
}
