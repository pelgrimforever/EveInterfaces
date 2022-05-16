/*
 * eSyssettings.java
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
import eve.interfaces.logicentity.ISyssettings;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Syssettings
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Syssettings Entity
 * 
 * @author Franky Laseure
 */
public class eSyssettings extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected SyssettingsPK syssettingsPK;
    private java.lang.String value;
	  
    public static final String table = "syssettings";
	  
    public String getFieldname(short fieldconstant) {
        return ISyssettings.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ISyssettings.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eSyssettings.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eSyssettings.connectionpool;
    }
    
    /**
     * 
     * @return table name for Syssettings
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Syssettings class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Syssettings entity
     */
    public eSyssettings() {
    }

    /**
     * Constructor
     * build an empty Syssettings entity with initialized field values
     */
    public eSyssettings(java.lang.String name) {
        this.syssettingsPK = new SyssettingsPK(name);
    }
  
    /**
     * Constructor
     * build an empty Syssettings entity with initialized Primarykey parameter
     * @param syssettingsPK: Syssettings Primarykey
     */
    public eSyssettings(SyssettingsPK syssettingsPK) {
        this.syssettingsPK = syssettingsPK;
    }

    /**
     * @return is Syssettings Empty ?
     */
    public boolean isEmpty() {
        return this.syssettingsPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.syssettingsPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.syssettingsPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(ISyssettings.VALUE, value);
        return getAllFields();
    }
	
    /**
     * @return SyssettingsPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return SyssettingsPK
     */
    @Override
    public SyssettingsPK getPrimaryKey() {
        return this.syssettingsPK;
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
            updates.put(ISyssettings.VALUE, value);
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
