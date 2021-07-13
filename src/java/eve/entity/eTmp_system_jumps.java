/*
 * eTmp_system_jumps.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 12.6.2021 13:57
 *
 */

package eve.entity;

import data.interfaces.db.AbstractEntity;
import data.interfaces.db.EntityInterface;
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

/**
 * Entity class Tmp_system_jumps
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Tmp_system_jumps Entity
 * 
 * @author Franky Laseure
 */
public class eTmp_system_jumps extends AbstractEntity implements EntityInterface {

    protected Tmp_system_jumpsPK tmp_system_jumpsPK;
    private int jump;
    private int maxjumps;
    private long previoussystem;
	  
    public static final String table = "tmp_system_jumps";
    public static final String SQLWhere1 = "system = :tmp_system_jumps.system:";
    public static final String SQLSelect1 = "select tmp_system_jumps.* from tmp_system_jumps where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from tmp_system_jumps where " + SQLWhere1;
    public static final String SQLSelectAll = "select tmp_system_jumps.* from tmp_system_jumps";
	  
    public String getFieldname(short fieldconstant) {
        return ITmp_system_jumps.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ITmp_system_jumps.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Tmp_system_jumps
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Tmp_system_jumps (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Tmp_system_jumps (=Primarykey)
     */
    public String getSQLSelect1() { return SQLSelect1; };

    /**
     * @return Select statement for Primary key, with count field as result
     * count = 1: exists
     * count = 0: not found
     */
    public String getSQLPKExcists() { return SQLSelectPKexists; };
    
    /**
     * 
     * @return SQL select statement for all Tmp_system_jumpss
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

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
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.tmp_system_jumpsPK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.tmp_system_jumpsPK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
        updates.put(ITmp_system_jumps.JUMP, jump);
        updates.put(ITmp_system_jumps.MAXJUMPS, maxjumps);
        updates.put(ITmp_system_jumps.PREVIOUSSYSTEM, previoussystem);
        return getAllFields();
    }
	
    /* (non-Javadoc)
     * @see .interfaces.db.EntityInterface#getKey()
     */
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return Primary Key Object
     */
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
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
