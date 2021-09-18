/*
 * ISystemOperation.java
 *
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 18.8.2021 11:31
 *
 */

package eve.interfaces.servlet;

import base.interfaces.servlet.IDataServlet;

/**
 * Interface ISystemOperation
 * 
 * Attributes: Defines the possible operations for the specified table
 * Methods: 
 * @author Franky Laseure
 */
public interface ISystemOperation extends IDataServlet {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
    public static final byte SELECT_SYSTEM = 2;
    public static final byte SELECT_SEARCH = 3;
    public static final byte SELECT_SEARCHCOUNT = 4;
    public static final byte SELECT_Security_island = 100 + 0;
    public static final byte SELECT_Constellation = 100 + 1;
    public static final byte SELECT_Systemjumpssystem_end = 100 + 2;
    public static final byte SELECT_Systemjumpssystem_start = 100 + 3;
    public static final byte SELECT_Route = 100 + 4;
    public static final byte SELECT_Systemtradesell_system = 100 + 5;
    public static final byte SELECT_Systemtradebuy_system = 100 + 6;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //UPDATE OPERATIONS
    public static final byte UPDATE_SYSTEM = 10;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //INSERT OPERATIONS
    public static final byte INSERT_SYSTEM = 20;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //DELETE OPERATIONS
    public static final byte DELETE_SYSTEM = 30;
    public static final byte DELETE_Security_island = 100 + 7;
    public static final byte DELETE_Constellation = 100 + 8;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //BACKUP OPERATIONS
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

}

