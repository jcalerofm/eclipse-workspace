package com.jcalero.MavenMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ElControlador {

	@GetMapping("/")
	public String muestraInicio() {
		return "inicio";
	}

  //Agragar mapping a administradores
  @GetMapping("/administradores")
  public String muestraAdministradores() {
    return "administradores";
  }

  //Agregar mapping a ayudantes
  @GetMapping("/ayudantes")
  public String muestraAyudantes() {
    return "ayudantes";
  }

  //Agregar mapping a accesoDenegado
  @GetMapping("/accesoDenegado")
  public String muestraAccesoDenegado() {
    return "accesoDenegado";
  }
}
