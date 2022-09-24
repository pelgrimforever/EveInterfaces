/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
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
import eve.interfaces.logicentity.IUsersettings;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

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
        
    @Override
    public String getDbtool() {
        return eUsersettings.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eUsersettings.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eUsersettings() {
    }

    public eUsersettings(java.lang.String username, java.lang.String name) {
        this.usersettingsPK = new UsersettingsPK(username, name);
    }
  
    public eUsersettings(UsersettingsPK usersettingsPK) {
        this.usersettingsPK = usersettingsPK;
    }

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
