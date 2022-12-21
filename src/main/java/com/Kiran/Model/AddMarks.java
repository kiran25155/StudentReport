package com.Kiran.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AddMarks {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sNo;
	private int english;
	private int maths;
	private int science;
	private String semester;
	private int total;
	private int average;
	private float percentage;
	private int rollNo;
	public AddMarks() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AddMarks(int sNo, int english, int maths, int science, String semester, int rollNo) {
		super();
		this.sNo = sNo;
		this.english = english;
		this.maths = maths;
		this.science = science;
		this.semester = semester;
		this.rollNo = rollNo;
	}
	public int getsNo() {
		return sNo;
	}
	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getAverage() {
		return average;
	}
	public void setAverage(int average) {
		this.average = average;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "AddMarks [sNo=" + sNo + ", english=" + english + ", maths=" + maths + ", science=" + science
				+ ", semester=" + semester + ", total=" + total + ", average=" + average + ", percentage=" + percentage
				+ ", rollNo=" + rollNo + "]";
	}
	
     
}
