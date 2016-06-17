package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableBinding(Sink.class)
public class QuoteServiceApplication {
    @Bean
    @Autowired
    CommandLineRunner commandLineRunner(QuoteRepository quoteRepository) {
        return args -> {
            quoteRepository.save(new Quote("The unexamined life is not worth living.", "Socrates"));
            quoteRepository.save(new Quote("What you do makes a difference, and you have to decide what kind of difference you want to make.", "Jane Goodall"));
            quoteRepository.save(new Quote("Do you want to know who you are? Don't ask. Act! Action will delineate and define you.", "Thomas Jefferson"));
            quoteRepository.save(new Quote("Love is the absence of judgment.", "Dalai Lama XIV"));
            quoteRepository.save(new Quote("You have power over your mind - not outside events. Realize this, and you will find strength.", "Marcus Aurelius, Meditations"));
            quoteRepository.save(new Quote("It's hard to beat a person who never gives up.", "Babe Ruth"));
            quoteRepository.save(new Quote("Imagination is the highest form of research.", "Albert Einstein"));

            quoteRepository.findAll().forEach(System.out::println);
        };
    }

	public static void main(String[] args) {
		SpringApplication.run(QuoteServiceApplication.class, args);
	}
}


