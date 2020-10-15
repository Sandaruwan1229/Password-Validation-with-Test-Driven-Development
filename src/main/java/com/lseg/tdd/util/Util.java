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

package com.lseg.tdd.util;

public class Util {

    /**
     * This method will console log error message if a validation is failed
     * @param message Error message
     * @param password error generated password string
     * @return
     */
    public static boolean logError(String message, String password) {
        System.out.println(message + " , Given Password : " + password);
        return false;
    }
}
