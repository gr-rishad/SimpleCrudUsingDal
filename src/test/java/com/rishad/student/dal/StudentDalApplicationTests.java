package com.rishad.student.dal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.rishad.student.dal.entities.Student;
import com.rishad.student.dal.repos.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentDalApplicationTests {
	
	@Autowired
	private StudentRepository studentRepository;

	@Test
	public void testCreateStudent() {
		
		Student student = new Student();
		student.setName("Golam Rabbai");
		student.setCourse("Android");
		student.setFee(30d);
		
		studentRepository.save(student);
	}
	
	@Test
	public void findStudentById() {
	Student student=	studentRepository.findById(1l).get();
	System.out.println(student);
	}

	@Test
	public void updateStudent() {
		Student student = studentRepository.findById(1l).get();
		student.setFee(40d);
		
		studentRepository.save(student);
		
	}
	@Test
	public void deleteStudent() {
		
		Student student = new Student();
		student.setId(1l);
		studentRepository.delete(student);
	}
	
}
