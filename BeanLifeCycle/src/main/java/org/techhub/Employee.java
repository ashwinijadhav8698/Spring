package org.techhub;

public class Employee {
	private int id;
	public Employee() {
		System.out.println("I am constructor");
	}
	public void myInit() {
		System.out.println("this is the init method");
	}
	public void display() {
		 System.out.println("I am utility method");
	}
	public void myDestroy() {
		System.out.println("Iam destroy method");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	private String name;
	private int sal;	

}
