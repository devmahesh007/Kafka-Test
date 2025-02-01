package com.kafka.publisher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PublisherApplication {

	public static void main(String[] args) {
		SpringApplication.run(PublisherApplication.class, args);
	}
	
	 @Bean
	    public java.util.function.Consumer<KStream<Object, String>> process() {

	        return input ->
	                input.foreach((key, value) -> {
	                    System.out.println("Key: " + key + " Value: " + value);
	                });
	    }

}
