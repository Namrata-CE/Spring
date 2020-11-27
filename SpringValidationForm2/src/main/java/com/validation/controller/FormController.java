package com.validation.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.validation.model.FormUser;

@Controller
public class FormController {
	
	
	@RequestMapping("/")
	public String home() {
		System.out.println("Going home...");
		return "index";
	}
	@GetMapping("/myform")
	public ModelAndView findAllproduct() {
		FormUser obj=new FormUser();
		return new ModelAndView("register_form","user",obj);
	}
		
	@PostMapping("/myform")
	public String submitForm(@Valid @ModelAttribute("user") FormUser formuser,
			BindingResult bindingResult, Model model) {
		System.out.println("Professing form...");
		System.out.println(formuser);
		
		if (bindingResult.hasErrors()) {
			return "register_form";
		}
		
		return "register_success";
	}

}
