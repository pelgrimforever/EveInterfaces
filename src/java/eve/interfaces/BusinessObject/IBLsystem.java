/*
 * IBLsystem.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 30.5.2021 15:39
 *
 */

package eve.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import eve.entity.pk.*;
import eve.interfaces.logicentity.ISystem;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class System
 * 
 * methods for manipulating data- and database objects
 * for Entity System and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLsystem extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new System()
     * @return new empty ISystem object
     */
    public ISystem newSystem();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new System(primarykey fields)
     * @return new ISystem object with initialized primary key
     */
    public ISystem newSystem(long id);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new System(ISystemPK systemPK)
     * @param systemPK: primary key
     * @return new ISystem object with initialized primary key
     */
    public ISystem newSystem(ISystemPK systemPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new SystemPK()
     * @return new empty ISystemPK object
     */
    public ISystemPK newSystemPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new SystemPK(primarykey fields)
     * @return new ISystemPK object with initialized primary key
     */
    public ISystemPK newSystemPK(long id);

    /**
     * 
     * @return all System objects from database, unsorted
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all System objects from database, customizable
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getSystems() throws CustomException;

    /**
     * 
     * @param systemPK: System primary key
     * @return System Entity object for primary key
     * @throws eve.general.exception.CustomException
     */
    public ISystem getSystem(ISystemPK systemPK) throws CustomException;

    /**
     * Search system in database for systemPK:
     * @param systemPK: System Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getSystemExists(ISystemPK systemPK) throws DBException;

    /**
     * try to insert System object in database
     * commit transaction
     * @param system: System Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertSystem(ISystem system) throws CustomException, DataException;

    /**
     * check if System exists
     * insert if not, update if found
     * do not commit transaction
     * @param system: System Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertupdateSystem(ISystem system) throws CustomException, DataException;

    /**
     * try to update System object in database
     * commit transaction
     * @param system: System Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void updateSystem(ISystem system) throws CustomException, DataException;
    
    /**
     * try to delete System object in database
     * commit transaction
     * @param system: System Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void deleteSystem(ISystem system) throws CustomException;

    /**
     * try to insert System object in database
     * do not commit transaction
     * @param system: System Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_insertSystem(ISystem system) throws CustomException, DataException;

    /**
     * try to update System object in database
     * do not commit transaction
     * @param system: System Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_updateSystem(ISystem system) throws CustomException, DataException;
    
    /**
     * try to delete System object in database
     * do not commit transaction
     * @param system: System Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void trans_deleteSystem(ISystem system) throws CustomException;
    
    /**
     * @param security_islandPK: foreign key for Security_island
     * @return all System Entity objects for Security_island
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getSystems4security_island(ISecurity_islandPK security_islandPK) throws CustomException;

    /**
     * @param constellationPK: foreign key for Constellation
     * @return all System Entity objects for Constellation
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getSystems4constellation(IConstellationPK constellationPK) throws CustomException;

    
    /**
     * @param systemjumpsPK: parent Systemjumps for child object System Entity
     * @return child System Entity object
     * @throws eve.general.exception.CustomException
     */
    public ISystem getSystemjumpssystem_end(ISystemjumpsPK systemjumpsPK) throws CustomException;

    /**
     * @param systemjumpsPK: parent Systemjumps for child object System Entity
     * @return child System Entity object
     * @throws eve.general.exception.CustomException
     */
    public ISystem getSystemjumpssystem_start(ISystemjumpsPK systemjumpsPK) throws CustomException;

    /**
     * @param routePK: parent Route for child object System Entity
     * @return child System Entity object
     * @throws eve.general.exception.CustomException
     */
    public ISystem getRoute(IRoutePK routePK) throws CustomException;

    /**
     * @param systemtradePK: parent Systemtrade for child object System Entity
     * @return child System Entity object
     * @throws eve.general.exception.CustomException
     */
    public ISystem getSystemtradesell_system(ISystemtradePK systemtradePK) throws CustomException;

    /**
     * @param systemtradePK: parent Systemtrade for child object System Entity
     * @return child System Entity object
     * @throws eve.general.exception.CustomException
     */
    public ISystem getSystemtradebuy_system(ISystemtradePK systemtradePK) throws CustomException;

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws eve.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
