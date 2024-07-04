package com.sms.service;

import java.util.List;

import com.sms.entities.Student;

public interface StudentService 
{
	Student createStudent(Student student);
	List<Student> getAllStudents();
	Student getStudentById(int id);
	 String deleteStudentById(int id);
	 Student updateStudent(int id,Student student);
}
