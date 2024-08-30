package com.durgesh.SpringIocContainer.removingconfigXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.durgesh.SpringIocContainer.removingconfigXML")
public class JavaConfig {
	
	@Bean
	public Samosa getSamose() {
		return new Samosa();
	}

	
	@Bean
	public Student getStudent() {
		
		return new Student(getSamose());
	}
}
