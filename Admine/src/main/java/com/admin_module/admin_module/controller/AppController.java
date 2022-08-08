package com.admin_module.admin_module.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.admin_module.admin_module.model.Staff;
import com.admin_module.admin_module.service.StaffService;

@Controller
public class AppController {

	@Autowired
	StaffService service;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Staff> listStaff = service.listAll();
		
		model.addAttribute("listStaff",listStaff);
		return "index";
	}
	
	@RequestMapping("/new")
	public String newStaffPage(Model model) {
		Staff staff=new Staff();
		model.addAttribute(staff);
		return "new_staff";
	}
	
	@RequestMapping(value = "/save", method =RequestMethod.POST)
	public String saveStudent(@ModelAttribute("staff") Staff staff ) {
		service.save(staff);
		return "redirect:/";
	}
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditStudentPage(@PathVariable (name="id") Long id) {
		ModelAndView mav=new ModelAndView("edit_staff");
		Staff staff=service.get(id);
		mav.addObject("staff",staff);
		return mav;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteStaffPage(@PathVariable (name="id") Long id) {
		service.delete(id);
		return "redirect:/";
	}
	
}



