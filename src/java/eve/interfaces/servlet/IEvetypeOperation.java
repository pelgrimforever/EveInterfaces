/*
 * IEvetypeOperation.java
 *
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 30.10.2021 10:3
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
    public static final byte SELECT_Stock = 100 + 3;
    public static final byte SELECT_Order_history = 100 + 4;
    public static final byte SELECT_Tradecombined = 100 + 5;
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
    public static final byte DELETE_Market_group = 100 + 6;
    public static final byte DELETE_Typegroup = 100 + 7;
    public static final byte DELETE_Graphic = 100 + 8;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //BACKUP OPERATIONS
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

}

