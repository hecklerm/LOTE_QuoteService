package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.MessageEndpoint;

/**
 * Created by markheckler on 6/16/16.
 */
@MessageEndpoint
public class MessageProcessor {
    @Autowired
    QuoteRepository quoteRepository;

//    @StreamListener(Sink.INPUT)
//    void addNewQuote(Quote quote) {
//        quoteRepository.save(quote);
//        System.out.println(quote.toString());
//    }
}
