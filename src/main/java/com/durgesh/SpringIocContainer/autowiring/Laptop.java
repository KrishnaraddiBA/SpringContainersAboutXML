package com.durgesh.SpringIocContainer.autowiring;

public class Laptop {
	private String lname;
	
	

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Laptop(String lname) {
		super();
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "Laptop [lname=" + lname + "]";
	}
	
	

}
