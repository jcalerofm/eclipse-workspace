package com.calero.spring.mvc.validacionjcalero;

import java.lang.annotation.*;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CPostalCadizVali.class)//Futura clase que tendra la logica de validacion
@Target({ElementType.METHOD, ElementType.FIELD})//Donde vamos a aplicar la validacion
@Retention(RetentionPolicy.RUNTIME)//Cuando se chequea q cumple la validacion
public @interface CPostalCadiz {
	public String value() default "11";
	public String message() default "El código postal de la provincia de Cádiz empieza por 11";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
