/*
 * eUsersettings.java
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
	  
    @Override
    public String getDbtool() {
        return databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return connectionpool;
    }

    public static final String table = "usersettings";
	  
    @Override
    public String getTable() { return table; }

    @Override
    public String getClassName() { return this.getClass().getName(); };

    public String getFieldname(short fieldconstant) {
        return IUsersettings.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IUsersettings.fieldtypes[fieldconstant-1];
    }
        
    public eUsersettings() {
    }

    public eUsersettings(java.lang.String username, java.lang.String name) {
        this.usersettingsPK = new UsersettingsPK(username, name);
    }
  
    public eUsersettings(UsersettingsPK usersettingsPK) {
        this.usersettingsPK = usersettingsPK;
    }

    @Override
    public boolean isEmpty() {
        return this.usersettingsPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.usersettingsPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.usersettingsPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(IUsersettings.VALUE, value);
        return getAllFields();
    }
	
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

    public java.lang.String getValue() {
        return this.value;
    }

    public void initValue(java.lang.String value) {
        this.value = value;
    }

    public void setValue(java.lang.String value) {
	if(value==null && value!=this.value || value!=null && !value.equals(this.value)) {
            updates.put(IUsersettings.VALUE, value);
        }
        this.value = value;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
