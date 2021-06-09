/*
 * IBLtypegroup.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 8.5.2021 19:33
 *
 */

package eve.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import eve.entity.pk.*;
import eve.interfaces.logicentity.ITypegroup;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Typegroup
 * 
 * methods for manipulating data- and database objects
 * for Entity Typegroup and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLtypegroup extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Typegroup()
     * @return new empty ITypegroup object
     */
    public ITypegroup newTypegroup();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Typegroup(primarykey fields)
     * @return new ITypegroup object with initialized primary key
     */
    public ITypegroup newTypegroup(long id);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Typegroup(ITypegroupPK typegroupPK)
     * @param typegroupPK: primary key
     * @return new ITypegroup object with initialized primary key
     */
    public ITypegroup newTypegroup(ITypegroupPK typegroupPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new TypegroupPK()
     * @return new empty ITypegroupPK object
     */
    public ITypegroupPK newTypegroupPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new TypegroupPK(primarykey fields)
     * @return new ITypegroupPK object with initialized primary key
     */
    public ITypegroupPK newTypegroupPK(long id);

    /**
     * 
     * @return all Typegroup objects from database, unsorted
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Typegroup objects from database, customizable
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getTypegroups() throws CustomException;

    /**
     * 
     * @param typegroupPK: Typegroup primary key
     * @return Typegroup Entity object for primary key
     * @throws eve.general.exception.CustomException
     */
    public ITypegroup getTypegroup(ITypegroupPK typegroupPK) throws CustomException;

    /**
     * Search typegroup in database for typegroupPK:
     * @param typegroupPK: Typegroup Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getTypegroupExists(ITypegroupPK typegroupPK) throws DBException;

    /**
     * try to insert Typegroup object in database
     * commit transaction
     * @param typegroup: Typegroup Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertTypegroup(ITypegroup typegroup) throws CustomException, DataException;

    /**
     * check if Typegroup exists
     * insert if not, update if found
     * do not commit transaction
     * @param typegroup: Typegroup Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertupdateTypegroup(ITypegroup typegroup) throws CustomException, DataException;

    /**
     * try to update Typegroup object in database
     * commit transaction
     * @param typegroup: Typegroup Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void updateTypegroup(ITypegroup typegroup) throws CustomException, DataException;
    
    /**
     * try to delete Typegroup object in database
     * commit transaction
     * @param typegroup: Typegroup Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void deleteTypegroup(ITypegroup typegroup) throws CustomException;

    /**
     * try to insert Typegroup object in database
     * do not commit transaction
     * @param typegroup: Typegroup Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_insertTypegroup(ITypegroup typegroup) throws CustomException, DataException;

    /**
     * try to update Typegroup object in database
     * do not commit transaction
     * @param typegroup: Typegroup Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_updateTypegroup(ITypegroup typegroup) throws CustomException, DataException;
    
    /**
     * try to delete Typegroup object in database
     * do not commit transaction
     * @param typegroup: Typegroup Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void trans_deleteTypegroup(ITypegroup typegroup) throws CustomException;
    
    /**
     * @param categoryPK: foreign key for Category
     * @return all Typegroup Entity objects for Category
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getTypegroups4category(ICategoryPK categoryPK) throws CustomException;

    
//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws eve.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
