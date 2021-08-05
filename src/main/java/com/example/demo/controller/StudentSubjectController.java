package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Student1;
import com.example.demo.domain.Student2;
import com.example.demo.domain.Subject1;
import com.example.demo.domain.Subject2;
import com.example.demo.service.StudentSubjectService1;
import com.example.demo.service.StudentSubjectService2;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;

@Api
@RestController
@RequestMapping("/student-subject")
@RequiredArgsConstructor
public class StudentSubjectController {
	private final StudentSubjectService1 studentSubjectService1;
	private final StudentSubjectService2 studentSubjectService2;

	@GetMapping("/save1")
	public void save1() {
		studentSubjectService1.save();
	}

	@GetMapping("/read-student1")
	public List<Student1> readstudent1() {
		return studentSubjectService1.readStudent();
	}

	@GetMapping("/read-subject1")
	public List<Subject1> readsubject1() {
		return studentSubjectService1.readSubject();
	}

	@GetMapping("/save2")
	public void save2() {
		studentSubjectService2.save();
	}

	@GetMapping("/read-student2")
	public List<Student2> readstudent2() {
		return studentSubjectService2.readStudent();
	}

	@GetMapping("/read-subject2")
	public List<Subject2> readsubject2() {
		return studentSubjectService2.readSubject();
	}
}
