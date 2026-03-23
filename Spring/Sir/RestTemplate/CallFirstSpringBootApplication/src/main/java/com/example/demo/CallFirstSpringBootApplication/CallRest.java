package com.example.demo.CallFirstSpringBootApplication;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CallRest {

	public String urlStudent = "http://localhost:8081/student";

	@Autowired
	private RestTemplate rest;

	@RequestMapping("/greettt")
	public String checkcolleges() {
		String urlNew = "http://localhost:8081/greet";

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> entity = new HttpEntity<String>(headers);
		ResponseEntity<String> responseEntity = rest.exchange(urlNew, HttpMethod.GET, entity, String.class);
		String str = responseEntity.getBody();
		System.out.println("the returned string is:" + str);

		return str;
	}

	@RequestMapping("/fetchStudent")
	public List<Student> getStudent() {

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> entity = new HttpEntity<String>(headers);
		ResponseEntity<Student[]> responseEntity = rest.exchange(urlStudent, HttpMethod.GET, entity, Student[].class);
		Student[] students = responseEntity.getBody();
		List<Student> lsit = new ArrayList();
		for (Student s : students) {
			System.out.println("the student name is:" + s.getStudentName() + " student address is "
					+ s.getStudentAddress() + " student id is " + s.getStudentId());
			lsit.add(s);
		}

		return lsit;
	}

	@RequestMapping("/postStudent")
	public Student postStudent() {

		Student student = new Student();
		student.setStudentName("John");
		student.setStudentId(301);
		student.setStudentAddress("India");

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<Student> entity = new HttpEntity<Student>(student, headers);
		ResponseEntity<Student> responseEntity = rest.exchange(urlStudent, HttpMethod.POST, entity, Student.class);
		Student studentResponse = responseEntity.getBody();

		return studentResponse;
	}

	@RequestMapping("/putStudent")
	public Student putStudent() {

		Student student = new Student();
		student.setStudentName("John");
		student.setStudentId(301);
		student.setStudentAddress("New-Delhi-India");

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<Student> entity = new HttpEntity<Student>(student, headers);
		ResponseEntity<Student> responseEntity = rest.exchange(urlStudent, HttpMethod.PUT, entity, Student.class);
		Student studentResponse = responseEntity.getBody();

		return studentResponse;
	}

	@RequestMapping("/deleteStudent")
	public void deleteStudent(@RequestParam("id") Integer id) {

		urlStudent = urlStudent + "/?id=" + id;

		HttpHeaders headers = new HttpHeaders();

		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> entity = new HttpEntity<String>(headers);
		rest.exchange(urlStudent, HttpMethod.DELETE, entity, Void.class);

	}

}
