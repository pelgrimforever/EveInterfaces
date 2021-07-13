/*
 * IBLsystemtrade_order.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 12.6.2021 13:57
 *
 */

package eve.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import eve.entity.pk.*;
import eve.interfaces.logicentity.ISystemtrade_order;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Systemtrade_order
 * 
 * methods for manipulating data- and database objects
 * for Entity Systemtrade_order and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLsystemtrade_order extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Systemtrade_order()
     * @return new empty ISystemtrade_order object
     */
    public ISystemtrade_order newSystemtrade_order();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Systemtrade_order(primarykey fields)
     * @return new ISystemtrade_order object with initialized primary key
     */
    public ISystemtrade_order newSystemtrade_order(long sell_system, long buy_system, long sell_order, long buy_order);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Systemtrade_order(ISystemtrade_orderPK systemtrade_orderPK)
     * @param systemtrade_orderPK: primary key
     * @return new ISystemtrade_order object with initialized primary key
     */
    public ISystemtrade_order newSystemtrade_order(ISystemtrade_orderPK systemtrade_orderPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Systemtrade_orderPK()
     * @return new empty ISystemtrade_orderPK object
     */
    public ISystemtrade_orderPK newSystemtrade_orderPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Systemtrade_orderPK(primarykey fields)
     * @return new ISystemtrade_orderPK object with initialized primary key
     */
    public ISystemtrade_orderPK newSystemtrade_orderPK(long sell_system, long buy_system, long sell_order, long buy_order);

    /**
     * 
     * @return all Systemtrade_order objects from database, unsorted
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Systemtrade_order objects from database, customizable
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getSystemtrade_orders() throws CustomException;

    /**
     * 
     * @param systemtrade_orderPK: Systemtrade_order primary key
     * @return Systemtrade_order Entity object for primary key
     * @throws eve.general.exception.CustomException
     */
    public ISystemtrade_order getSystemtrade_order(ISystemtrade_orderPK systemtrade_orderPK) throws CustomException;

    /**
     * Search systemtrade_order in database for systemtrade_orderPK:
     * @param systemtrade_orderPK: Systemtrade_order Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getSystemtrade_orderExists(ISystemtrade_orderPK systemtrade_orderPK) throws DBException;

    /**
     * try to insert Systemtrade_order object in database
     * commit transaction
     * @param systemtrade_order: Systemtrade_order Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertSystemtrade_order(ISystemtrade_order systemtrade_order) throws CustomException, DataException;

    /**
     * check if Systemtrade_order exists
     * insert if not, update if found
     * do not commit transaction
     * @param systemtrade_order: Systemtrade_order Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertupdateSystemtrade_order(ISystemtrade_order systemtrade_order) throws CustomException, DataException;

    /**
     * try to update Systemtrade_order object in database
     * commit transaction
     * @param systemtrade_order: Systemtrade_order Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void updateSystemtrade_order(ISystemtrade_order systemtrade_order) throws CustomException, DataException;
    
    /**
     * try to delete Systemtrade_order object in database
     * commit transaction
     * @param systemtrade_order: Systemtrade_order Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void deleteSystemtrade_order(ISystemtrade_order systemtrade_order) throws CustomException;

    /**
     * try to insert Systemtrade_order object in database
     * do not commit transaction
     * @param systemtrade_order: Systemtrade_order Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_insertSystemtrade_order(ISystemtrade_order systemtrade_order) throws CustomException, DataException;

    /**
     * try to update Systemtrade_order object in database
     * do not commit transaction
     * @param systemtrade_order: Systemtrade_order Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_updateSystemtrade_order(ISystemtrade_order systemtrade_order) throws CustomException, DataException;
    
    /**
     * try to delete Systemtrade_order object in database
     * do not commit transaction
     * @param systemtrade_order: Systemtrade_order Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void trans_deleteSystemtrade_order(ISystemtrade_order systemtrade_order) throws CustomException;
    
    /**
     * @param ordersPK: foreign key for Orders
     * @return all Systemtrade_order Entity objects for Orders
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getSystemtrade_orders4ordersBuy_order(IOrdersPK ordersPK) throws CustomException;

    /**
     * @param ordersPK: foreign key for Orders
     * @return all Systemtrade_order Entity objects for Orders
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getSystemtrade_orders4ordersSell_order(IOrdersPK ordersPK) throws CustomException;

    /**
     * @param systemtradePK: foreign key for Systemtrade
     * @return all Systemtrade_order Entity objects for Systemtrade
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getSystemtrade_orders4systemtrade(ISystemtradePK systemtradePK) throws CustomException;

    
//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws eve.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
