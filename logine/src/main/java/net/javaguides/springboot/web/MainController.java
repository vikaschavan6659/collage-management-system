package net.javaguides.springboot.web;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class MainController {
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/About")
	public String about() {
		return "About";
	}
	
	@GetMapping("/work")
	public String work() {
		return "work";
	}
	
	
	@GetMapping("/Contact")
	public String contact() {
		return "Contact";
	}
	
	@GetMapping("/services")
	public String services() {
		return "services";
	}
	
	@GetMapping("/chatbot")
	public String chatbot() {
		return "chatbot";
	}
}
