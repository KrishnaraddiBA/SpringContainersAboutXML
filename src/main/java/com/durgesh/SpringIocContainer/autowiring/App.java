package com.durgesh.SpringIocContainer.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/durgesh/SpringIocContainer/autowiring/autowiringconfig.xml");
		Student bean = context.getBean("studref", Student.class);
		System.out.println(bean);
	}
}
