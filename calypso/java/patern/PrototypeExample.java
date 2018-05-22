package com.calypso.java.patern;

public class PrototypeExample {

	public static void main(String[] args) {

		UserClone obj = new UserClone();
		obj.name = "Hi";
		System.out.println(obj.name);
		try {
			UserClone obj2=(UserClone) obj.clone();
			System.out.println(obj2.name);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
