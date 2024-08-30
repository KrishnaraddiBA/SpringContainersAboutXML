package com.durgesh.SpringIocContainer.spEl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/durgesh/SpringIocContainer/spEl/SpElconfig.xml");
		Student bean = context.getBean("ob",Student.class);
		System.out.println(bean);
		Student bean1 = context.getBean("ob",Student.class);
		System.out.println(bean1.hashCode());
		System.out.println(bean.hashCode());
	}
}
