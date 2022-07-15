/*
 * ICorporationOperation.java
 *
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 9.5.2022 11:11
 *
 */

package eve.interfaces.servlet;

/**
 * Interface ICorporationOperation
 * 
 * Attributes: Defines the possible operations for the specified table
 * Methods: 
 * @author Franky Laseure
 */
public interface ICorporationOperation {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
    public static final byte SELECT_CORPORATION = 2;
    public static final byte SELECT_SEARCH = 3;
    public static final byte SELECT_SEARCHCOUNT = 4;
    public static final byte SELECT_Station = 100 + 0;
    public static final byte SELECT_Faction = 100 + 1;
    public static final byte SELECT_Alliance = 100 + 2;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //UPDATE OPERATIONS
    public static final byte UPDATE_CORPORATION = 10;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //INSERT OPERATIONS
    public static final byte INSERT_CORPORATION = 20;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //DELETE OPERATIONS
    public static final byte DELETE_CORPORATION = 30;
    public static final byte DELETE_Station = 100 + 3;
    public static final byte DELETE_Faction = 100 + 4;
    public static final byte DELETE_Alliance = 100 + 5;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //BACKUP OPERATIONS
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

}

