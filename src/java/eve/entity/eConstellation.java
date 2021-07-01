/*
 * eConstellation.java
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
import eve.interfaces.logicentity.IConstellation;
import eve.interfaces.entity.pk.*;

/**
 * Entity class Constellation
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Constellation Entity
 * 
 * @author Franky Laseure
 */
public class eConstellation extends AbstractEntity implements EntityInterface {

    protected ConstellationPK constellationPK;
    private RegionPK regionPK;
    private java.lang.String name;
    private boolean noaccess;
	  
    public static final String table = "constellation";
    public static final String SQLWhere1 = "id = :constellation.id:";
    public static final String SQLSelect1 = "select constellation.* from constellation where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from constellation where " + SQLWhere1;
    public static final String SQLSelectAll = "select constellation.* from constellation";
	  
    public String getFieldname(short fieldconstant) {
        return IConstellation.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IConstellation.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Constellation
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Constellation (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Constellation (=Primarykey)
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
     * @return SQL select statement for all Constellations
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

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
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.constellationPK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.constellationPK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
        updates.put(IConstellation.REGION, this.regionPK.getId());

        updates.put(IConstellation.NAME, name);
        updates.put(IConstellation.NOACCESS, noaccess);
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
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
