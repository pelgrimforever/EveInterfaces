/*
 * IBLtrade.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 12.6.2021 13:57
 *
 */

package eve.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import eve.entity.pk.*;
import eve.interfaces.logicentity.ITrade;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Trade
 * 
 * methods for manipulating data- and database objects
 * for Entity Trade and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLtrade extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Trade()
     * @return new empty ITrade object
     */
    public ITrade newTrade();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Trade(primarykey fields)
     * @return new ITrade object with initialized primary key
     */
    public ITrade newTrade(long sell_order_id, long buy_order_id);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Trade(ITradePK tradePK)
     * @param tradePK: primary key
     * @return new ITrade object with initialized primary key
     */
    public ITrade newTrade(ITradePK tradePK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new TradePK()
     * @return new empty ITradePK object
     */
    public ITradePK newTradePK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new TradePK(primarykey fields)
     * @return new ITradePK object with initialized primary key
     */
    public ITradePK newTradePK(long sell_order_id, long buy_order_id);

    /**
     * 
     * @return all Trade objects from database, unsorted
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Trade objects from database, customizable
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getTrades() throws CustomException;

    /**
     * 
     * @param tradePK: Trade primary key
     * @return Trade Entity object for primary key
     * @throws eve.general.exception.CustomException
     */
    public ITrade getTrade(ITradePK tradePK) throws CustomException;

    /**
     * Search trade in database for tradePK:
     * @param tradePK: Trade Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getTradeExists(ITradePK tradePK) throws DBException;

    /**
     * try to insert Trade object in database
     * commit transaction
     * @param trade: Trade Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertTrade(ITrade trade) throws CustomException, DataException;

    /**
     * check if Trade exists
     * insert if not, update if found
     * do not commit transaction
     * @param trade: Trade Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertupdateTrade(ITrade trade) throws CustomException, DataException;

    /**
     * try to update Trade object in database
     * commit transaction
     * @param trade: Trade Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void updateTrade(ITrade trade) throws CustomException, DataException;
    
    /**
     * try to delete Trade object in database
     * commit transaction
     * @param trade: Trade Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void deleteTrade(ITrade trade) throws CustomException;

    /**
     * try to insert Trade object in database
     * do not commit transaction
     * @param trade: Trade Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_insertTrade(ITrade trade) throws CustomException, DataException;

    /**
     * try to update Trade object in database
     * do not commit transaction
     * @param trade: Trade Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_updateTrade(ITrade trade) throws CustomException, DataException;
    
    /**
     * try to delete Trade object in database
     * do not commit transaction
     * @param trade: Trade Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void trans_deleteTrade(ITrade trade) throws CustomException;
    
    /**
     * @param ordersPK: foreign key for Orders
     * @return all Trade Entity objects for Orders
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getTrades4ordersSell_order_id(IOrdersPK ordersPK) throws CustomException;

    /**
     * @param ordersPK: foreign key for Orders
     * @return all Trade Entity objects for Orders
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getTrades4ordersBuy_order_id(IOrdersPK ordersPK) throws CustomException;

    
//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws eve.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
