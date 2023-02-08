package com.jnieto.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class UsoAnnotations2 {

	public static void main(String[] args) {

	//! CREAMOS UN CONTEXTO, CARGAMOS EL ARCHIVO .CLASS
	//ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
	AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleConfig.class); //AQUI ESTAMOS USANDO LA CLASE EN LUGAR DEL XML

	// PEDIRLE EL OBJETO BEAN
	//EmpleadosStaff jnieto = contexto.getBean("Profe", EmpleadosStaff.class);
	EmpleadosStaff jnieto = contexto.getBean("profesorExperimentado", EmpleadosStaff.class);
	EmpleadosStaff chiqui = contexto.getBean("profesorExperimentado", EmpleadosStaff.class);


	// UTILIZAR EL BEAN
 // Apuntan al mismo objeto en memoria??
  if(jnieto == chiqui){
    System.out.println("Apuntan al mismo objeto en memoria");
    System.out.println(jnieto + "\n" + chiqui);
  }else{
    System.out.println("Apuntan a diferentes objetos en memoria");
    System.out.println(jnieto + "\n" + chiqui);
  }

//	System.out.println(jnieto.getTareas());
//	System.out.println(jnieto.getInforme());



	// CERRAR EL CONTEXTO
	contexto.close();
	}
}




//PREGUNTA EXAMEN: ESTE ARCHIVO ES EL USO DEL BEAN



//CICLO DE VIDA DEL BEAN
//1 CONTENEDOR SPRING INICIADO
//2 INSTANCIACION DEL BEAN
//3 INYECCION DE DEPENDENCIAS
//4 PROCESADO DEL BEAN
//5 BEAN LISTO PARA SU USO
//6 CONTENEDOR SPRING APAGADO

//Ciclo de vida de un bean en Spring:
//
//1- El contenedor Spring es iniciado y comienza a gestionar los beans que están definidos en la aplicación.
//
//2- Se instancia el bean mediante la creación de una nueva instancia de la clase que lo representa.
//
//3- Se inyectan las dependencias del bean, es decir, se asignan los valores de las propiedades que requieren 
//otros beans para funcionar correctamente.
//
//4- Se procesa el bean, lo que puede incluir la ejecución de métodos específicos para su inicialización o configuración.
//
//5- Una vez que el bean ha sido construido y sus dependencias han sido inyectadas, está listo para ser utilizado por otros beans de la aplicación.
//
//6- Cuando se apaga el contenedor Spring, se destruyen todos los beans gestionados por él, lo que puede incluir la ejecución 
//de métodos específicos para limpiar recursos y liberar memoria.
