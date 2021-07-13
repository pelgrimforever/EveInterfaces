/*
 * IBLstargate.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 12.6.2021 13:57
 *
 */

package eve.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import eve.entity.pk.*;
import eve.interfaces.logicentity.IStargate;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Stargate
 * 
 * methods for manipulating data- and database objects
 * for Entity Stargate and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLstargate extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Stargate()
     * @return new empty IStargate object
     */
    public IStargate newStargate();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Stargate(primarykey fields)
     * @return new IStargate object with initialized primary key
     */
    public IStargate newStargate(long id);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Stargate(IStargatePK stargatePK)
     * @param stargatePK: primary key
     * @return new IStargate object with initialized primary key
     */
    public IStargate newStargate(IStargatePK stargatePK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new StargatePK()
     * @return new empty IStargatePK object
     */
    public IStargatePK newStargatePK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new StargatePK(primarykey fields)
     * @return new IStargatePK object with initialized primary key
     */
    public IStargatePK newStargatePK(long id);

    /**
     * 
     * @return all Stargate objects from database, unsorted
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Stargate objects from database, customizable
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getStargates() throws CustomException;

    /**
     * 
     * @param stargatePK: Stargate primary key
     * @return Stargate Entity object for primary key
     * @throws eve.general.exception.CustomException
     */
    public IStargate getStargate(IStargatePK stargatePK) throws CustomException;

    /**
     * Search stargate in database for stargatePK:
     * @param stargatePK: Stargate Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getStargateExists(IStargatePK stargatePK) throws DBException;

    /**
     * try to insert Stargate object in database
     * commit transaction
     * @param stargate: Stargate Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertStargate(IStargate stargate) throws CustomException, DataException;

    /**
     * check if Stargate exists
     * insert if not, update if found
     * do not commit transaction
     * @param stargate: Stargate Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertupdateStargate(IStargate stargate) throws CustomException, DataException;

    /**
     * try to update Stargate object in database
     * commit transaction
     * @param stargate: Stargate Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void updateStargate(IStargate stargate) throws CustomException, DataException;
    
    /**
     * try to delete Stargate object in database
     * commit transaction
     * @param stargate: Stargate Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void deleteStargate(IStargate stargate) throws CustomException;

    /**
     * try to insert Stargate object in database
     * do not commit transaction
     * @param stargate: Stargate Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_insertStargate(IStargate stargate) throws CustomException, DataException;

    /**
     * try to update Stargate object in database
     * do not commit transaction
     * @param stargate: Stargate Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_updateStargate(IStargate stargate) throws CustomException, DataException;
    
    /**
     * try to delete Stargate object in database
     * do not commit transaction
     * @param stargate: Stargate Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void trans_deleteStargate(IStargate stargate) throws CustomException;
    
    /**
     * @param systemPK: foreign key for System
     * @return all Stargate Entity objects for System
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getStargates4systemSystem(ISystemPK systemPK) throws CustomException;

    /**
     * @param systemPK: foreign key for System
     * @return all Stargate Entity objects for System
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getStargates4systemTo_system(ISystemPK systemPK) throws CustomException;

    
//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws eve.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
