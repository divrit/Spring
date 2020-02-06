package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.Services.userService;
import com.cts.model.User;

@Controller
public class controller {
	@Autowired
	userService userservices;
	@RequestMapping("yo")
	String getList(Model model) {
		
		List <User>list=userservices.getall();
	model.addAttribute("list",list)	;
		return "Listuser";
			}
	
}
