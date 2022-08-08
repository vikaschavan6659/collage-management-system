package com.admin_module.admin_module.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PassGen {
	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		System.out.println(encoder.encode("anjali"));
		System.out.println(encoder.encode("admin"));
	}
}
