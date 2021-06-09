/*
 * IBLview_tradeorders.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 8.5.2021 19:33
 *
 */

package eve.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import eve.interfaces.logicview.IView_tradeorders;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for View class View_tradeorders
 * 
 * methods for manipulating data- and database objects
 * for Entity View_tradeorders and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLview_tradeorders extends Serializable {
	
    /**
     * 
     * @return all View_tradeorders objects from database, customizable
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getView_tradeorderss() throws CustomException;

//Custom code, do not change this line
//Custom code, do not change this line
}
