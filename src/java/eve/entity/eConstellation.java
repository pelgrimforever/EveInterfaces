/*
 * eConstellation.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 8.10.2021 7:21
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
import eve.interfaces.logicentity.IConstellation;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Constellation
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Constellation Entity
 * 
 * @author Franky Laseure
 */
public class eConstellation extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected ConstellationPK constellationPK;
    private RegionPK regionPK;
    private java.lang.String name;
    private boolean noaccess;
	  
    public static final String table = "constellation";
	  
    public String getFieldname(short fieldconstant) {
        return IConstellation.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IConstellation.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eConstellation.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eConstellation.connectionpool;
    }
    
    /**
     * 
     * @return table name for Constellation
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Constellation class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Constellation entity
     */
    public eConstellation() {
    }

    /**
     * Constructor
     * build an empty Constellation entity with initialized field values
     */
    public eConstellation(long id) {
        this.constellationPK = new ConstellationPK(id);
    }
  
    /**
     * Constructor
     * build an empty Constellation entity with initialized Primarykey parameter
     * @param constellationPK: Constellation Primarykey
     */
    public eConstellation(ConstellationPK constellationPK) {
        this.constellationPK = constellationPK;
    }

    /**
     * @return is Constellation Empty ?
     */
    public boolean isEmpty() {
        return this.constellationPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.constellationPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.constellationPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(IConstellation.REGION, this.regionPK.getId());

        updates.put(IConstellation.NAME, name);
        updates.put(IConstellation.NOACCESS, noaccess);
        return getAllFields();
    }
	
    /**
     * @return ConstellationPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return ConstellationPK
     */
    @Override
    public ConstellationPK getPrimaryKey() {
        return this.constellationPK;
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
            updates.put(IConstellation.NAME, name);
        }
        this.name = name;
    }

    /**
     * 
     * @return noaccess value
     */
    public boolean getNoaccess() {
        return this.noaccess;
    }

    /**
     * set noaccess value
     * @param noaccess: new value
     */
    public void initNoaccess(boolean noaccess) {
        this.noaccess = noaccess;
    }

    /**
     * set noaccess value
     * @param noaccess: new value
     */
    public void setNoaccess(boolean noaccess) {
        updates.put(IConstellation.NOACCESS, noaccess);
        this.noaccess = noaccess;
    }

    /**
     * 
     * @return foreign key regionPK, instance of RegionPK
     */
    public RegionPK getRegionPK() {
        return this.regionPK;
    }

    /**
     * set foreign key region
     * @param regionPK: instance of RegionPK
     */
    public void initRegionPK(IRegionPK regionPK) {
        this.regionPK = (RegionPK)regionPK;
    }

    /**
     * set foreign key region
     * @param regionPK: instance of RegionPK
     */
    public void setRegionPK(IRegionPK regionPK) {
	if(regionPK==null && regionPK!=this.regionPK || regionPK!=null) {
            if(regionPK==null) {
                updates.put(IConstellation.REGION, null);
            } else {
                updates.put(IConstellation.REGION, regionPK.getId());
            }
        }
        this.regionPK = (RegionPK)regionPK;
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
