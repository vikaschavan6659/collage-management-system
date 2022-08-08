package com.example.StudentManagementInfo.service;

import java.util.List;

import com.example.StudentManagementInfo.entity.Student;

public interface StudentService {
     List<Student> getAllStudents();
     
     Student savStudent(Student student);
     
     Student getStudentById(Long id);
     Student updateStudent(Student student);
     
     void deleteStudentById(Long id);
}
