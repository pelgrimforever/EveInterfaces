/*
 * IBLorder_hist.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 18.8.2021 11:31
 *
 */

package eve.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import eve.entity.pk.*;
import eve.interfaces.logicentity.IOrder_hist;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Order_hist
 * 
 * methods for manipulating data- and database objects
 * for Entity Order_hist and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLorder_hist extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Order_hist()
     * @return new empty IOrder_hist object
     */
    public IOrder_hist newOrder_hist();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Order_hist(primarykey fields)
     * @return new IOrder_hist object with initialized primary key
     */
    public IOrder_hist newOrder_hist(long id);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Order_hist(IOrder_histPK order_histPK)
     * @param order_histPK: primary key
     * @return new IOrder_hist object with initialized primary key
     */
    public IOrder_hist newOrder_hist(IOrder_histPK order_histPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Order_histPK()
     * @return new empty IOrder_histPK object
     */
    public IOrder_histPK newOrder_histPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Order_histPK(primarykey fields)
     * @return new IOrder_histPK object with initialized primary key
     */
    public IOrder_histPK newOrder_histPK(long id);

    /**
     * 
     * @return all Order_hist objects from database, unsorted
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Order_hist objects from database, customizable
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getOrder_hists() throws CustomException;

    /**
     * 
     * @param order_histPK: Order_hist primary key
     * @return Order_hist Entity object for primary key
     * @throws eve.general.exception.CustomException
     */
    public IOrder_hist getOrder_hist(IOrder_histPK order_histPK) throws CustomException;

    /**
     * Search order_hist in database for order_histPK:
     * @param order_histPK: Order_hist Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getOrder_histExists(IOrder_histPK order_histPK) throws DBException;

    /**
     * try to insert Order_hist object in database
     * commit transaction
     * @param order_hist: Order_hist Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertOrder_hist(IOrder_hist order_hist) throws CustomException, DataException;

    /**
     * check if Order_hist exists
     * insert if not, update if found
     * do not commit transaction
     * @param order_hist: Order_hist Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertupdateOrder_hist(IOrder_hist order_hist) throws CustomException, DataException;

    /**
     * try to update Order_hist object in database
     * commit transaction
     * @param order_hist: Order_hist Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void updateOrder_hist(IOrder_hist order_hist) throws CustomException, DataException;
    
    /**
     * try to delete Order_hist object in database
     * commit transaction
     * @param order_hist: Order_hist Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void deleteOrder_hist(IOrder_hist order_hist) throws CustomException;

    /**
     * try to insert Order_hist object in database
     * do not commit transaction
     * @param order_hist: Order_hist Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_insertOrder_hist(IOrder_hist order_hist) throws CustomException, DataException;

    /**
     * try to update Order_hist object in database
     * do not commit transaction
     * @param order_hist: Order_hist Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_updateOrder_hist(IOrder_hist order_hist) throws CustomException, DataException;
    
    /**
     * try to delete Order_hist object in database
     * do not commit transaction
     * @param order_hist: Order_hist Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void trans_deleteOrder_hist(IOrder_hist order_hist) throws CustomException;
    
    /**
     * @param evetypePK: foreign key for Evetype
     * @return all Order_hist Entity objects for Evetype
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getOrder_hists4evetype(IEvetypePK evetypePK) throws CustomException;

    /**
     * @param systemPK: foreign key for System
     * @return all Order_hist Entity objects for System
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getOrder_hists4system(ISystemPK systemPK) throws CustomException;

    
//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws eve.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
