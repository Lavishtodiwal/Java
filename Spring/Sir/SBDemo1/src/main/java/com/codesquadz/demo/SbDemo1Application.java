package com.codesquadz.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.codesquadz.demo.model.Address;
import com.codesquadz.demo.model.Student;

@SpringBootApplication
public class SbDemo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SbDemo1Application.class, args);
		System.out.println("Hello .....");
		Address add=context.getBean(Address.class);
		add.setHno(1231);
		add.setCity("East Delhi");
		add.setColony("Ashok nagar");
		Student obj=context.getBean(Student.class);
		obj.setRoll(101);
		obj.setSname("Ravi");
		//obj.setAddress(add);
		System.out.println("Roll no. :"+obj.getRoll());
		System.out.println("Student name :"+obj.getSname());
		obj.display();
		
	}

}
