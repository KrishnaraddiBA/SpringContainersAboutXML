package com.durgesh.SpringIocContainer.configuringstaticMethodsAndVariables;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("#{10+20}")
	private int num1;
	@Value("#{30+40}")
	private int num2;
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private double num3;
	@Value("#{T(java.lang.Math).PI}")
	private double num4;
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public double getNum3() {
		return num3;
	}
	public void setNum3(double num3) {
		this.num3 = num3;
	}
	public double getNum4() {
		return num4;
	}
	public void setNum4(double num4) {
		this.num4 = num4;
	}
	@Override
	public String toString() {
		return "Student [num1=" + num1 + ", num2=" + num2 + ", num3=" + num3 + ", num4=" + num4 + "]";
	}
	
	

}
