/*
 * IBLfaction.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 30.5.2021 15:39
 *
 */

package eve.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import eve.entity.pk.*;
import eve.interfaces.logicentity.IFaction;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Faction
 * 
 * methods for manipulating data- and database objects
 * for Entity Faction and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLfaction extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Faction()
     * @return new empty IFaction object
     */
    public IFaction newFaction();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Faction(primarykey fields)
     * @return new IFaction object with initialized primary key
     */
    public IFaction newFaction(long id);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Faction(IFactionPK factionPK)
     * @param factionPK: primary key
     * @return new IFaction object with initialized primary key
     */
    public IFaction newFaction(IFactionPK factionPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new FactionPK()
     * @return new empty IFactionPK object
     */
    public IFactionPK newFactionPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new FactionPK(primarykey fields)
     * @return new IFactionPK object with initialized primary key
     */
    public IFactionPK newFactionPK(long id);

    /**
     * 
     * @return all Faction objects from database, unsorted
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Faction objects from database, customizable
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getFactions() throws CustomException;

    /**
     * 
     * @param factionPK: Faction primary key
     * @return Faction Entity object for primary key
     * @throws eve.general.exception.CustomException
     */
    public IFaction getFaction(IFactionPK factionPK) throws CustomException;

    /**
     * Search faction in database for factionPK:
     * @param factionPK: Faction Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getFactionExists(IFactionPK factionPK) throws DBException;

    /**
     * try to insert Faction object in database
     * commit transaction
     * @param faction: Faction Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertFaction(IFaction faction) throws CustomException, DataException;

    /**
     * check if Faction exists
     * insert if not, update if found
     * do not commit transaction
     * @param faction: Faction Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertupdateFaction(IFaction faction) throws CustomException, DataException;

    /**
     * try to update Faction object in database
     * commit transaction
     * @param faction: Faction Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void updateFaction(IFaction faction) throws CustomException, DataException;
    
    /**
     * try to delete Faction object in database
     * commit transaction
     * @param faction: Faction Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void deleteFaction(IFaction faction) throws CustomException;

    /**
     * try to insert Faction object in database
     * do not commit transaction
     * @param faction: Faction Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_insertFaction(IFaction faction) throws CustomException, DataException;

    /**
     * try to update Faction object in database
     * do not commit transaction
     * @param faction: Faction Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_updateFaction(IFaction faction) throws CustomException, DataException;
    
    /**
     * try to delete Faction object in database
     * do not commit transaction
     * @param faction: Faction Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void trans_deleteFaction(IFaction faction) throws CustomException;
    
    /**
     * @param systemPK: foreign key for System
     * @return all Faction Entity objects for System
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getFactions4system(ISystemPK systemPK) throws CustomException;

    
//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws eve.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
