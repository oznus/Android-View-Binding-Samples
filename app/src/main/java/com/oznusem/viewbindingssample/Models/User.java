package com.oznusem.viewbindingssample.Models;

/**
 * Created by oznusem on 8/30/15.
 */
public class User {

	private final String firstName;
	private final String lastName;

	public User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}
}