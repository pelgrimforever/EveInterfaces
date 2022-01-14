/*
 * eSecurity_island.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.0.2022 16:56
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
import eve.interfaces.logicentity.ISecurity_island;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Security_island
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Security_island Entity
 * 
 * @author Franky Laseure
 */
public class eSecurity_island extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected Security_islandPK security_islandPK;
    private java.lang.String name;
    private double security_status;
	  
    public static final String table = "security_island";
	  
    public String getFieldname(short fieldconstant) {
        return ISecurity_island.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ISecurity_island.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eSecurity_island.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eSecurity_island.connectionpool;
    }
    
    /**
     * 
     * @return table name for Security_island
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Security_island class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Security_island entity
     */
    public eSecurity_island() {
    }

    /**
     * Constructor
     * build an empty Security_island entity with initialized field values
     */
    public eSecurity_island(long id) {
        this.security_islandPK = new Security_islandPK(id);
    }
  
    /**
     * Constructor
     * build an empty Security_island entity with initialized Primarykey parameter
     * @param security_islandPK: Security_island Primarykey
     */
    public eSecurity_island(Security_islandPK security_islandPK) {
        this.security_islandPK = security_islandPK;
    }

    /**
     * @return is Security_island Empty ?
     */
    public boolean isEmpty() {
        return this.security_islandPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.security_islandPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.security_islandPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(ISecurity_island.NAME, name);
        updates.put(ISecurity_island.SECURITY_STATUS, security_status);
        return getAllFields();
    }
	
    /**
     * @return Security_islandPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return Security_islandPK
     */
    @Override
    public Security_islandPK getPrimaryKey() {
        return this.security_islandPK;
    }

    /**
     * 
     * @return name value
     */
    public java.lang.String getName() {
        return this.name;
    }

    /**
     * set name value
     * @param name: new value
     */
    public void initName(java.lang.String name) {
        this.name = name;
    }

    /**
     * set name value
     * @param name: new value
     */
    public void setName(java.lang.String name) {
	if(name==null && name!=this.name || name!=null && !name.equals(this.name)) {
            updates.put(ISecurity_island.NAME, name);
        }
        this.name = name;
    }

    /**
     * 
     * @return security_status value
     */
    public double getSecurity_status() {
        return this.security_status;
    }

    /**
     * set security_status value
     * @param security_status: new value
     */
    public void initSecurity_status(double security_status) {
        this.security_status = security_status;
    }

    /**
     * set security_status value
     * @param security_status: new value
     */
    public void setSecurity_status(double security_status) {
        updates.put(ISecurity_island.SECURITY_STATUS, security_status);
        this.security_status = security_status;
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
