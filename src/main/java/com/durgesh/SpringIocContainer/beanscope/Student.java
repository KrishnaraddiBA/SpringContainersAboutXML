package com.durgesh.SpringIocContainer.beanscope;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("ob")
//@Scope("prototype")
public class Student {
	@Value("101")
	private int id;
	@Value("Krishnaraddi")
	private String name;
	@Value("#{temp}")
	private List<String> college;
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
	public List<String> getCollege() {
		return college;
	}
	public void setCollege(List<String> college) {
		this.college = college;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + "]";
	}
	
	
}
