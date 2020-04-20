package com.cg.lab03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("emp.xml");
		   Employee employee=(Employee)ctx.getBean("emp");
		   System.out.println("Employee Details");
		   System.out.println("--------------------");
		   System.out.println(employee);

	
	}

}
