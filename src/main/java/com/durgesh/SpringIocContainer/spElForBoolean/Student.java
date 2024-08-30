package com.durgesh.SpringIocContainer.spElForBoolean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	//this is a spring expression language for the boolean values
	@Value("#{8>3}")
	private boolean first;

	public boolean isFirst() {
		return first;
	}

	public void setFirst(boolean first) {
		this.first = first;
	}

	@Override
	public String toString() {
		return "Student [first=" + first + "]";
	}
	
	
}
