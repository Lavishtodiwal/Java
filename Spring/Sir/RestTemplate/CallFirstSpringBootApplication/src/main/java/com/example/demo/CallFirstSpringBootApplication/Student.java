package com.example.demo.CallFirstSpringBootApplication;



public class Student {
	
	
	public Student()
	{
		
	}

	private Integer studentId;
	private String studentName;
	private String studentAddress;

	

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

}
