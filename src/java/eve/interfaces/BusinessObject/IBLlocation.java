/*
 * IBLlocation.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 18.6.2021 14:35
 *
 */

package eve.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import eve.entity.pk.*;
import eve.interfaces.logicentity.ILocation;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Location
 * 
 * methods for manipulating data- and database objects
 * for Entity Location and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLlocation extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Location()
     * @return new empty ILocation object
     */
    public ILocation newLocation();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Location(primarykey fields)
     * @return new ILocation object with initialized primary key
     */
    public ILocation newLocation(long id);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Location(ILocationPK locationPK)
     * @param locationPK: primary key
     * @return new ILocation object with initialized primary key
     */
    public ILocation newLocation(ILocationPK locationPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new LocationPK()
     * @return new empty ILocationPK object
     */
    public ILocationPK newLocationPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new LocationPK(primarykey fields)
     * @return new ILocationPK object with initialized primary key
     */
    public ILocationPK newLocationPK(long id);

    /**
     * 
     * @return all Location objects from database, unsorted
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Location objects from database, customizable
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getLocations() throws CustomException;

    /**
     * 
     * @param locationPK: Location primary key
     * @return Location Entity object for primary key
     * @throws eve.general.exception.CustomException
     */
    public ILocation getLocation(ILocationPK locationPK) throws CustomException;

    /**
     * Search location in database for locationPK:
     * @param locationPK: Location Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getLocationExists(ILocationPK locationPK) throws DBException;

    /**
     * try to insert Location object in database
     * commit transaction
     * @param location: Location Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertLocation(ILocation location) throws CustomException, DataException;

    /**
     * check if Location exists
     * insert if not, update if found
     * do not commit transaction
     * @param location: Location Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertupdateLocation(ILocation location) throws CustomException, DataException;

    /**
     * try to update Location object in database
     * commit transaction
     * @param location: Location Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void updateLocation(ILocation location) throws CustomException, DataException;
    
    /**
     * try to delete Location object in database
     * commit transaction
     * @param location: Location Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void deleteLocation(ILocation location) throws CustomException;

    /**
     * try to insert Location object in database
     * do not commit transaction
     * @param location: Location Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_insertLocation(ILocation location) throws CustomException, DataException;

    /**
     * try to update Location object in database
     * do not commit transaction
     * @param location: Location Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_updateLocation(ILocation location) throws CustomException, DataException;
    
    /**
     * try to delete Location object in database
     * do not commit transaction
     * @param location: Location Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void trans_deleteLocation(ILocation location) throws CustomException;
    
    /**
     * @param systemPK: foreign key for System
     * @return all Location Entity objects for System
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getLocations4system(ISystemPK systemPK) throws CustomException;

    
//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws eve.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
