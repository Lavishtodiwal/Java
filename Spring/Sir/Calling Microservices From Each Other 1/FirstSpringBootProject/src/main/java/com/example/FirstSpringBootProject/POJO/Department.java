package com.example.FirstSpringBootProject.POJO;

import org.springframework.stereotype.Component;


public class Department {

	private String deptName;
	private Integer deptId;

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

}
