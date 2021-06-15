/*
 * IBLalliance.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.5.2021 13:35
 *
 */

package eve.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import eve.entity.pk.*;
import eve.interfaces.logicentity.IAlliance;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Alliance
 * 
 * methods for manipulating data- and database objects
 * for Entity Alliance and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLalliance extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Alliance()
     * @return new empty IAlliance object
     */
    public IAlliance newAlliance();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Alliance(primarykey fields)
     * @return new IAlliance object with initialized primary key
     */
    public IAlliance newAlliance(long id);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Alliance(IAlliancePK alliancePK)
     * @param alliancePK: primary key
     * @return new IAlliance object with initialized primary key
     */
    public IAlliance newAlliance(IAlliancePK alliancePK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new AlliancePK()
     * @return new empty IAlliancePK object
     */
    public IAlliancePK newAlliancePK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new AlliancePK(primarykey fields)
     * @return new IAlliancePK object with initialized primary key
     */
    public IAlliancePK newAlliancePK(long id);

    /**
     * 
     * @return all Alliance objects from database, unsorted
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Alliance objects from database, customizable
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getAlliances() throws CustomException;

    /**
     * 
     * @param alliancePK: Alliance primary key
     * @return Alliance Entity object for primary key
     * @throws eve.general.exception.CustomException
     */
    public IAlliance getAlliance(IAlliancePK alliancePK) throws CustomException;

    /**
     * Search alliance in database for alliancePK:
     * @param alliancePK: Alliance Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getAllianceExists(IAlliancePK alliancePK) throws DBException;

    /**
     * try to insert Alliance object in database
     * commit transaction
     * @param alliance: Alliance Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertAlliance(IAlliance alliance) throws CustomException, DataException;

    /**
     * check if Alliance exists
     * insert if not, update if found
     * do not commit transaction
     * @param alliance: Alliance Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertupdateAlliance(IAlliance alliance) throws CustomException, DataException;

    /**
     * try to update Alliance object in database
     * commit transaction
     * @param alliance: Alliance Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void updateAlliance(IAlliance alliance) throws CustomException, DataException;
    
    /**
     * try to delete Alliance object in database
     * commit transaction
     * @param alliance: Alliance Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void deleteAlliance(IAlliance alliance) throws CustomException;

    /**
     * try to insert Alliance object in database
     * do not commit transaction
     * @param alliance: Alliance Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_insertAlliance(IAlliance alliance) throws CustomException, DataException;

    /**
     * try to update Alliance object in database
     * do not commit transaction
     * @param alliance: Alliance Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_updateAlliance(IAlliance alliance) throws CustomException, DataException;
    
    /**
     * try to delete Alliance object in database
     * do not commit transaction
     * @param alliance: Alliance Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void trans_deleteAlliance(IAlliance alliance) throws CustomException;
    
    /**
     * @param corporationPK: foreign key for Corporation
     * @return all Alliance Entity objects for Corporation
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getAlliances4corporationCreator_corporation(ICorporationPK corporationPK) throws CustomException;

    /**
     * @param corporationPK: foreign key for Corporation
     * @return all Alliance Entity objects for Corporation
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getAlliances4corporationExecutor_corporation(ICorporationPK corporationPK) throws CustomException;

    
//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws eve.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
