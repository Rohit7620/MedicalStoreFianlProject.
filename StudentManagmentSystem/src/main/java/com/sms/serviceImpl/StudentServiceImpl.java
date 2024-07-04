package com.sms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.entities.Student;
import com.sms.repository.StudentRepository;
import com.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService
{

	@Autowired
	StudentRepository studentRepository;
	@Override
	public Student createStudent(Student student) 
	{
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}
	@Override
	public Student getStudentById(int id) {
		
		return studentRepository.findById(id).get();
	}
	@Override
	public String deleteStudentById(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
		return "Student deleted";
	}
	@Override
	public Student updateStudent(int id, Student student) {
		// TODO Auto-generated method stub
		
		Student s1=studentRepository.findById(id).get();
		s1.setName(student.getName());
		s1.setPhNo(student.getPhNo());
		s1.setAddress(student.getAddress());
		 
		return studentRepository.save(s1);
	}

}
