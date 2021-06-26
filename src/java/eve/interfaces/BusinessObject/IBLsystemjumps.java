/*
 * IBLsystemjumps.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.5.2021 16:2
 *
 */

package eve.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import eve.entity.pk.*;
import eve.interfaces.logicentity.ISystemjumps;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Systemjumps
 * 
 * methods for manipulating data- and database objects
 * for Entity Systemjumps and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLsystemjumps extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Systemjumps()
     * @return new empty ISystemjumps object
     */
    public ISystemjumps newSystemjumps();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Systemjumps(primarykey fields)
     * @return new ISystemjumps object with initialized primary key
     */
    public ISystemjumps newSystemjumps(long system_start, long system_end);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Systemjumps(ISystemjumpsPK systemjumpsPK)
     * @param systemjumpsPK: primary key
     * @return new ISystemjumps object with initialized primary key
     */
    public ISystemjumps newSystemjumps(ISystemjumpsPK systemjumpsPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new SystemjumpsPK()
     * @return new empty ISystemjumpsPK object
     */
    public ISystemjumpsPK newSystemjumpsPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new SystemjumpsPK(primarykey fields)
     * @return new ISystemjumpsPK object with initialized primary key
     */
    public ISystemjumpsPK newSystemjumpsPK(long system_start, long system_end);

    /**
     * 
     * @return all Systemjumps objects from database, unsorted
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Systemjumps objects from database, customizable
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getSystemjumpss() throws CustomException;

    /**
     * 
     * @param systemjumpsPK: Systemjumps primary key
     * @return Systemjumps Entity object for primary key
     * @throws eve.general.exception.CustomException
     */
    public ISystemjumps getSystemjumps(ISystemjumpsPK systemjumpsPK) throws CustomException;

    /**
     * Search systemjumps in database for systemjumpsPK:
     * @param systemjumpsPK: Systemjumps Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getSystemjumpsExists(ISystemjumpsPK systemjumpsPK) throws DBException;

    /**
     * try to insert Systemjumps object in database
     * commit transaction
     * @param systemjumps: Systemjumps Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertSystemjumps(ISystemjumps systemjumps) throws CustomException, DataException;

    /**
     * check if Systemjumps exists
     * insert if not, update if found
     * do not commit transaction
     * @param systemjumps: Systemjumps Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertupdateSystemjumps(ISystemjumps systemjumps) throws CustomException, DataException;

    /**
     * try to update Systemjumps object in database
     * commit transaction
     * @param systemjumps: Systemjumps Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void updateSystemjumps(ISystemjumps systemjumps) throws CustomException, DataException;
    
    /**
     * try to delete Systemjumps object in database
     * commit transaction
     * @param systemjumps: Systemjumps Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void deleteSystemjumps(ISystemjumps systemjumps) throws CustomException;

    /**
     * try to insert Systemjumps object in database
     * do not commit transaction
     * @param systemjumps: Systemjumps Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_insertSystemjumps(ISystemjumps systemjumps) throws CustomException, DataException;

    /**
     * try to update Systemjumps object in database
     * do not commit transaction
     * @param systemjumps: Systemjumps Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_updateSystemjumps(ISystemjumps systemjumps) throws CustomException, DataException;
    
    /**
     * try to delete Systemjumps object in database
     * do not commit transaction
     * @param systemjumps: Systemjumps Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void trans_deleteSystemjumps(ISystemjumps systemjumps) throws CustomException;
    
    /**
     * @param systemPK: foreign key for System
     * @return all Systemjumps Entity objects for System
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getSystemjumpss4systemSystem_end(ISystemPK systemPK) throws CustomException;

    /**
     * @param systemPK: foreign key for System
     * @return all Systemjumps Entity objects for System
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getSystemjumpss4systemSystem_start(ISystemPK systemPK) throws CustomException;

    
//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws eve.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
