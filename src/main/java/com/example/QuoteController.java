package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by markheckler on 6/16/16.
 */
@RestController
class QuoteController {
    @Autowired
    QuoteRepository quoteRepository;

    @RequestMapping("/random")
    public Quote getRandomQuote() {
        return quoteRepository.getQuotesRandomOrder().get(0);
    }
}