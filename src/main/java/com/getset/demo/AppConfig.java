package com.getset.demo;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public MyRunnerTwo mrt() {
		return new MyRunnerTwo();
	}
	
	
	@Bean
	public CommandLineRunner clr() {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				// TODO Auto-generated method stub
				System.out.println("My anonymos runner starts...");
				System.out.println(Arrays.asList(args));
				
			}
		};
	}

}
