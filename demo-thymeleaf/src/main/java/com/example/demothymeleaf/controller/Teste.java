package com.example.demothymeleaf.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Teste {	
	
	@GetMapping("/home")
	public String testeMe(ModelMap model){
		model.addAttribute("msg", "Esta é uma mensagem vinda do controller");
		model.addAttribute("lista", List.of("Jobs", "Bill Gates", "Elon Musk"));
		return "home/home";
	}
}
