package com.getset.demo;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;

public class MyRunnerTwo implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
     System.out.println("MyRunnerTwo starts...");
		System.out.println(Arrays.asList(args));
		System.out.println(args[1]);
		System.out.println(args[args.length-1]);
	}

}
