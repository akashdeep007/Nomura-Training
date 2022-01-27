package com.corejava.day5;

public class Student {

	private String name;
	private String email;
	private String phoneNo;
	private String department;
	private String rollNo;
	
	public Student(){
		
	}
	
	public Student(String name, String email, String phoneNo, String department, String rollNo){
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.department = department;
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("name is updated");
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("email is updated from "+this.email+ " to "+email);
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getRollNo() {
		if(rollNo.length() > 2)
			return rollNo.substring(0, 2)+" "+rollNo.substring(2);
		
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		if(rollNo != null && !rollNo.equals("0"))
			this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", phoneNo=" + phoneNo + ", department=" + department
				+ ", rollNo=" + rollNo + "]";
	}

}
