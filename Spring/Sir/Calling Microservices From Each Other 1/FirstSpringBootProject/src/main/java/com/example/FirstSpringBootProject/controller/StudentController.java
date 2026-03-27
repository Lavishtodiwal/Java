package com.example.FirstSpringBootProject.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.FirstSpringBootProject.POJO.Bank;
import com.example.FirstSpringBootProject.POJO.Department;
import com.example.FirstSpringBootProject.POJO.PNB;
import com.example.FirstSpringBootProject.POJO.Student;
import com.example.FirstSpringBootProject.aspect.Logged;
import com.example.FirstSpringBootProject.service.StudentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class StudentController {

	List<String> universities = Arrays.asList("IIT", "IIM", "Roorkee");

	@Autowired
	private StudentService service;

	@Qualifier("pnb")
	@Autowired
	private Bank bank;

	private Bank b;

	@Autowired
	public StudentController(PNB pnb) {
		System.out.println("inside the constructor of pnb" + pnb);
		this.b = pnb;
	}

	@GetMapping("/bank")
	public String getBank() {

		return bank.show();
	}

	@Autowired
	private Department dept;

	@Value("${name}")
	private String names;

	@Value("${clss}")
	private String cl;

	@Value("${technology}")
	private String tech;

	@Value("${framework}")
	private String fWork;

	@Value("${place}")
	private String venue;

	@Logged
	@GetMapping("/greet")
	public String greeting() {

		return "Hello";
	}
	
	@Logged
	@GetMapping("/tech")
	public String checkTech() {
		return "Technology is :" + tech + " and framework is :" + fWork;
	}

	@Logged
	@GetMapping("/dept")
	public Department getDepartment() {
		return dept;
	}

	@Logged
	@GetMapping("/country")
	public String getCountry() {
		return venue;
	}

	@Logged
	@GetMapping("/class")
	public String getClas() {
		return cl;
	}

	@Logged
	@GetMapping("/name")
	public String getNameFromProp() {
		return names;
	}
	
	@Logged
	@GetMapping("/listOfUniversities")
	public List<String> getUniversities() {
		return universities;
	}

	@Logged
	@PostMapping("/student")
	public Student createStudent(@RequestBody Student st) {
		return service.createStudent(st);
	}

	@Logged
	@GetMapping("/student")
	public List<Student> getAllStudents() {
		return service.getAllStudents();
	}
	
	@Logged
	@PutMapping("/student")
	public Student updateStudent(@RequestBody Student st) {
		return service.updateStudent(st);
	}

	@Logged
	@DeleteMapping("/student")
	public void deleteStudent(@RequestParam Integer id) {
		service.deleteStudent(id);
	}
	
	@RequestMapping("/checkHystric")
	@HystrixCommand(fallbackMethod = "defaultMessage")
	public String checkHystrix() throws InterruptedException {
		Thread.sleep(3000);
		return "viresh";

	}

	private String defaultMessage() {

		return "Hello User! Thread is sleeping";
	}

}
