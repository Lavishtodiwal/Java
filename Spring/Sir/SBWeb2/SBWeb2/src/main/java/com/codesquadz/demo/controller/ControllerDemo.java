package com.codesquadz.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codesquadz.demo.model.Employee;

@Controller
public class ControllerDemo {
	
	@RequestMapping("/")
	public String show()
	{
		return "index";
	}
	@RequestMapping(value="Login" , method=RequestMethod.POST)
	public String show1(Employee emp, Model m)
	{
		m.addAttribute("user",emp);
		return "display";
	}
}
