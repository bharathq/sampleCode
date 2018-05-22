package com.calypso.java.patern;

public class UserSingelton {
	public int age;
	public static UserSingelton obj;

	private UserSingelton() {

	}
	
	public static UserSingelton getInstance()
	{
		if(obj==null)
		{
		obj = new UserSingelton();
		}
		return obj;
	}

}
