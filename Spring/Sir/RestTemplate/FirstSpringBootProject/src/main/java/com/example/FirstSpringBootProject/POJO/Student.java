package com.example.FirstSpringBootProject.POJO;

import com.example.FirstSpringBootProject.entity.StudentEntity;

public class Student {
	
	
	public Student()
	{
		
	}

	private Integer studentId;
	private String studentName;
	private String studentAddress;

	public Student(StudentEntity entity) {
		this.studentId = entity.getStudentid();
		this.studentName = entity.getStudentName();
		this.studentAddress = entity.getStudentAddress();
	}

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
