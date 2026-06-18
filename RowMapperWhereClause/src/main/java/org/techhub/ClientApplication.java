package org.techhub;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class ClientApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
		JdbcTemplate template = (JdbcTemplate) context.getBean("template");
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter employee id");
		int empid = xyz.nextInt();
		PreparedStatementSetter stmt = new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub
				ps.setInt(1, empid);
				 
			}
		};

		RowMapper r = new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee emp = new Employee(rs.getString("name"), rs.getInt("id"), rs.getInt("salary"));
				return emp;
			}
		};
		List<Employee> list = template.query("select *from employee where id=?", stmt, r);
		 
		list.forEach((e)->System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal()));
	}

}
