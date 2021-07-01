/*
 * IBLcategory.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 30.5.2021 15:39
 *
 */

package eve.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import eve.entity.pk.*;
import eve.interfaces.logicentity.ICategory;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Category
 * 
 * methods for manipulating data- and database objects
 * for Entity Category and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLcategory extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Category()
     * @return new empty ICategory object
     */
    public ICategory newCategory();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Category(primarykey fields)
     * @return new ICategory object with initialized primary key
     */
    public ICategory newCategory(long id);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Category(ICategoryPK categoryPK)
     * @param categoryPK: primary key
     * @return new ICategory object with initialized primary key
     */
    public ICategory newCategory(ICategoryPK categoryPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new CategoryPK()
     * @return new empty ICategoryPK object
     */
    public ICategoryPK newCategoryPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new CategoryPK(primarykey fields)
     * @return new ICategoryPK object with initialized primary key
     */
    public ICategoryPK newCategoryPK(long id);

    /**
     * 
     * @return all Category objects from database, unsorted
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Category objects from database, customizable
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getCategorys() throws CustomException;

    /**
     * 
     * @param categoryPK: Category primary key
     * @return Category Entity object for primary key
     * @throws eve.general.exception.CustomException
     */
    public ICategory getCategory(ICategoryPK categoryPK) throws CustomException;

    /**
     * Search category in database for categoryPK:
     * @param categoryPK: Category Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getCategoryExists(ICategoryPK categoryPK) throws DBException;

    /**
     * try to insert Category object in database
     * commit transaction
     * @param category: Category Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertCategory(ICategory category) throws CustomException, DataException;

    /**
     * check if Category exists
     * insert if not, update if found
     * do not commit transaction
     * @param category: Category Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertupdateCategory(ICategory category) throws CustomException, DataException;

    /**
     * try to update Category object in database
     * commit transaction
     * @param category: Category Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void updateCategory(ICategory category) throws CustomException, DataException;
    
    /**
     * try to delete Category object in database
     * commit transaction
     * @param category: Category Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void deleteCategory(ICategory category) throws CustomException;

    /**
     * try to insert Category object in database
     * do not commit transaction
     * @param category: Category Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_insertCategory(ICategory category) throws CustomException, DataException;

    /**
     * try to update Category object in database
     * do not commit transaction
     * @param category: Category Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_updateCategory(ICategory category) throws CustomException, DataException;
    
    /**
     * try to delete Category object in database
     * do not commit transaction
     * @param category: Category Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void trans_deleteCategory(ICategory category) throws CustomException;
    
    
//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws eve.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
