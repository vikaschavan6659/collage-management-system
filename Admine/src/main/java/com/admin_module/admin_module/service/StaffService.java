package com.admin_module.admin_module.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin_module.admin_module.model.Staff;
import com.admin_module.admin_module.security.repository.StaffRepository;


@Service
public class StaffService {

	@Autowired
	private StaffRepository repo;
	
	public List<Staff> listAll(){
		return repo.findAll();
	}
	
	public void save(Staff staff) {
		repo.save(staff);
	}
	
	public Staff get(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
	
}


