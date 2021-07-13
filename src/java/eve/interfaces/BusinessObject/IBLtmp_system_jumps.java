/*
 * IBLtmp_system_jumps.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 12.6.2021 13:57
 *
 */

package eve.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import eve.entity.pk.*;
import eve.interfaces.logicentity.ITmp_system_jumps;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Tmp_system_jumps
 * 
 * methods for manipulating data- and database objects
 * for Entity Tmp_system_jumps and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLtmp_system_jumps extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Tmp_system_jumps()
     * @return new empty ITmp_system_jumps object
     */
    public ITmp_system_jumps newTmp_system_jumps();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Tmp_system_jumps(primarykey fields)
     * @return new ITmp_system_jumps object with initialized primary key
     */
    public ITmp_system_jumps newTmp_system_jumps(long system);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Tmp_system_jumps(ITmp_system_jumpsPK tmp_system_jumpsPK)
     * @param tmp_system_jumpsPK: primary key
     * @return new ITmp_system_jumps object with initialized primary key
     */
    public ITmp_system_jumps newTmp_system_jumps(ITmp_system_jumpsPK tmp_system_jumpsPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Tmp_system_jumpsPK()
     * @return new empty ITmp_system_jumpsPK object
     */
    public ITmp_system_jumpsPK newTmp_system_jumpsPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Tmp_system_jumpsPK(primarykey fields)
     * @return new ITmp_system_jumpsPK object with initialized primary key
     */
    public ITmp_system_jumpsPK newTmp_system_jumpsPK(long system);

    /**
     * 
     * @return all Tmp_system_jumps objects from database, unsorted
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Tmp_system_jumps objects from database, customizable
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getTmp_system_jumpss() throws CustomException;

    /**
     * 
     * @param tmp_system_jumpsPK: Tmp_system_jumps primary key
     * @return Tmp_system_jumps Entity object for primary key
     * @throws eve.general.exception.CustomException
     */
    public ITmp_system_jumps getTmp_system_jumps(ITmp_system_jumpsPK tmp_system_jumpsPK) throws CustomException;

    /**
     * Search tmp_system_jumps in database for tmp_system_jumpsPK:
     * @param tmp_system_jumpsPK: Tmp_system_jumps Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getTmp_system_jumpsExists(ITmp_system_jumpsPK tmp_system_jumpsPK) throws DBException;

    /**
     * try to insert Tmp_system_jumps object in database
     * commit transaction
     * @param tmp_system_jumps: Tmp_system_jumps Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertTmp_system_jumps(ITmp_system_jumps tmp_system_jumps) throws CustomException, DataException;

    /**
     * check if Tmp_system_jumps exists
     * insert if not, update if found
     * do not commit transaction
     * @param tmp_system_jumps: Tmp_system_jumps Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertupdateTmp_system_jumps(ITmp_system_jumps tmp_system_jumps) throws CustomException, DataException;

    /**
     * try to update Tmp_system_jumps object in database
     * commit transaction
     * @param tmp_system_jumps: Tmp_system_jumps Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void updateTmp_system_jumps(ITmp_system_jumps tmp_system_jumps) throws CustomException, DataException;
    
    /**
     * try to delete Tmp_system_jumps object in database
     * commit transaction
     * @param tmp_system_jumps: Tmp_system_jumps Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void deleteTmp_system_jumps(ITmp_system_jumps tmp_system_jumps) throws CustomException;

    /**
     * try to insert Tmp_system_jumps object in database
     * do not commit transaction
     * @param tmp_system_jumps: Tmp_system_jumps Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_insertTmp_system_jumps(ITmp_system_jumps tmp_system_jumps) throws CustomException, DataException;

    /**
     * try to update Tmp_system_jumps object in database
     * do not commit transaction
     * @param tmp_system_jumps: Tmp_system_jumps Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_updateTmp_system_jumps(ITmp_system_jumps tmp_system_jumps) throws CustomException, DataException;
    
    /**
     * try to delete Tmp_system_jumps object in database
     * do not commit transaction
     * @param tmp_system_jumps: Tmp_system_jumps Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void trans_deleteTmp_system_jumps(ITmp_system_jumps tmp_system_jumps) throws CustomException;
    
    
//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws eve.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
