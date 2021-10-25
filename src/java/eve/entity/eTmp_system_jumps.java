/*
 * eTmp_system_jumps.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2021 15:16
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
import eve.interfaces.logicentity.ITmp_system_jumps;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Tmp_system_jumps
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Tmp_system_jumps Entity
 * 
 * @author Franky Laseure
 */
public class eTmp_system_jumps extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected Tmp_system_jumpsPK tmp_system_jumpsPK;
    private int jump;
    private int maxjumps;
    private long previoussystem;
	  
    public static final String table = "tmp_system_jumps";
	  
    public String getFieldname(short fieldconstant) {
        return ITmp_system_jumps.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ITmp_system_jumps.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eTmp_system_jumps.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eTmp_system_jumps.connectionpool;
    }
    
    /**
     * 
     * @return table name for Tmp_system_jumps
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Tmp_system_jumps class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Tmp_system_jumps entity
     */
    public eTmp_system_jumps() {
    }

    /**
     * Constructor
     * build an empty Tmp_system_jumps entity with initialized field values
     */
    public eTmp_system_jumps(long system) {
        this.tmp_system_jumpsPK = new Tmp_system_jumpsPK(system);
    }
  
    /**
     * Constructor
     * build an empty Tmp_system_jumps entity with initialized Primarykey parameter
     * @param tmp_system_jumpsPK: Tmp_system_jumps Primarykey
     */
    public eTmp_system_jumps(Tmp_system_jumpsPK tmp_system_jumpsPK) {
        this.tmp_system_jumpsPK = tmp_system_jumpsPK;
    }

    /**
     * @return is Tmp_system_jumps Empty ?
     */
    public boolean isEmpty() {
        return this.tmp_system_jumpsPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.tmp_system_jumpsPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.tmp_system_jumpsPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(ITmp_system_jumps.JUMP, jump);
        updates.put(ITmp_system_jumps.MAXJUMPS, maxjumps);
        updates.put(ITmp_system_jumps.PREVIOUSSYSTEM, previoussystem);
        return getAllFields();
    }
	
    /**
     * @return Tmp_system_jumpsPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return Tmp_system_jumpsPK
     */
    @Override
    public Tmp_system_jumpsPK getPrimaryKey() {
        return this.tmp_system_jumpsPK;
    }

    /**
     * 
     * @return jump value
     */
    public int getJump() {
        return this.jump;
    }

    /**
     * set jump value
     * @param jump: new value
     */
    public void initJump(int jump) {
        this.jump = jump;
    }

    /**
     * set jump value
     * @param jump: new value
     */
    public void setJump(int jump) {
        updates.put(ITmp_system_jumps.JUMP, jump);
        this.jump = jump;
    }

    /**
     * 
     * @return maxjumps value
     */
    public int getMaxjumps() {
        return this.maxjumps;
    }

    /**
     * set maxjumps value
     * @param maxjumps: new value
     */
    public void initMaxjumps(int maxjumps) {
        this.maxjumps = maxjumps;
    }

    /**
     * set maxjumps value
     * @param maxjumps: new value
     */
    public void setMaxjumps(int maxjumps) {
        updates.put(ITmp_system_jumps.MAXJUMPS, maxjumps);
        this.maxjumps = maxjumps;
    }

    /**
     * 
     * @return previoussystem value
     */
    public long getPrevioussystem() {
        return this.previoussystem;
    }

    /**
     * set previoussystem value
     * @param previoussystem: new value
     */
    public void initPrevioussystem(long previoussystem) {
        this.previoussystem = previoussystem;
    }

    /**
     * set previoussystem value
     * @param previoussystem: new value
     */
    public void setPrevioussystem(long previoussystem) {
        updates.put(ITmp_system_jumps.PREVIOUSSYSTEM, previoussystem);
        this.previoussystem = previoussystem;
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
