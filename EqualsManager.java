package com.calypso.java.equalshash;

public class EqualsManager {

	public static void main(String[] args) {

		UserEquals u1 = new UserEquals("abc", 11);
		UserEquals u2 = new UserEquals("abc", 11);

		System.out.println(u1.equals(u2));

		if (u1.getName().equals(u2.getName()) && u1.getAge() == u2.getAge())
			System.out.println("Equals");
		else
			System.out.println("Not Equals");

	}

}
