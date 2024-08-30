package com.durgesh.SpingIocContainer.refObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/durgesh/SpingIocContainer/refObject/refconfig.xml");
		A bean = (A) context.getBean("aref");
		System.out.println(bean.getX());
		System.out.println(bean.getB().getY());
	}
}
