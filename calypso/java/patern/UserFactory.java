package com.calypso.java.patern;

public class UserFactory {
	
	public static IUser getInstance(String type)
	{
		IUser obj=null;
		if(type.equals("A"))
		{
			obj=new Admin();
		}
		else if(type.equals("S"))
		{
			obj=new SuperUser();				
		}
		return obj;
	}
	

}
