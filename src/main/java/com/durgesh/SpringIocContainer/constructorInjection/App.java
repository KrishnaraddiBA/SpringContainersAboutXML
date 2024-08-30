package com.durgesh.SpringIocContainer.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/durgesh/SpringIocContainer/constructorInjection/cigconfig.xml");
		A bean = (A)context.getBean("aref");
		System.out.println(bean);
	}

}
