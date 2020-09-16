package com.divya.springMVCBoot;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		
		return "index.jsp";
	}
	
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("num1") int firstNumber, @RequestParam("num2") int secondNumber) {
		
		ModelAndView modelAndView = new ModelAndView("result.jsp");
		
		int result = firstNumber + secondNumber;
		
		modelAndView.addObject("result", result);
		
		return modelAndView;
	}
}
