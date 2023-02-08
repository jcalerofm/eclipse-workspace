package com.jnieto.annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeGeneralTrim2 implements CreacionInformeGeneral {

	@Override
	public String getInformeGeneral() {
		// TODO Auto-generated method stub
		return "Presentacion de suspensos y aprobados del Trimestre 2";
	}

}
