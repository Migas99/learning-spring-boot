package com.zuehlke.learningspringboot.Services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class QuotesServiceImp implements QuotesService {

    private final ChuckNorrisQuotes quotes;

    public QuotesServiceImp() {
        this.quotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomQuote() {
        return this.quotes.getRandomQuote();
    }

}
