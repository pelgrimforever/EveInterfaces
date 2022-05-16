/*
 * eStation.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 11.4.2022 9:13
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
import eve.interfaces.logicentity.IStation;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Station
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Station Entity
 * 
 * @author Franky Laseure
 */
public class eStation extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected StationPK stationPK;
    private RacePK racePK;
    private EvetypePK evetypePK;
    private SystemPK systemPK;
    private java.lang.String name;
    private double office_rental_cost;
    private double reprocessing_efficiency;
    private double reprocessing_stations_take;
    private double max_dockable_ship_volume;
    private long owner;
    private java.sql.Date downloaddate;
	  
    public static final String table = "station";
	  
    public String getFieldname(short fieldconstant) {
        return IStation.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IStation.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eStation.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eStation.connectionpool;
    }
    
    /**
     * 
     * @return table name for Station
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Station class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Station entity
     */
    public eStation() {
    }

    /**
     * Constructor
     * build an empty Station entity with initialized field values
     */
    public eStation(long id) {
        this.stationPK = new StationPK(id);
    }
  
    /**
     * Constructor
     * build an empty Station entity with initialized Primarykey parameter
     * @param stationPK: Station Primarykey
     */
    public eStation(StationPK stationPK) {
        this.stationPK = stationPK;
    }

    /**
     * @return is Station Empty ?
     */
    public boolean isEmpty() {
        return this.stationPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.stationPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.stationPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(IStation.RACE_ID, this.racePK.getId());

        updates.put(IStation.TYPE_ID, this.evetypePK.getId());

        updates.put(IStation.SYSTEM_ID, this.systemPK.getId());

        updates.put(IStation.NAME, name);
        updates.put(IStation.OFFICE_RENTAL_COST, office_rental_cost);
        updates.put(IStation.REPROCESSING_EFFICIENCY, reprocessing_efficiency);
        updates.put(IStation.REPROCESSING_STATIONS_TAKE, reprocessing_stations_take);
        updates.put(IStation.MAX_DOCKABLE_SHIP_VOLUME, max_dockable_ship_volume);
        updates.put(IStation.OWNER, owner);
        updates.put(IStation.DOWNLOADDATE, downloaddate);
        return getAllFields();
    }
	
    /**
     * @return StationPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return StationPK
     */
    @Override
    public StationPK getPrimaryKey() {
        return this.stationPK;
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
            updates.put(IStation.NAME, name);
        }
        this.name = name;
    }

    /**
     * 
     * @return office_rental_cost value
     */
    public double getOffice_rental_cost() {
        return this.office_rental_cost;
    }

    /**
     * set office_rental_cost value
     * @param office_rental_cost: new value
     */
    public void initOffice_rental_cost(double office_rental_cost) {
        this.office_rental_cost = office_rental_cost;
    }

    /**
     * set office_rental_cost value
     * @param office_rental_cost: new value
     */
    public void setOffice_rental_cost(double office_rental_cost) {
        updates.put(IStation.OFFICE_RENTAL_COST, office_rental_cost);
        this.office_rental_cost = office_rental_cost;
    }

    /**
     * 
     * @return reprocessing_efficiency value
     */
    public double getReprocessing_efficiency() {
        return this.reprocessing_efficiency;
    }

    /**
     * set reprocessing_efficiency value
     * @param reprocessing_efficiency: new value
     */
    public void initReprocessing_efficiency(double reprocessing_efficiency) {
        this.reprocessing_efficiency = reprocessing_efficiency;
    }

    /**
     * set reprocessing_efficiency value
     * @param reprocessing_efficiency: new value
     */
    public void setReprocessing_efficiency(double reprocessing_efficiency) {
        updates.put(IStation.REPROCESSING_EFFICIENCY, reprocessing_efficiency);
        this.reprocessing_efficiency = reprocessing_efficiency;
    }

    /**
     * 
     * @return reprocessing_stations_take value
     */
    public double getReprocessing_stations_take() {
        return this.reprocessing_stations_take;
    }

    /**
     * set reprocessing_stations_take value
     * @param reprocessing_stations_take: new value
     */
    public void initReprocessing_stations_take(double reprocessing_stations_take) {
        this.reprocessing_stations_take = reprocessing_stations_take;
    }

    /**
     * set reprocessing_stations_take value
     * @param reprocessing_stations_take: new value
     */
    public void setReprocessing_stations_take(double reprocessing_stations_take) {
        updates.put(IStation.REPROCESSING_STATIONS_TAKE, reprocessing_stations_take);
        this.reprocessing_stations_take = reprocessing_stations_take;
    }

    /**
     * 
     * @return max_dockable_ship_volume value
     */
    public double getMax_dockable_ship_volume() {
        return this.max_dockable_ship_volume;
    }

    /**
     * set max_dockable_ship_volume value
     * @param max_dockable_ship_volume: new value
     */
    public void initMax_dockable_ship_volume(double max_dockable_ship_volume) {
        this.max_dockable_ship_volume = max_dockable_ship_volume;
    }

    /**
     * set max_dockable_ship_volume value
     * @param max_dockable_ship_volume: new value
     */
    public void setMax_dockable_ship_volume(double max_dockable_ship_volume) {
        updates.put(IStation.MAX_DOCKABLE_SHIP_VOLUME, max_dockable_ship_volume);
        this.max_dockable_ship_volume = max_dockable_ship_volume;
    }

    /**
     * 
     * @return owner value
     */
    public long getOwner() {
        return this.owner;
    }

    /**
     * set owner value
     * @param owner: new value
     */
    public void initOwner(long owner) {
        this.owner = owner;
    }

    /**
     * set owner value
     * @param owner: new value
     */
    public void setOwner(long owner) {
        updates.put(IStation.OWNER, owner);
        this.owner = owner;
    }

    /**
     * 
     * @return downloaddate value
     */
    public java.sql.Date getDownloaddate() {
        return this.downloaddate;
    }

    /**
     * set downloaddate value
     * @param downloaddate: new value
     */
    public void initDownloaddate(java.sql.Date downloaddate) {
        this.downloaddate = downloaddate;
    }

    /**
     * set downloaddate value
     * @param downloaddate: new value
     */
    public void setDownloaddate(java.sql.Date downloaddate) {
	if(downloaddate==null && downloaddate!=this.downloaddate || downloaddate!=null && !downloaddate.equals(this.downloaddate)) {
            updates.put(IStation.DOWNLOADDATE, downloaddate);
        }
        this.downloaddate = downloaddate;
    }

    /**
     * 
     * @return foreign key racePK, instance of RacePK
     */
    public RacePK getRacePK() {
        return this.racePK;
    }

    /**
     * set foreign key race
     * @param racePK: instance of RacePK
     */
    public void initRacePK(IRacePK racePK) {
        this.racePK = (RacePK)racePK;
    }

    /**
     * set foreign key race
     * @param racePK: instance of RacePK
     */
    public void setRacePK(IRacePK racePK) {
	if(racePK==null && racePK!=this.racePK || racePK!=null) {
            if(racePK==null) {
                updates.put(IStation.RACE_ID, null);
            } else {
                updates.put(IStation.RACE_ID, racePK.getId());
            }
        }
        this.racePK = (RacePK)racePK;
    }

    /**
     * 
     * @return foreign key evetypePK, instance of EvetypePK
     */
    public EvetypePK getEvetypePK() {
        return this.evetypePK;
    }

    /**
     * set foreign key evetype
     * @param evetypePK: instance of EvetypePK
     */
    public void initEvetypePK(IEvetypePK evetypePK) {
        this.evetypePK = (EvetypePK)evetypePK;
    }

    /**
     * set foreign key evetype
     * @param evetypePK: instance of EvetypePK
     */
    public void setEvetypePK(IEvetypePK evetypePK) {
	if(evetypePK==null && evetypePK!=this.evetypePK || evetypePK!=null) {
            if(evetypePK==null) {
                updates.put(IStation.TYPE_ID, null);
            } else {
                updates.put(IStation.TYPE_ID, evetypePK.getId());
            }
        }
        this.evetypePK = (EvetypePK)evetypePK;
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
                updates.put(IStation.SYSTEM_ID, null);
            } else {
                updates.put(IStation.SYSTEM_ID, systemPK.getId());
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
