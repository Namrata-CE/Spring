package com.strap.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.strap.model.BootStrapModel;

//import com.demo.model.FormModel;


@Controller
public class BootStrapController {

	
	@GetMapping("/form")
	public ModelAndView findAllproduct() {
		BootStrapModel obj=new BootStrapModel();
		return new ModelAndView("index","user",obj);
	}
		
	
	@PostMapping("/form")
	public String submitForm(@Valid @ModelAttribute("FormModel") BootStrapModel form, Model model) {
		System.out.println("Professing form...");
		System.out.println(form);	
			
		return "register_success";
	}
}
