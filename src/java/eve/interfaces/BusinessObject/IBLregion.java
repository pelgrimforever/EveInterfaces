/*
 * IBLregion.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.5.2021 13:35
 *
 */

package eve.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import eve.entity.pk.*;
import eve.interfaces.logicentity.IRegion;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Region
 * 
 * methods for manipulating data- and database objects
 * for Entity Region and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLregion extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Region()
     * @return new empty IRegion object
     */
    public IRegion newRegion();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Region(primarykey fields)
     * @return new IRegion object with initialized primary key
     */
    public IRegion newRegion(long id);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Region(IRegionPK regionPK)
     * @param regionPK: primary key
     * @return new IRegion object with initialized primary key
     */
    public IRegion newRegion(IRegionPK regionPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new RegionPK()
     * @return new empty IRegionPK object
     */
    public IRegionPK newRegionPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new RegionPK(primarykey fields)
     * @return new IRegionPK object with initialized primary key
     */
    public IRegionPK newRegionPK(long id);

    /**
     * 
     * @return all Region objects from database, unsorted
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Region objects from database, customizable
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getRegions() throws CustomException;

    /**
     * 
     * @param regionPK: Region primary key
     * @return Region Entity object for primary key
     * @throws eve.general.exception.CustomException
     */
    public IRegion getRegion(IRegionPK regionPK) throws CustomException;

    /**
     * Search region in database for regionPK:
     * @param regionPK: Region Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getRegionExists(IRegionPK regionPK) throws DBException;

    /**
     * try to insert Region object in database
     * commit transaction
     * @param region: Region Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertRegion(IRegion region) throws CustomException, DataException;

    /**
     * check if Region exists
     * insert if not, update if found
     * do not commit transaction
     * @param region: Region Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertupdateRegion(IRegion region) throws CustomException, DataException;

    /**
     * try to update Region object in database
     * commit transaction
     * @param region: Region Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void updateRegion(IRegion region) throws CustomException, DataException;
    
    /**
     * try to delete Region object in database
     * commit transaction
     * @param region: Region Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void deleteRegion(IRegion region) throws CustomException;

    /**
     * try to insert Region object in database
     * do not commit transaction
     * @param region: Region Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_insertRegion(IRegion region) throws CustomException, DataException;

    /**
     * try to update Region object in database
     * do not commit transaction
     * @param region: Region Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_updateRegion(IRegion region) throws CustomException, DataException;
    
    /**
     * try to delete Region object in database
     * do not commit transaction
     * @param region: Region Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void trans_deleteRegion(IRegion region) throws CustomException;
    
    
    /**
     * @param order_historyPK: parent Order_history for child object Region Entity
     * @return child Region Entity object
     * @throws eve.general.exception.CustomException
     */
    public IRegion getOrder_history(IOrder_historyPK order_historyPK) throws CustomException;

    /**
     * @param region_neighbourPK: parent Region_neighbour for child object Region Entity
     * @return child Region Entity object
     * @throws eve.general.exception.CustomException
     */
    public IRegion getRegion_neighbourregion(IRegion_neighbourPK region_neighbourPK) throws CustomException;

    /**
     * @param region_neighbourPK: parent Region_neighbour for child object Region Entity
     * @return child Region Entity object
     * @throws eve.general.exception.CustomException
     */
    public IRegion getRegion_neighbourneighbour(IRegion_neighbourPK region_neighbourPK) throws CustomException;

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws eve.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
