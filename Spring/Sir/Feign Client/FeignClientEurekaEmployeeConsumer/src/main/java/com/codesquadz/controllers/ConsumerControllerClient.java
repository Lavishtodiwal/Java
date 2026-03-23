package com.codesquadz.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestClientException;
import	org.springframework.web.bind.annotation.RestController;
import	org.springframework.web.bind.annotation.RequestMapping;
import com.codesquadz.services.RemoteCallService;
import	org.springframework.web.bind.annotation.RequestMethod;
@RestController
public class ConsumerControllerClient {

	@Autowired
	private RemoteCallService loadBalancer;
@RequestMapping(value = "/empclient", method = RequestMethod.GET)
	public Employee getEmployee() throws RestClientException, IOException {
Employee emp=loadBalancer.getData();
		try {
			Thread.sleep(10000);
			//System.out.println("HELLO");
			//System.out.println(emp);
			//System.out.println(emp.getEmpId());
			//System.out.println(emp.getName());
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return emp;
	}

}