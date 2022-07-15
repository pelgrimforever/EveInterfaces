/*
 * ITradeOperation.java
 *
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 9.5.2022 11:11
 *
 */

package eve.interfaces.servlet;

/**
 * Interface ITradeOperation
 * 
 * Attributes: Defines the possible operations for the specified table
 * Methods: 
 * @author Franky Laseure
 */
public interface ITradeOperation {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
    public static final byte SELECT_TRADE = 2;
    public static final byte SELECT_SEARCH = 3;
    public static final byte SELECT_SEARCHCOUNT = 4;
    public static final byte SELECT_Orderssell_order_id = 100 + 0;
    public static final byte SELECT_Ordersbuy_order_id = 100 + 1;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //UPDATE OPERATIONS
    public static final byte UPDATE_TRADE = 10;
//Custom code, do not change this line
//add here custom operations
    public static final byte UPDATE_DOWNLOAD = 11;
    public static final byte UPDATE_TRADING = 12;
//Custom code, do not change this line   

    //INSERT OPERATIONS
    public static final byte INSERT_TRADE = 20;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //DELETE OPERATIONS
    public static final byte DELETE_TRADE = 30;
    public static final byte DELETE_Orderssell_order_id = 100 + 2;
    public static final byte DELETE_Ordersbuy_order_id = 100 + 3;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //BACKUP OPERATIONS
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

}

