/*
 * eView_bp_profitperregion.java
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
 * View class View_bp_profitperregion
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_bp_profitperregion Entity
 * 
 * @author Franky Laseure
 */
public class eView_bp_profitperregion implements eveDatabaseproperties, EntityView {

    public static final String table = "view_bp_profitperregion";
    private long categoryid;
    private java.lang.String categoryname;
    private long typegroupid;
    private java.lang.String typegroupname;
    private long id;
    private java.lang.String name;
    private double estimatedproductioncost;
    private long region;
    private java.lang.String regionname;
    private int year;
    private int month;
    private double average;
    private double highest;
    private double lowest;
    private float volume;
    private float ordercount;
    private double percprofit;
	  
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eView_bp_profitperregion.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eView_bp_profitperregion.connectionpool;
    }
    
    /**
     * 
     * @return view name for View_bp_profitperregion
     */
    public String getTable() { return table; }

    /**
     * 
     * @return View_bp_profitperregion class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_bp_profitperregion entity
     */
    public eView_bp_profitperregion() {
    }

    /**
     * @return is View_bp_profitperregion Empty ?
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * 
     * @return categoryid value
     */
    public long getCategoryid() {
        return this.categoryid;
    }

    /**
     * set categoryid value
     * @param categoryid: new value
     */
    public void setCategoryid(long categoryid) {
        this.categoryid = categoryid;
    }

    /**
     * 
     * @return categoryname value
     */
    public java.lang.String getCategoryname() {
        return this.categoryname;
    }

    /**
     * set categoryname value
     * @param categoryname: new value
     */
    public void setCategoryname(java.lang.String categoryname) {
        this.categoryname = categoryname;
    }

    /**
     * 
     * @return typegroupid value
     */
    public long getTypegroupid() {
        return this.typegroupid;
    }

    /**
     * set typegroupid value
     * @param typegroupid: new value
     */
    public void setTypegroupid(long typegroupid) {
        this.typegroupid = typegroupid;
    }

    /**
     * 
     * @return typegroupname value
     */
    public java.lang.String getTypegroupname() {
        return this.typegroupname;
    }

    /**
     * set typegroupname value
     * @param typegroupname: new value
     */
    public void setTypegroupname(java.lang.String typegroupname) {
        this.typegroupname = typegroupname;
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
     * @return name value
     */
    public java.lang.String getName() {
        return this.name;
    }

    /**
     * set name value
     * @param name: new value
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    /**
     * 
     * @return estimatedproductioncost value
     */
    public double getEstimatedproductioncost() {
        return this.estimatedproductioncost;
    }

    /**
     * set estimatedproductioncost value
     * @param estimatedproductioncost: new value
     */
    public void setEstimatedproductioncost(double estimatedproductioncost) {
        this.estimatedproductioncost = estimatedproductioncost;
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

    /**
     * 
     * @return percprofit value
     */
    public double getPercprofit() {
        return this.percprofit;
    }

    /**
     * set percprofit value
     * @param percprofit: new value
     */
    public void setPercprofit(double percprofit) {
        this.percprofit = percprofit;
    }

}
