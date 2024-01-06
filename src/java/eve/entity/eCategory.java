/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
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
        
    @Override
    public String getDbtool() {
        return eCategory.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eCategory.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eCategory() {
    }

    public eCategory(long id) {
        this.categoryPK = new CategoryPK(id);
    }
  
    public eCategory(CategoryPK categoryPK) {
        this.categoryPK = categoryPK;
    }

    public boolean isEmpty() {
        return this.categoryPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.categoryPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.categoryPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(ICategory.NAME, name);
        updates.put(ICategory.PUBLISHED, published);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public CategoryPK getPrimaryKey() {
        return this.categoryPK;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void initName(java.lang.String name) {
        this.name = name;
    }

    public void setName(java.lang.String name) {
	if(name==null && name!=this.name || name!=null && !name.equals(this.name)) {
            updates.put(ICategory.NAME, name);
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
        updates.put(ICategory.PUBLISHED, published);
        this.published = published;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
