/*
 * Copyright(C) 2010 MILLENNIUM IT SOFTWARE (PRIVATE) LIMITED
 * All rights reserved.
 * <p>
 * THIS IS UNPUBLISHED PROPRIETARY SOURCE CODE OF
 * MILLENNIUM IT SOFTWARE (PRIVATE) LIMITED.
 * <p>
 * This copy of the Source Code is intended for MILLENNIUM IT SOFTWARE (PRIVATE) LIMITED 's internal use only and is
 *  intended for view by persons duly authorized by the management of MILLENNIUM IT SOFTWARE (PRIVATE) LIMITED. No
 * part of this file may be reproduced or distributed in any form or by any
 * means without the written approval of the Management of MILLENNIUM IT SOFTWARE (PRIVATE) LIMITED.
 * <p>
 * Created by sampathw on 13/10/2020.
 *
 */
package com.lseg.tdd;

import com.lseg.tdd.util.Util;
import java.util.*;

public class PasswordValidator {
    private int minLength;
    private List<String> specialChars;
    private int minNumbers;

    public PasswordValidator(int minLength ,List<String> specialChars ,int minNumbers) {
        this.minLength = minLength;
        this.specialChars = specialChars;
        this.minNumbers = minNumbers;
    }
    public boolean validate(String password) {
        if (password != null && password.length() >= minLength) {

            if(!specialChars.stream().anyMatch(ch ->password.contains(ch))){
                
                if(password.matches(".*\\d{2}.*")){
                    return true;
                }
                else{ Util.logError("Password does not contain at least two numbers ", password);}
            }
            else{ Util.logError("Password contains special characters", password); }
        }
        else { Util.logError("Password do not meet minimum length", password);}

        return false;
    }

}