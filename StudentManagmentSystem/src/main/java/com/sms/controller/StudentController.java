package com.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.entities.Student;
import com.sms.service.StudentService;

@RestController
//@RequestMapping("/api")
public class StudentController 
{
	@Autowired
	StudentService studentService;
	
	@PostMapping("/api/createStudent")
	ResponseEntity<Student> createStudent(@RequestBody Student student )
	{
		return new ResponseEntity<Student>(studentService.createStudent(student),HttpStatus.CREATED);
	}
	@GetMapping("/getAllstudents")
	List<Student> getAllStudents()
	{
		return studentService.getAllStudents();		
	}
	@GetMapping("/getStudentById/{sid}")
	Student getStudentById(@PathVariable("sid") int id)
	{
		return studentService.getStudentById(id);
	}
	@DeleteMapping("/deleteStudent/{sid}")
	String deleteStudentById(@PathVariable("sid") int id)
	{
		return studentService.deleteStudentById(id);
	}
	@PutMapping("/updateStudent/{sid}")
	Student updateStudent(@PathVariable("sid") int id,@RequestBody Student student)
	{
		return studentService.updateStudent(id, student);
		
	}
	
	
	
}
