package com.hcl.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestClientException;

import com.hcl.services.RemoteCallService;

@Controller
public class ConsumerControllerClient {

	@Autowired
	private RemoteCallService loadBalancer;

	public void getEmployee() throws RestClientException, IOException {

		try {
			Employee emp = loadBalancer.getData();
			System.out.println("HELLO");
			System.out.println(emp);
			System.out.println(emp.getEmpId());
			System.out.println(emp.getName());
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

}