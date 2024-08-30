package com.durgesh.SpringIocContainer.autowiring.byAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//we can use autowired for the properties setter and contructor feilds to initialize a variable
public class Student {
	
	private int id;
	private String name;
	private String college;
	@Autowired
	@Qualifier("lap2")
	private Laptop laptop;
	public Student(int id, String name, String college, Laptop laptop) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
		this.laptop = laptop;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + ", laptop=" + laptop + "]";
	}
	
	

}
