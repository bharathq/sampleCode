package com.calypso.java.patern;

public class SingeltonExample {

	public static void main(String[] args) {
		UserSingelton obj1= UserSingelton.getInstance();
		obj1.age=24;
		System.out.println(obj1.age);
		UserSingelton obj2= UserSingelton.getInstance();
		System.out.println(obj2.age);
	}

}
