package com.jnieto.IoC;

public class JefeEmpleado implements EmpleadosDAM {

  public JefeEmpleado(CreacionInformes informeNuevo) {
    this.informeNuevo = informeNuevo;
  }

  @Override
  public String getTareas() {
    return "Gestiona la plantilla de la empresa";
  }

  @Override
  public String getInforme() {
    return "Informe generado por el jefe: " + informeNuevo.getInformes();
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getNombreEmpresa() {
    return nombreEmpresa;
  }

  public void setNombreEmpresa(String nombreEmpresa) {
    this.nombreEmpresa = nombreEmpresa;
  }

  private CreacionInformes informeNuevo;
  private String email;
  private String nombreEmpresa;

}
