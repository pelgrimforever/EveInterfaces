/*
 * eLocation.java
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
import eve.interfaces.logicentity.ILocation;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Location
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Location Entity
 * 
 * @author Franky Laseure
 */
public class eLocation extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected LocationPK locationPK;
    private SystemPK systemPK;
    private java.lang.String name;
    private boolean visited;
    private boolean access;
	  
    public static final String table = "location";
	  
    public String getFieldname(short fieldconstant) {
        return ILocation.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ILocation.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eLocation.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eLocation.connectionpool;
    }
    
    /**
     * 
     * @return table name for Location
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Location class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Location entity
     */
    public eLocation() {
    }

    /**
     * Constructor
     * build an empty Location entity with initialized field values
     */
    public eLocation(long id) {
        this.locationPK = new LocationPK(id);
    }
  
    /**
     * Constructor
     * build an empty Location entity with initialized Primarykey parameter
     * @param locationPK: Location Primarykey
     */
    public eLocation(LocationPK locationPK) {
        this.locationPK = locationPK;
    }

    /**
     * @return is Location Empty ?
     */
    public boolean isEmpty() {
        return this.locationPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.locationPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.locationPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(ILocation.SYSTEM, this.systemPK.getId());

        updates.put(ILocation.NAME, name);
        updates.put(ILocation.VISITED, visited);
        updates.put(ILocation.ACCESS, access);
        return getAllFields();
    }
	
    /**
     * @return LocationPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return LocationPK
     */
    @Override
    public LocationPK getPrimaryKey() {
        return this.locationPK;
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
            updates.put(ILocation.NAME, name);
        }
        this.name = name;
    }

    /**
     * 
     * @return visited value
     */
    public boolean getVisited() {
        return this.visited;
    }

    /**
     * set visited value
     * @param visited: new value
     */
    public void initVisited(boolean visited) {
        this.visited = visited;
    }

    /**
     * set visited value
     * @param visited: new value
     */
    public void setVisited(boolean visited) {
        updates.put(ILocation.VISITED, visited);
        this.visited = visited;
    }

    /**
     * 
     * @return access value
     */
    public boolean getAccess() {
        return this.access;
    }

    /**
     * set access value
     * @param access: new value
     */
    public void initAccess(boolean access) {
        this.access = access;
    }

    /**
     * set access value
     * @param access: new value
     */
    public void setAccess(boolean access) {
        updates.put(ILocation.ACCESS, access);
        this.access = access;
    }

    /**
     * 
     * @return foreign key systemPK, instance of SystemPK
     */
    public SystemPK getSystemPK() {
        return this.systemPK;
    }

    /**
     * set foreign key system
     * @param systemPK: instance of SystemPK
     */
    public void initSystemPK(ISystemPK systemPK) {
        this.systemPK = (SystemPK)systemPK;
    }

    /**
     * set foreign key system
     * @param systemPK: instance of SystemPK
     */
    public void setSystemPK(ISystemPK systemPK) {
	if(systemPK==null && systemPK!=this.systemPK || systemPK!=null) {
            if(systemPK==null) {
                updates.put(ILocation.SYSTEM, null);
            } else {
                updates.put(ILocation.SYSTEM, systemPK.getId());
            }
        }
        this.systemPK = (SystemPK)systemPK;
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
