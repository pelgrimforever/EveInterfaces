/*
 * eRegion_neighbour.java
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
import eve.interfaces.logicentity.IRegion_neighbour;
import eve.interfaces.entity.pk.*;

/**
 * Entity class Region_neighbour
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Region_neighbour Entity
 * 
 * @author Franky Laseure
 */
public class eRegion_neighbour extends AbstractEntity implements EntityInterface {

    protected Region_neighbourPK region_neighbourPK;
	  
    public static final String table = "region_neighbour";
    public static final String SQLWhere1 = "region = :region_neighbour.region: and neighbour = :region_neighbour.neighbour:";
    public static final String SQLSelect1 = "select region_neighbour.* from region_neighbour where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from region_neighbour where " + SQLWhere1;
    public static final String SQLSelectAll = "select region_neighbour.* from region_neighbour";
	  
    public String getFieldname(short fieldconstant) {
        return IRegion_neighbour.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IRegion_neighbour.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Region_neighbour
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Region_neighbour (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Region_neighbour (=Primarykey)
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
     * @return SQL select statement for all Region_neighbours
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

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
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.region_neighbourPK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.region_neighbourPK.getInsertKeyFields();	  
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
    public Region_neighbourPK getPrimaryKey() {
        return this.region_neighbourPK;
    }

    /**
     * 
     * @return Primarykey string value
     */
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
