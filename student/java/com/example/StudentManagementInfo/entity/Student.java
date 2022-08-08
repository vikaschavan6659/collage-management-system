package com.example.StudentManagementInfo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "Collage_Id", nullable = false ,unique = true)
	private Long studentId ;
	
	@Column(name="Department")
	private String deparment;
	
	@Column(name = "Student_Name", nullable = false)
	private String studentName;
	
	@Column(name = "Contact_No", nullable = false)
	private Long phoneNumber;
	
	@Column(name = "Date_Of_Birth", nullable = false)
	private Date DOB;
	
	@Column(name = "Age", nullable = false)
	private int age;
	
	@Column(name = "Gender", nullable = false)
	private String gender;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "Address")
	private String address;
	
	
	
	public Student() {
		super();
		
	}
	
	
	public Student(Long id, Long studentId, String deparment, String studentName, Long phoneNumber, Date dOB, int age,
			String gender, String email, String address) {
		super();
		this.id = id;
		this.studentId = studentId;
		this.deparment = deparment;
		this.studentName = studentName;
		this.phoneNumber = phoneNumber;
		DOB = dOB;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.address = address;
	
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getStudentId() {
		return studentId;
	}


	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}


	public String getDeparment() {
		return deparment;
	}


	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public Long getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public Date getDOB() {
		return DOB;
	}


	public void setDOB(Date dOB) {
		DOB = dOB;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

	
     
	

}
