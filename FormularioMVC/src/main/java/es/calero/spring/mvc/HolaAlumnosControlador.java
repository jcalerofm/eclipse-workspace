package es.calero.spring.mvc;

// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/principal")
public class HolaAlumnosControlador {

  @RequestMapping("/muestraFormulario")
  public String muestraFormulario() {
    return "HolaAlumnosFormulario";
  }

  @RequestMapping("/procesarFormulario")
  public String procesoFormulario() {
    return "holaAlumnosSpring";
  }


  @RequestMapping("/procesarFormulario2")
  public String otroProcesoFormulario(@RequestParam("nombreAlumno") String nombre, Model modelo) {
    //Informacion que le vamos a agregar a la variable
    nombre+=" es un alumno genial";
    //mensaje definitivo
    String mensajeFinal = "¿Quien es el mejor alumno? " + nombre;
    //Agregamos la variable al modelo
    modelo.addAttribute("mensajeClaro", mensajeFinal);
    //Retornamos la vista
    return "holaAlumnos";
  }
}
