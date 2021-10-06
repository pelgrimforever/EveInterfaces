/*
 * IConstellation_neighbourOperation.java
 *
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 6.9.2021 16:29
 *
 */

package eve.interfaces.servlet;

import base.interfaces.servlet.IDataServlet;

/**
 * Interface IConstellation_neighbourOperation
 * 
 * Attributes: Defines the possible operations for the specified table
 * Methods: 
 * @author Franky Laseure
 */
public interface IConstellation_neighbourOperation extends IDataServlet {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
    public static final byte SELECT_CONSTELLATION_NEIGHBOUR = 2;
    public static final byte SELECT_SEARCH = 3;
    public static final byte SELECT_SEARCHCOUNT = 4;
    public static final byte SELECT_Constellationneighbour = 100 + 0;
    public static final byte SELECT_Constellationconstellation = 100 + 1;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //UPDATE OPERATIONS
    public static final byte UPDATE_CONSTELLATION_NEIGHBOUR = 10;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //INSERT OPERATIONS
    public static final byte INSERT_CONSTELLATION_NEIGHBOUR = 20;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //DELETE OPERATIONS
    public static final byte DELETE_CONSTELLATION_NEIGHBOUR = 30;
    public static final byte DELETE_Constellationneighbour = 100 + 2;
    public static final byte DELETE_Constellationconstellation = 100 + 3;
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

    //BACKUP OPERATIONS
//Custom code, do not change this line
//add here custom operations
//Custom code, do not change this line   

}

