package com.sagar.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
//	@RequestMapping(value = "/elibrary")  //this is spring 4 version type
//	@GetMapping(value = "/elibrary")  //this is spring 5 type
	@GetMapping(value = {"/elibrary","/elibrary/home"})  //to provide multiple options
	public String displayHomepage() {
		return "home/index";
	}
	
	@GetMapping(value = "/elibrary/about")
	public String displayAboutpage() {
		return "home/about";
	}
	
}
