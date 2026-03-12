package com.example.FirstSpringBootProject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.example.FirstSpringBootProject.POJO.Department;

@Configuration
@PropertySource("classpath:check.properties")
public class CommonConfig {

	@Bean
	public Department getDepartment() {

		return new Department();
	}

}
