package com.example.studentdemo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private String email;
	private String course;
	private int age;
	public Student() {}
	Student(String name,String email,String course,int age){
		this.name=name;
		this.email=email;
		this.course=course;
		this.age=age;
	}
	public String toString() {
		return "id="+id+" name="+name+" email="+email+" course="+course+" age"+age;
	}
	public void setId(int id ) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setCourse(String course) {
		this.course=course;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getCourse() {
		return course;
	}
	public int getAge() {
		return age;
	}
}
