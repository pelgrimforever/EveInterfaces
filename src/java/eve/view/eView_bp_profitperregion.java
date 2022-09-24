/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
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
	  
    @Override
    public String getDbtool() {
        return eView_bp_profitperregion.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eView_bp_profitperregion.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eView_bp_profitperregion() {
    }

    public boolean isEmpty() {
        return false;
    }

    public long getCategoryid() {
        return this.categoryid;
    }

    public void setCategoryid(long categoryid) {
        this.categoryid = categoryid;
    }

    public java.lang.String getCategoryname() {
        return this.categoryname;
    }

    public void setCategoryname(java.lang.String categoryname) {
        this.categoryname = categoryname;
    }

    public long getTypegroupid() {
        return this.typegroupid;
    }

    public void setTypegroupid(long typegroupid) {
        this.typegroupid = typegroupid;
    }

    public java.lang.String getTypegroupname() {
        return this.typegroupname;
    }

    public void setTypegroupname(java.lang.String typegroupname) {
        this.typegroupname = typegroupname;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public double getEstimatedproductioncost() {
        return this.estimatedproductioncost;
    }

    public void setEstimatedproductioncost(double estimatedproductioncost) {
        this.estimatedproductioncost = estimatedproductioncost;
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

    public double getPercprofit() {
        return this.percprofit;
    }

    public void setPercprofit(double percprofit) {
        this.percprofit = percprofit;
    }

}
