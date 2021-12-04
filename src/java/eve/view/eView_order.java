/*
 * eView_order.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.11.2021 14:51
 *
 */

package eve.view;

import eve.eveDatabaseproperties;
import data.interfaces.db.EntityView;
import data.interfaces.db.Filedata;
import data.gis.shape.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.HashMap;
import java.util.Iterator;

/**
 * View class View_order
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_order Entity
 * 
 * @author Franky Laseure
 */
public class eView_order implements eveDatabaseproperties, EntityView {

    public static final String table = "view_order";
    private long id;
    private boolean isopen;
    private long system;
    private long evetype;
    private long volume_total;
    private long volume_remain;
    private java.lang.String range;
    private int range_number;
    private double price;
    private int min_volume;
    private long location;
    private boolean is_buy_order;
    private java.sql.Timestamp issued;
    private int duration;
    private int page;
    private long stationid;
    private java.lang.String stationname;
    private long locationid;
    private java.lang.String locationname;
    private java.lang.String systemname;
    private double security_status;
    private long constellation;
    private java.lang.String constellationname;
    private long region;
    private java.lang.String regionname;
    private java.lang.String evetypename;
    private double packaged_volume;
	  
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eView_order.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eView_order.connectionpool;
    }
    
    /**
     * 
     * @return view name for View_order
     */
    public String getTable() { return table; }

    /**
     * 
     * @return View_order class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_order entity
     */
    public eView_order() {
    }

    /**
     * @return is View_order Empty ?
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * 
     * @return id value
     */
    public long getId() {
        return this.id;
    }

    /**
     * set id value
     * @param id: new value
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * 
     * @return isopen value
     */
    public boolean getIsopen() {
        return this.isopen;
    }

    /**
     * set isopen value
     * @param isopen: new value
     */
    public void setIsopen(boolean isopen) {
        this.isopen = isopen;
    }

    /**
     * 
     * @return system value
     */
    public long getSystem() {
        return this.system;
    }

    /**
     * set system value
     * @param system: new value
     */
    public void setSystem(long system) {
        this.system = system;
    }

    /**
     * 
     * @return evetype value
     */
    public long getEvetype() {
        return this.evetype;
    }

    /**
     * set evetype value
     * @param evetype: new value
     */
    public void setEvetype(long evetype) {
        this.evetype = evetype;
    }

    /**
     * 
     * @return volume_total value
     */
    public long getVolume_total() {
        return this.volume_total;
    }

    /**
     * set volume_total value
     * @param volume_total: new value
     */
    public void setVolume_total(long volume_total) {
        this.volume_total = volume_total;
    }

    /**
     * 
     * @return volume_remain value
     */
    public long getVolume_remain() {
        return this.volume_remain;
    }

    /**
     * set volume_remain value
     * @param volume_remain: new value
     */
    public void setVolume_remain(long volume_remain) {
        this.volume_remain = volume_remain;
    }

    /**
     * 
     * @return range value
     */
    public java.lang.String getRange() {
        return this.range;
    }

    /**
     * set range value
     * @param range: new value
     */
    public void setRange(java.lang.String range) {
        this.range = range;
    }

    /**
     * 
     * @return range_number value
     */
    public int getRange_number() {
        return this.range_number;
    }

    /**
     * set range_number value
     * @param range_number: new value
     */
    public void setRange_number(int range_number) {
        this.range_number = range_number;
    }

    /**
     * 
     * @return price value
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * set price value
     * @param price: new value
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 
     * @return min_volume value
     */
    public int getMin_volume() {
        return this.min_volume;
    }

    /**
     * set min_volume value
     * @param min_volume: new value
     */
    public void setMin_volume(int min_volume) {
        this.min_volume = min_volume;
    }

    /**
     * 
     * @return location value
     */
    public long getLocation() {
        return this.location;
    }

    /**
     * set location value
     * @param location: new value
     */
    public void setLocation(long location) {
        this.location = location;
    }

    /**
     * 
     * @return is_buy_order value
     */
    public boolean getIs_buy_order() {
        return this.is_buy_order;
    }

    /**
     * set is_buy_order value
     * @param is_buy_order: new value
     */
    public void setIs_buy_order(boolean is_buy_order) {
        this.is_buy_order = is_buy_order;
    }

    /**
     * 
     * @return issued value
     */
    public java.sql.Timestamp getIssued() {
        return this.issued;
    }

    /**
     * set issued value
     * @param issued: new value
     */
    public void setIssued(java.sql.Timestamp issued) {
        this.issued = issued;
    }

    /**
     * 
     * @return duration value
     */
    public int getDuration() {
        return this.duration;
    }

    /**
     * set duration value
     * @param duration: new value
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * 
     * @return page value
     */
    public int getPage() {
        return this.page;
    }

    /**
     * set page value
     * @param page: new value
     */
    public void setPage(int page) {
        this.page = page;
    }

    /**
     * 
     * @return stationid value
     */
    public long getStationid() {
        return this.stationid;
    }

    /**
     * set stationid value
     * @param stationid: new value
     */
    public void setStationid(long stationid) {
        this.stationid = stationid;
    }

    /**
     * 
     * @return stationname value
     */
    public java.lang.String getStationname() {
        return this.stationname;
    }

    /**
     * set stationname value
     * @param stationname: new value
     */
    public void setStationname(java.lang.String stationname) {
        this.stationname = stationname;
    }

    /**
     * 
     * @return locationid value
     */
    public long getLocationid() {
        return this.locationid;
    }

    /**
     * set locationid value
     * @param locationid: new value
     */
    public void setLocationid(long locationid) {
        this.locationid = locationid;
    }

    /**
     * 
     * @return locationname value
     */
    public java.lang.String getLocationname() {
        return this.locationname;
    }

    /**
     * set locationname value
     * @param locationname: new value
     */
    public void setLocationname(java.lang.String locationname) {
        this.locationname = locationname;
    }

    /**
     * 
     * @return systemname value
     */
    public java.lang.String getSystemname() {
        return this.systemname;
    }

    /**
     * set systemname value
     * @param systemname: new value
     */
    public void setSystemname(java.lang.String systemname) {
        this.systemname = systemname;
    }

    /**
     * 
     * @return security_status value
     */
    public double getSecurity_status() {
        return this.security_status;
    }

    /**
     * set security_status value
     * @param security_status: new value
     */
    public void setSecurity_status(double security_status) {
        this.security_status = security_status;
    }

    /**
     * 
     * @return constellation value
     */
    public long getConstellation() {
        return this.constellation;
    }

    /**
     * set constellation value
     * @param constellation: new value
     */
    public void setConstellation(long constellation) {
        this.constellation = constellation;
    }

    /**
     * 
     * @return constellationname value
     */
    public java.lang.String getConstellationname() {
        return this.constellationname;
    }

    /**
     * set constellationname value
     * @param constellationname: new value
     */
    public void setConstellationname(java.lang.String constellationname) {
        this.constellationname = constellationname;
    }

    /**
     * 
     * @return region value
     */
    public long getRegion() {
        return this.region;
    }

    /**
     * set region value
     * @param region: new value
     */
    public void setRegion(long region) {
        this.region = region;
    }

    /**
     * 
     * @return regionname value
     */
    public java.lang.String getRegionname() {
        return this.regionname;
    }

    /**
     * set regionname value
     * @param regionname: new value
     */
    public void setRegionname(java.lang.String regionname) {
        this.regionname = regionname;
    }

    /**
     * 
     * @return evetypename value
     */
    public java.lang.String getEvetypename() {
        return this.evetypename;
    }

    /**
     * set evetypename value
     * @param evetypename: new value
     */
    public void setEvetypename(java.lang.String evetypename) {
        this.evetypename = evetypename;
    }

    /**
     * 
     * @return packaged_volume value
     */
    public double getPackaged_volume() {
        return this.packaged_volume;
    }

    /**
     * set packaged_volume value
     * @param packaged_volume: new value
     */
    public void setPackaged_volume(double packaged_volume) {
        this.packaged_volume = packaged_volume;
    }

}
