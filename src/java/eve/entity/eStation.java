/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
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
import eve.interfaces.logicentity.IStation;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

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
        
    @Override
    public String getDbtool() {
        return eStation.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eStation.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eStation() {
    }

    public eStation(long id) {
        this.stationPK = new StationPK(id);
    }
  
    public eStation(StationPK stationPK) {
        this.stationPK = stationPK;
    }

    public boolean isEmpty() {
        return this.stationPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.stationPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.stationPK.getPrimarykeyvalues();	  
    }
  
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
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public StationPK getPrimaryKey() {
        return this.stationPK;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void initName(java.lang.String name) {
        this.name = name;
    }

    public void setName(java.lang.String name) {
	if(name==null && name!=this.name || name!=null && !name.equals(this.name)) {
            updates.put(IStation.NAME, name);
        }
        this.name = name;
    }

    public double getOffice_rental_cost() {
        return this.office_rental_cost;
    }

    public void initOffice_rental_cost(double office_rental_cost) {
        this.office_rental_cost = office_rental_cost;
    }

    public void setOffice_rental_cost(double office_rental_cost) {
        updates.put(IStation.OFFICE_RENTAL_COST, office_rental_cost);
        this.office_rental_cost = office_rental_cost;
    }

    public double getReprocessing_efficiency() {
        return this.reprocessing_efficiency;
    }

    public void initReprocessing_efficiency(double reprocessing_efficiency) {
        this.reprocessing_efficiency = reprocessing_efficiency;
    }

    public void setReprocessing_efficiency(double reprocessing_efficiency) {
        updates.put(IStation.REPROCESSING_EFFICIENCY, reprocessing_efficiency);
        this.reprocessing_efficiency = reprocessing_efficiency;
    }

    public double getReprocessing_stations_take() {
        return this.reprocessing_stations_take;
    }

    public void initReprocessing_stations_take(double reprocessing_stations_take) {
        this.reprocessing_stations_take = reprocessing_stations_take;
    }

    public void setReprocessing_stations_take(double reprocessing_stations_take) {
        updates.put(IStation.REPROCESSING_STATIONS_TAKE, reprocessing_stations_take);
        this.reprocessing_stations_take = reprocessing_stations_take;
    }

    public double getMax_dockable_ship_volume() {
        return this.max_dockable_ship_volume;
    }

    public void initMax_dockable_ship_volume(double max_dockable_ship_volume) {
        this.max_dockable_ship_volume = max_dockable_ship_volume;
    }

    public void setMax_dockable_ship_volume(double max_dockable_ship_volume) {
        updates.put(IStation.MAX_DOCKABLE_SHIP_VOLUME, max_dockable_ship_volume);
        this.max_dockable_ship_volume = max_dockable_ship_volume;
    }

    public long getOwner() {
        return this.owner;
    }

    public void initOwner(long owner) {
        this.owner = owner;
    }

    public void setOwner(long owner) {
        updates.put(IStation.OWNER, owner);
        this.owner = owner;
    }

    public java.sql.Date getDownloaddate() {
        return this.downloaddate;
    }

    public void initDownloaddate(java.sql.Date downloaddate) {
        this.downloaddate = downloaddate;
    }

    public void setDownloaddate(java.sql.Date downloaddate) {
	if(downloaddate==null && downloaddate!=this.downloaddate || downloaddate!=null && !downloaddate.equals(this.downloaddate)) {
            updates.put(IStation.DOWNLOADDATE, downloaddate);
        }
        this.downloaddate = downloaddate;
    }

    public RacePK getRacePK() {
        return this.racePK;
    }

    public void initRacePK(IRacePK racePK) {
        this.racePK = (RacePK)racePK;
    }

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

    public EvetypePK getEvetypePK() {
        return this.evetypePK;
    }

    public void initEvetypePK(IEvetypePK evetypePK) {
        this.evetypePK = (EvetypePK)evetypePK;
    }

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

    public SystemPK getSystemPK() {
        return this.systemPK;
    }

    public void initSystemPK(ISystemPK systemPK) {
        this.systemPK = (SystemPK)systemPK;
    }

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

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
