package com.durgesh.SpringIocContainer.spEl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob")
@Scope("prototype")
public class Student {

	@Value("#{100+200}")
	private int first;
	@Value("#{25}")
	private int second;
	public int getFirst() {
		return first;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	@Override
	public String toString() {
		return "Student [first=" + first + ", second=" + second + "]";
	}
	
	
}
