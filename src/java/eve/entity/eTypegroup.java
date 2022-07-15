/*
 * eTypegroup.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.5.2022 11:24
 *
 */

package eve.entity;

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

import eve.eveDatabaseproperties;
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
	  
    @Override
    public String getDbtool() {
        return databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return connectionpool;
    }

    public static final String table = "typegroup";
	  
    @Override
    public String getTable() { return table; }

    @Override
    public String getClassName() { return this.getClass().getName(); };

    public String getFieldname(short fieldconstant) {
        return ITypegroup.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ITypegroup.fieldtypes[fieldconstant-1];
    }
        
    public eTypegroup() {
    }

    public eTypegroup(long id) {
        this.typegroupPK = new TypegroupPK(id);
    }
  
    public eTypegroup(TypegroupPK typegroupPK) {
        this.typegroupPK = typegroupPK;
    }

    @Override
    public boolean isEmpty() {
        return this.typegroupPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.typegroupPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.typegroupPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(ITypegroup.CATEGORY, this.categoryPK.getId());

        updates.put(ITypegroup.NAME, name);
        updates.put(ITypegroup.PUBLISHED, published);
        return getAllFields();
    }
	
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

    public java.lang.String getName() {
        return this.name;
    }

    public void initName(java.lang.String name) {
        this.name = name;
    }

    public void setName(java.lang.String name) {
	if(name==null && name!=this.name || name!=null && !name.equals(this.name)) {
            updates.put(ITypegroup.NAME, name);
        }
        this.name = name;
    }

    public boolean getPublished() {
        return this.published;
    }

    public void initPublished(boolean published) {
        this.published = published;
    }

    public void setPublished(boolean published) {
        updates.put(ITypegroup.PUBLISHED, published);
        this.published = published;
    }

    public CategoryPK getCategoryPK() {
        return this.categoryPK;
    }

    public void initCategoryPK(ICategoryPK categoryPK) {
        this.categoryPK = (CategoryPK)categoryPK;
    }

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

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
