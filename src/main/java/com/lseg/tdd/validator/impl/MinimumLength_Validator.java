package com.lseg.tdd.validator.impl;

import com.lseg.tdd.util.Util;
import com.lseg.tdd.validator.Ivalidator;

public class MinimumLength_Validator implements Ivalidator {
    private  int minLength;

    public MinimumLength_Validator(int minLength){
        this.minLength = minLength;
    }
    @Override
    public boolean validate(String password) {
        if(password != null && password.length() >= minLength){
            return true;
        }
        return Util.logError("PAssword does not meet minimum length",password);
    }
}
