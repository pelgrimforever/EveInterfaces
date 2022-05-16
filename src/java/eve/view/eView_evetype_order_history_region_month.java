/*
 * eView_evetype_order_history_region_month.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 11.4.2022 9:13
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
 * View class View_evetype_order_history_region_month
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_evetype_order_history_region_month Entity
 * 
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
	  
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eView_evetype_order_history_region_month.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eView_evetype_order_history_region_month.connectionpool;
    }
    
    /**
     * 
     * @return view name for View_evetype_order_history_region_month
     */
    public String getTable() { return table; }

    /**
     * 
     * @return View_evetype_order_history_region_month class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_evetype_order_history_region_month entity
     */
    public eView_evetype_order_history_region_month() {
    }

    /**
     * @return is View_evetype_order_history_region_month Empty ?
     */
    public boolean isEmpty() {
        return false;
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
     * @return year value
     */
    public int getYear() {
        return this.year;
    }

    /**
     * set year value
     * @param year: new value
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * 
     * @return month value
     */
    public int getMonth() {
        return this.month;
    }

    /**
     * set month value
     * @param month: new value
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * 
     * @return average value
     */
    public double getAverage() {
        return this.average;
    }

    /**
     * set average value
     * @param average: new value
     */
    public void setAverage(double average) {
        this.average = average;
    }

    /**
     * 
     * @return highest value
     */
    public double getHighest() {
        return this.highest;
    }

    /**
     * set highest value
     * @param highest: new value
     */
    public void setHighest(double highest) {
        this.highest = highest;
    }

    /**
     * 
     * @return lowest value
     */
    public double getLowest() {
        return this.lowest;
    }

    /**
     * set lowest value
     * @param lowest: new value
     */
    public void setLowest(double lowest) {
        this.lowest = lowest;
    }

    /**
     * 
     * @return volume value
     */
    public float getVolume() {
        return this.volume;
    }

    /**
     * set volume value
     * @param volume: new value
     */
    public void setVolume(float volume) {
        this.volume = volume;
    }

    /**
     * 
     * @return ordercount value
     */
    public float getOrdercount() {
        return this.ordercount;
    }

    /**
     * set ordercount value
     * @param ordercount: new value
     */
    public void setOrdercount(float ordercount) {
        this.ordercount = ordercount;
    }

}
