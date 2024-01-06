/*
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.interfaces.servlet;

public interface IStargateOperation {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
    public static final byte SELECT_STARGATE = 2;
    public static final byte SELECT_SEARCH = 3;
    public static final byte SELECT_SEARCHCOUNT = 4;
    public static final byte SELECT_Systemsystem = 100 + 0;
    public static final byte SELECT_Systemto_system = 100 + 1;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //UPDATE OPERATIONS
    public static final byte UPDATE_STARGATE = 10;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //INSERT OPERATIONS
    public static final byte INSERT_STARGATE = 20;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //DELETE OPERATIONS
    public static final byte DELETE_STARGATE = 30;
    public static final byte DELETE_Systemsystem = 100 + 2;
    public static final byte DELETE_Systemto_system = 100 + 3;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //BACKUP OPERATIONS
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

}

