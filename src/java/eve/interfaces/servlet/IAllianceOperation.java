/*
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.interfaces.servlet;

public interface IAllianceOperation {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
    public static final byte SELECT_ALLIANCE = 2;
    public static final byte SELECT_SEARCH = 3;
    public static final byte SELECT_SEARCHCOUNT = 4;
    public static final byte SELECT_Corporationcreator_corporation = 100 + 0;
    public static final byte SELECT_Corporationexecutor_corporation = 100 + 1;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //UPDATE OPERATIONS
    public static final byte UPDATE_ALLIANCE = 10;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //INSERT OPERATIONS
    public static final byte INSERT_ALLIANCE = 20;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //DELETE OPERATIONS
    public static final byte DELETE_ALLIANCE = 30;
    public static final byte DELETE_Corporationcreator_corporation = 100 + 2;
    public static final byte DELETE_Corporationexecutor_corporation = 100 + 3;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //BACKUP OPERATIONS
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

}

