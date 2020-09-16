package com.divya.springMVCBoot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("add")
	public String add(@RequestParam("num1") int firstNumber, @RequestParam("num2") int secondNumber, Model model) {
		
		int res = firstNumber + secondNumber;
		
//		ModelAndView modelAndView = new ModelAndView("result");
//		modelAndView.addObject("res", res);
		
		model.addAttribute("res", res);
		return "result";
	}
}
