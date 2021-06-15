/*
 * eConstellation_neighbour.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.5.2021 13:35
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
import eve.interfaces.logicentity.IConstellation_neighbour;
import eve.interfaces.entity.pk.*;

/**
 * Entity class Constellation_neighbour
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Constellation_neighbour Entity
 * 
 * @author Franky Laseure
 */
public class eConstellation_neighbour extends AbstractEntity implements EntityInterface {

    protected Constellation_neighbourPK constellation_neighbourPK;
	  
    public static final String table = "constellation_neighbour";
    public static final String SQLWhere1 = "constellation = :constellation_neighbour.constellation: and neighbour = :constellation_neighbour.neighbour:";
    public static final String SQLSelect1 = "select constellation_neighbour.* from constellation_neighbour where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from constellation_neighbour where " + SQLWhere1;
    public static final String SQLSelectAll = "select constellation_neighbour.* from constellation_neighbour";
	  
    public String getFieldname(short fieldconstant) {
        return IConstellation_neighbour.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IConstellation_neighbour.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Constellation_neighbour
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Constellation_neighbour (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Constellation_neighbour (=Primarykey)
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
     * @return SQL select statement for all Constellation_neighbours
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

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
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.constellation_neighbourPK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.constellation_neighbourPK.getInsertKeyFields();	  
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
    public Constellation_neighbourPK getPrimaryKey() {
        return this.constellation_neighbourPK;
    }

    /**
     * 
     * @return Primarykey string value
     */
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
