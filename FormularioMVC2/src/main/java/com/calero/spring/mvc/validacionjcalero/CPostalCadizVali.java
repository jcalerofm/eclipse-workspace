package com.calero.spring.mvc.validacionjcalero;

import javax.validation.*;

public class CPostalCadizVali implements ConstraintValidator<CPostalCadiz, String> {

    private String prefiCPCadiz;

    @Override
    public void initialize(CPostalCadiz elCodigo) {
      prefiCPCadiz=elCodigo.value();
    }

    @Override
    public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
        boolean valido;
        if(arg0!=null){
            valido=arg0.startsWith(prefiCPCadiz);
        }else{
            valido=true;
        }
        return valido;
    }


}
