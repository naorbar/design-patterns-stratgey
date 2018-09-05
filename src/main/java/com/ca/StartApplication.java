package com.ca;

import java.util.Map.Entry;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ca.hr.User;
import com.ca.hr.beans.HumanResourceManager;

@SpringBootApplication
public class StartApplication {

	@Autowired
	private HumanResourceManager hr;
	
	public static void main(String[] args) {
		System.out.println("start app...");
		
		ConfigurableApplicationContext appContext = SpringApplication.run(StartApplication.class, args);
		
		/*// Option 1: Call hrManager from main:
		HumanResourceManager hr = appContext.getBean(HumanResourceManager.class);
		hr.addUser(new User.Builder().id(2000).name("naor").build());
		for (Entry<Double, User> entry : hr.listAllUsers().entrySet()) {
			System.out.println(entry.toString());
		}*/
		System.out.println("end app...");
	}

	
	@PostConstruct
	public void doSomethingWithDependencyInjectedObjects() {
		// Option 2: Call hrManager from post construct method:
		System.out.println("IN POST CONSTRUCT...");
		hr.addUser(new User.Builder().id(2000).name("naor").build());
		for (Entry<Double, User> entry : hr.listAllUsers().entrySet()) {
			System.out.println(entry.toString());
		}
	}
}
