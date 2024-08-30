package com.durgesh.SpringIocContainer.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	
	private int id;
	private String name;
	private List<String> phnNo;
	private Set<String> adress;
	private Map<String,String> courses;
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
	public List<String> getPhnNo() {
		return phnNo;
	}
	public void setPhnNo(List<String> phnNo) {
		this.phnNo = phnNo;
	}
	public Set<String> getAdress() {
		return adress;
	}
	public void setAdress(Set<String> adress) {
		this.adress = adress;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phnNo=" + phnNo + ", adress=" + adress + ", courses="
				+ courses + "]";
	}
	
	

}
