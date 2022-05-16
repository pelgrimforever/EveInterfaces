/*
 * IView_orderOperation.java
 *
 * Created on Dec 13, 2012, 12:22 PM
 * Generated on 11.4.2022 9:13
 *
 */

package eve.interfaces.servlet;

import base.interfaces.servlet.HTTPOperationtypes;

/**
 * Interface IView_orderOperation
 * 
 * Attributes: Defines the possible operations for the specified view
 * Methods: 
 * @author Franky Laseure
 */
public interface IView_orderOperation extends HTTPOperationtypes {

    //SELECT OPERATIONS
    public static final byte SELECT_COUNT = 0;
    public static final byte SELECT_ALL = 1;
//Custom code, do not change this line
//add here custom operations
    public static final byte SELECT_ONE = 2;
    public static final byte SELECT_EVETYPE_SELL = 3;
    public static final byte SELECT_EVETYPE_BUY = 4;
    public static final byte SELECT_LOWPRICE_SELL = 5;
    public static final byte SELECT_LOWPRICE_BUY = 6;
    public static final byte SELECT_Wishlistorders = 7;
    public static final byte SELECT_EVETYPE_REGION_SELL = 8;
//Custom code, do not change this line
}

