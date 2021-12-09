/*
 * IView_stockOperation.java
 *
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 9.11.2021 14:30
 *
 */

package eve.interfaces.servlet;

import base.interfaces.servlet.IDataServlet;

/**
 * Interface IView_stockOperation
 * 
 * Attributes: Defines the possible operations for the specified view
 * Methods: 
 * @author Franky Laseure
 */
public interface IView_stockOperation extends IDataServlet {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
//Custom code, do not change this line
//add here custom operations
    public static final byte SELECT_4USER = 2;
//Custom code, do not change this line
}

