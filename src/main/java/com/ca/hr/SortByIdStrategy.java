package com.ca.hr;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByIdStrategy extends SortStrategy {

	@Override
	public List<User> sort(List<User> usersList) {
		Collections.sort(usersList, new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				return (int) (o1.id - o2.id);
			}
		});
		return usersList;
	}

}
