/*
 * IBLregion_neighbour.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 6.9.2021 16:29
 *
 */

package eve.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import eve.entity.pk.*;
import eve.interfaces.logicentity.IRegion_neighbour;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Region_neighbour
 * 
 * methods for manipulating data- and database objects
 * for Entity Region_neighbour and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLregion_neighbour extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Region_neighbour()
     * @return new empty IRegion_neighbour object
     */
    public IRegion_neighbour newRegion_neighbour();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Region_neighbour(primarykey fields)
     * @return new IRegion_neighbour object with initialized primary key
     */
    public IRegion_neighbour newRegion_neighbour(long region, long neighbour);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Region_neighbour(IRegion_neighbourPK region_neighbourPK)
     * @param region_neighbourPK: primary key
     * @return new IRegion_neighbour object with initialized primary key
     */
    public IRegion_neighbour newRegion_neighbour(IRegion_neighbourPK region_neighbourPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Region_neighbourPK()
     * @return new empty IRegion_neighbourPK object
     */
    public IRegion_neighbourPK newRegion_neighbourPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Region_neighbourPK(primarykey fields)
     * @return new IRegion_neighbourPK object with initialized primary key
     */
    public IRegion_neighbourPK newRegion_neighbourPK(long region, long neighbour);

    /**
     * 
     * @return all Region_neighbour objects from database, unsorted
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Region_neighbour objects from database, customizable
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getRegion_neighbours() throws CustomException;

    /**
     * 
     * @param region_neighbourPK: Region_neighbour primary key
     * @return Region_neighbour Entity object for primary key
     * @throws eve.general.exception.CustomException
     */
    public IRegion_neighbour getRegion_neighbour(IRegion_neighbourPK region_neighbourPK) throws CustomException;

    /**
     * Search region_neighbour in database for region_neighbourPK:
     * @param region_neighbourPK: Region_neighbour Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getRegion_neighbourExists(IRegion_neighbourPK region_neighbourPK) throws DBException;

    /**
     * try to insert Region_neighbour object in database
     * commit transaction
     * @param region_neighbour: Region_neighbour Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertRegion_neighbour(IRegion_neighbour region_neighbour) throws CustomException, DataException;

    /**
     * check if Region_neighbour exists
     * insert if not, update if found
     * do not commit transaction
     * @param region_neighbour: Region_neighbour Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertupdateRegion_neighbour(IRegion_neighbour region_neighbour) throws CustomException, DataException;

    /**
     * try to update Region_neighbour object in database
     * commit transaction
     * @param region_neighbour: Region_neighbour Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void updateRegion_neighbour(IRegion_neighbour region_neighbour) throws CustomException, DataException;
    
    /**
     * try to delete Region_neighbour object in database
     * commit transaction
     * @param region_neighbour: Region_neighbour Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void deleteRegion_neighbour(IRegion_neighbour region_neighbour) throws CustomException;

    /**
     * try to insert Region_neighbour object in database
     * do not commit transaction
     * @param region_neighbour: Region_neighbour Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_insertRegion_neighbour(IRegion_neighbour region_neighbour) throws CustomException, DataException;

    /**
     * try to update Region_neighbour object in database
     * do not commit transaction
     * @param region_neighbour: Region_neighbour Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_updateRegion_neighbour(IRegion_neighbour region_neighbour) throws CustomException, DataException;
    
    /**
     * try to delete Region_neighbour object in database
     * do not commit transaction
     * @param region_neighbour: Region_neighbour Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void trans_deleteRegion_neighbour(IRegion_neighbour region_neighbour) throws CustomException;
    
    /**
     * @param regionPK: foreign key for Region
     * @return all Region_neighbour Entity objects for Region
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getRegion_neighbours4regionRegion(IRegionPK regionPK) throws CustomException;

    /**
     * @param regionPK: foreign key for Region
     * @return all Region_neighbour Entity objects for Region
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getRegion_neighbours4regionNeighbour(IRegionPK regionPK) throws CustomException;

    
//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws eve.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
