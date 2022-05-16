/*
 * IView_evetypesOperation.java
 *
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 11.4.2022 9:13
 *
 */

package eve.interfaces.servlet;

import base.interfaces.servlet.HTTPOperationtypes;

/**
 * Interface IView_evetypesOperation
 * 
 * Attributes: Defines the possible operations for the specified view
 * Methods: 
 * @author Franky Laseure
 */
public interface IView_evetypesOperation extends HTTPOperationtypes {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
//Custom code, do not change this line
//add here custom operations
    public static final byte SELECT_SHIPS = 2;
    public static final byte SELECT_MODULES = 3;
    public static final byte SELECT_CHARGES = 4;
    public static final byte SELECT_DRONES = 5;
    public static final byte SELECT_DEPLOYABLES = 6;
    public static final byte SELECT_MINERALS = 7;
    public static final byte SELECT_SALVAGED = 8;
    public static final byte SELECT_BLEUPRINT = 9;
    public static final byte SELECT_BLEUPRINTRESULT = 10;
    public static final byte SELECT_COMMODITY = 11;
    public static final byte SELECT_MATERIAL = 12;
    public static final byte SELECT_PLANETARYCOMMODITY = 13;
//Custom code, do not change this line
}

