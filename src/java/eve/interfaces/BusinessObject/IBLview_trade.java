/*
 * IBLview_trade.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.5.2021 16:2
 *
 */

package eve.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import eve.interfaces.logicview.IView_trade;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for View class View_trade
 * 
 * methods for manipulating data- and database objects
 * for Entity View_trade and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLview_trade extends Serializable {
	
    /**
     * 
     * @return all View_trade objects from database, customizable
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getView_trades() throws CustomException;

//Custom code, do not change this line
//Custom code, do not change this line
}