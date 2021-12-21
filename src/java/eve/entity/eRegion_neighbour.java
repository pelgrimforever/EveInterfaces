/*
 * eRegion_neighbour.java
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
	  
    public static final String table = "region_neighbour";
	  
    public String getFieldname(short fieldconstant) {
        return IRegion_neighbour.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IRegion_neighbour.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eRegion_neighbour.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eRegion_neighbour.connectionpool;
    }
    
    /**
     * 
     * @return table name for Region_neighbour
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Region_neighbour class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Region_neighbour entity
     */
    public eRegion_neighbour() {
    }

    /**
     * Constructor
     * build an empty Region_neighbour entity with initialized field values
     */
    public eRegion_neighbour(long region, long neighbour) {
        this.region_neighbourPK = new Region_neighbourPK(region, neighbour);
    }
  
    /**
     * Constructor
     * build an empty Region_neighbour entity with initialized Primarykey parameter
     * @param region_neighbourPK: Region_neighbour Primarykey
     */
    public eRegion_neighbour(Region_neighbourPK region_neighbourPK) {
        this.region_neighbourPK = region_neighbourPK;
    }

    /**
     * @return is Region_neighbour Empty ?
     */
    public boolean isEmpty() {
        return this.region_neighbourPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.region_neighbourPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.region_neighbourPK.getPrimarykeyvalues();	  
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
     * @return Region_neighbourPK
     */
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

    /**
     * 
     * @return Primarykey string value
     */
    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
