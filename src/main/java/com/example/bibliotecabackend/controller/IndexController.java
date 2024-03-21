package com.example.bibliotecabackend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {

	@GetMapping("/")
	public String index(Model model) {
		return "index";
	}

	@GetMapping("/debug/users")
	public String userDebug(Model model) {
		return "HTML/userdebug";
	}

	@GetMapping("/debug/authors")
	public String authorDebug(Model model) {
		return "HTML/authordebug";
	}

	@GetMapping("/debug/books")
	public String bookDebug(Model model) {
		return "HTML/bookdebug";
	}

	@GetMapping("/debug/loans")
	public String loanDebug(Model model) {
		return "HTML/loandebug";
	}

	@GetMapping("/debug/reviews")
	public String reviewDebug(Model model) {
		return "HTML/reviewdebug";
	}

	@GetMapping("/debug/admins")
	public String adminDebug(Model model) {
		return "HTML/admindebug";
	}

	@GetMapping("/debug/subscription")
	public String subscriptionDebug(Model model) {
		return "HTML/subscriptiondebug";
	}

	
}
