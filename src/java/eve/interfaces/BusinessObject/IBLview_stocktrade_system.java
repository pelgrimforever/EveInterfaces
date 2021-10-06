/*
 * IBLview_stocktrade_system.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 6.9.2021 16:29
 *
 */

package eve.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import eve.interfaces.logicview.IView_stocktrade_system;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for View class View_stocktrade_system
 * 
 * methods for manipulating data- and database objects
 * for Entity View_stocktrade_system and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLview_stocktrade_system extends Serializable {
	
    /**
     * 
     * @return all View_stocktrade_system objects from database, customizable
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getView_stocktrade_systems() throws CustomException;

//Custom code, do not change this line
//Custom code, do not change this line
}
