/*
 * eRegion.java
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
import eve.interfaces.logicentity.IRegion;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Region
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Region Entity
 * 
 * @author Franky Laseure
 */
public class eRegion extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected RegionPK regionPK;
    private java.lang.String name;
    private boolean noaccess;
    private int orderpages;
    private int ordererrors;
	  
    public static final String table = "region";
	  
    public String getFieldname(short fieldconstant) {
        return IRegion.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IRegion.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eRegion.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eRegion.connectionpool;
    }
    
    /**
     * 
     * @return table name for Region
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Region class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Region entity
     */
    public eRegion() {
    }

    /**
     * Constructor
     * build an empty Region entity with initialized field values
     */
    public eRegion(long id) {
        this.regionPK = new RegionPK(id);
    }
  
    /**
     * Constructor
     * build an empty Region entity with initialized Primarykey parameter
     * @param regionPK: Region Primarykey
     */
    public eRegion(RegionPK regionPK) {
        this.regionPK = regionPK;
    }

    /**
     * @return is Region Empty ?
     */
    public boolean isEmpty() {
        return this.regionPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.regionPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.regionPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(IRegion.NAME, name);
        updates.put(IRegion.NOACCESS, noaccess);
        updates.put(IRegion.ORDERPAGES, orderpages);
        updates.put(IRegion.ORDERERRORS, ordererrors);
        return getAllFields();
    }
	
    /**
     * @return RegionPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return RegionPK
     */
    @Override
    public RegionPK getPrimaryKey() {
        return this.regionPK;
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
            updates.put(IRegion.NAME, name);
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
        updates.put(IRegion.NOACCESS, noaccess);
        this.noaccess = noaccess;
    }

    /**
     * 
     * @return orderpages value
     */
    public int getOrderpages() {
        return this.orderpages;
    }

    /**
     * set orderpages value
     * @param orderpages: new value
     */
    public void initOrderpages(int orderpages) {
        this.orderpages = orderpages;
    }

    /**
     * set orderpages value
     * @param orderpages: new value
     */
    public void setOrderpages(int orderpages) {
        updates.put(IRegion.ORDERPAGES, orderpages);
        this.orderpages = orderpages;
    }

    /**
     * 
     * @return ordererrors value
     */
    public int getOrdererrors() {
        return this.ordererrors;
    }

    /**
     * set ordererrors value
     * @param ordererrors: new value
     */
    public void initOrdererrors(int ordererrors) {
        this.ordererrors = ordererrors;
    }

    /**
     * set ordererrors value
     * @param ordererrors: new value
     */
    public void setOrdererrors(int ordererrors) {
        updates.put(IRegion.ORDERERRORS, ordererrors);
        this.ordererrors = ordererrors;
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
