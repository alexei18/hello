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
	@GetMapping("/register")
	public String register(Model model) {
		return "HTML/register";
	}

	@GetMapping("/cpanel")
	public String cpanel(Model model) {
		return "HTML/cpanel";
	}
	@GetMapping("/cpanel/management-a")
	public String managementa(Model model) {
		return "HTML/management-author";
	}
	@GetMapping("/cpanel/management-b")
	public String managementb(Model model) {
		return "HTML/management-book";
	}
	@GetMapping("/cpanel/management")
	public String management(Model model) {
		return "HTML/management";
	}
	@GetMapping("/login")
	public String login(Model model) {
		return "HTML/login";
	}
	@GetMapping("/management-aa")
	public String managementaa(Model model) {
		return "HTML/admin";
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
