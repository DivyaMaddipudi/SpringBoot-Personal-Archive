package com.divya.SpringBootSecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.divya.SpringBootSecurity.UserPrincipal;
import com.divya.SpringBootSecurity.model.User;
import com.divya.SpringBootSecurity.repository.UserRepo;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = repo.findByUsername(username);
		
		if(user == null)
			throw new UsernameNotFoundException("Invalid User");
		
		return new UserPrincipal(user);
	}

}
