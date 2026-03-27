package com.example.FirstSpringBootProject.POJO;

import org.springframework.stereotype.Component;

@Component("sbi")
public class SBI implements Bank {

	public SBI() {
		System.out.println("inside the sbi bank");
	}
	
	public String show()
	{
		return "this is sbi bank";
	}

}
