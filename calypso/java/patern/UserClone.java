package com.calypso.java.patern;

public class UserClone implements Cloneable {

	public String name;
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

}
