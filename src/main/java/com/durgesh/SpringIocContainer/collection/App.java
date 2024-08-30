package com.durgesh.SpringIocContainer.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	
	public static void main(String[] args) {
	
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/durgesh/SpringIocContainer/collection/configCollection.xml");
		Employee bean = (Employee) context.getBean("employee1");
		System.out.println(bean);
	}

}
