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

import com.lseg.tdd.validator.Ivalidator;
import com.lseg.tdd.validator.impl.MinimumLength_Validator;
import com.lseg.tdd.validator.impl.NumericalCharactors_Validator;
import com.lseg.tdd.validator.impl.SpecialCharactors_Validator;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PasswordValidatorTest {

    private PasswordValidator getInstance(){
        List<Ivalidator> validators = new ArrayList<>();
        validators.add( new MinimumLength_Validator(3));
        validators.add(new SpecialCharactors_Validator(Arrays.asList("*","!","%")));
        validators.add(new NumericalCharactors_Validator(2));

        return new PasswordValidator(validators);
    }
    @Test
    public void testSpecialChars(){
        PasswordValidator passwordValidator = getInstance();
        Assert.assertTrue(passwordValidator.validate("test123"));
        Assert.assertFalse(passwordValidator.validate("test*"));
        Assert.assertFalse(passwordValidator.validate(null));

    }

    @Test
    public void testNumbers(){
        PasswordValidator passwordValidator = getInstance();
        Assert.assertTrue(passwordValidator.validate("test123"));
        Assert.assertFalse(passwordValidator.validate("test"));
        Assert.assertFalse(passwordValidator.validate(null));
        Assert.assertFalse(passwordValidator.validate("test1"));

    }
}