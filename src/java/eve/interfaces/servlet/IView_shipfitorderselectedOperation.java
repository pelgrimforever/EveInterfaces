/*
 * IView_shipfitorderselectedOperation.java
 *
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 14.0.2022 16:56
 *
 */

package eve.interfaces.servlet;

import base.interfaces.servlet.IDataServlet;

/**
 * Interface IView_shipfitorderselectedOperation
 * 
 * Attributes: Defines the possible operations for the specified view
 * Methods: 
 * @author Franky Laseure
 */
public interface IView_shipfitorderselectedOperation extends IDataServlet {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
//Custom code, do not change this line
//add here custom operations
    public static final byte SELECT_4USER = 2;
    public static final byte SELECT_4USERSYSTEM = 3;
//Custom code, do not change this line
}

