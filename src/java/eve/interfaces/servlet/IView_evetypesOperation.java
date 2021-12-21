/*
 * IView_evetypesOperation.java
 *
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 18.11.2021 18:23
 *
 */

package eve.interfaces.servlet;

import base.interfaces.servlet.IDataServlet;

/**
 * Interface IView_evetypesOperation
 * 
 * Attributes: Defines the possible operations for the specified view
 * Methods: 
 * @author Franky Laseure
 */
public interface IView_evetypesOperation extends IDataServlet {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
//Custom code, do not change this line
//add here custom operations
    public static final byte SELECT_SHIPS = 2;
    public static final byte SELECT_MODULES = 3;
    public static final byte SELECT_CHARGES = 4;
    public static final byte SELECT_DEPLOYABLES = 5;
//Custom code, do not change this line
}

