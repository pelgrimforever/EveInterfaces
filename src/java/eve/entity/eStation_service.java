/*
 * eStation_service.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.5.2022 11:24
 *
 */

package eve.entity;

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

import eve.eveDatabaseproperties;
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
	  
    @Override
    public String getDbtool() {
        return databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return connectionpool;
    }

    public static final String table = "station_service";
	  
    @Override
    public String getTable() { return table; }

    @Override
    public String getClassName() { return this.getClass().getName(); };

    public String getFieldname(short fieldconstant) {
        return IStation_service.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IStation_service.fieldtypes[fieldconstant-1];
    }
        
    public eStation_service() {
    }

    public eStation_service(long station, java.lang.String service) {
        this.station_servicePK = new Station_servicePK(station, service);
    }
  
    public eStation_service(Station_servicePK station_servicePK) {
        this.station_servicePK = station_servicePK;
    }

    @Override
    public boolean isEmpty() {
        return this.station_servicePK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.station_servicePK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.station_servicePK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        return getAllFields();
    }
	
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

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
