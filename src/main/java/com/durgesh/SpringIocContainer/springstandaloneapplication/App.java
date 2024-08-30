package com.durgesh.SpringIocContainer.springstandaloneapplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/durgesh/SpringIocContainer/springstandaloneapplication/standaloneconfig.xml");
		Student bean = context.getBean("stu1", Student.class);
		System.out.println(bean);
	
	}
}
