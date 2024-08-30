package com.durgesh.SpringIocContainer.autowiring.byAnnotation;

public class Laptop {
	private String name;
	private int lid;
	public Laptop(String name, int lid) {
		super();
		this.name = name;
		this.lid = lid;
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	@Override
	public String toString() {
		return "Laptop [name=" + name + ", lid=" + lid + "]";
	}
	
	

}
