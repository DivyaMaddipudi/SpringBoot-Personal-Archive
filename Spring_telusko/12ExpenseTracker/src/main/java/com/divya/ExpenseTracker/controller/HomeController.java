package com.divya.ExpenseTracker.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.divya.ExpenseTracker.model.Expense;
import com.divya.ExpenseTracker.model.ExpenseTrackerModel;
import com.divya.ExpenseTracker.repo.ExpenseRepo;

@Controller
public class HomeController {

	@Autowired
	private ExpenseTrackerModel expenseTracker;

	@Autowired
	private ExpenseRepo repo;

	@GetMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping(value = "/addInitialAmount", method = RequestMethod.POST)
	public String addInitialAmount(@RequestParam("initialAmount") String name,
			@RequestParam("basicAmount") String amount, Model model) {
		int amt = Integer.parseInt(amount);
		expenseTracker.setInitialAmount(amt);
		model.addAttribute("amount", amt);
		return "addInitialAmount";
	}

	@RequestMapping(value = "/addExpense", method =  RequestMethod.POST)
	public String addExpense(@ModelAttribute Expense exp, Model model) {
		repo.save(exp);

		int income = expenseTracker.getIncome();
		int expense = expenseTracker.getExpense();
		if (exp.getAmount() > 0) {
			income += exp.getAmount();
			expenseTracker.setIncome(income);
			System.out.println(expenseTracker.getIncome());
			
			int balance = exp.getAmount() + expenseTracker.getInitialAmount();
			expenseTracker.setInitialAmount(balance);
			model.addAttribute("amount", balance);
		} else {
			expense += exp.getAmount();
			expenseTracker.setExpense(expense);
			System.out.println(expenseTracker.getIncome());
			
			int balance = expenseTracker.getInitialAmount() + exp.getAmount();
			expenseTracker.setInitialAmount(balance);
			model.addAttribute("amount", balance);
		}
		
		model.addAttribute("incomeVal", income);
		model.addAttribute("expense", expense);

		List<Expense> expList = repo.findAll();
		model.addAttribute("expList", expList);


		return "addInitialAmount";
	}

}
