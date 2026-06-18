package org.techhub;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
public class TestConnection {
	public static void main(String[] args) {
		 AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DBConfig.class);
		 JdbcTemplate template=(JdbcTemplate)context.getBean("template");
		 template.execute("insert into employee values (3, 'Ashwini', 45000)");
	}

}
