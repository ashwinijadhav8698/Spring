package org.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("e")
public class Employee {
	private int id;
	private String name;
	private int sal;
	public int getId() {
		return id;
	}
	@Value("1")
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	@Value("ABC")
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	@Value("10000")
	public void setSal(int sal) {
		this.sal = sal;
	}
	

}
