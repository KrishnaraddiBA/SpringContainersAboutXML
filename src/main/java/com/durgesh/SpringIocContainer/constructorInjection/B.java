package com.durgesh.SpringIocContainer.constructorInjection;

public class B {
	private String brand;

	public B(String brand) {
		super();
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "B [brand=" + brand + "]";
	}
	

}
