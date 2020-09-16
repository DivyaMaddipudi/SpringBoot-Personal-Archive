package com.divya.SpringBootMVC;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.divya.SpringBootMVC.model.Alien;

@Controller
public class HomeController {
	
	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("name", "Aliens");
	}
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("getAliens")
	public String getAliens(Model model) {
		List<Alien> aliens = Arrays.asList(new Alien(101, "Divya"), new Alien(102, "Veenai"));
		model.addAttribute("result", aliens);
		return "showAliens";
	}
	
//	@RequestMapping(value="addAlien", method=RequestMethod.POST)
	@PostMapping(value = "addAlien")
	public String addAlien(@ModelAttribute("alien") Alien alien) {
		
		return "result";
		
	}
}
