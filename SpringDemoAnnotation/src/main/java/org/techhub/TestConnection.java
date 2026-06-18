package org.techhub;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class TestConnection {

	public static void main(String[] args) {

		 AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DBConfig.class);
		 DriverManagerDataSource dataSource=(DriverManagerDataSource)context.getBean("dataSource");
		 if(dataSource!=null) {
			 System.out.println("Database is connected");
		 }
		 else
		 {
			 System.out.println("Database is not connected");
		 }
	}

}
