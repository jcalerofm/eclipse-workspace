package com.jnieto.IoC;

public class SecretarioEmpleado implements EmpleadosDAM {

  @Override
  public String getTareas() {
    return "Gestionar la agenda de los jefes";
  }

  @Override
  public String getInforme() {
    return "Informe generado por el secretario: " + informeNuevo.getInformes();
  }

  public void setInformeNuevo(CreacionInformes informeNuevo) {
    this.informeNuevo = informeNuevo;
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
