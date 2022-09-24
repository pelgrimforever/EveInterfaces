/*
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.interfaces.servlet;

public interface IShipfitorderselectedOperation {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
    public static final byte SELECT_SHIPFITORDERSELECTED = 2;
    public static final byte SELECT_SEARCH = 3;
    public static final byte SELECT_SEARCHCOUNT = 4;
    public static final byte SELECT_Orders = 100 + 0;
    public static final byte SELECT_Shipfitorder = 100 + 1;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //UPDATE OPERATIONS
    public static final byte UPDATE_SHIPFITORDERSELECTED = 10;
//Custom code, do not change this line
//add here custom operations
    public static final byte UPDATE_CONFIRMORDER = 11;
//Custom code, do not change this line   

    //INSERT OPERATIONS
    public static final byte INSERT_SHIPFITORDERSELECTED = 20;
//Custom code, do not change this line
//add here custom operations
    public static final byte INSERT_ORDERID = 21;
//Custom code, do not change this line   

    //DELETE OPERATIONS
    public static final byte DELETE_SHIPFITORDERSELECTED = 30;
    public static final byte DELETE_Orders = 100 + 2;
    public static final byte DELETE_Shipfitorder = 100 + 3;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //BACKUP OPERATIONS
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

}

