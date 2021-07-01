/*
 * IView_tradeOperation.java
 *
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 30.5.2021 15:39
 *
 */

package eve.interfaces.servlet;

import base.interfaces.servlet.IDataServlet;

/**
 * Interface IView_tradeOperation
 * 
 * Attributes: Defines the possible operations for the specified view
 * Methods: 
 * @author Franky Laseure
 */
public interface IView_tradeOperation extends IDataServlet {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
//Custom code, do not change this line
//add here custom operations
    public static final byte SELECT_ALL_STARTSYSTEM = 2;
//Custom code, do not change this line
}

