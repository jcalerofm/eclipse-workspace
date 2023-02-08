package com.jnieto.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class UsoAnnotations {
	
	public static void main(String[] args) {
	
	//! CREAMOS UN CONTEXTO, CARGAMOS EL ARCHIVO XML
	ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	
	// PEDIRLE EL OBJETO BEAN
	//EmpleadosStaff jnieto = contexto.getBean("Profe", EmpleadosStaff.class);
	EmpleadosStaff jnieto = contexto.getBean("profesorExperimentado", EmpleadosStaff.class);
	
	
	// UTILIZAR EL BEAN	
	System.out.println(jnieto.getTareas());
	System.out.println(jnieto.getInforme());

	
	
	// CERRAR EL CONTEXTO
	contexto.close();
	}
}
