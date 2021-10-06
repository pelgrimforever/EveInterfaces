/*
 * IBLview_order.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 6.9.2021 16:29
 *
 */

package eve.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import eve.interfaces.logicview.IView_order;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for View class View_order
 * 
 * methods for manipulating data- and database objects
 * for Entity View_order and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLview_order extends Serializable {
	
    /**
     * 
     * @return all View_order objects from database, customizable
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getView_orders() throws CustomException;

//Custom code, do not change this line
//Custom code, do not change this line
}
