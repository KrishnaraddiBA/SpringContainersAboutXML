package com.durgesh.SpingIocContainer.refObject;

public class B {
	private int y;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "B [y=" + y + "]";
	}
	
//	<bean class="com.durgesh.SpingIocContainer.refObject.A" name="aref">
//	<property name="x" value="91"/>
//	<property name="b" ><ref bean="bref"/> </property>
//	</bean>
}
