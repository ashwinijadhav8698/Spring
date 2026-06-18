package org.model;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
		MSME m = (MSME) context.getBean("m");
		m.showCompanyDetails();
	}

}
