/*
 * eTypegroup.java
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
import eve.interfaces.logicentity.ITypegroup;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Typegroup
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Typegroup Entity
 * 
 * @author Franky Laseure
 */
public class eTypegroup extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected TypegroupPK typegroupPK;
    private CategoryPK categoryPK;
    private java.lang.String name;
    private boolean published;
	  
    public static final String table = "typegroup";
	  
    public String getFieldname(short fieldconstant) {
        return ITypegroup.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ITypegroup.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eTypegroup.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eTypegroup.connectionpool;
    }
    
    /**
     * 
     * @return table name for Typegroup
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Typegroup class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Typegroup entity
     */
    public eTypegroup() {
    }

    /**
     * Constructor
     * build an empty Typegroup entity with initialized field values
     */
    public eTypegroup(long id) {
        this.typegroupPK = new TypegroupPK(id);
    }
  
    /**
     * Constructor
     * build an empty Typegroup entity with initialized Primarykey parameter
     * @param typegroupPK: Typegroup Primarykey
     */
    public eTypegroup(TypegroupPK typegroupPK) {
        this.typegroupPK = typegroupPK;
    }

    /**
     * @return is Typegroup Empty ?
     */
    public boolean isEmpty() {
        return this.typegroupPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.typegroupPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.typegroupPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(ITypegroup.CATEGORY, this.categoryPK.getId());

        updates.put(ITypegroup.NAME, name);
        updates.put(ITypegroup.PUBLISHED, published);
        return getAllFields();
    }
	
    /**
     * @return TypegroupPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return TypegroupPK
     */
    @Override
    public TypegroupPK getPrimaryKey() {
        return this.typegroupPK;
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
            updates.put(ITypegroup.NAME, name);
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
        updates.put(ITypegroup.PUBLISHED, published);
        this.published = published;
    }

    /**
     * 
     * @return foreign key categoryPK, instance of CategoryPK
     */
    public CategoryPK getCategoryPK() {
        return this.categoryPK;
    }

    /**
     * set foreign key category
     * @param categoryPK: instance of CategoryPK
     */
    public void initCategoryPK(ICategoryPK categoryPK) {
        this.categoryPK = (CategoryPK)categoryPK;
    }

    /**
     * set foreign key category
     * @param categoryPK: instance of CategoryPK
     */
    public void setCategoryPK(ICategoryPK categoryPK) {
	if(categoryPK==null && categoryPK!=this.categoryPK || categoryPK!=null) {
            if(categoryPK==null) {
                updates.put(ITypegroup.CATEGORY, null);
            } else {
                updates.put(ITypegroup.CATEGORY, categoryPK.getId());
            }
        }
        this.categoryPK = (CategoryPK)categoryPK;
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
