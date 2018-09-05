package com.ca.hr.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.ca.hr.SortStrategy;
import com.ca.hr.User;

@Component
public class HumanResourceManager {

	Map<Double, User> usersDatabase;
	
	public HumanResourceManager() {
		usersDatabase = new HashMap<>();
	}
	
	public Map<Double, User> listAllUsers() {
		return this.usersDatabase;
	}
	
	public User addUser(User u) {
		return this.usersDatabase.put(u.id, u);
	}
	
	public User deleteUser(double id) {
		return this.usersDatabase.remove(id);
	}
	
	// OLD - BAD...
	/*public List<User> sort(SortBy sortBy) {
		List<User> usersList = new ArrayList<>(this.usersDatabase.values());
		switch (sortBy) {
		case ID:
			Collections.sort(usersList, new Comparator<User>() {
				@Override
				public int compare(User o1, User o2) {
					return (int) (o1.id - o2.id);
				}
			});
			break;
		case NAME:
			Collections.sort(usersList, new Comparator<User>() {
				@Override
				public int compare(User o1, User o2) {
					return o1.name.compareTo(o2.name);
				}
			});
			break;
		case TITLE:
			Collections.sort(usersList, new Comparator<User>() {
				@Override
				public int compare(User o1, User o2) {
					return o1.title.compareTo(o2.title);
				}
			});
			break;
		default:

			break;
		}
		return usersList;
	}

	public enum SortBy {
		ID, NAME, TITLE;
	}
*/
	
	// With STRATEGY PATTERN:
	public List<User> sort(SortStrategy strategy) {
		List<User> usersList = new ArrayList<>(this.usersDatabase.values());
		return strategy.sort(usersList);
	}
	
	@Override
	public String toString() {
		return "HumanResourceManager [usersDatabase=" + usersDatabase + "]";
	}
}
