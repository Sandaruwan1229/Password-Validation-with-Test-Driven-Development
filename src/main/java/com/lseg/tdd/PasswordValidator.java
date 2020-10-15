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
import com.lseg.tdd.validator.Ivalidator;

import java.util.*;

public class PasswordValidator {

    private List<Ivalidator> validators;

    public PasswordValidator(List<Ivalidator> validators) {
        this.validators = validators;
    }
    public boolean validate(String password) {
        return validators.stream().allMatch(validator -> validator.validate(password));
    }

}