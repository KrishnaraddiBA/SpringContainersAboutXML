package com.durgesh.SpringIocContainer.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	//there are 5 types of bean scopes
	//they are
	//Singleton,
	//prototype,
	//request,
	//session,
	//globalsession
	
	//by default the scope will be like singleton scope 
	//we have to change like prototype,request,session,globalsession
	//were i have seen that session,globalsession,and request are only available  for the web MVC

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/durgesh/SpringIocContainer/beanscope/configCollection.xml");
		Student bean = context.getBean("ob",Student.class);
		System.out.println(bean.hashCode());
		Student bean2 = context.getBean("ob",Student.class);
		System.out.println(bean2.hashCode());
	}
}
