package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.Cal;

public class Driver {
 public static void main(String [] args) {
	 
	 
	 ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
	 Cal obj = ac.getBean("cal",Cal.class);
	 System.out.println(obj.sum(0, 1));
 }

}
