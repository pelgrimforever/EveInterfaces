/*
 * eRace.java
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
import eve.interfaces.logicentity.IRace;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Race
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Race Entity
 * 
 * @author Franky Laseure
 */
public class eRace extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected RacePK racePK;
    private FactionPK factionPK;
    private java.lang.String name;
    private java.lang.String description;
	  
    public static final String table = "race";
	  
    public String getFieldname(short fieldconstant) {
        return IRace.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IRace.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eRace.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eRace.connectionpool;
    }
    
    /**
     * 
     * @return table name for Race
     */
    public String getTable() { return table; }

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
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.racePK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.racePK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(IRace.FACTION, this.factionPK.getId());

        updates.put(IRace.NAME, name);
        updates.put(IRace.DESCRIPTION, description);
        return getAllFields();
    }
	
    /**
     * @return RacePK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return RacePK
     */
    @Override
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
     * @return foreign key factionPK, instance of FactionPK
     */
    public FactionPK getFactionPK() {
        return this.factionPK;
    }

    /**
     * set foreign key faction
     * @param factionPK: instance of FactionPK
     */
    public void initFactionPK(IFactionPK factionPK) {
        this.factionPK = (FactionPK)factionPK;
    }

    /**
     * set foreign key faction
     * @param factionPK: instance of FactionPK
     */
    public void setFactionPK(IFactionPK factionPK) {
	if(factionPK==null && factionPK!=this.factionPK || factionPK!=null) {
            if(factionPK==null) {
                updates.put(IRace.FACTION, null);
            } else {
                updates.put(IRace.FACTION, factionPK.getId());
            }
        }
        this.factionPK = (FactionPK)factionPK;
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
