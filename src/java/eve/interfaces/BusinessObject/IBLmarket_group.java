/*
 * IBLmarket_group.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 18.6.2021 14:35
 *
 */

package eve.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import eve.entity.pk.*;
import eve.interfaces.logicentity.IMarket_group;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Market_group
 * 
 * methods for manipulating data- and database objects
 * for Entity Market_group and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLmarket_group extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Market_group()
     * @return new empty IMarket_group object
     */
    public IMarket_group newMarket_group();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Market_group(primarykey fields)
     * @return new IMarket_group object with initialized primary key
     */
    public IMarket_group newMarket_group(long id);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Market_group(IMarket_groupPK market_groupPK)
     * @param market_groupPK: primary key
     * @return new IMarket_group object with initialized primary key
     */
    public IMarket_group newMarket_group(IMarket_groupPK market_groupPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Market_groupPK()
     * @return new empty IMarket_groupPK object
     */
    public IMarket_groupPK newMarket_groupPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Market_groupPK(primarykey fields)
     * @return new IMarket_groupPK object with initialized primary key
     */
    public IMarket_groupPK newMarket_groupPK(long id);

    /**
     * 
     * @return all Market_group objects from database, unsorted
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Market_group objects from database, customizable
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getMarket_groups() throws CustomException;

    /**
     * 
     * @param market_groupPK: Market_group primary key
     * @return Market_group Entity object for primary key
     * @throws eve.general.exception.CustomException
     */
    public IMarket_group getMarket_group(IMarket_groupPK market_groupPK) throws CustomException;

    /**
     * Search market_group in database for market_groupPK:
     * @param market_groupPK: Market_group Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getMarket_groupExists(IMarket_groupPK market_groupPK) throws DBException;

    /**
     * try to insert Market_group object in database
     * commit transaction
     * @param market_group: Market_group Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertMarket_group(IMarket_group market_group) throws CustomException, DataException;

    /**
     * check if Market_group exists
     * insert if not, update if found
     * do not commit transaction
     * @param market_group: Market_group Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertupdateMarket_group(IMarket_group market_group) throws CustomException, DataException;

    /**
     * try to update Market_group object in database
     * commit transaction
     * @param market_group: Market_group Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void updateMarket_group(IMarket_group market_group) throws CustomException, DataException;
    
    /**
     * try to delete Market_group object in database
     * commit transaction
     * @param market_group: Market_group Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void deleteMarket_group(IMarket_group market_group) throws CustomException;

    /**
     * try to insert Market_group object in database
     * do not commit transaction
     * @param market_group: Market_group Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_insertMarket_group(IMarket_group market_group) throws CustomException, DataException;

    /**
     * try to update Market_group object in database
     * do not commit transaction
     * @param market_group: Market_group Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_updateMarket_group(IMarket_group market_group) throws CustomException, DataException;
    
    /**
     * try to delete Market_group object in database
     * do not commit transaction
     * @param market_group: Market_group Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void trans_deleteMarket_group(IMarket_group market_group) throws CustomException;
    
    /**
     * @param market_groupPK: foreign key for Market_group
     * @return all Market_group Entity objects for Market_group
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getMarket_groups4market_groupParent_id(IMarket_groupPK market_groupPK) throws CustomException;

    
//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws eve.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
