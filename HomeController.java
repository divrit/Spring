package com.divrit.jdbctemplate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.divrit.jdbctemplate.model.employee;
import com.divrit.jdbctemplate.service.employeeService;

@Controller
public class HomeController {
	@Autowired
	employeeService empserv;
	@RequestMapping("one")
	String lol() {
		System.out.println("hello");
		return "home";
	}
	@RequestMapping("two")
	String list(Model model) {
		
		List<employee> list=empserv.getall();
		
		model.addAttribute("list",list);
		return "lo";
	}
	

}
