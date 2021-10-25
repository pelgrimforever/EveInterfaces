/*
 * eStation_service.java
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
import eve.interfaces.logicentity.IStation_service;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Station_service
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Station_service Entity
 * 
 * @author Franky Laseure
 */
public class eStation_service extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected Station_servicePK station_servicePK;
	  
    public static final String table = "station_service";
	  
    public String getFieldname(short fieldconstant) {
        return IStation_service.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IStation_service.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eStation_service.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eStation_service.connectionpool;
    }
    
    /**
     * 
     * @return table name for Station_service
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Station_service class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Station_service entity
     */
    public eStation_service() {
    }

    /**
     * Constructor
     * build an empty Station_service entity with initialized field values
     */
    public eStation_service(long station, java.lang.String service) {
        this.station_servicePK = new Station_servicePK(station, service);
    }
  
    /**
     * Constructor
     * build an empty Station_service entity with initialized Primarykey parameter
     * @param station_servicePK: Station_service Primarykey
     */
    public eStation_service(Station_servicePK station_servicePK) {
        this.station_servicePK = station_servicePK;
    }

    /**
     * @return is Station_service Empty ?
     */
    public boolean isEmpty() {
        return this.station_servicePK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.station_servicePK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.station_servicePK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        return getAllFields();
    }
	
    /**
     * @return Station_servicePK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return Station_servicePK
     */
    @Override
    public Station_servicePK getPrimaryKey() {
        return this.station_servicePK;
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
