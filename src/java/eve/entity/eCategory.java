/*
 * eCategory.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 8.5.2021 19:33
 *
 */

package eve.entity;

import data.interfaces.db.AbstractEntity;
import data.interfaces.db.EntityInterface;
import data.interfaces.db.Filedata;
import data.gis.shape.*;
import data.json.piJson;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Iterator;

import eve.entity.pk.*;
import eve.interfaces.logicentity.ICategory;
import eve.interfaces.entity.pk.*;

/**
 * Entity class Category
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Category Entity
 * 
 * @author Franky Laseure
 */
public class eCategory extends AbstractEntity implements EntityInterface {

    protected CategoryPK categoryPK;
    private java.lang.String name;
    private boolean published;
	  
    public static final String table = "category";
    public static final String SQLWhere1 = "id = :category.id:";
    public static final String SQLSelect1 = "select category.* from category where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from category where " + SQLWhere1;
    public static final String SQLSelectAll = "select category.* from category";
	  
    public String getFieldname(short fieldconstant) {
        return ICategory.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ICategory.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Category
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Category (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Category (=Primarykey)
     */
    public String getSQLSelect1() { return SQLSelect1; };

    /**
     * @return Select statement for Primary key, with count field as result
     * count = 1: exists
     * count = 0: not found
     */
    public String getSQLPKExcists() { return SQLSelectPKexists; };
    
    /**
     * 
     * @return SQL select statement for all Categorys
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

    /**
     * 
     * @return Category class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Category entity
     */
    public eCategory() {
    }

    /**
     * Constructor
     * build an empty Category entity with initialized field values
     */
    public eCategory(long id) {
        this.categoryPK = new CategoryPK(id);
    }
  
    /**
     * Constructor
     * build an empty Category entity with initialized Primarykey parameter
     * @param categoryPK: Category Primarykey
     */
    public eCategory(CategoryPK categoryPK) {
        this.categoryPK = categoryPK;
    }

    /**
     * @return is Category Empty ?
     */
    public boolean isEmpty() {
        return this.categoryPK == null;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.categoryPK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.categoryPK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
        updates.put(ICategory.NAME, name);
        updates.put(ICategory.PUBLISHED, published);
        return getAllFields();
    }
	
    /* (non-Javadoc)
     * @see .interfaces.db.EntityInterface#getKey()
     */
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return Primary Key Object
     */
    public CategoryPK getPrimaryKey() {
        return this.categoryPK;
    }

    /**
     * 
     * @return name value
     */
    public java.lang.String getName() {
        return this.name;
    }

    /**
     * set name value
     * @param name: new value
     */
    public void initName(java.lang.String name) {
        this.name = name;
    }

    /**
     * set name value
     * @param name: new value
     */
    public void setName(java.lang.String name) {
	if(name==null && name!=this.name || name!=null && !name.equals(this.name)) {
            updates.put(ICategory.NAME, name);
        }
        this.name = name;
    }

    /**
     * 
     * @return published value
     */
    public boolean getPublished() {
        return this.published;
    }

    /**
     * set published value
     * @param published: new value
     */
    public void initPublished(boolean published) {
        this.published = published;
    }

    /**
     * set published value
     * @param published: new value
     */
    public void setPublished(boolean published) {
        updates.put(ICategory.PUBLISHED, published);
        this.published = published;
    }

    /**
     * 
     * @return Primarykey string value
     */
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
