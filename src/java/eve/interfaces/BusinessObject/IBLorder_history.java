/*
 * IBLorder_history.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 30.5.2021 15:39
 *
 */

package eve.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import eve.entity.pk.*;
import eve.interfaces.logicentity.IOrder_history;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Order_history
 * 
 * methods for manipulating data- and database objects
 * for Entity Order_history and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLorder_history extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Order_history()
     * @return new empty IOrder_history object
     */
    public IOrder_history newOrder_history();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Order_history(primarykey fields)
     * @return new IOrder_history object with initialized primary key
     */
    public IOrder_history newOrder_history(long region, long evetype, java.sql.Date date);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Order_history(IOrder_historyPK order_historyPK)
     * @param order_historyPK: primary key
     * @return new IOrder_history object with initialized primary key
     */
    public IOrder_history newOrder_history(IOrder_historyPK order_historyPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Order_historyPK()
     * @return new empty IOrder_historyPK object
     */
    public IOrder_historyPK newOrder_historyPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Order_historyPK(primarykey fields)
     * @return new IOrder_historyPK object with initialized primary key
     */
    public IOrder_historyPK newOrder_historyPK(long region, long evetype, java.sql.Date date);

    /**
     * 
     * @return all Order_history objects from database, unsorted
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Order_history objects from database, customizable
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getOrder_historys() throws CustomException;

    /**
     * 
     * @param order_historyPK: Order_history primary key
     * @return Order_history Entity object for primary key
     * @throws eve.general.exception.CustomException
     */
    public IOrder_history getOrder_history(IOrder_historyPK order_historyPK) throws CustomException;

    /**
     * Search order_history in database for order_historyPK:
     * @param order_historyPK: Order_history Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getOrder_historyExists(IOrder_historyPK order_historyPK) throws DBException;

    /**
     * try to insert Order_history object in database
     * commit transaction
     * @param order_history: Order_history Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertOrder_history(IOrder_history order_history) throws CustomException, DataException;

    /**
     * check if Order_history exists
     * insert if not, update if found
     * do not commit transaction
     * @param order_history: Order_history Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertupdateOrder_history(IOrder_history order_history) throws CustomException, DataException;

    /**
     * try to update Order_history object in database
     * commit transaction
     * @param order_history: Order_history Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void updateOrder_history(IOrder_history order_history) throws CustomException, DataException;
    
    /**
     * try to delete Order_history object in database
     * commit transaction
     * @param order_history: Order_history Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void deleteOrder_history(IOrder_history order_history) throws CustomException;

    /**
     * try to insert Order_history object in database
     * do not commit transaction
     * @param order_history: Order_history Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_insertOrder_history(IOrder_history order_history) throws CustomException, DataException;

    /**
     * try to update Order_history object in database
     * do not commit transaction
     * @param order_history: Order_history Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_updateOrder_history(IOrder_history order_history) throws CustomException, DataException;
    
    /**
     * try to delete Order_history object in database
     * do not commit transaction
     * @param order_history: Order_history Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void trans_deleteOrder_history(IOrder_history order_history) throws CustomException;
    
    /**
     * @param evetypePK: foreign key for Evetype
     * @return all Order_history Entity objects for Evetype
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getOrder_historys4evetype(IEvetypePK evetypePK) throws CustomException;

    /**
     * @param regionPK: foreign key for Region
     * @return all Order_history Entity objects for Region
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getOrder_historys4region(IRegionPK regionPK) throws CustomException;

    
//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws eve.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
