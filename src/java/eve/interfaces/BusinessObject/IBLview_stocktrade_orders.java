/*
 * IBLview_stocktrade_orders.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 18.8.2021 11:31
 *
 */

package eve.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import eve.interfaces.logicview.IView_stocktrade_orders;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for View class View_stocktrade_orders
 * 
 * methods for manipulating data- and database objects
 * for Entity View_stocktrade_orders and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLview_stocktrade_orders extends Serializable {
	
    /**
     * 
     * @return all View_stocktrade_orders objects from database, customizable
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getView_stocktrade_orderss() throws CustomException;

//Custom code, do not change this line
//Custom code, do not change this line
}
