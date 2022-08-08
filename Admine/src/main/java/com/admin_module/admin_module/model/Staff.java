package com.admin_module.admin_module.model;


	import java.util.Date;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;


	@Entity
	@Table(name = "staffs")
	public class Staff {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column(name = "Collage_Id", nullable = false)
		private Long college_Id ;
		
		@Column(name="Department")
		private String department;
		
		@Column(name = "StaffName", nullable = false)
		private String staffName;
		
		@Column(name = "Contact_No", nullable = false)
		private Long phoneNumber;
		
		@Column(name = "Date_of_join", nullable = false)
		private Date DOJ;
		
		@Column(name = "Salary", nullable = false)
		private int salary;
		
		
		@Column(name = "Age", nullable = false)
		private int age;
		
		@Column(name = "Gender", nullable = false)
		private String gender;
		
		@Column(name = "email", nullable = false)
		private String email;
		
		@Column(name = "Address")
		private String address;
		
		
		
		public Staff() {
			super();
			
		}
		
		
		public Staff(Long id, Long college_Id, String department, String staffName, Long phoneNumber, Date dOJ, int salary, int age,
				String gender, String email, String address) {
			super();
			this.id = id;
			this.college_Id = college_Id;
			this.department = department;
			this.staffName = staffName;
			this.phoneNumber = phoneNumber;
			DOJ = dOJ;
			this.salary=salary;
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


		public Long getCollege_Id() {
			return college_Id;
		}


		public void setCollege_Id(Long College_Id) {
			this.college_Id = College_Id;
		}


		public String getDepartment() {
			return department;
		}


		public void setDepartment(String department) {
			this.department = department;
		}


		public String getStaffName() {
			return staffName;
		}


		public void setStaffName(String staffName) {
			this.staffName = staffName;
		}


		public Long getPhoneNumber() {
			return phoneNumber;
		}


		public void setPhoneNumber(Long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}


		public Date getDOJ() {
			return DOJ;
		}


		public void setDOJ(Date dOJ) {
			DOJ = dOJ;
		}
		
		public int getSalary() {
			return salary;
		}


		public void setSalary(int salary) {
			this.salary = salary;
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


