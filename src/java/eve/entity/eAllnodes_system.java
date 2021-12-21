/*
 * eAllnodes_system.java
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
import eve.interfaces.logicentity.IAllnodes_system;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Allnodes_system
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Allnodes_system Entity
 * 
 * @author Franky Laseure
 */
public class eAllnodes_system extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected Allnodes_systemPK allnodes_systemPK;
    private boolean deadend;
	  
    public static final String table = "allnodes_system";
	  
    public String getFieldname(short fieldconstant) {
        return IAllnodes_system.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IAllnodes_system.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eAllnodes_system.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eAllnodes_system.connectionpool;
    }
    
    /**
     * 
     * @return table name for Allnodes_system
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Allnodes_system class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Allnodes_system entity
     */
    public eAllnodes_system() {
    }

    /**
     * Constructor
     * build an empty Allnodes_system entity with initialized field values
     */
    public eAllnodes_system(long id) {
        this.allnodes_systemPK = new Allnodes_systemPK(id);
    }
  
    /**
     * Constructor
     * build an empty Allnodes_system entity with initialized Primarykey parameter
     * @param allnodes_systemPK: Allnodes_system Primarykey
     */
    public eAllnodes_system(Allnodes_systemPK allnodes_systemPK) {
        this.allnodes_systemPK = allnodes_systemPK;
    }

    /**
     * @return is Allnodes_system Empty ?
     */
    public boolean isEmpty() {
        return this.allnodes_systemPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.allnodes_systemPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.allnodes_systemPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(IAllnodes_system.DEADEND, deadend);
        return getAllFields();
    }
	
    /**
     * @return Allnodes_systemPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return Allnodes_systemPK
     */
    @Override
    public Allnodes_systemPK getPrimaryKey() {
        return this.allnodes_systemPK;
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
        updates.put(IAllnodes_system.DEADEND, deadend);
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
