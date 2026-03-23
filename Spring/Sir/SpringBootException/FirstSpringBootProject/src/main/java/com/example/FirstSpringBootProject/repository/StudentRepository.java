package com.example.FirstSpringBootProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.FirstSpringBootProject.POJO.Student;
import com.example.FirstSpringBootProject.entity.StudentEntity;
@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

	StudentEntity save(StudentEntity st); 

	List<StudentEntity> findAll(); 

	void delete(StudentEntity entity);
	
	void deleteByStudentid(Integer id);
	
	Student findByStudentName(String name); 

}
