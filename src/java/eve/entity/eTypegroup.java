/*
 * eTypegroup.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 12.6.2021 13:57
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
import eve.interfaces.logicentity.ITypegroup;
import eve.interfaces.entity.pk.*;

/**
 * Entity class Typegroup
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Typegroup Entity
 * 
 * @author Franky Laseure
 */
public class eTypegroup extends AbstractEntity implements EntityInterface {

    protected TypegroupPK typegroupPK;
    private CategoryPK categoryPK;
    private java.lang.String name;
    private boolean published;
	  
    public static final String table = "typegroup";
    public static final String SQLWhere1 = "id = :typegroup.id:";
    public static final String SQLSelect1 = "select typegroup.* from typegroup where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from typegroup where " + SQLWhere1;
    public static final String SQLSelectAll = "select typegroup.* from typegroup";
	  
    public String getFieldname(short fieldconstant) {
        return ITypegroup.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ITypegroup.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Typegroup
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Typegroup (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Typegroup (=Primarykey)
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
     * @return SQL select statement for all Typegroups
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

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
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.typegroupPK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.typegroupPK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
        updates.put(ITypegroup.CATEGORY, this.categoryPK.getId());

        updates.put(ITypegroup.NAME, name);
        updates.put(ITypegroup.PUBLISHED, published);
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
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
