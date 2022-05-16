/*
 * eUsersettings.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 11.4.2022 9:13
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
import eve.interfaces.logicentity.IUsersettings;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Usersettings
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Usersettings Entity
 * 
 * @author Franky Laseure
 */
public class eUsersettings extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected UsersettingsPK usersettingsPK;
    private java.lang.String value;
	  
    public static final String table = "usersettings";
	  
    public String getFieldname(short fieldconstant) {
        return IUsersettings.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IUsersettings.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eUsersettings.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eUsersettings.connectionpool;
    }
    
    /**
     * 
     * @return table name for Usersettings
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Usersettings class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Usersettings entity
     */
    public eUsersettings() {
    }

    /**
     * Constructor
     * build an empty Usersettings entity with initialized field values
     */
    public eUsersettings(java.lang.String username, java.lang.String name) {
        this.usersettingsPK = new UsersettingsPK(username, name);
    }
  
    /**
     * Constructor
     * build an empty Usersettings entity with initialized Primarykey parameter
     * @param usersettingsPK: Usersettings Primarykey
     */
    public eUsersettings(UsersettingsPK usersettingsPK) {
        this.usersettingsPK = usersettingsPK;
    }

    /**
     * @return is Usersettings Empty ?
     */
    public boolean isEmpty() {
        return this.usersettingsPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.usersettingsPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.usersettingsPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(IUsersettings.VALUE, value);
        return getAllFields();
    }
	
    /**
     * @return UsersettingsPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return UsersettingsPK
     */
    @Override
    public UsersettingsPK getPrimaryKey() {
        return this.usersettingsPK;
    }

    /**
     * 
     * @return value value
     */
    public java.lang.String getValue() {
        return this.value;
    }

    /**
     * set value value
     * @param value: new value
     */
    public void initValue(java.lang.String value) {
        this.value = value;
    }

    /**
     * set value value
     * @param value: new value
     */
    public void setValue(java.lang.String value) {
	if(value==null && value!=this.value || value!=null && !value.equals(this.value)) {
            updates.put(IUsersettings.VALUE, value);
        }
        this.value = value;
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
