/*
 * IEvetypeOperation.java
 *
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 24.0.2022 16:47
 *
 */

package eve.interfaces.servlet;

import base.interfaces.servlet.IDataServlet;

/**
 * Interface IEvetypeOperation
 * 
 * Attributes: Defines the possible operations for the specified table
 * Methods: 
 * @author Franky Laseure
 */
public interface IEvetypeOperation extends IDataServlet {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
    public static final byte SELECT_EVETYPE = 2;
    public static final byte SELECT_SEARCH = 3;
    public static final byte SELECT_SEARCHCOUNT = 4;
    public static final byte SELECT_Market_group = 100 + 0;
    public static final byte SELECT_Typegroup = 100 + 1;
    public static final byte SELECT_Graphic = 100 + 2;
    public static final byte SELECT_Wishlist = 100 + 3;
    public static final byte SELECT_Materialinput = 100 + 4;
    public static final byte SELECT_Bpmaterialbp = 100 + 5;
    public static final byte SELECT_Bpmaterialmaterial = 100 + 6;
    public static final byte SELECT_Order_history_month = 100 + 7;
    public static final byte SELECT_Stock = 100 + 8;
    public static final byte SELECT_Order_history = 100 + 9;
    public static final byte SELECT_Shipfitmodule = 100 + 10;
    public static final byte SELECT_Shipfitorder = 100 + 11;
    public static final byte SELECT_Tradecombined = 100 + 12;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //UPDATE OPERATIONS
    public static final byte UPDATE_EVETYPE = 10;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //INSERT OPERATIONS
    public static final byte INSERT_EVETYPE = 20;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //DELETE OPERATIONS
    public static final byte DELETE_EVETYPE = 30;
    public static final byte DELETE_Market_group = 100 + 13;
    public static final byte DELETE_Typegroup = 100 + 14;
    public static final byte DELETE_Graphic = 100 + 15;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //BACKUP OPERATIONS
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

}

