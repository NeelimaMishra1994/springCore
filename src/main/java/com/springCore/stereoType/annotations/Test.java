package com.springCore.stereoType.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/stereoType/annotations/stereoConfig.xml");
		 Student student =  (Student) context.getBean("student");
		 System.out.println(student);
		 System.out.println(student.getAddress());

	}

}
