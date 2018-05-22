package com.calypso.java.myenum;

public class EnumManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String state = "TX";

		for (StateEnum e : StateEnum.values()) {
			if (e.toString().equals(state)) {
				System.out.println("State found");
			} else
				System.out.println("Enter correct state");
		}

		System.out.println(StateEnum.NY.getState() + "        " + StateEnum.NY.getZip());
		StateEnum.UT.print();

	}

}
