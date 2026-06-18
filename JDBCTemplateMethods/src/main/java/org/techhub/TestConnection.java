package org.techhub;
import java.util.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.techhub.DBConfig;

public class TestConnection {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
		JdbcTemplate template = (JdbcTemplate) context.getBean("template");
		if (template != null) {
			System.out.println("Enter name  and salary of employee");
			Scanner xyz = new Scanner(System.in);
			String name = xyz.nextLine();
			 	int sal = xyz.nextInt();
			template.execute("insert into employee values('0','"+name+"',"+sal+")");
			System.out.println("Record save");
		} else {
			System.out.println("Database is not connected");
		}
	}
}
