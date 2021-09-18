/*
 * eSystemjumps.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 18.8.2021 11:31
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
import eve.interfaces.logicentity.ISystemjumps;
import eve.interfaces.entity.pk.*;

/**
 * Entity class Systemjumps
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Systemjumps Entity
 * 
 * @author Franky Laseure
 */
public class eSystemjumps extends AbstractEntity implements EntityInterface {

    protected SystemjumpsPK systemjumpsPK;
    private int jumps;
	  
    public static final String table = "systemjumps";
    public static final String SQLWhere1 = "system_start = :systemjumps.system_start: and system_end = :systemjumps.system_end:";
    public static final String SQLSelect1 = "select systemjumps.* from systemjumps where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from systemjumps where " + SQLWhere1;
    public static final String SQLSelectAll = "select systemjumps.* from systemjumps";
	  
    public String getFieldname(short fieldconstant) {
        return ISystemjumps.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ISystemjumps.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Systemjumps
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Systemjumps (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Systemjumps (=Primarykey)
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
     * @return SQL select statement for all Systemjumpss
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

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
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.systemjumpsPK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.systemjumpsPK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
        updates.put(ISystemjumps.JUMPS, jumps);
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
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
