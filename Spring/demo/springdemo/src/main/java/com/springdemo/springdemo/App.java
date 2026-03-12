package com.springdemo.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        Student s = new Student(123,"lavish","meerut");
//        System.out.println(s.getStudentId());
//        System.out.println(s.getStudentName());
//        System.out.println(s.getStudentAddress());
        @SuppressWarnings("resource")
		ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        Student student1 = (Student) context.getBean("student1");
        System.out.println( student1 );
    }	
}
