/*
 * IView_contractitemOperation.java
 *
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 14.0.2022 16:56
 *
 */

package eve.interfaces.servlet;

import base.interfaces.servlet.IDataServlet;

/**
 * Interface IView_contractitemOperation
 * 
 * Attributes: Defines the possible operations for the specified view
 * Methods: 
 * @author Franky Laseure
 */
public interface IView_contractitemOperation extends IDataServlet {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
//Custom code, do not change this line
//add here custom operations
    public static final byte SELECT_CONTRACT = 2;
//Custom code, do not change this line
}
