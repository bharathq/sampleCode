package com.calypso.java.patern;

public class Admin implements IUser{

	@Override
	public boolean authenticate() {
		// TODO Auto-generated method stub
		System.out.println("Hi from Admin");
		return false;
	}

}
