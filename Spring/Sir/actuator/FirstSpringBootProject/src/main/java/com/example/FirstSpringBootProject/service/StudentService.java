package com.example.FirstSpringBootProject.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FirstSpringBootProject.POJO.Student;
import com.example.FirstSpringBootProject.entity.StudentEntity;
import com.example.FirstSpringBootProject.repository.StudentRepository;

@Service
public class StudentService {
	
	

	@Autowired
	private StudentRepository repository;

	public Student createStudent(Student st) {
		StudentEntity s = new StudentEntity(st);
		StudentEntity entity = repository.save(s);
		return new Student(entity);
	}

	public List<Student> getAllStudents() {
		List<StudentEntity> listEntity = repository.findAll();
		List<Student> listStudents = listEntity.stream().map(x -> new Student(x)).collect(Collectors.toList());
		return listStudents;

	}

	public Student updateStudent(Student st) {

		StudentEntity s = new StudentEntity(st);
		StudentEntity entity = repository.save(s);
		return new Student(entity);
	}

	public void deleteStudent(Integer id) {

		repository.deleteById(id);
	}

}
