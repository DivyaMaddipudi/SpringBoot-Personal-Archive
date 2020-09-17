package com.divya.SpringBootMVC.controller;

import java.awt.PageAttributes.MediaType;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.divya.SpringBootMVC.model.Alien;
import com.divya.SpringBootMVC.repo.AlienRepo;

@RestController
public class HomeController {

	@Autowired
	AlienRepo repo;

	@GetMapping(path = "aliens", produces = {"application/json"})
	public List<Alien> getAliens() {
		
		List<Alien> aliens = repo.findAll();

		return aliens;

	}
	
	@GetMapping("alien/{aid}")
	public Alien getAlien(@PathVariable("aid") int aid) {
		
		Alien alien = repo.findById(aid).orElse(null);
		return alien;
	}
	
	@PostMapping(path = "alien", consumes = {"application/json"})
	public Alien addAlien(@RequestBody Alien alien) {
		repo.save(alien);
		return alien;
	}
	
}
