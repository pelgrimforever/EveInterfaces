/*
 * eRegion.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 30.5.2021 15:39
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
import eve.interfaces.logicentity.IRegion;
import eve.interfaces.entity.pk.*;

/**
 * Entity class Region
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Region Entity
 * 
 * @author Franky Laseure
 */
public class eRegion extends AbstractEntity implements EntityInterface {

    protected RegionPK regionPK;
    private java.lang.String name;
    private boolean noaccess;
    private int orderpages;
    private int ordererrors;
	  
    public static final String table = "region";
    public static final String SQLWhere1 = "id = :region.id:";
    public static final String SQLSelect1 = "select region.* from region where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from region where " + SQLWhere1;
    public static final String SQLSelectAll = "select region.* from region";
	  
    public String getFieldname(short fieldconstant) {
        return IRegion.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IRegion.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Region
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Region (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Region (=Primarykey)
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
     * @return SQL select statement for all Regions
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

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
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.regionPK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.regionPK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
        updates.put(IRegion.NAME, name);
        updates.put(IRegion.NOACCESS, noaccess);
        updates.put(IRegion.ORDERPAGES, orderpages);
        updates.put(IRegion.ORDERERRORS, ordererrors);
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
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
