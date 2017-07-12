package com.immense.tw.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.immense.tw.entity.Student;
import com.immense.tw.service.StudentService;

public class TestAll {

	@Test
	public void getAll(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		StudentService studentService =  (StudentService) ac.getBean("studentService");
		List<Student> students = studentService.getAll();
		for (Student student : students) {
			System.out.println(student);
		}
	}
}
