/*
 * IBLview_systemtrade.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 18.6.2021 14:35
 *
 */

package eve.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import eve.interfaces.logicview.IView_systemtrade;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for View class View_systemtrade
 * 
 * methods for manipulating data- and database objects
 * for Entity View_systemtrade and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLview_systemtrade extends Serializable {
	
    /**
     * 
     * @return all View_systemtrade objects from database, customizable
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getView_systemtrades() throws CustomException;

//Custom code, do not change this line
//Custom code, do not change this line
}
