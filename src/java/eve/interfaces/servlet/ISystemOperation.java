/*
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.interfaces.servlet;

public interface ISystemOperation {

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
    public static final byte SELECT_Tradecombinedbuy_system = 100 + 4;
    public static final byte SELECT_Tradecombinedsell_system = 100 + 5;
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
    public static final byte DELETE_Security_island = 100 + 6;
    public static final byte DELETE_Constellation = 100 + 7;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //BACKUP OPERATIONS
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

}

