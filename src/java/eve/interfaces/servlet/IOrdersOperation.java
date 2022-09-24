/*
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.interfaces.servlet;

public interface IOrdersOperation {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
    public static final byte SELECT_ORDERS = 2;
    public static final byte SELECT_SEARCH = 3;
    public static final byte SELECT_SEARCHCOUNT = 4;
    public static final byte SELECT_Evetype = 100 + 0;
    public static final byte SELECT_System = 100 + 1;
    public static final byte SELECT_Tradecombined_sellbuy_order_id = 100 + 2;
    public static final byte SELECT_Tradecombined_sellsell_order_id = 100 + 3;
    public static final byte SELECT_Shipfitorderselected = 100 + 4;
    public static final byte SELECT_Tradesell_order_id = 100 + 5;
    public static final byte SELECT_Tradebuy_order_id = 100 + 6;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //UPDATE OPERATIONS
    public static final byte UPDATE_ORDERS = 10;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //INSERT OPERATIONS
    public static final byte INSERT_ORDERS = 20;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //DELETE OPERATIONS
    public static final byte DELETE_ORDERS = 30;
    public static final byte DELETE_Evetype = 100 + 7;
    public static final byte DELETE_System = 100 + 8;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //BACKUP OPERATIONS
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

}

