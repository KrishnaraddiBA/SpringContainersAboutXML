package com.durgesh.SpringIocContainer;


public class Student {
	private int studentId;
	private String studentName;
	private String college;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		System.out.println("setting a student id");
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {

		System.out.println("setting a student name");
		this.studentName = studentName;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
	System.out.println("setting a student college");
		this.college = college;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", college=" + college + "]";
	}
	
	
	
}
