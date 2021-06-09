/*
 * IBLsecurity_island.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 8.5.2021 19:33
 *
 */

package eve.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import eve.entity.pk.*;
import eve.interfaces.logicentity.ISecurity_island;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Security_island
 * 
 * methods for manipulating data- and database objects
 * for Entity Security_island and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLsecurity_island extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Security_island()
     * @return new empty ISecurity_island object
     */
    public ISecurity_island newSecurity_island();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Security_island(primarykey fields)
     * @return new ISecurity_island object with initialized primary key
     */
    public ISecurity_island newSecurity_island(long id);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Security_island(ISecurity_islandPK security_islandPK)
     * @param security_islandPK: primary key
     * @return new ISecurity_island object with initialized primary key
     */
    public ISecurity_island newSecurity_island(ISecurity_islandPK security_islandPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Security_islandPK()
     * @return new empty ISecurity_islandPK object
     */
    public ISecurity_islandPK newSecurity_islandPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Security_islandPK(primarykey fields)
     * @return new ISecurity_islandPK object with initialized primary key
     */
    public ISecurity_islandPK newSecurity_islandPK(long id);

    /**
     * 
     * @return all Security_island objects from database, unsorted
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Security_island objects from database, customizable
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getSecurity_islands() throws CustomException;

    /**
     * 
     * @param security_islandPK: Security_island primary key
     * @return Security_island Entity object for primary key
     * @throws eve.general.exception.CustomException
     */
    public ISecurity_island getSecurity_island(ISecurity_islandPK security_islandPK) throws CustomException;

    /**
     * Search security_island in database for security_islandPK:
     * @param security_islandPK: Security_island Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getSecurity_islandExists(ISecurity_islandPK security_islandPK) throws DBException;

    /**
     * try to insert Security_island object in database
     * commit transaction
     * @param security_island: Security_island Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertSecurity_island(ISecurity_island security_island) throws CustomException, DataException;

    /**
     * check if Security_island exists
     * insert if not, update if found
     * do not commit transaction
     * @param security_island: Security_island Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertupdateSecurity_island(ISecurity_island security_island) throws CustomException, DataException;

    /**
     * try to update Security_island object in database
     * commit transaction
     * @param security_island: Security_island Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void updateSecurity_island(ISecurity_island security_island) throws CustomException, DataException;
    
    /**
     * try to delete Security_island object in database
     * commit transaction
     * @param security_island: Security_island Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void deleteSecurity_island(ISecurity_island security_island) throws CustomException;

    /**
     * try to insert Security_island object in database
     * do not commit transaction
     * @param security_island: Security_island Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_insertSecurity_island(ISecurity_island security_island) throws CustomException, DataException;

    /**
     * try to update Security_island object in database
     * do not commit transaction
     * @param security_island: Security_island Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_updateSecurity_island(ISecurity_island security_island) throws CustomException, DataException;
    
    /**
     * try to delete Security_island object in database
     * do not commit transaction
     * @param security_island: Security_island Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void trans_deleteSecurity_island(ISecurity_island security_island) throws CustomException;
    
    
//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws eve.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
