/*
 * IBLcorporation.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 12.6.2021 13:57
 *
 */

package eve.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import eve.entity.pk.*;
import eve.interfaces.logicentity.ICorporation;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Corporation
 * 
 * methods for manipulating data- and database objects
 * for Entity Corporation and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLcorporation extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Corporation()
     * @return new empty ICorporation object
     */
    public ICorporation newCorporation();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Corporation(primarykey fields)
     * @return new ICorporation object with initialized primary key
     */
    public ICorporation newCorporation(long id);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Corporation(ICorporationPK corporationPK)
     * @param corporationPK: primary key
     * @return new ICorporation object with initialized primary key
     */
    public ICorporation newCorporation(ICorporationPK corporationPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new CorporationPK()
     * @return new empty ICorporationPK object
     */
    public ICorporationPK newCorporationPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new CorporationPK(primarykey fields)
     * @return new ICorporationPK object with initialized primary key
     */
    public ICorporationPK newCorporationPK(long id);

    /**
     * 
     * @return all Corporation objects from database, unsorted
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Corporation objects from database, customizable
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getCorporations() throws CustomException;

    /**
     * 
     * @param corporationPK: Corporation primary key
     * @return Corporation Entity object for primary key
     * @throws eve.general.exception.CustomException
     */
    public ICorporation getCorporation(ICorporationPK corporationPK) throws CustomException;

    /**
     * Search corporation in database for corporationPK:
     * @param corporationPK: Corporation Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getCorporationExists(ICorporationPK corporationPK) throws DBException;

    /**
     * try to insert Corporation object in database
     * commit transaction
     * @param corporation: Corporation Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertCorporation(ICorporation corporation) throws CustomException, DataException;

    /**
     * check if Corporation exists
     * insert if not, update if found
     * do not commit transaction
     * @param corporation: Corporation Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertupdateCorporation(ICorporation corporation) throws CustomException, DataException;

    /**
     * try to update Corporation object in database
     * commit transaction
     * @param corporation: Corporation Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void updateCorporation(ICorporation corporation) throws CustomException, DataException;
    
    /**
     * try to delete Corporation object in database
     * commit transaction
     * @param corporation: Corporation Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void deleteCorporation(ICorporation corporation) throws CustomException;

    /**
     * try to insert Corporation object in database
     * do not commit transaction
     * @param corporation: Corporation Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_insertCorporation(ICorporation corporation) throws CustomException, DataException;

    /**
     * try to update Corporation object in database
     * do not commit transaction
     * @param corporation: Corporation Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_updateCorporation(ICorporation corporation) throws CustomException, DataException;
    
    /**
     * try to delete Corporation object in database
     * do not commit transaction
     * @param corporation: Corporation Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void trans_deleteCorporation(ICorporation corporation) throws CustomException;
    
    /**
     * @param stationPK: foreign key for Station
     * @return all Corporation Entity objects for Station
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getCorporations4station(IStationPK stationPK) throws CustomException;

    /**
     * @param factionPK: foreign key for Faction
     * @return all Corporation Entity objects for Faction
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getCorporations4faction(IFactionPK factionPK) throws CustomException;

    /**
     * @param alliancePK: foreign key for Alliance
     * @return all Corporation Entity objects for Alliance
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getCorporations4alliance(IAlliancePK alliancePK) throws CustomException;

    
//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws eve.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
