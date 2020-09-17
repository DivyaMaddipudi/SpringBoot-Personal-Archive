package com.divya.SpringBootSecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.divya.SpringBootSecurity.model.User;

public interface UserRepo extends JpaRepository<User, Long> {
	
	User findByUsername(String username);

}
