package com.tns.inheritance;

public class Student extends Person { 
	private int sid;
	private String course;
	private String dept;
	
	public int getSid() {
		return sid;
	}
	
	public void setSid(int sid) {
		this.sid=sid;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept=dept;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", course=" + course + ", dept=" + dept + "]";
	}
	
	
}
