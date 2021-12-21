/*
 * IView_evetype_order_historyOperation.java
 *
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 16.11.2021 15:45
 *
 */

package eve.interfaces.servlet;

import base.interfaces.servlet.IDataServlet;

/**
 * Interface IView_evetype_order_historyOperation
 * 
 * Attributes: Defines the possible operations for the specified view
 * Methods: 
 * @author Franky Laseure
 */
public interface IView_evetype_order_historyOperation extends IDataServlet {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
//Custom code, do not change this line
//add here custom operations
    public static final byte SELECT_EVETYPE = 2;
//Custom code, do not change this line
}

