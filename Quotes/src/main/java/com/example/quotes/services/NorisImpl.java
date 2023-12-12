package com.example.quotes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;


public class NorisImpl implements Noris {

    @Override
    public String getQuote() {
        ChuckNorrisQuotes c = new ChuckNorrisQuotes();
        return c.getRandomQuote();
    }
}
