package com.getset.demo;

import java.awt.List;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class MyRunnerOne implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("MyRunnerOne starts");
		System.out.println(Arrays.asList(args));
		System.out.println(args[1]);
		System.out.println(args[args.length-1]);

	}

}
