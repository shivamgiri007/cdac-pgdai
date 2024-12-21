package com.controller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainclass {
	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
         dbconnection d = (dbconnection) context.getBean("s");
         System.out.println(d.getId());
         
         
		
	}

}
