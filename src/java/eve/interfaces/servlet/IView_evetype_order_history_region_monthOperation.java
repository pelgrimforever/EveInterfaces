/*
 * IView_evetype_order_history_region_monthOperation.java
 *
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 11.1.2022 21:46
 *
 */

package eve.interfaces.servlet;

import base.interfaces.servlet.IDataServlet;

/**
 * Interface IView_evetype_order_history_region_monthOperation
 * 
 * Attributes: Defines the possible operations for the specified view
 * Methods: 
 * @author Franky Laseure
 */
public interface IView_evetype_order_history_region_monthOperation extends IDataServlet {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
//Custom code, do not change this line
//add here custom operations
    public static final byte SELECT_EVETYPE = 2;
    public static final byte SELECT_EVETYPEYM = 3;
//Custom code, do not change this line
}

