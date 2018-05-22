package com.calypso.java.patern;

public class SuperUser implements IUser {

	@Override
	public boolean authenticate() {
		// TODO Auto-generated method stub
		System.out.println("Hi from SuperUser");
		return false;
	}

}
