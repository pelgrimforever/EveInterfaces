/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
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

public class eView_shipfitorderselected implements eveDatabaseproperties, EntityView {

    public static final String table = "view_shipfitorderselected";
    private java.lang.String username;
    private java.lang.String shipname;
    private int amountneeded;
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
    private double avg_buyorder;
    private double avg_sellorder;
	  
    @Override
    public String getDbtool() {
        return eView_shipfitorderselected.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eView_shipfitorderselected.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eView_shipfitorderselected() {
    }

    public boolean isEmpty() {
        return false;
    }

    public java.lang.String getUsername() {
        return this.username;
    }

    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    public java.lang.String getShipname() {
        return this.shipname;
    }

    public void setShipname(java.lang.String shipname) {
        this.shipname = shipname;
    }

    public int getAmountneeded() {
        return this.amountneeded;
    }

    public void setAmountneeded(int amountneeded) {
        this.amountneeded = amountneeded;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean getIsopen() {
        return this.isopen;
    }

    public void setIsopen(boolean isopen) {
        this.isopen = isopen;
    }

    public long getSystem() {
        return this.system;
    }

    public void setSystem(long system) {
        this.system = system;
    }

    public long getEvetype() {
        return this.evetype;
    }

    public void setEvetype(long evetype) {
        this.evetype = evetype;
    }

    public long getVolume_total() {
        return this.volume_total;
    }

    public void setVolume_total(long volume_total) {
        this.volume_total = volume_total;
    }

    public long getVolume_remain() {
        return this.volume_remain;
    }

    public void setVolume_remain(long volume_remain) {
        this.volume_remain = volume_remain;
    }

    public java.lang.String getRange() {
        return this.range;
    }

    public void setRange(java.lang.String range) {
        this.range = range;
    }

    public int getRange_number() {
        return this.range_number;
    }

    public void setRange_number(int range_number) {
        this.range_number = range_number;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMin_volume() {
        return this.min_volume;
    }

    public void setMin_volume(int min_volume) {
        this.min_volume = min_volume;
    }

    public long getLocation() {
        return this.location;
    }

    public void setLocation(long location) {
        this.location = location;
    }

    public boolean getIs_buy_order() {
        return this.is_buy_order;
    }

    public void setIs_buy_order(boolean is_buy_order) {
        this.is_buy_order = is_buy_order;
    }

    public java.sql.Timestamp getIssued() {
        return this.issued;
    }

    public void setIssued(java.sql.Timestamp issued) {
        this.issued = issued;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getPage() {
        return this.page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public long getStationid() {
        return this.stationid;
    }

    public void setStationid(long stationid) {
        this.stationid = stationid;
    }

    public java.lang.String getStationname() {
        return this.stationname;
    }

    public void setStationname(java.lang.String stationname) {
        this.stationname = stationname;
    }

    public long getLocationid() {
        return this.locationid;
    }

    public void setLocationid(long locationid) {
        this.locationid = locationid;
    }

    public java.lang.String getLocationname() {
        return this.locationname;
    }

    public void setLocationname(java.lang.String locationname) {
        this.locationname = locationname;
    }

    public java.lang.String getSystemname() {
        return this.systemname;
    }

    public void setSystemname(java.lang.String systemname) {
        this.systemname = systemname;
    }

    public double getSecurity_status() {
        return this.security_status;
    }

    public void setSecurity_status(double security_status) {
        this.security_status = security_status;
    }

    public long getConstellation() {
        return this.constellation;
    }

    public void setConstellation(long constellation) {
        this.constellation = constellation;
    }

    public java.lang.String getConstellationname() {
        return this.constellationname;
    }

    public void setConstellationname(java.lang.String constellationname) {
        this.constellationname = constellationname;
    }

    public long getRegion() {
        return this.region;
    }

    public void setRegion(long region) {
        this.region = region;
    }

    public java.lang.String getRegionname() {
        return this.regionname;
    }

    public void setRegionname(java.lang.String regionname) {
        this.regionname = regionname;
    }

    public java.lang.String getEvetypename() {
        return this.evetypename;
    }

    public void setEvetypename(java.lang.String evetypename) {
        this.evetypename = evetypename;
    }

    public double getPackaged_volume() {
        return this.packaged_volume;
    }

    public void setPackaged_volume(double packaged_volume) {
        this.packaged_volume = packaged_volume;
    }

    public double getAvg_buyorder() {
        return this.avg_buyorder;
    }

    public void setAvg_buyorder(double avg_buyorder) {
        this.avg_buyorder = avg_buyorder;
    }

    public double getAvg_sellorder() {
        return this.avg_sellorder;
    }

    public void setAvg_sellorder(double avg_sellorder) {
        this.avg_sellorder = avg_sellorder;
    }

}
