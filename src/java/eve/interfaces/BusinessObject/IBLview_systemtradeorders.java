/*
 * IBLview_systemtradeorders.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 12.6.2021 13:57
 *
 */

package eve.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import eve.interfaces.logicview.IView_systemtradeorders;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for View class View_systemtradeorders
 * 
 * methods for manipulating data- and database objects
 * for Entity View_systemtradeorders and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLview_systemtradeorders extends Serializable {
	
    /**
     * 
     * @return all View_systemtradeorders objects from database, customizable
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getView_systemtradeorderss() throws CustomException;

//Custom code, do not change this line
//Custom code, do not change this line
}
