package com.codesquadz;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;

import com.codesquadz.controllers.ConsumerControllerClient;

@SpringBootApplication
@EnableFeignClients
public class FeignClientEurekaEmployeeConsumerProjectApplication {

	public static void main(String[] args) throws RestClientException, IOException {
		ApplicationContext ctx = SpringApplication.run(FeignClientEurekaEmployeeConsumerProjectApplication.class, args);

		//ConsumerControllerClient consumerControllerClient = ctx.getBean(ConsumerControllerClient.class);
		//System.out.println(consumerControllerClient);
		//consumerControllerClient.getEmployee();
try
{
	System.out.println("codesquadz");
	Thread.sleep(1000);
}
catch(Exception e){}
	}

	@Bean
	public ConsumerControllerClient consumerControllerClient() {
		return new ConsumerControllerClient();
	}
}
