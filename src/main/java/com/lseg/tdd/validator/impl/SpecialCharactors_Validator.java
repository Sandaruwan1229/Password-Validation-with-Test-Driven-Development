package com.lseg.tdd.validator.impl;

import com.lseg.tdd.util.Util;
import com.lseg.tdd.validator.Ivalidator;
import java.util.*;


public class SpecialCharactors_Validator implements Ivalidator {
    private List<String> specialChars;

    public SpecialCharactors_Validator(List<String> specialChars){
        this.specialChars = specialChars;
    }
    public boolean validate(String password){
        if(!specialChars.stream().anyMatch(ch ->password.contains(ch))){
            return true;
        }
        return Util.logError("Password contains Special Charactors",password);
    }
}
