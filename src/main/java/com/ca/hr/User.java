package com.ca.hr;

public class User {

	public double id;
	public String name;
	public String title;

	public static class Builder {
		private double id;
		private String name;
		private String title;

		public Builder id(double id) {
			this.id = id;
			return this;
		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder title(String title) {
			this.title = title;
			return this;
		}

		public User build() {
			User user = new User();
			user.id = id;
			user.name = name;
			user.title = title;
			return user;
		}
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", title=" + title + "]";
	}
}
