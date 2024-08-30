package com.durgesh.SpringIocContainer.lifecycle;

public class Example {
	private int id;
	private String name;
	private long salary;
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
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Example [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("lifecycle has been started!!");
	}
	@Predestroy
	public void destroy() {
		System.out.println("lifecycle has been destroyed!!");
	}
	
	
}
