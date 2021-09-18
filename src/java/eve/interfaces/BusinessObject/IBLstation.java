/*
 * IBLstation.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 18.8.2021 11:31
 *
 */

package eve.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import eve.entity.pk.*;
import eve.interfaces.logicentity.IStation;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Station
 * 
 * methods for manipulating data- and database objects
 * for Entity Station and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLstation extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Station()
     * @return new empty IStation object
     */
    public IStation newStation();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Station(primarykey fields)
     * @return new IStation object with initialized primary key
     */
    public IStation newStation(long id);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Station(IStationPK stationPK)
     * @param stationPK: primary key
     * @return new IStation object with initialized primary key
     */
    public IStation newStation(IStationPK stationPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new StationPK()
     * @return new empty IStationPK object
     */
    public IStationPK newStationPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new StationPK(primarykey fields)
     * @return new IStationPK object with initialized primary key
     */
    public IStationPK newStationPK(long id);

    /**
     * 
     * @return all Station objects from database, unsorted
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Station objects from database, customizable
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getStations() throws CustomException;

    /**
     * 
     * @param stationPK: Station primary key
     * @return Station Entity object for primary key
     * @throws eve.general.exception.CustomException
     */
    public IStation getStation(IStationPK stationPK) throws CustomException;

    /**
     * Search station in database for stationPK:
     * @param stationPK: Station Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getStationExists(IStationPK stationPK) throws DBException;

    /**
     * try to insert Station object in database
     * commit transaction
     * @param station: Station Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertStation(IStation station) throws CustomException, DataException;

    /**
     * check if Station exists
     * insert if not, update if found
     * do not commit transaction
     * @param station: Station Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertupdateStation(IStation station) throws CustomException, DataException;

    /**
     * try to update Station object in database
     * commit transaction
     * @param station: Station Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void updateStation(IStation station) throws CustomException, DataException;
    
    /**
     * try to delete Station object in database
     * commit transaction
     * @param station: Station Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void deleteStation(IStation station) throws CustomException;

    /**
     * try to insert Station object in database
     * do not commit transaction
     * @param station: Station Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_insertStation(IStation station) throws CustomException, DataException;

    /**
     * try to update Station object in database
     * do not commit transaction
     * @param station: Station Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_updateStation(IStation station) throws CustomException, DataException;
    
    /**
     * try to delete Station object in database
     * do not commit transaction
     * @param station: Station Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void trans_deleteStation(IStation station) throws CustomException;
    
    /**
     * @param racePK: foreign key for Race
     * @return all Station Entity objects for Race
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getStations4race(IRacePK racePK) throws CustomException;

    /**
     * @param evetypePK: foreign key for Evetype
     * @return all Station Entity objects for Evetype
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getStations4evetype(IEvetypePK evetypePK) throws CustomException;

    /**
     * @param systemPK: foreign key for System
     * @return all Station Entity objects for System
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getStations4system(ISystemPK systemPK) throws CustomException;

    
    /**
     * @param station_servicePK: parent Station_service for child object Station Entity
     * @return child Station Entity object
     * @throws eve.general.exception.CustomException
     */
    public IStation getStation_service(IStation_servicePK station_servicePK) throws CustomException;

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws eve.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
