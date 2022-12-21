package com.Kiran.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RegisterStudent {
	@Id
	private int rollNo;
	private String name;
	public RegisterStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RegisterStudent(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "RegisterStudent [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
	

}
