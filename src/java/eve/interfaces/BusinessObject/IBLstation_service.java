/*
 * IBLstation_service.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 18.8.2021 11:31
 *
 */

package eve.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import eve.entity.pk.*;
import eve.interfaces.logicentity.IStation_service;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Station_service
 * 
 * methods for manipulating data- and database objects
 * for Entity Station_service and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLstation_service extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Station_service()
     * @return new empty IStation_service object
     */
    public IStation_service newStation_service();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Station_service(primarykey fields)
     * @return new IStation_service object with initialized primary key
     */
    public IStation_service newStation_service(long station, java.lang.String service);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Station_service(IStation_servicePK station_servicePK)
     * @param station_servicePK: primary key
     * @return new IStation_service object with initialized primary key
     */
    public IStation_service newStation_service(IStation_servicePK station_servicePK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Station_servicePK()
     * @return new empty IStation_servicePK object
     */
    public IStation_servicePK newStation_servicePK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Station_servicePK(primarykey fields)
     * @return new IStation_servicePK object with initialized primary key
     */
    public IStation_servicePK newStation_servicePK(long station, java.lang.String service);

    /**
     * 
     * @return all Station_service objects from database, unsorted
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Station_service objects from database, customizable
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getStation_services() throws CustomException;

    /**
     * 
     * @param station_servicePK: Station_service primary key
     * @return Station_service Entity object for primary key
     * @throws eve.general.exception.CustomException
     */
    public IStation_service getStation_service(IStation_servicePK station_servicePK) throws CustomException;

    /**
     * Search station_service in database for station_servicePK:
     * @param station_servicePK: Station_service Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getStation_serviceExists(IStation_servicePK station_servicePK) throws DBException;

    /**
     * try to insert Station_service object in database
     * commit transaction
     * @param station_service: Station_service Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertStation_service(IStation_service station_service) throws CustomException, DataException;

    /**
     * check if Station_service exists
     * insert if not, update if found
     * do not commit transaction
     * @param station_service: Station_service Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertupdateStation_service(IStation_service station_service) throws CustomException, DataException;

    /**
     * try to update Station_service object in database
     * commit transaction
     * @param station_service: Station_service Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void updateStation_service(IStation_service station_service) throws CustomException, DataException;
    
    /**
     * try to delete Station_service object in database
     * commit transaction
     * @param station_service: Station_service Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void deleteStation_service(IStation_service station_service) throws CustomException;

    /**
     * try to insert Station_service object in database
     * do not commit transaction
     * @param station_service: Station_service Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_insertStation_service(IStation_service station_service) throws CustomException, DataException;

    /**
     * try to update Station_service object in database
     * do not commit transaction
     * @param station_service: Station_service Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_updateStation_service(IStation_service station_service) throws CustomException, DataException;
    
    /**
     * try to delete Station_service object in database
     * do not commit transaction
     * @param station_service: Station_service Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void trans_deleteStation_service(IStation_service station_service) throws CustomException;
    
    /**
     * @param stationPK: foreign key for Station
     * @return all Station_service Entity objects for Station
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getStation_services4station(IStationPK stationPK) throws CustomException;

    
//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws eve.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
