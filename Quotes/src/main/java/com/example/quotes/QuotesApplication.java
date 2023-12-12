package com.example.quotes;

import com.example.quotes.controllers.NorrisController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class QuotesApplication {

	public static void main(String[] args) {


		ApplicationContext ctx = SpringApplication.run(QuotesApplication.class, args);
		NorrisController norrisController = (NorrisController) ctx.getBean("norrisController");
		System.out.println(norrisController.quote());
	}
}