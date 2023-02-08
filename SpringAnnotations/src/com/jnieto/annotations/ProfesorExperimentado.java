package com.jnieto.annotations;

import javax.annotation.*;

import org.springframework.beans.factory.annotation.*;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("Profe")
@Component
//@Scope("prototype") // Crea un nuevo espacio de memoria para cada objeto
public class ProfesorExperimentado implements EmpleadosStaff {

  // @Autowired
  // public ProfesorExperimentado(CreacionInformeGeneral informeGeneral) {
  // this.informeGeneral = informeGeneral;
  // }

  // @Autowired
  // public void setInformeGeneral(CreacionInformeGeneral informeGeneral) {
  // this.informeGeneral = informeGeneral;
  // }

  // Ejecucion de codigo despues de creacion del Bean
  @PostConstruct
  public void ejecutaPostCrear() {
    System.out.println("Ejecutado tras creacion del Bean");
  }

  // Ejecucion de codigo despues del apagado del contenedor Spring
  @PreDestroy
  public void ejecutaAntClose() {
    System.out.println("Ejecutado tras el apagado del contenedor Spring");
  }

  @Override
  public String getTareas() {
    return "Explicar Asignaturas";
  }

  @Override
  public String getInforme() {
    return informeGeneral.getInformeGeneral();
  }

  @Autowired
  @Qualifier("informeGeneralTrim3")
  private CreacionInformeGeneral informeGeneral;
}
