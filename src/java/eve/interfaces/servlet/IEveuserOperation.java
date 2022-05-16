/*
 * IEveuserOperation.java
 *
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 11.4.2022 9:13
 *
 */

package eve.interfaces.servlet;

import base.interfaces.servlet.HTTPOperationtypes;

/**
 * Interface IEveuserOperation
 * 
 * Attributes: Defines the possible operations for the specified table
 * Methods: 
 * @author Franky Laseure
 */
public interface IEveuserOperation extends HTTPOperationtypes {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
    public static final byte SELECT_EVEUSER = 2;
    public static final byte SELECT_SEARCH = 3;
    public static final byte SELECT_SEARCHCOUNT = 4;
    public static final byte SELECT_Frontendpage_auth = 100 + 0;
//Custom code, do not change this line
//add here custom operations
    public static final byte SELECT_ISADMIN = 40;
//Custom code, do not change this line   

    //UPDATE OPERATIONS
    public static final byte UPDATE_EVEUSER = 10;
//Custom code, do not change this line
//add here custom operations
    public static final byte UPDATE_EVEUSERPASS = 11;
    public static final byte UPDATE_EVEUSERRESET = 12;
//Custom code, do not change this line   

    //INSERT OPERATIONS
    public static final byte INSERT_EVEUSER = 20;
//Custom code, do not change this line
//add here custom operations
    public static final byte INSERT_NEWUSER = 21;
//Custom code, do not change this line   

    //DELETE OPERATIONS
    public static final byte DELETE_EVEUSER = 30;
//Custom code, do not change this line
//add here custom operations
    public static final byte DELETE_REGISTRATION = 31;
//Custom code, do not change this line   

    //BACKUP OPERATIONS
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

}

