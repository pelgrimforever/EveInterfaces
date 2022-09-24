/*
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.interfaces.servlet;

public interface IEveuserOperation {

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

