/*
 * IBLsystemtrade.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 18.8.2021 11:31
 *
 */

package eve.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import eve.entity.pk.*;
import eve.interfaces.logicentity.ISystemtrade;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Systemtrade
 * 
 * methods for manipulating data- and database objects
 * for Entity Systemtrade and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLsystemtrade extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Systemtrade()
     * @return new empty ISystemtrade object
     */
    public ISystemtrade newSystemtrade();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Systemtrade(primarykey fields)
     * @return new ISystemtrade object with initialized primary key
     */
    public ISystemtrade newSystemtrade(long sell_system, long buy_system);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Systemtrade(ISystemtradePK systemtradePK)
     * @param systemtradePK: primary key
     * @return new ISystemtrade object with initialized primary key
     */
    public ISystemtrade newSystemtrade(ISystemtradePK systemtradePK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new SystemtradePK()
     * @return new empty ISystemtradePK object
     */
    public ISystemtradePK newSystemtradePK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new SystemtradePK(primarykey fields)
     * @return new ISystemtradePK object with initialized primary key
     */
    public ISystemtradePK newSystemtradePK(long sell_system, long buy_system);

    /**
     * 
     * @return all Systemtrade objects from database, unsorted
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Systemtrade objects from database, customizable
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getSystemtrades() throws CustomException;

    /**
     * 
     * @param systemtradePK: Systemtrade primary key
     * @return Systemtrade Entity object for primary key
     * @throws eve.general.exception.CustomException
     */
    public ISystemtrade getSystemtrade(ISystemtradePK systemtradePK) throws CustomException;

    /**
     * Search systemtrade in database for systemtradePK:
     * @param systemtradePK: Systemtrade Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getSystemtradeExists(ISystemtradePK systemtradePK) throws DBException;

    /**
     * try to insert Systemtrade object in database
     * commit transaction
     * @param systemtrade: Systemtrade Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertSystemtrade(ISystemtrade systemtrade) throws CustomException, DataException;

    /**
     * check if Systemtrade exists
     * insert if not, update if found
     * do not commit transaction
     * @param systemtrade: Systemtrade Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertupdateSystemtrade(ISystemtrade systemtrade) throws CustomException, DataException;

    /**
     * try to update Systemtrade object in database
     * commit transaction
     * @param systemtrade: Systemtrade Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void updateSystemtrade(ISystemtrade systemtrade) throws CustomException, DataException;
    
    /**
     * try to delete Systemtrade object in database
     * commit transaction
     * @param systemtrade: Systemtrade Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void deleteSystemtrade(ISystemtrade systemtrade) throws CustomException;

    /**
     * try to insert Systemtrade object in database
     * do not commit transaction
     * @param systemtrade: Systemtrade Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_insertSystemtrade(ISystemtrade systemtrade) throws CustomException, DataException;

    /**
     * try to update Systemtrade object in database
     * do not commit transaction
     * @param systemtrade: Systemtrade Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_updateSystemtrade(ISystemtrade systemtrade) throws CustomException, DataException;
    
    /**
     * try to delete Systemtrade object in database
     * do not commit transaction
     * @param systemtrade: Systemtrade Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void trans_deleteSystemtrade(ISystemtrade systemtrade) throws CustomException;
    
    /**
     * @param systemPK: foreign key for System
     * @return all Systemtrade Entity objects for System
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getSystemtrades4systemSell_system(ISystemPK systemPK) throws CustomException;

    /**
     * @param systemPK: foreign key for System
     * @return all Systemtrade Entity objects for System
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getSystemtrades4systemBuy_system(ISystemPK systemPK) throws CustomException;

    
    /**
     * @param systemtrade_orderPK: parent Systemtrade_order for child object Systemtrade Entity
     * @return child Systemtrade Entity object
     * @throws eve.general.exception.CustomException
     */
    public ISystemtrade getSystemtrade_order(ISystemtrade_orderPK systemtrade_orderPK) throws CustomException;

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws eve.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
