/*
 * eFaction.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 9.11.2021 14:30
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
import eve.interfaces.logicentity.IFaction;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Faction
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Faction Entity
 * 
 * @author Franky Laseure
 */
public class eFaction extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected FactionPK factionPK;
    private SystemPK systemPK;
    private java.lang.String name;
    private java.lang.String description;
    private boolean is_unique;
    private double size_factor;
    private int station_count;
    private int station_system_count;
    private long corporation;
    private long militia_corporation;
	  
    public static final String table = "faction";
	  
    public String getFieldname(short fieldconstant) {
        return IFaction.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IFaction.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eFaction.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eFaction.connectionpool;
    }
    
    /**
     * 
     * @return table name for Faction
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Faction class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Faction entity
     */
    public eFaction() {
    }

    /**
     * Constructor
     * build an empty Faction entity with initialized field values
     */
    public eFaction(long id) {
        this.factionPK = new FactionPK(id);
    }
  
    /**
     * Constructor
     * build an empty Faction entity with initialized Primarykey parameter
     * @param factionPK: Faction Primarykey
     */
    public eFaction(FactionPK factionPK) {
        this.factionPK = factionPK;
    }

    /**
     * @return is Faction Empty ?
     */
    public boolean isEmpty() {
        return this.factionPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.factionPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.factionPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(IFaction.SOLAR_SYSTEM, this.systemPK.getId());

        updates.put(IFaction.NAME, name);
        updates.put(IFaction.DESCRIPTION, description);
        updates.put(IFaction.IS_UNIQUE, is_unique);
        updates.put(IFaction.SIZE_FACTOR, size_factor);
        updates.put(IFaction.STATION_COUNT, station_count);
        updates.put(IFaction.STATION_SYSTEM_COUNT, station_system_count);
        updates.put(IFaction.CORPORATION, corporation);
        updates.put(IFaction.MILITIA_CORPORATION, militia_corporation);
        return getAllFields();
    }
	
    /**
     * @return FactionPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return FactionPK
     */
    @Override
    public FactionPK getPrimaryKey() {
        return this.factionPK;
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
            updates.put(IFaction.NAME, name);
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
            updates.put(IFaction.DESCRIPTION, description);
        }
        this.description = description;
    }

    /**
     * 
     * @return is_unique value
     */
    public boolean getIs_unique() {
        return this.is_unique;
    }

    /**
     * set is_unique value
     * @param is_unique: new value
     */
    public void initIs_unique(boolean is_unique) {
        this.is_unique = is_unique;
    }

    /**
     * set is_unique value
     * @param is_unique: new value
     */
    public void setIs_unique(boolean is_unique) {
        updates.put(IFaction.IS_UNIQUE, is_unique);
        this.is_unique = is_unique;
    }

    /**
     * 
     * @return size_factor value
     */
    public double getSize_factor() {
        return this.size_factor;
    }

    /**
     * set size_factor value
     * @param size_factor: new value
     */
    public void initSize_factor(double size_factor) {
        this.size_factor = size_factor;
    }

    /**
     * set size_factor value
     * @param size_factor: new value
     */
    public void setSize_factor(double size_factor) {
        updates.put(IFaction.SIZE_FACTOR, size_factor);
        this.size_factor = size_factor;
    }

    /**
     * 
     * @return station_count value
     */
    public int getStation_count() {
        return this.station_count;
    }

    /**
     * set station_count value
     * @param station_count: new value
     */
    public void initStation_count(int station_count) {
        this.station_count = station_count;
    }

    /**
     * set station_count value
     * @param station_count: new value
     */
    public void setStation_count(int station_count) {
        updates.put(IFaction.STATION_COUNT, station_count);
        this.station_count = station_count;
    }

    /**
     * 
     * @return station_system_count value
     */
    public int getStation_system_count() {
        return this.station_system_count;
    }

    /**
     * set station_system_count value
     * @param station_system_count: new value
     */
    public void initStation_system_count(int station_system_count) {
        this.station_system_count = station_system_count;
    }

    /**
     * set station_system_count value
     * @param station_system_count: new value
     */
    public void setStation_system_count(int station_system_count) {
        updates.put(IFaction.STATION_SYSTEM_COUNT, station_system_count);
        this.station_system_count = station_system_count;
    }

    /**
     * 
     * @return corporation value
     */
    public long getCorporation() {
        return this.corporation;
    }

    /**
     * set corporation value
     * @param corporation: new value
     */
    public void initCorporation(long corporation) {
        this.corporation = corporation;
    }

    /**
     * set corporation value
     * @param corporation: new value
     */
    public void setCorporation(long corporation) {
        updates.put(IFaction.CORPORATION, corporation);
        this.corporation = corporation;
    }

    /**
     * 
     * @return militia_corporation value
     */
    public long getMilitia_corporation() {
        return this.militia_corporation;
    }

    /**
     * set militia_corporation value
     * @param militia_corporation: new value
     */
    public void initMilitia_corporation(long militia_corporation) {
        this.militia_corporation = militia_corporation;
    }

    /**
     * set militia_corporation value
     * @param militia_corporation: new value
     */
    public void setMilitia_corporation(long militia_corporation) {
        updates.put(IFaction.MILITIA_CORPORATION, militia_corporation);
        this.militia_corporation = militia_corporation;
    }

    /**
     * 
     * @return foreign key systemPK, instance of SystemPK
     */
    public SystemPK getSystemPK() {
        return this.systemPK;
    }

    /**
     * set foreign key system
     * @param systemPK: instance of SystemPK
     */
    public void initSystemPK(ISystemPK systemPK) {
        this.systemPK = (SystemPK)systemPK;
    }

    /**
     * set foreign key system
     * @param systemPK: instance of SystemPK
     */
    public void setSystemPK(ISystemPK systemPK) {
	if(systemPK==null && systemPK!=this.systemPK || systemPK!=null) {
            if(systemPK==null) {
                updates.put(IFaction.SOLAR_SYSTEM, null);
            } else {
                updates.put(IFaction.SOLAR_SYSTEM, systemPK.getId());
            }
        }
        this.systemPK = (SystemPK)systemPK;
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
