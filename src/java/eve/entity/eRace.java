/*
 * eRace.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 8.4.2021 13:20
 *
 */

package eve.entity;

import data.interfaces.db.AbstractEntity;
import data.interfaces.db.EntityInterface;
import data.interfaces.db.Filedata;
import data.gis.shape.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Iterator;

import eve.entity.pk.*;
import eve.interfaces.logicentity.IRace;
import eve.interfaces.entity.pk.*;

/**
 * Entity class Race
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Race Entity
 * 
 * @author Franky Laseure
 */
public class eRace extends AbstractEntity implements EntityInterface {

    protected RacePK racePK;
    private java.lang.String name;
    private java.lang.String description;
    private long alliance;
	  
    public static final String table = "race";
    public static final String SQLWhere1 = "id = :race.id:";
    public static final String SQLSelect1 = "select race.* from race where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from race where " + SQLWhere1;
    public static final String SQLSelectAll = "select race.* from race";
	  
    public String getFieldname(short fieldconstant) {
        return IRace.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IRace.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Race
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Race (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Race (=Primarykey)
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
     * @return SQL select statement for all Races
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

    /**
     * 
     * @return Race class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Race entity
     */
    public eRace() {
    }

    /**
     * Constructor
     * build an empty Race entity with initialized field values
     */
    public eRace(long id) {
        this.racePK = new RacePK(id);
    }
  
    /**
     * Constructor
     * build an empty Race entity with initialized Primarykey parameter
     * @param racePK: Race Primarykey
     */
    public eRace(RacePK racePK) {
        this.racePK = racePK;
    }

    /**
     * @return is Race Empty ?
     */
    public boolean isEmpty() {
        return this.racePK == null;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.racePK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.racePK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
        updates.put(IRace.NAME, name);
        updates.put(IRace.DESCRIPTION, description);
        updates.put(IRace.ALLIANCE, alliance);
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
    public RacePK getPrimaryKey() {
        return this.racePK;
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
            updates.put(IRace.NAME, name);
        }
        this.name = name;
    }

    /**
     * 
     * @return description value
     */
    public java.lang.String getDescription() {
        return this.description;
    }

    /**
     * set description value
     * @param description: new value
     */
    public void initDescription(java.lang.String description) {
        this.description = description;
    }

    /**
     * set description value
     * @param description: new value
     */
    public void setDescription(java.lang.String description) {
	if(description==null && description!=this.description || description!=null && !description.equals(this.description)) {
            updates.put(IRace.DESCRIPTION, description);
        }
        this.description = description;
    }

    /**
     * 
     * @return alliance value
     */
    public long getAlliance() {
        return this.alliance;
    }

    /**
     * set alliance value
     * @param alliance: new value
     */
    public void initAlliance(long alliance) {
        this.alliance = alliance;
    }

    /**
     * set alliance value
     * @param alliance: new value
     */
    public void setAlliance(long alliance) {
	if(alliance!=this.alliance) {
            updates.put(IRace.ALLIANCE, alliance);
        }
        this.alliance = alliance;
    }

    /**
     * 
     * @return Primarykey string value
     */
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
