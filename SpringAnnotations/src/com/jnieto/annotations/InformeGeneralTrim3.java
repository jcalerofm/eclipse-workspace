package com.jnieto.annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeGeneralTrim3 implements CreacionInformeGeneral {

	@Override
	public String getInformeGeneral() {
		// TODO Auto-generated method stub
		return "Alumnos que han aprobado el curso";
	}

}
