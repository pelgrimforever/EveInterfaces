/*
 * IBLorders.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 8.5.2021 19:33
 *
 */

package eve.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import eve.entity.pk.*;
import eve.interfaces.logicentity.IOrders;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Orders
 * 
 * methods for manipulating data- and database objects
 * for Entity Orders and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLorders extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Orders()
     * @return new empty IOrders object
     */
    public IOrders newOrders();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Orders(primarykey fields)
     * @return new IOrders object with initialized primary key
     */
    public IOrders newOrders(long id);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Orders(IOrdersPK ordersPK)
     * @param ordersPK: primary key
     * @return new IOrders object with initialized primary key
     */
    public IOrders newOrders(IOrdersPK ordersPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new OrdersPK()
     * @return new empty IOrdersPK object
     */
    public IOrdersPK newOrdersPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new OrdersPK(primarykey fields)
     * @return new IOrdersPK object with initialized primary key
     */
    public IOrdersPK newOrdersPK(long id);

    /**
     * 
     * @return all Orders objects from database, unsorted
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Orders objects from database, customizable
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getOrderss() throws CustomException;

    /**
     * 
     * @param ordersPK: Orders primary key
     * @return Orders Entity object for primary key
     * @throws eve.general.exception.CustomException
     */
    public IOrders getOrders(IOrdersPK ordersPK) throws CustomException;

    /**
     * Search orders in database for ordersPK:
     * @param ordersPK: Orders Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getOrdersExists(IOrdersPK ordersPK) throws DBException;

    /**
     * try to insert Orders object in database
     * commit transaction
     * @param orders: Orders Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertOrders(IOrders orders) throws CustomException, DataException;

    /**
     * check if Orders exists
     * insert if not, update if found
     * do not commit transaction
     * @param orders: Orders Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertupdateOrders(IOrders orders) throws CustomException, DataException;

    /**
     * try to update Orders object in database
     * commit transaction
     * @param orders: Orders Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void updateOrders(IOrders orders) throws CustomException, DataException;
    
    /**
     * try to delete Orders object in database
     * commit transaction
     * @param orders: Orders Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void deleteOrders(IOrders orders) throws CustomException;

    /**
     * try to insert Orders object in database
     * do not commit transaction
     * @param orders: Orders Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_insertOrders(IOrders orders) throws CustomException, DataException;

    /**
     * try to update Orders object in database
     * do not commit transaction
     * @param orders: Orders Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_updateOrders(IOrders orders) throws CustomException, DataException;
    
    /**
     * try to delete Orders object in database
     * do not commit transaction
     * @param orders: Orders Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void trans_deleteOrders(IOrders orders) throws CustomException;
    
    /**
     * @param evetypePK: foreign key for Evetype
     * @return all Orders Entity objects for Evetype
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getOrderss4evetype(IEvetypePK evetypePK) throws CustomException;

    /**
     * @param systemPK: foreign key for System
     * @return all Orders Entity objects for System
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getOrderss4system(ISystemPK systemPK) throws CustomException;

    
    /**
     * @param tradePK: parent Trade for child object Orders Entity
     * @return child Orders Entity object
     * @throws eve.general.exception.CustomException
     */
    public IOrders getTradesell_order_id(ITradePK tradePK) throws CustomException;

    /**
     * @param tradePK: parent Trade for child object Orders Entity
     * @return child Orders Entity object
     * @throws eve.general.exception.CustomException
     */
    public IOrders getTradebuy_order_id(ITradePK tradePK) throws CustomException;

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws eve.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
