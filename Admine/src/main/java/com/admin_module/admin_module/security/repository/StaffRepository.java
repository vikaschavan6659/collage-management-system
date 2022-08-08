package com.admin_module.admin_module.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.admin_module.admin_module.model.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff,Long>{

}
