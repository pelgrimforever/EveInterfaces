/*
 * IBLrace.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 18.6.2021 14:35
 *
 */

package eve.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import eve.entity.pk.*;
import eve.interfaces.logicentity.IRace;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Race
 * 
 * methods for manipulating data- and database objects
 * for Entity Race and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLrace extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Race()
     * @return new empty IRace object
     */
    public IRace newRace();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Race(primarykey fields)
     * @return new IRace object with initialized primary key
     */
    public IRace newRace(long id);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Race(IRacePK racePK)
     * @param racePK: primary key
     * @return new IRace object with initialized primary key
     */
    public IRace newRace(IRacePK racePK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new RacePK()
     * @return new empty IRacePK object
     */
    public IRacePK newRacePK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new RacePK(primarykey fields)
     * @return new IRacePK object with initialized primary key
     */
    public IRacePK newRacePK(long id);

    /**
     * 
     * @return all Race objects from database, unsorted
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Race objects from database, customizable
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getRaces() throws CustomException;

    /**
     * 
     * @param racePK: Race primary key
     * @return Race Entity object for primary key
     * @throws eve.general.exception.CustomException
     */
    public IRace getRace(IRacePK racePK) throws CustomException;

    /**
     * Search race in database for racePK:
     * @param racePK: Race Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getRaceExists(IRacePK racePK) throws DBException;

    /**
     * try to insert Race object in database
     * commit transaction
     * @param race: Race Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertRace(IRace race) throws CustomException, DataException;

    /**
     * check if Race exists
     * insert if not, update if found
     * do not commit transaction
     * @param race: Race Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertupdateRace(IRace race) throws CustomException, DataException;

    /**
     * try to update Race object in database
     * commit transaction
     * @param race: Race Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void updateRace(IRace race) throws CustomException, DataException;
    
    /**
     * try to delete Race object in database
     * commit transaction
     * @param race: Race Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void deleteRace(IRace race) throws CustomException;

    /**
     * try to insert Race object in database
     * do not commit transaction
     * @param race: Race Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_insertRace(IRace race) throws CustomException, DataException;

    /**
     * try to update Race object in database
     * do not commit transaction
     * @param race: Race Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_updateRace(IRace race) throws CustomException, DataException;
    
    /**
     * try to delete Race object in database
     * do not commit transaction
     * @param race: Race Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void trans_deleteRace(IRace race) throws CustomException;
    
    /**
     * @param factionPK: foreign key for Faction
     * @return all Race Entity objects for Faction
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getRaces4faction(IFactionPK factionPK) throws CustomException;

    
//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws eve.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
