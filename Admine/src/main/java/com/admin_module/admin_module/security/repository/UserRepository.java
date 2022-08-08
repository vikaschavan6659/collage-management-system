package com.admin_module.admin_module.security.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.admin_module.admin_module.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

		@Query("SELECT u from User u Where u.username = :username")
		public User getUserByUsername(@Param("username") String username);
		
	
}
