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

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class PasswordValidatorTest {
    private PasswordValidator getInstance(){
        return new PasswordValidator(3, Arrays.asList("*","!","%"),2);
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