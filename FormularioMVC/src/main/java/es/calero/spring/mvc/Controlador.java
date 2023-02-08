package es.calero.spring.mvc;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador {

  @RequestMapping
  public String muestraPagina() {
    return "paginaFormulario";
  }

  @RequestMapping("/procesaFormulario")
  public String procesaFormulario() {
    return "paginaSalida";
  }
}
