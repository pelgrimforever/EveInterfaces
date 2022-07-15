/*
 * IUsersettingsOperation.java
 *
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 9.5.2022 11:11
 *
 */

package eve.interfaces.servlet;

/**
 * Interface IUsersettingsOperation
 * 
 * Attributes: Defines the possible operations for the specified table
 * Methods: 
 * @author Franky Laseure
 */
public interface IUsersettingsOperation {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
    public static final byte SELECT_USERSETTINGS = 2;
    public static final byte SELECT_SEARCH = 3;
    public static final byte SELECT_SEARCHCOUNT = 4;
    public static final byte SELECT_Settings = 100 + 0;
//Custom code, do not change this line
//add here custom operations
    public static final byte SELECT_4USER = 40;
//Custom code, do not change this line   

    //UPDATE OPERATIONS
    public static final byte UPDATE_USERSETTINGS = 10;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //INSERT OPERATIONS
    public static final byte INSERT_USERSETTINGS = 20;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //DELETE OPERATIONS
    public static final byte DELETE_USERSETTINGS = 30;
    public static final byte DELETE_Settings = 100 + 1;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //BACKUP OPERATIONS
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

}

