package com.example.employeedemo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	private int id;
	private String name;
	private String dept;
	private int sal;
	private String joiningdate;
	public Employee() {}
	Employee(String name,String dept,int sal, String joiningdate){
		this.name=name;
		this.dept=dept;
		this.sal=sal;
		this.joiningdate=joiningdate;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setId(int id) {
		this.id=id;
	}
	public void setDept(String dept) {
		this.dept=dept;
	}
	public void setSal(int sal) {
		this.sal=sal;
	}
	public void setJoiningdate(String joiningdate) {
		this.joiningdate=joiningdate;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public int getSal() {
		return sal;
	}
	public String getJoiningdate() {
		return joiningdate;
	}
}
