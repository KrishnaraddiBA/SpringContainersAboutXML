package com.durgesh.SpringIocContainer.autowiring.byAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/durgesh/SpringIocContainer/autowiring/byAnnotation/configCollection.xml");
		Student bean = context.getBean("student", Student.class);
		System.out.println(bean);
	}
}
