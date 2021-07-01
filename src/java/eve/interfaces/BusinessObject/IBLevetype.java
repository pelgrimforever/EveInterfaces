/*
 * IBLevetype.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 30.5.2021 15:39
 *
 */

package eve.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import eve.entity.pk.*;
import eve.interfaces.logicentity.IEvetype;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Evetype
 * 
 * methods for manipulating data- and database objects
 * for Entity Evetype and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLevetype extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Evetype()
     * @return new empty IEvetype object
     */
    public IEvetype newEvetype();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Evetype(primarykey fields)
     * @return new IEvetype object with initialized primary key
     */
    public IEvetype newEvetype(long id);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Evetype(IEvetypePK evetypePK)
     * @param evetypePK: primary key
     * @return new IEvetype object with initialized primary key
     */
    public IEvetype newEvetype(IEvetypePK evetypePK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new EvetypePK()
     * @return new empty IEvetypePK object
     */
    public IEvetypePK newEvetypePK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new EvetypePK(primarykey fields)
     * @return new IEvetypePK object with initialized primary key
     */
    public IEvetypePK newEvetypePK(long id);

    /**
     * 
     * @return all Evetype objects from database, unsorted
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Evetype objects from database, customizable
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getEvetypes() throws CustomException;

    /**
     * 
     * @param evetypePK: Evetype primary key
     * @return Evetype Entity object for primary key
     * @throws eve.general.exception.CustomException
     */
    public IEvetype getEvetype(IEvetypePK evetypePK) throws CustomException;

    /**
     * Search evetype in database for evetypePK:
     * @param evetypePK: Evetype Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getEvetypeExists(IEvetypePK evetypePK) throws DBException;

    /**
     * try to insert Evetype object in database
     * commit transaction
     * @param evetype: Evetype Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertEvetype(IEvetype evetype) throws CustomException, DataException;

    /**
     * check if Evetype exists
     * insert if not, update if found
     * do not commit transaction
     * @param evetype: Evetype Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertupdateEvetype(IEvetype evetype) throws CustomException, DataException;

    /**
     * try to update Evetype object in database
     * commit transaction
     * @param evetype: Evetype Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void updateEvetype(IEvetype evetype) throws CustomException, DataException;
    
    /**
     * try to delete Evetype object in database
     * commit transaction
     * @param evetype: Evetype Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void deleteEvetype(IEvetype evetype) throws CustomException;

    /**
     * try to insert Evetype object in database
     * do not commit transaction
     * @param evetype: Evetype Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_insertEvetype(IEvetype evetype) throws CustomException, DataException;

    /**
     * try to update Evetype object in database
     * do not commit transaction
     * @param evetype: Evetype Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_updateEvetype(IEvetype evetype) throws CustomException, DataException;
    
    /**
     * try to delete Evetype object in database
     * do not commit transaction
     * @param evetype: Evetype Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void trans_deleteEvetype(IEvetype evetype) throws CustomException;
    
    /**
     * @param market_groupPK: foreign key for Market_group
     * @return all Evetype Entity objects for Market_group
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getEvetypes4market_group(IMarket_groupPK market_groupPK) throws CustomException;

    /**
     * @param typegroupPK: foreign key for Typegroup
     * @return all Evetype Entity objects for Typegroup
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getEvetypes4typegroup(ITypegroupPK typegroupPK) throws CustomException;

    /**
     * @param graphicPK: foreign key for Graphic
     * @return all Evetype Entity objects for Graphic
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getEvetypes4graphic(IGraphicPK graphicPK) throws CustomException;

    
    /**
     * @param order_historyPK: parent Order_history for child object Evetype Entity
     * @return child Evetype Entity object
     * @throws eve.general.exception.CustomException
     */
    public IEvetype getOrder_history(IOrder_historyPK order_historyPK) throws CustomException;

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws eve.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
