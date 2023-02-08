package com.jnieto.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

  public static void main(String[] args) {
    // Creamos un contexto, cargamos el xml
    ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

    //Pedimos un bean
    EmpleadosDAM jnieto = contexto.getBean("miEmpleado", EmpleadosDAM.class);
    //EmpleadosDAM chiqui = contexto.getBean("miSecretarioEmpleado", EmpleadosDAM.class);
    SecretarioEmpleado chiqui = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);

    //Usamos el bean
    System.out.println(jnieto.getTareas());
    System.out.println(jnieto.getInforme());
    System.out.println(chiqui.getTareas());
    System.out.println(chiqui.getInforme());
    System.out.println(chiqui.getNombreEmpresa());
    System.out.println("Email: " + chiqui.getEmail());
    
    JefeEmpleado jefe = contexto.getBean("miJefeEmpleado", JefeEmpleado.class);
    
    System.out.println(jefe.getTareas());
    System.out.println(jefe.getInforme());
    System.out.println(jefe.getNombreEmpresa());
    System.out.println("Email: " + jefe.getEmail());
    

    contexto.close();

  }


}
