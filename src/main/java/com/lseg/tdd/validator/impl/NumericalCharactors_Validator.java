package com.lseg.tdd.validator.impl;

import com.lseg.tdd.util.Util;
import com.lseg.tdd.validator.Ivalidator;

public class NumericalCharactors_Validator implements Ivalidator {
    private int numberOfDigits;

    public NumericalCharactors_Validator(int numberOfDigits){
        this.numberOfDigits = numberOfDigits;
    }
    @Override
    public boolean validate(String password) {
        if (password.matches(".*\\d{"+numberOfDigits+"}.*")) return true;
        else return Util.logError("Password does not contains at least two digits",password);
    }
}
