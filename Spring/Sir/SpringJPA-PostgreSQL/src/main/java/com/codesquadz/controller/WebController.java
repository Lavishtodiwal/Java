package com.codesquadz.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import com.codesquadz.model.Employee;
import com.codesquadz.repo.EmployeeRepository;

@RestController
@RequestMapping("/employee")
//@CrossOrigin(origins = "http://localhost:3000")
public class WebController {
	@Autowired
	EmployeeRepository repository;
	@RequestMapping("/insert")  
    public String index(){  
        return"controller logic executed successfully...!!";  
    }  
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public HttpStatus insertEmployee(@RequestBody Employee employee){
		boolean status = repository.save(employee) != null;		
		return status? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}
	
	
	@RequestMapping("/findall")
	public List<Employee> findAll(){
		
		
		return (List<Employee>) repository.findAll();
	}
	
	@RequestMapping("/findbyid")
	public Optional<Employee> findById(@RequestParam("id") long id){
		Optional<Employee> result = repository.findById(id);
		return result;
	}
	
	@RequestMapping("/findbylastname")
	public List<Employee> fetchDataByLastName(@RequestParam("lastname") String lastName){
		 		
		return repository.findByLastName(lastName);
	}
	@RequestMapping("/findbyage")
	public List<Employee> fetchDataByAge(@RequestParam("age") int age){
		 		
		return repository.findByAge(age);
	}
}

