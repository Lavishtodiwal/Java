//http://localhost:8081/service/user//add/codesquadz/1001
package com.codesquadz.controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codesquadz.model.Employee;
import com.codesquadz.service.EmployeeService;

@RestController
@RequestMapping("/service/user/")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "add/{name}/{empId}", method = RequestMethod.GET)
	public Employee addEmployee(@PathVariable String name, @PathVariable String empId) {

		return employeeService.createEmployee(name, empId);

	}

	@RequestMapping(value = "/{empId}", method = RequestMethod.GET)
	public String removeEmployee( @PathVariable String empId) {

		employeeService.deleteEmployee(empId);

		return "Employee removed";
	}

}