/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
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
        
    @Override
    public String getDbtool() {
        return eFaction.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eFaction.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eFaction() {
    }

    public eFaction(long id) {
        this.factionPK = new FactionPK(id);
    }
  
    public eFaction(FactionPK factionPK) {
        this.factionPK = factionPK;
    }

    public boolean isEmpty() {
        return this.factionPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.factionPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.factionPK.getPrimarykeyvalues();	  
    }
  
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
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public FactionPK getPrimaryKey() {
        return this.factionPK;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void initName(java.lang.String name) {
        this.name = name;
    }

    public void setName(java.lang.String name) {
	if(name==null && name!=this.name || name!=null && !name.equals(this.name)) {
            updates.put(IFaction.NAME, name);
        }
        this.name = name;
    }

    public java.lang.String getDescription() {
        return this.description;
    }

    public void initDescription(java.lang.String description) {
        this.description = description;
    }

    public void setDescription(java.lang.String description) {
	if(description==null && description!=this.description || description!=null && !description.equals(this.description)) {
            updates.put(IFaction.DESCRIPTION, description);
        }
        this.description = description;
    }

    public boolean getIs_unique() {
        return this.is_unique;
    }

    public void initIs_unique(boolean is_unique) {
        this.is_unique = is_unique;
    }

    public void setIs_unique(boolean is_unique) {
        updates.put(IFaction.IS_UNIQUE, is_unique);
        this.is_unique = is_unique;
    }

    public double getSize_factor() {
        return this.size_factor;
    }

    public void initSize_factor(double size_factor) {
        this.size_factor = size_factor;
    }

    public void setSize_factor(double size_factor) {
        updates.put(IFaction.SIZE_FACTOR, size_factor);
        this.size_factor = size_factor;
    }

    public int getStation_count() {
        return this.station_count;
    }

    public void initStation_count(int station_count) {
        this.station_count = station_count;
    }

    public void setStation_count(int station_count) {
        updates.put(IFaction.STATION_COUNT, station_count);
        this.station_count = station_count;
    }

    public int getStation_system_count() {
        return this.station_system_count;
    }

    public void initStation_system_count(int station_system_count) {
        this.station_system_count = station_system_count;
    }

    public void setStation_system_count(int station_system_count) {
        updates.put(IFaction.STATION_SYSTEM_COUNT, station_system_count);
        this.station_system_count = station_system_count;
    }

    public long getCorporation() {
        return this.corporation;
    }

    public void initCorporation(long corporation) {
        this.corporation = corporation;
    }

    public void setCorporation(long corporation) {
        updates.put(IFaction.CORPORATION, corporation);
        this.corporation = corporation;
    }

    public long getMilitia_corporation() {
        return this.militia_corporation;
    }

    public void initMilitia_corporation(long militia_corporation) {
        this.militia_corporation = militia_corporation;
    }

    public void setMilitia_corporation(long militia_corporation) {
        updates.put(IFaction.MILITIA_CORPORATION, militia_corporation);
        this.militia_corporation = militia_corporation;
    }

    public SystemPK getSystemPK() {
        return this.systemPK;
    }

    public void initSystemPK(ISystemPK systemPK) {
        this.systemPK = (SystemPK)systemPK;
    }

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

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
