package com.durgesh.SpringIocContainer.lifecycle.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/durgesh/SpringIocContainer/lifecycle/collections/lifecyclecollectionsconfig.xml");
		Student bean = context.getBean("student", Student.class);
	
		System.out.println(bean.getBooks());
		System.out.println(bean.getBooks().getClass().getName());
	}
}
