package com.ca.hr.beans;

import java.util.List;

import org.junit.Test;

import com.ca.hr.SortByIdStrategy;
import com.ca.hr.SortByNameStrategy;
import com.ca.hr.SortByTitleStrategy;
import com.ca.hr.User;
// import com.ca.hr.beans.HumanResourceManager.SortBy;

public class HumanResourceManagerTest {

	@Test
	public void shouldSortById() {
		HumanResourceManager hr = new HumanResourceManager();
		hr.addUser(new User.Builder().id(1002).name("naor3").title("office cleaner").build());
		hr.addUser(new User.Builder().id(1003).name("naor1").title("bathroom cleaner").build());
		hr.addUser(new User.Builder().id(1001).name("naor2").title("dog washer").build());
	
		System.out.println(hr.toString());
		// List<User> sortedList = hr.sort(SortBy.ID);
		List<User> sortedList = hr.sort(new SortByIdStrategy());
		System.out.println(sortedList.toString());
	}

	@Test
	public void shouldSortByName() {
		HumanResourceManager hr = new HumanResourceManager();
		hr.addUser(new User.Builder().id(1000).name("naor4").title("office cleaner").build());
		hr.addUser(new User.Builder().id(1002).name("naor3").title("bathroom cleaner").build());
		hr.addUser(new User.Builder().id(1003).name("naor2").title("dog washer").build());
	
		System.out.println(hr.toString());
		//List<User> sortedList = hr.sort(SortBy.NAME);
		List<User> sortedList = hr.sort(new SortByNameStrategy());
		System.out.println(sortedList.toString());
	}
	
	@Test
	public void shouldSortByTitle() {
		HumanResourceManager hr = new HumanResourceManager();
		hr.addUser(new User.Builder().id(1000).name("naor4").title("office cleaner").build());
		hr.addUser(new User.Builder().id(1002).name("naor3").title("bathroom cleaner").build());
		hr.addUser(new User.Builder().id(1003).name("naor2").title("dog washer").build());
	
		System.out.println(hr.toString());
		//List<User> sortedList = hr.sort(SortBy.TITLE);
		List<User> sortedList = hr.sort(new SortByTitleStrategy());
		System.out.println(sortedList.toString());
	}



}
