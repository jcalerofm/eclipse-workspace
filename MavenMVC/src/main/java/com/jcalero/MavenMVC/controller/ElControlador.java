package com.jcalero.MavenMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ElControlador {
	
	@GetMapping("/")
	public String muestraInicio() {
		return "inicio";
	}
}
