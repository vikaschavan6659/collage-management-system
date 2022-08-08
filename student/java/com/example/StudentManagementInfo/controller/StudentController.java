package com.example.StudentManagementInfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.StudentManagementInfo.entity.Student;
import com.example.StudentManagementInfo.service.StudentService;

@Controller
public class StudentController {
	
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	// handler method to handle list student and return mode and view
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		
		return "students";
	}
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		
		// create student object to hold student form data
		Student student = new Student();
		model.addAttribute("student", student);
		return "create_student";
		
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.savStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String editStudentFrom(@PathVariable Long id, Model model ) {
		model.addAttribute("student",studentService.getStudentById(id));
		return "edit_student";
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student, Model model)
	{
		// get student from database by id
		
		Student existingStudent=studentService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setStudentId(student.getStudentId());
		existingStudent.setStudentName(student.getStudentName());
		existingStudent.setDeparment(student.getDeparment());
		existingStudent.setPhoneNumber(student.getPhoneNumber());
		//existingStudent.setDOB(student.getDOB());
		existingStudent.setAge(student.getAge());
		existingStudent.setGender(student.getGender());
		existingStudent.setEmail(student.getEmail());
	    existingStudent.setAddress(student.getAddress());
	    
	    //save update student object
	    studentService.updateStudent(existingStudent);
	    return "redirect:/students";
	}
	
	//handular method to handle delate student requst
	
	@GetMapping("/students/{id}")
	public String deleteStudent( @PathVariable Long id) {
		studentService.deleteStudentById(id);
		return "redirect:/students";
	}
}
