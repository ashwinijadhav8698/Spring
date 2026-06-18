package org.model;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.techhub.config.ConfigApp;

public class CleintApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(ConfigApp.class);
		Employee emp=(Employee)context.getBean("e");
		System.out.println(emp.getName()+" "+emp.getId()+" "+emp.getSal());
	}

}
