/*
 * IView_tradecombined_sellOperation.java
 *
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 14.0.2022 16:56
 *
 */

package eve.interfaces.servlet;

import base.interfaces.servlet.IDataServlet;

/**
 * Interface IView_tradecombined_sellOperation
 * 
 * Attributes: Defines the possible operations for the specified view
 * Methods: 
 * @author Franky Laseure
 */
public interface IView_tradecombined_sellOperation extends IDataServlet {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
//Custom code, do not change this line
//add here custom operations
    public static final byte SELECT4TRADECOMBINED = 2;
    public static final byte SELECT4TRADESYSTEMS = 3;
//Custom code, do not change this line
}

