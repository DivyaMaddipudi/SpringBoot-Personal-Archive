package com.divya.SpringBootMVC.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.divya.SpringBootMVC.model.Alien;
import com.divya.SpringBootMVC.repo.AlienRepo;

@Controller
public class HomeController {

	@Autowired
	AlienRepo repo;

	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@GetMapping(value = "getAliens")
	public String getAliens(Model model) {

		model.addAttribute("result", repo.findAll());
		return "showAliens";

	}

	@GetMapping(value = "getAlien")
	public String getAlienById(@RequestParam int aid, Model model) {
		model.addAttribute("result", repo.getOne(aid));
		return "showAliens";
	}
	
	@GetMapping(value = "getAlienByAname")
	public String getAlienByAname(@RequestParam String aname, Model model) {
		model.addAttribute("result", repo.findByAnameOrderByAidDesc(aname));
		return "showAliens";
	}

	@GetMapping(value = "deleteAlien")
	public String deleteAlien(@RequestParam int aid, Model model) {
		repo.deleteById(aid);
		return "showAliens";

	}

	@PostMapping(value = "addAlien")
	public String addAlien(@ModelAttribute("alien") Alien alien) {
		repo.save(alien);
		return "result";
	}

}
