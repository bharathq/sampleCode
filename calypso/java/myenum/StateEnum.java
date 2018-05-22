package com.calypso.java.myenum;

public enum StateEnum {
	CA("California", 94536), TX("Texas", 97593), UT("Utah", 23433), NY("New York", 123456);

	private StateEnum(String state, int zip) {
		this.state = state;
		this.zip = zip;
	}

	private String state;
	private int zip;

	public String getState() {
		return state;
	}

	public int getZip() {
		return zip;
	}

	public void print() {
		System.out.println("State : " + this.state);
		System.out.println("Zip : " + this.zip);

	}

}
