package com.durgesh.SpringIocContainer.configuringstaticMethodsAndVariables;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/durgesh/SpringIocContainer/configuringstaticMethodsAndVariables/staticConfig.xml");
		Student bean = context.getBean("student",Student.class);
		System.out.println(bean);
	}

}
