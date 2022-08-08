package com.example.StudentManagementInfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentManagementInfo.entity.Student;



public interface StudentRepository extends JpaRepository<Student, Long>{

}
