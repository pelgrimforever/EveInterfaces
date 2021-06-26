/*
 * eStation_service.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.5.2021 16:2
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
import eve.interfaces.logicentity.IStation_service;
import eve.interfaces.entity.pk.*;

/**
 * Entity class Station_service
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Station_service Entity
 * 
 * @author Franky Laseure
 */
public class eStation_service extends AbstractEntity implements EntityInterface {

    protected Station_servicePK station_servicePK;
	  
    public static final String table = "station_service";
    public static final String SQLWhere1 = "station = :station_service.station: and service = :station_service.service:";
    public static final String SQLSelect1 = "select station_service.* from station_service where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from station_service where " + SQLWhere1;
    public static final String SQLSelectAll = "select station_service.* from station_service";
	  
    public String getFieldname(short fieldconstant) {
        return IStation_service.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IStation_service.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Station_service
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Station_service (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Station_service (=Primarykey)
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
     * @return SQL select statement for all Station_services
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

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
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.station_servicePK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.station_servicePK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
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
    public Station_servicePK getPrimaryKey() {
        return this.station_servicePK;
    }

    /**
     * 
     * @return Primarykey string value
     */
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
