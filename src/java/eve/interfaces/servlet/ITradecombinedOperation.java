/*
 * ITradecombinedOperation.java
 *
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 30.10.2021 10:3
 *
 */

package eve.interfaces.servlet;

import base.interfaces.servlet.IDataServlet;

/**
 * Interface ITradecombinedOperation
 * 
 * Attributes: Defines the possible operations for the specified table
 * Methods: 
 * @author Franky Laseure
 */
public interface ITradecombinedOperation extends IDataServlet {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
    public static final byte SELECT_TRADECOMBINED = 2;
    public static final byte SELECT_SEARCH = 3;
    public static final byte SELECT_SEARCHCOUNT = 4;
    public static final byte SELECT_Evetype = 100 + 0;
    public static final byte SELECT_Systembuy_system = 100 + 1;
    public static final byte SELECT_Systemsell_system = 100 + 2;
    public static final byte SELECT_Tradecombined_sell = 100 + 3;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //UPDATE OPERATIONS
    public static final byte UPDATE_TRADECOMBINED = 10;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //INSERT OPERATIONS
    public static final byte INSERT_TRADECOMBINED = 20;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //DELETE OPERATIONS
    public static final byte DELETE_TRADECOMBINED = 30;
    public static final byte DELETE_Evetype = 100 + 4;
    public static final byte DELETE_Systembuy_system = 100 + 5;
    public static final byte DELETE_Systemsell_system = 100 + 6;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //BACKUP OPERATIONS
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

}

