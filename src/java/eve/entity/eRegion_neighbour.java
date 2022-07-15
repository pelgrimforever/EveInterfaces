/*
 * eRegion_neighbour.java
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
import eve.interfaces.logicentity.IRegion_neighbour;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Region_neighbour
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Region_neighbour Entity
 * 
 * @author Franky Laseure
 */
public class eRegion_neighbour extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected Region_neighbourPK region_neighbourPK;
	  
    @Override
    public String getDbtool() {
        return databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return connectionpool;
    }

    public static final String table = "region_neighbour";
	  
    @Override
    public String getTable() { return table; }

    @Override
    public String getClassName() { return this.getClass().getName(); };

    public String getFieldname(short fieldconstant) {
        return IRegion_neighbour.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IRegion_neighbour.fieldtypes[fieldconstant-1];
    }
        
    public eRegion_neighbour() {
    }

    public eRegion_neighbour(long region, long neighbour) {
        this.region_neighbourPK = new Region_neighbourPK(region, neighbour);
    }
  
    public eRegion_neighbour(Region_neighbourPK region_neighbourPK) {
        this.region_neighbourPK = region_neighbourPK;
    }

    @Override
    public boolean isEmpty() {
        return this.region_neighbourPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.region_neighbourPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.region_neighbourPK.getPrimarykeyvalues();	  
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
     * @return Region_neighbourPK
     */
    @Override
    public Region_neighbourPK getPrimaryKey() {
        return this.region_neighbourPK;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
