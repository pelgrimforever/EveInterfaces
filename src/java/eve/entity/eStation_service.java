/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
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

public class eStation_service extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected Station_servicePK station_servicePK;
	  
    public static final String table = "station_service";
	  
    public String getFieldname(short fieldconstant) {
        return IStation_service.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IStation_service.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return eStation_service.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eStation_service.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eStation_service() {
    }

    public eStation_service(long station, java.lang.String service) {
        this.station_servicePK = new Station_servicePK(station, service);
    }
  
    public eStation_service(Station_servicePK station_servicePK) {
        this.station_servicePK = station_servicePK;
    }

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
  
    @Override
    public Station_servicePK getPrimaryKey() {
        return this.station_servicePK;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
