package com.example.FirstSpringBootProject.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.FirstSpringBootProject.POJO.Department;
import com.example.FirstSpringBootProject.POJO.Student;
import com.example.FirstSpringBootProject.service.StudentService;

@RestController
public class StudentController {

	List<String> universities = Arrays.asList("IIT", "IIM", "Roorkee");

	@Autowired
	private StudentService service;
	

	@Autowired
	private Department dept;

	@Value("${name}")
	private String names;
	

	@Value("${technology}")
	private String tech;
	

	@Value("${framework}")
	private String fWork;
	

	//@Value("${place}")
	private String venue;

	@GetMapping("/greet")
	public String greeting() {
		return "Hello";
	}
	
	@GetMapping("/tech")
	public String checkTech() {
		return "Technology is :"+tech+" and framework is :" + fWork;
	}

	@GetMapping("/dept")
	public Department getDepartment() {
		return dept;
	}
	
	@GetMapping("/country")
	public String getCountry() {
		return venue;
	}

	@GetMapping("/name")
	public String getNameFromProp() {
		return names;
	}

	@GetMapping("/listOfUniversities")
	public List<String> getUniversities() {
		return universities;
	}

	@PostMapping("/student")
	public Student createStudent(@RequestBody Student st) {
		return service.createStudent(st);
	}

	@GetMapping("/student")
	public List<Student> getAllStudents() {
		return service.getAllStudents();
	}

	@PutMapping("/student")
	public Student updateStudent(@RequestBody Student st) {
		return service.updateStudent(st);
	}

	@DeleteMapping("/student")
	public void deleteStudent(@RequestParam Integer id) {
		service.deleteStudent(id);
	}

}
