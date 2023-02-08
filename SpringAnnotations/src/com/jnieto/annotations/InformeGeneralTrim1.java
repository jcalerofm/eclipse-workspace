package com.jnieto.annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeGeneralTrim1 implements CreacionInformeGeneral {

	@Override
	public String getInformeGeneral() {
		return "Presentacion del Informe General del primer Trimestre";
	}

}
