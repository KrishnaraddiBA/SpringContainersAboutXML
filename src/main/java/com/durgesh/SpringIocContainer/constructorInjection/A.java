package com.durgesh.SpringIocContainer.constructorInjection;

public class A {
	
	private int empId;
	private String name;
	private B laptop;
	public A(int empId, String name, B laptop) {
		super();
		this.empId = empId;
		this.name = name;
		this.laptop = laptop;
	}
	@Override
	public String toString() {
		return "A [empId=" + empId + ", name=" + name + ", laptop=" + laptop + "]";
	}
}
