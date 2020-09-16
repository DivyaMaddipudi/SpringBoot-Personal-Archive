package com.divya.springMVCBoot;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		
		return "index.jsp";
	}
	
	@RequestMapping("add")
	public String add(HttpServletRequest req) {
		
		int firstNumber = Integer.parseInt(req.getParameter("num1"));
		int secondNumber = Integer.parseInt(req.getParameter("num2"));
		
		int result = firstNumber + secondNumber;
		HttpSession session = req.getSession();
		session.setAttribute("result", result);
		
		return "result.jsp";
	}
}
