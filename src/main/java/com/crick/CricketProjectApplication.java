package com.crick;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@SpringBootApplication
@ComponentScan("com")
@EnableAspectJAutoProxy


public class CricketProjectApplication implements CommandLineRunner{

	@Autowired
	@Qualifier("student1")
	 
	public static void main(String[] args) 
	{
		SpringApplication.run(CricketProjectApplication.class, args);
		System.out.println("hello");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
