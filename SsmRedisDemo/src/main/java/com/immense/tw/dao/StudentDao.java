package com.immense.tw.dao;

import java.util.List;

import com.immense.tw.entity.Student;

public interface StudentDao {

	List<Student> getAll();
	
	void add1student(Student student);
	
	void update1student(Student student);
	
	void delete1student(Integer id);
	
}
