/*
 * IStockOperation.java
 *
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 24.9.2021 14:40
 *
 */

package eve.interfaces.servlet;

import base.interfaces.servlet.IDataServlet;

/**
 * Interface IStockOperation
 * 
 * Attributes: Defines the possible operations for the specified table
 * Methods: 
 * @author Franky Laseure
 */
public interface IStockOperation extends IDataServlet {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
    public static final byte SELECT_STOCK = 2;
    public static final byte SELECT_SEARCH = 3;
    public static final byte SELECT_SEARCHCOUNT = 4;
    public static final byte SELECT_Evetype = 100 + 0;
    public static final byte SELECT_Stocktrade = 100 + 1;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //UPDATE OPERATIONS
    public static final byte UPDATE_STOCK = 10;
//Custom code, do not change this line
//add here custom operations
    public static final byte UPDATE_ADDSTOCK = 11;
    public static final byte UPDATE_REMOVESTOCK = 12;
//Custom code, do not change this line   

    //INSERT OPERATIONS
    public static final byte INSERT_STOCK = 20;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //DELETE OPERATIONS
    public static final byte DELETE_STOCK = 30;
    public static final byte DELETE_Evetype = 100 + 2;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //BACKUP OPERATIONS
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

}
