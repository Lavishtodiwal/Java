package com.example.FirstSpringBootProject.POJO;

import org.springframework.stereotype.Component;

@Component("pnb")
public class PNB implements Bank {

	public PNB() {
		System.out.println("inside the PNB bank");
	}

	public PNB(String str) {
		System.out.println("inside the PNB bank of parameterized cons" + str);
	}

	public String show() {
		return "this is pnb bank";
	}

}
