/*
 * IShipfitorderOperation.java
 *
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 1.5.2022 20:21
 *
 */

package eve.interfaces.servlet;

/**
 * Interface IShipfitorderOperation
 * 
 * Attributes: Defines the possible operations for the specified table
 * Methods: 
 * @author Franky Laseure
 */
public interface IShipfitorderOperation {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
    public static final byte SELECT_SHIPFITORDER = 2;
    public static final byte SELECT_SEARCH = 3;
    public static final byte SELECT_SEARCHCOUNT = 4;
    public static final byte SELECT_Shipfit = 100 + 0;
    public static final byte SELECT_Evetype = 100 + 1;
    public static final byte SELECT_Shipfitorderselected = 100 + 2;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //UPDATE OPERATIONS
    public static final byte UPDATE_SHIPFITORDER = 10;
//Custom code, do not change this line
//add here custom operations
    public static final byte UPDATE_ORDERAMOUNT = 11;
//Custom code, do not change this line   

    //INSERT OPERATIONS
    public static final byte INSERT_SHIPFITORDER = 20;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //DELETE OPERATIONS
    public static final byte DELETE_SHIPFITORDER = 30;
    public static final byte DELETE_Shipfit = 100 + 3;
    public static final byte DELETE_Evetype = 100 + 4;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //BACKUP OPERATIONS
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

}

