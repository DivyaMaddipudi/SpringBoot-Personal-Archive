package com.divya.springMVCBoot;

import org.springframework.stereotype.Controller;
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
	public ModelAndView add(@RequestParam("num1") int firstNumber, @RequestParam("num2") int secondNumber) {
		
		ModelAndView modelAndView = new ModelAndView("result");
		
		int res = firstNumber + secondNumber;
		
		modelAndView.addObject("res", res);
		
		return modelAndView;
	}
}
