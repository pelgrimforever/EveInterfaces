/*
 * eSystemjumps.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.11.2021 14:51
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
import eve.interfaces.logicentity.ISystemjumps;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Systemjumps
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Systemjumps Entity
 * 
 * @author Franky Laseure
 */
public class eSystemjumps extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected SystemjumpsPK systemjumpsPK;
    private int jumps;
	  
    public static final String table = "systemjumps";
	  
    public String getFieldname(short fieldconstant) {
        return ISystemjumps.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ISystemjumps.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eSystemjumps.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eSystemjumps.connectionpool;
    }
    
    /**
     * 
     * @return table name for Systemjumps
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Systemjumps class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Systemjumps entity
     */
    public eSystemjumps() {
    }

    /**
     * Constructor
     * build an empty Systemjumps entity with initialized field values
     */
    public eSystemjumps(long system_start, long system_end) {
        this.systemjumpsPK = new SystemjumpsPK(system_start, system_end);
    }
  
    /**
     * Constructor
     * build an empty Systemjumps entity with initialized Primarykey parameter
     * @param systemjumpsPK: Systemjumps Primarykey
     */
    public eSystemjumps(SystemjumpsPK systemjumpsPK) {
        this.systemjumpsPK = systemjumpsPK;
    }

    /**
     * @return is Systemjumps Empty ?
     */
    public boolean isEmpty() {
        return this.systemjumpsPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.systemjumpsPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.systemjumpsPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(ISystemjumps.JUMPS, jumps);
        return getAllFields();
    }
	
    /**
     * @return SystemjumpsPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return SystemjumpsPK
     */
    @Override
    public SystemjumpsPK getPrimaryKey() {
        return this.systemjumpsPK;
    }

    /**
     * 
     * @return jumps value
     */
    public int getJumps() {
        return this.jumps;
    }

    /**
     * set jumps value
     * @param jumps: new value
     */
    public void initJumps(int jumps) {
        this.jumps = jumps;
    }

    /**
     * set jumps value
     * @param jumps: new value
     */
    public void setJumps(int jumps) {
        updates.put(ISystemjumps.JUMPS, jumps);
        this.jumps = jumps;
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
