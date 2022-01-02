/*
 * IView_shipfitmoduleOperation.java
 *
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 18.11.2021 16:29
 *
 */

package eve.interfaces.servlet;

import base.interfaces.servlet.IDataServlet;

/**
 * Interface IView_shipfitmoduleOperation
 * 
 * Attributes: Defines the possible operations for the specified view
 * Methods: 
 * @author Franky Laseure
 */
public interface IView_shipfitmoduleOperation extends IDataServlet {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
//Custom code, do not change this line
//add here custom operations
    public static final byte SELECT4Shipfit = 2;
//Custom code, do not change this line
}
