package com.divya.springMVCBoot;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		
		return "index.jsp";
	}
	
	@RequestMapping("add")
	public String add(@RequestParam("num1") int firstNumber, @RequestParam("num2") int secondNumber, HttpSession session) {
		
		int result = firstNumber + secondNumber;
		
		session.setAttribute("result", result);
		
		return "result.jsp";
	}
}
