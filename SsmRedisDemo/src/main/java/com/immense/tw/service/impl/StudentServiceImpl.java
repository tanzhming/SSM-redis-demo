package com.immense.tw.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.immense.tw.dao.StudentDao;
import com.immense.tw.entity.Student;
import com.immense.tw.service.StudentService;

@Service(value="studentService")
public class StudentServiceImpl implements StudentService{
	
	@Resource
	private StudentDao studentDao;

	@Override
	public List<Student> getAll() {
		return studentDao.getAll();
	}

	@Override
	public void add1student(Student student) {
		studentDao.add1student(student);
	}

	@Override
	public void update1student(Student student) {
		studentDao.update1student(student);
	}

	@Override
	public void delete1student(Integer id) {
		studentDao.delete1student(id);
	}

}
