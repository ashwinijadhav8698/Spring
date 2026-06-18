package org.techhub;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.techhub.config.ConfigApp;

public class ClientApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AnnotationConfigApplicationContext  context=new AnnotationConfigApplicationContext(ConfigApp.class);
		 Calculator calc=(Calculator)context.getBean("calc");
		 calc.show();
	}

}
