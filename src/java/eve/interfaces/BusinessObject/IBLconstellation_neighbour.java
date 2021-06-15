/*
 * IBLconstellation_neighbour.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.5.2021 13:35
 *
 */

package eve.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import eve.entity.pk.*;
import eve.interfaces.logicentity.IConstellation_neighbour;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Constellation_neighbour
 * 
 * methods for manipulating data- and database objects
 * for Entity Constellation_neighbour and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLconstellation_neighbour extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Constellation_neighbour()
     * @return new empty IConstellation_neighbour object
     */
    public IConstellation_neighbour newConstellation_neighbour();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Constellation_neighbour(primarykey fields)
     * @return new IConstellation_neighbour object with initialized primary key
     */
    public IConstellation_neighbour newConstellation_neighbour(long constellation, long neighbour);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Constellation_neighbour(IConstellation_neighbourPK constellation_neighbourPK)
     * @param constellation_neighbourPK: primary key
     * @return new IConstellation_neighbour object with initialized primary key
     */
    public IConstellation_neighbour newConstellation_neighbour(IConstellation_neighbourPK constellation_neighbourPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Constellation_neighbourPK()
     * @return new empty IConstellation_neighbourPK object
     */
    public IConstellation_neighbourPK newConstellation_neighbourPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Constellation_neighbourPK(primarykey fields)
     * @return new IConstellation_neighbourPK object with initialized primary key
     */
    public IConstellation_neighbourPK newConstellation_neighbourPK(long constellation, long neighbour);

    /**
     * 
     * @return all Constellation_neighbour objects from database, unsorted
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Constellation_neighbour objects from database, customizable
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getConstellation_neighbours() throws CustomException;

    /**
     * 
     * @param constellation_neighbourPK: Constellation_neighbour primary key
     * @return Constellation_neighbour Entity object for primary key
     * @throws eve.general.exception.CustomException
     */
    public IConstellation_neighbour getConstellation_neighbour(IConstellation_neighbourPK constellation_neighbourPK) throws CustomException;

    /**
     * Search constellation_neighbour in database for constellation_neighbourPK:
     * @param constellation_neighbourPK: Constellation_neighbour Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getConstellation_neighbourExists(IConstellation_neighbourPK constellation_neighbourPK) throws DBException;

    /**
     * try to insert Constellation_neighbour object in database
     * commit transaction
     * @param constellation_neighbour: Constellation_neighbour Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertConstellation_neighbour(IConstellation_neighbour constellation_neighbour) throws CustomException, DataException;

    /**
     * check if Constellation_neighbour exists
     * insert if not, update if found
     * do not commit transaction
     * @param constellation_neighbour: Constellation_neighbour Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertupdateConstellation_neighbour(IConstellation_neighbour constellation_neighbour) throws CustomException, DataException;

    /**
     * try to update Constellation_neighbour object in database
     * commit transaction
     * @param constellation_neighbour: Constellation_neighbour Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void updateConstellation_neighbour(IConstellation_neighbour constellation_neighbour) throws CustomException, DataException;
    
    /**
     * try to delete Constellation_neighbour object in database
     * commit transaction
     * @param constellation_neighbour: Constellation_neighbour Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void deleteConstellation_neighbour(IConstellation_neighbour constellation_neighbour) throws CustomException;

    /**
     * try to insert Constellation_neighbour object in database
     * do not commit transaction
     * @param constellation_neighbour: Constellation_neighbour Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_insertConstellation_neighbour(IConstellation_neighbour constellation_neighbour) throws CustomException, DataException;

    /**
     * try to update Constellation_neighbour object in database
     * do not commit transaction
     * @param constellation_neighbour: Constellation_neighbour Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_updateConstellation_neighbour(IConstellation_neighbour constellation_neighbour) throws CustomException, DataException;
    
    /**
     * try to delete Constellation_neighbour object in database
     * do not commit transaction
     * @param constellation_neighbour: Constellation_neighbour Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void trans_deleteConstellation_neighbour(IConstellation_neighbour constellation_neighbour) throws CustomException;
    
    /**
     * @param constellationPK: foreign key for Constellation
     * @return all Constellation_neighbour Entity objects for Constellation
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getConstellation_neighbours4constellationNeighbour(IConstellationPK constellationPK) throws CustomException;

    /**
     * @param constellationPK: foreign key for Constellation
     * @return all Constellation_neighbour Entity objects for Constellation
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getConstellation_neighbours4constellationConstellation(IConstellationPK constellationPK) throws CustomException;

    
//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws eve.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
