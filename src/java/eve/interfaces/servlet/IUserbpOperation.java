/*
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.interfaces.servlet;

public interface IUserbpOperation {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
    public static final byte SELECT_USERBP = 2;
    public static final byte SELECT_SEARCH = 3;
    public static final byte SELECT_SEARCHCOUNT = 4;
    public static final byte SELECT_Evetype = 100 + 0;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //UPDATE OPERATIONS
    public static final byte UPDATE_USERBP = 10;
//Custom code, do not change this line
//add here custom operations
    public static final byte UPDATE_PROPERTIES = 11;
    public static final byte UPDATE_RUNBP = 12;
//Custom code, do not change this line   

    //INSERT OPERATIONS
    public static final byte INSERT_USERBP = 20;
//Custom code, do not change this line
//add here custom operations
    public static final byte INSERT_ADDBP = 21;
//Custom code, do not change this line   

    //DELETE OPERATIONS
    public static final byte DELETE_USERBP = 30;
    public static final byte DELETE_Evetype = 100 + 1;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //BACKUP OPERATIONS
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

}

