package com.codesquadz.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Student {
	private int roll;
	private String sname;
	@Autowired
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void display()
	{
		System.out.println("Student information");
		System.out.println("......................................");
		System.out.println("Roll no. :"+roll);
		System.out.println("Student name :"+sname);
		System.out.println(address.toString());
	}
	

}
