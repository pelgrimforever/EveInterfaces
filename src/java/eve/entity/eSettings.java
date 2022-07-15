/*
 * eSettings.java
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
import eve.interfaces.logicentity.ISettings;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Settings
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Settings Entity
 * 
 * @author Franky Laseure
 */
public class eSettings extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected SettingsPK settingsPK;
    private java.lang.String value;
	  
    @Override
    public String getDbtool() {
        return databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return connectionpool;
    }

    public static final String table = "settings";
	  
    @Override
    public String getTable() { return table; }

    @Override
    public String getClassName() { return this.getClass().getName(); };

    public String getFieldname(short fieldconstant) {
        return ISettings.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ISettings.fieldtypes[fieldconstant-1];
    }
        
    public eSettings() {
    }

    public eSettings(java.lang.String name) {
        this.settingsPK = new SettingsPK(name);
    }
  
    public eSettings(SettingsPK settingsPK) {
        this.settingsPK = settingsPK;
    }

    @Override
    public boolean isEmpty() {
        return this.settingsPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.settingsPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.settingsPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(ISettings.VALUE, value);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return SettingsPK
     */
    @Override
    public SettingsPK getPrimaryKey() {
        return this.settingsPK;
    }

    public java.lang.String getValue() {
        return this.value;
    }

    public void initValue(java.lang.String value) {
        this.value = value;
    }

    public void setValue(java.lang.String value) {
	if(value==null && value!=this.value || value!=null && !value.equals(this.value)) {
            updates.put(ISettings.VALUE, value);
        }
        this.value = value;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
