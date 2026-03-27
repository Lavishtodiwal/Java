package com.example.demo.CallFirstSpringBootApplication;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;


@RestController
public class CallRest {

	public String urlStudent = "http://localhost:9090/student";

	@Autowired
	private RestTemplate rest;
	
	@Autowired
	private EurekaClient client;

	@RequestMapping("/greettt")
	public String checkcolleges() {
	//	String urlNew = "http://localhost:9090/greet";
		
		InstanceInfo info = client.getNextServerFromEureka("FIRSTSPRINGBOOTPROJECT", false);
		String baseUrl = info.getHomePageUrl();
		baseUrl = baseUrl + "/greet";

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> entity = new HttpEntity<String>(headers);
		ResponseEntity<String> responseEntity = rest.exchange(baseUrl, HttpMethod.GET, entity, String.class);
		String str = responseEntity.getBody();
		System.out.println("the returned string is:" + str);

		return str;
	}
	
	@RequestMapping("/check")
	public String check() 
	{
		return "check";
	}

	@RequestMapping("/fetchStudent")
	public List<Student> getStudent() {

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		InstanceInfo info = client.getNextServerFromEureka("FIRSTSPRINGBOOTPROJECT", false);
		String baseUrl = info.getHomePageUrl();
		baseUrl = baseUrl + "/student";

		HttpEntity<String> entity = new HttpEntity<String>(headers);
		ResponseEntity<Student[]> responseEntity = rest.exchange(baseUrl, HttpMethod.GET, entity, Student[].class);
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
		
		InstanceInfo info = client.getNextServerFromEureka("FIRSTSPRINGBOOTPROJECT", false);
		String baseUrl = info.getHomePageUrl();
		baseUrl = baseUrl + "/student";

		Student student = new Student();
		student.setStudentName("John");
		student.setStudentId(301);
		student.setStudentAddress("India");

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<Student> entity = new HttpEntity<Student>(student, headers);
		ResponseEntity<Student> responseEntity = rest.exchange(baseUrl, HttpMethod.POST, entity, Student.class);
		Student studentResponse = responseEntity.getBody();

		return studentResponse;
	}

	@RequestMapping("/putStudent")
	public Student putStudent() {
		
		InstanceInfo info = client.getNextServerFromEureka("FIRSTSPRINGBOOTPROJECT", false);
		String baseUrl = info.getHomePageUrl();
		baseUrl = baseUrl + "/student";

		Student student = new Student();
		student.setStudentName("John");
		student.setStudentId(301);
		student.setStudentAddress("New-Delhi-India");

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<Student> entity = new HttpEntity<Student>(student, headers);
		ResponseEntity<Student> responseEntity = rest.exchange(baseUrl, HttpMethod.PUT, entity, Student.class);
		Student studentResponse = responseEntity.getBody();

		return studentResponse;
	}

	@RequestMapping("/deleteStudent")
	public void deleteStudent(@RequestParam("id") Integer id) {
		
		InstanceInfo info = client.getNextServerFromEureka("FIRSTSPRINGBOOTPROJECT", false);
		String baseUrl = info.getHomePageUrl();
		baseUrl = baseUrl + "/student" + "/?id=" + id;

	//	urlStudent = urlStudent + "/?id=" + id;

		HttpHeaders headers = new HttpHeaders();

		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> entity = new HttpEntity<String>(headers);
		rest.exchange(baseUrl, HttpMethod.DELETE, entity, Void.class);

	}
	
	

}
