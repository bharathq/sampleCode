package com.calypso.java.equalshash;

public class UserEquals {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public UserEquals(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;

		if (!(obj instanceof UserEquals))
			return false;

		UserEquals uobj = (UserEquals) obj;
		return this.name.equals(uobj.name) && this.age == uobj.age;
	}

	@Override
	public int hashCode() {
		int hash = 35;
		hash += (name == null ? 0 : name.hashCode());
		hash += age;
		return hash;
	}
}
/* design Paterns
Creational , Structural, Behavorial, J2EE */