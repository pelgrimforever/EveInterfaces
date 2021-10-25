/*
 * eCategory.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2021 15:16
 *
 */

package eve.entity;

import eve.eveDatabaseproperties;
import data.interfaces.db.AbstractEntity;
import data.interfaces.db.Entity;
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
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Category
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Category Entity
 * 
 * @author Franky Laseure
 */
public class eCategory extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected CategoryPK categoryPK;
    private java.lang.String name;
    private boolean published;
	  
    public static final String table = "category";
	  
    public String getFieldname(short fieldconstant) {
        return ICategory.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ICategory.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eCategory.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eCategory.connectionpool;
    }
    
    /**
     * 
     * @return table name for Category
     */
    public String getTable() { return table; }

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
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.categoryPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.categoryPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(ICategory.NAME, name);
        updates.put(ICategory.PUBLISHED, published);
        return getAllFields();
    }
	
    /**
     * @return CategoryPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return CategoryPK
     */
    @Override
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
    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
