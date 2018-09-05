package com.ca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.ca.hr.User;
import com.ca.hr.beans.HumanResourceManager;
import com.ca.hr.beans.RandomNameGenerator;

@Order(2)
@Component
public class CmdRunner1 implements CommandLineRunner {

	@Autowired
	private HumanResourceManager hrManager;

	@Autowired
	private RandomNameGenerator randGenerator;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("start run 1... adding user...");
		hrManager.addUser(new User.Builder().id(1005).name(randGenerator.generate()).build());
	}
}