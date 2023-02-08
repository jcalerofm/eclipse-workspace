package com.jnieto.IoC;

public class DirectorEmpleado implements EmpleadosDAM {


  public DirectorEmpleado(CreacionInformes informeNuevo) {
    this.informeNuevo = informeNuevo;
  }

  @Override
  public String getTareas() {
    return "Gestiona la plantilla de la empresa";
  }
  @Override
  public String getInforme() {
    return "Informe generado por el director: " + informeNuevo.getInformes();
  }

  private CreacionInformes informeNuevo;
}


