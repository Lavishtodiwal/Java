package com.codesquadz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerRibbonProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerRibbonProjectApplication.class, args);
	}

}
