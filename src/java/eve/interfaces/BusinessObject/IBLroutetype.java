/*
 * IBLroutetype.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.5.2021 13:35
 *
 */

package eve.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import eve.entity.pk.*;
import eve.interfaces.logicentity.IRoutetype;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Routetype
 * 
 * methods for manipulating data- and database objects
 * for Entity Routetype and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLroutetype extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Routetype()
     * @return new empty IRoutetype object
     */
    public IRoutetype newRoutetype();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Routetype(primarykey fields)
     * @return new IRoutetype object with initialized primary key
     */
    public IRoutetype newRoutetype(long id);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Routetype(IRoutetypePK routetypePK)
     * @param routetypePK: primary key
     * @return new IRoutetype object with initialized primary key
     */
    public IRoutetype newRoutetype(IRoutetypePK routetypePK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new RoutetypePK()
     * @return new empty IRoutetypePK object
     */
    public IRoutetypePK newRoutetypePK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new RoutetypePK(primarykey fields)
     * @return new IRoutetypePK object with initialized primary key
     */
    public IRoutetypePK newRoutetypePK(long id);

    /**
     * 
     * @return all Routetype objects from database, unsorted
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Routetype objects from database, customizable
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getRoutetypes() throws CustomException;

    /**
     * 
     * @param routetypePK: Routetype primary key
     * @return Routetype Entity object for primary key
     * @throws eve.general.exception.CustomException
     */
    public IRoutetype getRoutetype(IRoutetypePK routetypePK) throws CustomException;

    /**
     * Search routetype in database for routetypePK:
     * @param routetypePK: Routetype Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getRoutetypeExists(IRoutetypePK routetypePK) throws DBException;

    /**
     * try to insert Routetype object in database
     * commit transaction
     * @param routetype: Routetype Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertRoutetype(IRoutetype routetype) throws CustomException, DataException;

    /**
     * check if Routetype exists
     * insert if not, update if found
     * do not commit transaction
     * @param routetype: Routetype Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertupdateRoutetype(IRoutetype routetype) throws CustomException, DataException;

    /**
     * try to update Routetype object in database
     * commit transaction
     * @param routetype: Routetype Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void updateRoutetype(IRoutetype routetype) throws CustomException, DataException;
    
    /**
     * try to delete Routetype object in database
     * commit transaction
     * @param routetype: Routetype Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void deleteRoutetype(IRoutetype routetype) throws CustomException;

    /**
     * try to insert Routetype object in database
     * do not commit transaction
     * @param routetype: Routetype Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_insertRoutetype(IRoutetype routetype) throws CustomException, DataException;

    /**
     * try to update Routetype object in database
     * do not commit transaction
     * @param routetype: Routetype Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_updateRoutetype(IRoutetype routetype) throws CustomException, DataException;
    
    /**
     * try to delete Routetype object in database
     * do not commit transaction
     * @param routetype: Routetype Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void trans_deleteRoutetype(IRoutetype routetype) throws CustomException;
    
    /**
     * @param security_islandPK: foreign key for Security_island
     * @return all Routetype Entity objects for Security_island
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getRoutetypes4security_island(ISecurity_islandPK security_islandPK) throws CustomException;

    
    /**
     * @param routePK: parent Route for child object Routetype Entity
     * @return child Routetype Entity object
     * @throws eve.general.exception.CustomException
     */
    public IRoutetype getRoute(IRoutePK routePK) throws CustomException;

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws eve.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
