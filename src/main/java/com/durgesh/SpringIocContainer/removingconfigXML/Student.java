package com.durgesh.SpringIocContainer.removingconfigXML;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("101")
	private int id;
	@Value("krishnaraddi")
	private String name;
	@Value("TOCE")
	private String college;
	private Samosa samose;
	
	
	
	
	
	public Student(Samosa samose) {
		
		this.samose = samose;
	}
	
	public Samosa getSamose() {
		return samose;
	}
	public void setSamose(Samosa samose) {
		this.samose = samose;
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
	@Override
	public String toString() {
		
		samose.display();
		return "Student [id=" + id + ", name=" + name + ", college=" + college + "]";
		
	}
	
	
}
