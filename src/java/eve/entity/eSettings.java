/*
 * eSettings.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 9.11.2021 14:30
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
	  
    public static final String table = "settings";
	  
    public String getFieldname(short fieldconstant) {
        return ISettings.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ISettings.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eSettings.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eSettings.connectionpool;
    }
    
    /**
     * 
     * @return table name for Settings
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Settings class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Settings entity
     */
    public eSettings() {
    }

    /**
     * Constructor
     * build an empty Settings entity with initialized field values
     */
    public eSettings(java.lang.String name) {
        this.settingsPK = new SettingsPK(name);
    }
  
    /**
     * Constructor
     * build an empty Settings entity with initialized Primarykey parameter
     * @param settingsPK: Settings Primarykey
     */
    public eSettings(SettingsPK settingsPK) {
        this.settingsPK = settingsPK;
    }

    /**
     * @return is Settings Empty ?
     */
    public boolean isEmpty() {
        return this.settingsPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.settingsPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.settingsPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(ISettings.VALUE, value);
        return getAllFields();
    }
	
    /**
     * @return SettingsPK
     */
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
            updates.put(ISettings.VALUE, value);
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
