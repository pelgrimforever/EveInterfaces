/*
 * eConstellation_neighbour.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 24.9.2021 14:40
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
import eve.interfaces.logicentity.IConstellation_neighbour;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Constellation_neighbour
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Constellation_neighbour Entity
 * 
 * @author Franky Laseure
 */
public class eConstellation_neighbour extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected Constellation_neighbourPK constellation_neighbourPK;
	  
    public static final String table = "constellation_neighbour";
	  
    public String getFieldname(short fieldconstant) {
        return IConstellation_neighbour.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IConstellation_neighbour.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eConstellation_neighbour.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eConstellation_neighbour.connectionpool;
    }
    
    /**
     * 
     * @return table name for Constellation_neighbour
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Constellation_neighbour class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Constellation_neighbour entity
     */
    public eConstellation_neighbour() {
    }

    /**
     * Constructor
     * build an empty Constellation_neighbour entity with initialized field values
     */
    public eConstellation_neighbour(long constellation, long neighbour) {
        this.constellation_neighbourPK = new Constellation_neighbourPK(constellation, neighbour);
    }
  
    /**
     * Constructor
     * build an empty Constellation_neighbour entity with initialized Primarykey parameter
     * @param constellation_neighbourPK: Constellation_neighbour Primarykey
     */
    public eConstellation_neighbour(Constellation_neighbourPK constellation_neighbourPK) {
        this.constellation_neighbourPK = constellation_neighbourPK;
    }

    /**
     * @return is Constellation_neighbour Empty ?
     */
    public boolean isEmpty() {
        return this.constellation_neighbourPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.constellation_neighbourPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.constellation_neighbourPK.getPrimarykeyvalues();	  
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
     * @return Constellation_neighbourPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return Constellation_neighbourPK
     */
    @Override
    public Constellation_neighbourPK getPrimaryKey() {
        return this.constellation_neighbourPK;
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
