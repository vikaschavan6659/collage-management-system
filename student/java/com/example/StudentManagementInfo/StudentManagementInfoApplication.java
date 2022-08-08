package com.example.StudentManagementInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.StudentManagementInfo.entity.Student;
import com.example.StudentManagementInfo.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementInfoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementInfoApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
	
	
	}

}
