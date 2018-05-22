package com.calypso.java.patern;

public class FactoryExample {

	public static void main(String[] args) {

		IUser obj= UserFactory.getInstance("A");
		obj.authenticate();
		obj=UserFactory.getInstance("S");
		obj.authenticate();
	}

}
