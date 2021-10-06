/*
 * IBLstocktrade.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 6.9.2021 16:29
 *
 */

package eve.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import eve.entity.pk.*;
import eve.interfaces.logicentity.IStocktrade;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Stocktrade
 * 
 * methods for manipulating data- and database objects
 * for Entity Stocktrade and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLstocktrade extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Stocktrade()
     * @return new empty IStocktrade object
     */
    public IStocktrade newStocktrade();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Stocktrade(primarykey fields)
     * @return new IStocktrade object with initialized primary key
     */
    public IStocktrade newStocktrade(java.lang.String username, long evetype, long orderid);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Stocktrade(IStocktradePK stocktradePK)
     * @param stocktradePK: primary key
     * @return new IStocktrade object with initialized primary key
     */
    public IStocktrade newStocktrade(IStocktradePK stocktradePK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new StocktradePK()
     * @return new empty IStocktradePK object
     */
    public IStocktradePK newStocktradePK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new StocktradePK(primarykey fields)
     * @return new IStocktradePK object with initialized primary key
     */
    public IStocktradePK newStocktradePK(java.lang.String username, long evetype, long orderid);

    /**
     * 
     * @return all Stocktrade objects from database, unsorted
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Stocktrade objects from database, customizable
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getStocktrades() throws CustomException;

    /**
     * 
     * @param stocktradePK: Stocktrade primary key
     * @return Stocktrade Entity object for primary key
     * @throws eve.general.exception.CustomException
     */
    public IStocktrade getStocktrade(IStocktradePK stocktradePK) throws CustomException;

    /**
     * Search stocktrade in database for stocktradePK:
     * @param stocktradePK: Stocktrade Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getStocktradeExists(IStocktradePK stocktradePK) throws DBException;

    /**
     * try to insert Stocktrade object in database
     * commit transaction
     * @param stocktrade: Stocktrade Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertStocktrade(IStocktrade stocktrade) throws CustomException, DataException;

    /**
     * check if Stocktrade exists
     * insert if not, update if found
     * do not commit transaction
     * @param stocktrade: Stocktrade Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertupdateStocktrade(IStocktrade stocktrade) throws CustomException, DataException;

    /**
     * try to update Stocktrade object in database
     * commit transaction
     * @param stocktrade: Stocktrade Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void updateStocktrade(IStocktrade stocktrade) throws CustomException, DataException;
    
    /**
     * try to delete Stocktrade object in database
     * commit transaction
     * @param stocktrade: Stocktrade Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void deleteStocktrade(IStocktrade stocktrade) throws CustomException;

    /**
     * try to insert Stocktrade object in database
     * do not commit transaction
     * @param stocktrade: Stocktrade Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_insertStocktrade(IStocktrade stocktrade) throws CustomException, DataException;

    /**
     * try to update Stocktrade object in database
     * do not commit transaction
     * @param stocktrade: Stocktrade Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_updateStocktrade(IStocktrade stocktrade) throws CustomException, DataException;
    
    /**
     * try to delete Stocktrade object in database
     * do not commit transaction
     * @param stocktrade: Stocktrade Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void trans_deleteStocktrade(IStocktrade stocktrade) throws CustomException;
    
    /**
     * @param stockPK: foreign key for Stock
     * @return all Stocktrade Entity objects for Stock
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getStocktrades4stock(IStockPK stockPK) throws CustomException;

    
//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws eve.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
