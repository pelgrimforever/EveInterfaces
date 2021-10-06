/*
 * IBLstock.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 6.9.2021 16:29
 *
 */

package eve.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import eve.entity.pk.*;
import eve.interfaces.logicentity.IStock;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Stock
 * 
 * methods for manipulating data- and database objects
 * for Entity Stock and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLstock extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Stock()
     * @return new empty IStock object
     */
    public IStock newStock();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Stock(primarykey fields)
     * @return new IStock object with initialized primary key
     */
    public IStock newStock(java.lang.String username, long evetype);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Stock(IStockPK stockPK)
     * @param stockPK: primary key
     * @return new IStock object with initialized primary key
     */
    public IStock newStock(IStockPK stockPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new StockPK()
     * @return new empty IStockPK object
     */
    public IStockPK newStockPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new StockPK(primarykey fields)
     * @return new IStockPK object with initialized primary key
     */
    public IStockPK newStockPK(java.lang.String username, long evetype);

    /**
     * 
     * @return all Stock objects from database, unsorted
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Stock objects from database, customizable
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getStocks() throws CustomException;

    /**
     * 
     * @param stockPK: Stock primary key
     * @return Stock Entity object for primary key
     * @throws eve.general.exception.CustomException
     */
    public IStock getStock(IStockPK stockPK) throws CustomException;

    /**
     * Search stock in database for stockPK:
     * @param stockPK: Stock Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getStockExists(IStockPK stockPK) throws DBException;

    /**
     * try to insert Stock object in database
     * commit transaction
     * @param stock: Stock Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertStock(IStock stock) throws CustomException, DataException;

    /**
     * check if Stock exists
     * insert if not, update if found
     * do not commit transaction
     * @param stock: Stock Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertupdateStock(IStock stock) throws CustomException, DataException;

    /**
     * try to update Stock object in database
     * commit transaction
     * @param stock: Stock Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void updateStock(IStock stock) throws CustomException, DataException;
    
    /**
     * try to delete Stock object in database
     * commit transaction
     * @param stock: Stock Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void deleteStock(IStock stock) throws CustomException;

    /**
     * try to insert Stock object in database
     * do not commit transaction
     * @param stock: Stock Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_insertStock(IStock stock) throws CustomException, DataException;

    /**
     * try to update Stock object in database
     * do not commit transaction
     * @param stock: Stock Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_updateStock(IStock stock) throws CustomException, DataException;
    
    /**
     * try to delete Stock object in database
     * do not commit transaction
     * @param stock: Stock Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void trans_deleteStock(IStock stock) throws CustomException;
    
    /**
     * @param evetypePK: foreign key for Evetype
     * @return all Stock Entity objects for Evetype
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getStocks4evetype(IEvetypePK evetypePK) throws CustomException;

    
    /**
     * @param stocktradePK: parent Stocktrade for child object Stock Entity
     * @return child Stock Entity object
     * @throws eve.general.exception.CustomException
     */
    public IStock getStocktrade(IStocktradePK stocktradePK) throws CustomException;

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws eve.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
