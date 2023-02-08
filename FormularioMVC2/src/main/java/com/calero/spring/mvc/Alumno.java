package com.calero.spring.mvc;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.calero.spring.mvc.validacionjcalero.CPostalCadiz;

public class Alumno {

  @NotNull
  @Size(min = 2, message = "Campo obligatorio, minimo 2 caracteres")
  private String nombre;
  @Pattern(regexp="[a-zA-z]{3,}", message="Minimo 3 caracteres y solo se permiten caracteres del abecedario")
  private String apellido;
  @Min(value = 10, message = "Debe ser mayor de 10 años")
  @Max(value = 100, message = "Debe ser menor de 100 años")
  private int edad;
  @NotNull
  @Email
  private String email;
  //@Pattern(regexp="{0-9}{5}", message="Cinco valores numericos")
  @CPostalCadiz
  private String codigoPostal;
  private String optativa;
  private String ciudadEstudios;
  private String idiomasAlumno;

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCodigoPostal() {
    return codigoPostal;
  }

  public void setCodigoPostal(String codigoPostal) {
    this.codigoPostal = codigoPostal;
  }

  public String getOptativa() {
    return optativa;
  }

  public void setOptativa(String optativa) {
    this.optativa = optativa;
  }

  public String getCiudadEstudios() {
    return ciudadEstudios;
  }

  public void setCiudadEstudios(String ciudadEstudios) {
    this.ciudadEstudios = ciudadEstudios;
  }

  public String getIdiomasAlumno() {
    return idiomasAlumno;
  }

  public void setIdiomasAlumno(String idiomasAlumno) {
    this.idiomasAlumno = idiomasAlumno;
  }

}
