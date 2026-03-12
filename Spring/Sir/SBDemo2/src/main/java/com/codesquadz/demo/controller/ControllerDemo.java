package com.codesquadz.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerDemo {
	
	@RequestMapping("home")
	public String view()
	{
		System.out.println("hi");
		return "index";
		
	}

}
