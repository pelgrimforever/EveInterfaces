/*
 * IBLjson_orders.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 6.9.2021 16:29
 *
 */

package eve.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import eve.entity.pk.*;
import eve.interfaces.logicentity.IJson_orders;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Json_orders
 * 
 * methods for manipulating data- and database objects
 * for Entity Json_orders and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLjson_orders extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Json_orders()
     * @return new empty IJson_orders object
     */
    public IJson_orders newJson_orders();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Json_orders(primarykey fields)
     * @return new IJson_orders object with initialized primary key
     */
    public IJson_orders newJson_orders(int id);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Json_orders(IJson_ordersPK json_ordersPK)
     * @param json_ordersPK: primary key
     * @return new IJson_orders object with initialized primary key
     */
    public IJson_orders newJson_orders(IJson_ordersPK json_ordersPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Json_ordersPK()
     * @return new empty IJson_ordersPK object
     */
    public IJson_ordersPK newJson_ordersPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Json_ordersPK(primarykey fields)
     * @return new IJson_ordersPK object with initialized primary key
     */
    public IJson_ordersPK newJson_ordersPK(int id);

    /**
     * 
     * @return all Json_orders objects from database, unsorted
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Json_orders objects from database, customizable
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getJson_orderss() throws CustomException;

    /**
     * 
     * @param json_ordersPK: Json_orders primary key
     * @return Json_orders Entity object for primary key
     * @throws eve.general.exception.CustomException
     */
    public IJson_orders getJson_orders(IJson_ordersPK json_ordersPK) throws CustomException;

    /**
     * Search json_orders in database for json_ordersPK:
     * @param json_ordersPK: Json_orders Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getJson_ordersExists(IJson_ordersPK json_ordersPK) throws DBException;

    /**
     * try to insert Json_orders object in database
     * commit transaction
     * @param json_orders: Json_orders Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertJson_orders(IJson_orders json_orders) throws CustomException, DataException;

    /**
     * check if Json_orders exists
     * insert if not, update if found
     * do not commit transaction
     * @param json_orders: Json_orders Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertupdateJson_orders(IJson_orders json_orders) throws CustomException, DataException;

    /**
     * try to update Json_orders object in database
     * commit transaction
     * @param json_orders: Json_orders Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void updateJson_orders(IJson_orders json_orders) throws CustomException, DataException;
    
    /**
     * try to delete Json_orders object in database
     * commit transaction
     * @param json_orders: Json_orders Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void deleteJson_orders(IJson_orders json_orders) throws CustomException;

    /**
     * try to insert Json_orders object in database
     * do not commit transaction
     * @param json_orders: Json_orders Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_insertJson_orders(IJson_orders json_orders) throws CustomException, DataException;

    /**
     * try to update Json_orders object in database
     * do not commit transaction
     * @param json_orders: Json_orders Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_updateJson_orders(IJson_orders json_orders) throws CustomException, DataException;
    
    /**
     * try to delete Json_orders object in database
     * do not commit transaction
     * @param json_orders: Json_orders Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void trans_deleteJson_orders(IJson_orders json_orders) throws CustomException;
    
    
//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws eve.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
