package com.codesquadz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaEmployeeProducerProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaEmployeeProducerProjectApplication.class, args);
	}

}
