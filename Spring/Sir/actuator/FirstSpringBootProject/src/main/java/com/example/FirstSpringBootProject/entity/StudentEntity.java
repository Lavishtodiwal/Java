package com.example.FirstSpringBootProject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.FirstSpringBootProject.POJO.Student;

@Entity
@Table(name = "student")
public class StudentEntity {
	
	public StudentEntity()
	{
		
	}

	public StudentEntity(Student student) {
		this.studentid = student.getStudentId();
		this.studentName = student.getStudentName();
		this.studentAddress = student.getStudentAddress();
	}

	@Id
	@Column(name = "student_id")
	private Integer studentid;
	@Column(name = "student_name")
	private String studentName;
	@Column(name = "student_address")
	private String studentAddress;

	public Integer getStudentid() {
		return studentid;
	}

	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
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
