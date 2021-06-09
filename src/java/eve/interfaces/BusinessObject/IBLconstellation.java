/*
 * IBLconstellation.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 8.5.2021 19:33
 *
 */

package eve.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import eve.entity.pk.*;
import eve.interfaces.logicentity.IConstellation;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Constellation
 * 
 * methods for manipulating data- and database objects
 * for Entity Constellation and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLconstellation extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Constellation()
     * @return new empty IConstellation object
     */
    public IConstellation newConstellation();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Constellation(primarykey fields)
     * @return new IConstellation object with initialized primary key
     */
    public IConstellation newConstellation(long id);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Constellation(IConstellationPK constellationPK)
     * @param constellationPK: primary key
     * @return new IConstellation object with initialized primary key
     */
    public IConstellation newConstellation(IConstellationPK constellationPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new ConstellationPK()
     * @return new empty IConstellationPK object
     */
    public IConstellationPK newConstellationPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new ConstellationPK(primarykey fields)
     * @return new IConstellationPK object with initialized primary key
     */
    public IConstellationPK newConstellationPK(long id);

    /**
     * 
     * @return all Constellation objects from database, unsorted
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Constellation objects from database, customizable
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getConstellations() throws CustomException;

    /**
     * 
     * @param constellationPK: Constellation primary key
     * @return Constellation Entity object for primary key
     * @throws eve.general.exception.CustomException
     */
    public IConstellation getConstellation(IConstellationPK constellationPK) throws CustomException;

    /**
     * Search constellation in database for constellationPK:
     * @param constellationPK: Constellation Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getConstellationExists(IConstellationPK constellationPK) throws DBException;

    /**
     * try to insert Constellation object in database
     * commit transaction
     * @param constellation: Constellation Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertConstellation(IConstellation constellation) throws CustomException, DataException;

    /**
     * check if Constellation exists
     * insert if not, update if found
     * do not commit transaction
     * @param constellation: Constellation Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertupdateConstellation(IConstellation constellation) throws CustomException, DataException;

    /**
     * try to update Constellation object in database
     * commit transaction
     * @param constellation: Constellation Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void updateConstellation(IConstellation constellation) throws CustomException, DataException;
    
    /**
     * try to delete Constellation object in database
     * commit transaction
     * @param constellation: Constellation Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void deleteConstellation(IConstellation constellation) throws CustomException;

    /**
     * try to insert Constellation object in database
     * do not commit transaction
     * @param constellation: Constellation Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_insertConstellation(IConstellation constellation) throws CustomException, DataException;

    /**
     * try to update Constellation object in database
     * do not commit transaction
     * @param constellation: Constellation Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_updateConstellation(IConstellation constellation) throws CustomException, DataException;
    
    /**
     * try to delete Constellation object in database
     * do not commit transaction
     * @param constellation: Constellation Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void trans_deleteConstellation(IConstellation constellation) throws CustomException;
    
    /**
     * @param regionPK: foreign key for Region
     * @return all Constellation Entity objects for Region
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getConstellations4region(IRegionPK regionPK) throws CustomException;

    
    /**
     * @param constellation_neighbourPK: parent Constellation_neighbour for child object Constellation Entity
     * @return child Constellation Entity object
     * @throws eve.general.exception.CustomException
     */
    public IConstellation getConstellation_neighbourneighbour(IConstellation_neighbourPK constellation_neighbourPK) throws CustomException;

    /**
     * @param constellation_neighbourPK: parent Constellation_neighbour for child object Constellation Entity
     * @return child Constellation Entity object
     * @throws eve.general.exception.CustomException
     */
    public IConstellation getConstellation_neighbourconstellation(IConstellation_neighbourPK constellation_neighbourPK) throws CustomException;

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws eve.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
