/*
 * ITradecombined_sellOperation.java
 *
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 16.11.2021 15:45
 *
 */

package eve.interfaces.servlet;

import base.interfaces.servlet.IDataServlet;

/**
 * Interface ITradecombined_sellOperation
 * 
 * Attributes: Defines the possible operations for the specified table
 * Methods: 
 * @author Franky Laseure
 */
public interface ITradecombined_sellOperation extends IDataServlet {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
    public static final byte SELECT_TRADECOMBINED_SELL = 2;
    public static final byte SELECT_SEARCH = 3;
    public static final byte SELECT_SEARCHCOUNT = 4;
    public static final byte SELECT_Ordersbuy_order_id = 100 + 0;
    public static final byte SELECT_Orderssell_order_id = 100 + 1;
    public static final byte SELECT_Tradecombined = 100 + 2;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //UPDATE OPERATIONS
    public static final byte UPDATE_TRADECOMBINED_SELL = 10;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //INSERT OPERATIONS
    public static final byte INSERT_TRADECOMBINED_SELL = 20;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //DELETE OPERATIONS
    public static final byte DELETE_TRADECOMBINED_SELL = 30;
    public static final byte DELETE_Ordersbuy_order_id = 100 + 3;
    public static final byte DELETE_Orderssell_order_id = 100 + 4;
    public static final byte DELETE_Tradecombined = 100 + 5;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //BACKUP OPERATIONS
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

}

