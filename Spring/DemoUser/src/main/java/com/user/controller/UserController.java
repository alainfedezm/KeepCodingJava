package com.user.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.user.model.User;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/user")
public class UserController {


	@GetMapping("/current")
	public String showDesignForm(Model model) {	
		model.addAttribute("user", new User());
		return "userForm";
	}
	
	@PostMapping
	public String processDesign(Model model, @Valid User user, Errors errors) {	
		if(errors.hasErrors()) {
			log.info("dentro");
			return "userForm";
		}
		log.info(user.toString());
		return "redirect:/";	
	}
	
}
