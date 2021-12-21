/*
 * eAllnodes_stargate.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 16.11.2021 15:46
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
import eve.interfaces.logicentity.IAllnodes_stargate;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Allnodes_stargate
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Allnodes_stargate Entity
 * 
 * @author Franky Laseure
 */
public class eAllnodes_stargate extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected Allnodes_stargatePK allnodes_stargatePK;
    private long to_stargate;
    private long system;
    private long to_system;
    private boolean deadend;
	  
    public static final String table = "allnodes_stargate";
	  
    public String getFieldname(short fieldconstant) {
        return IAllnodes_stargate.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IAllnodes_stargate.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eAllnodes_stargate.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eAllnodes_stargate.connectionpool;
    }
    
    /**
     * 
     * @return table name for Allnodes_stargate
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Allnodes_stargate class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Allnodes_stargate entity
     */
    public eAllnodes_stargate() {
    }

    /**
     * Constructor
     * build an empty Allnodes_stargate entity with initialized field values
     */
    public eAllnodes_stargate(long id) {
        this.allnodes_stargatePK = new Allnodes_stargatePK(id);
    }
  
    /**
     * Constructor
     * build an empty Allnodes_stargate entity with initialized Primarykey parameter
     * @param allnodes_stargatePK: Allnodes_stargate Primarykey
     */
    public eAllnodes_stargate(Allnodes_stargatePK allnodes_stargatePK) {
        this.allnodes_stargatePK = allnodes_stargatePK;
    }

    /**
     * @return is Allnodes_stargate Empty ?
     */
    public boolean isEmpty() {
        return this.allnodes_stargatePK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.allnodes_stargatePK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.allnodes_stargatePK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(IAllnodes_stargate.TO_STARGATE, to_stargate);
        updates.put(IAllnodes_stargate.SYSTEM, system);
        updates.put(IAllnodes_stargate.TO_SYSTEM, to_system);
        updates.put(IAllnodes_stargate.DEADEND, deadend);
        return getAllFields();
    }
	
    /**
     * @return Allnodes_stargatePK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return Allnodes_stargatePK
     */
    @Override
    public Allnodes_stargatePK getPrimaryKey() {
        return this.allnodes_stargatePK;
    }

    /**
     * 
     * @return to_stargate value
     */
    public long getTo_stargate() {
        return this.to_stargate;
    }

    /**
     * set to_stargate value
     * @param to_stargate: new value
     */
    public void initTo_stargate(long to_stargate) {
        this.to_stargate = to_stargate;
    }

    /**
     * set to_stargate value
     * @param to_stargate: new value
     */
    public void setTo_stargate(long to_stargate) {
        updates.put(IAllnodes_stargate.TO_STARGATE, to_stargate);
        this.to_stargate = to_stargate;
    }

    /**
     * 
     * @return system value
     */
    public long getSystem() {
        return this.system;
    }

    /**
     * set system value
     * @param system: new value
     */
    public void initSystem(long system) {
        this.system = system;
    }

    /**
     * set system value
     * @param system: new value
     */
    public void setSystem(long system) {
        updates.put(IAllnodes_stargate.SYSTEM, system);
        this.system = system;
    }

    /**
     * 
     * @return to_system value
     */
    public long getTo_system() {
        return this.to_system;
    }

    /**
     * set to_system value
     * @param to_system: new value
     */
    public void initTo_system(long to_system) {
        this.to_system = to_system;
    }

    /**
     * set to_system value
     * @param to_system: new value
     */
    public void setTo_system(long to_system) {
        updates.put(IAllnodes_stargate.TO_SYSTEM, to_system);
        this.to_system = to_system;
    }

    /**
     * 
     * @return deadend value
     */
    public boolean getDeadend() {
        return this.deadend;
    }

    /**
     * set deadend value
     * @param deadend: new value
     */
    public void initDeadend(boolean deadend) {
        this.deadend = deadend;
    }

    /**
     * set deadend value
     * @param deadend: new value
     */
    public void setDeadend(boolean deadend) {
        updates.put(IAllnodes_stargate.DEADEND, deadend);
        this.deadend = deadend;
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
