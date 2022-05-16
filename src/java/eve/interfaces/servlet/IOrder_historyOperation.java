/*
 * IOrder_historyOperation.java
 *
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 11.4.2022 9:13
 *
 */

package eve.interfaces.servlet;

import base.interfaces.servlet.HTTPOperationtypes;

/**
 * Interface IOrder_historyOperation
 * 
 * Attributes: Defines the possible operations for the specified table
 * Methods: 
 * @author Franky Laseure
 */
public interface IOrder_historyOperation extends HTTPOperationtypes {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
    public static final byte SELECT_ORDER_HISTORY = 2;
    public static final byte SELECT_SEARCH = 3;
    public static final byte SELECT_SEARCHCOUNT = 4;
    public static final byte SELECT_Evetype = 100 + 0;
    public static final byte SELECT_Region = 100 + 1;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //UPDATE OPERATIONS
    public static final byte UPDATE_ORDER_HISTORY = 10;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //INSERT OPERATIONS
    public static final byte INSERT_ORDER_HISTORY = 20;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //DELETE OPERATIONS
    public static final byte DELETE_ORDER_HISTORY = 30;
    public static final byte DELETE_Evetype = 100 + 2;
    public static final byte DELETE_Region = 100 + 3;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //BACKUP OPERATIONS
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

}

