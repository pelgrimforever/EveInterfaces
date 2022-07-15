/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.5.2022 11:23
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
 * @author Franky Laseure
 */
public class eView_evetype_order_history_region_month implements eveDatabaseproperties, EntityView {

    public static final String table = "view_evetype_order_history_region_month";
    private long region;
    private java.lang.String regionname;
    private long evetype;
    private int year;
    private int month;
    private double average;
    private double highest;
    private double lowest;
    private float volume;
    private float ordercount;
	  
    @Override
    public String getDbtool() {
        return databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return connectionpool;
    }
    
    @Override
    public String getTable() { return table; }

    @Override
    public String getClassName() { return this.getClass().getName(); };
	  
    public eView_evetype_order_history_region_month() {
    }

    @Override
    public boolean isEmpty() {
        return false;
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

    public long getEvetype() {
        return this.evetype;
    }

    public void setEvetype(long evetype) {
        this.evetype = evetype;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public double getAverage() {
        return this.average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public double getHighest() {
        return this.highest;
    }

    public void setHighest(double highest) {
        this.highest = highest;
    }

    public double getLowest() {
        return this.lowest;
    }

    public void setLowest(double lowest) {
        this.lowest = lowest;
    }

    public float getVolume() {
        return this.volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public float getOrdercount() {
        return this.ordercount;
    }

    public void setOrdercount(float ordercount) {
        this.ordercount = ordercount;
    }

}
