package com.jcalero.MavenMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerLoginMio {

    @GetMapping("/miFormLogin")
    public String muestraMiLogin() {
      return "login-propio";
    }
}
