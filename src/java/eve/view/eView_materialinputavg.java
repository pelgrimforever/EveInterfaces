/*
 * eView_materialinputavg.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.0.2022 17:52
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
 * View class View_materialinputavg
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_materialinputavg Entity
 * 
 * @author Franky Laseure
 */
public class eView_materialinputavg implements eveDatabaseproperties, EntityView {

    public static final String table = "view_materialinputavg";
    private java.lang.String username;
    private long evetype;
    private java.sql.Timestamp lastbuytimestamp;
    private float totalamount;
    private double avgunitprice;
    private float totalusedamount;
    private java.lang.String name;
    private double packaged_volume;
    private double average;
    private double highest;
    private double lowest;
	  
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eView_materialinputavg.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eView_materialinputavg.connectionpool;
    }
    
    /**
     * 
     * @return view name for View_materialinputavg
     */
    public String getTable() { return table; }

    /**
     * 
     * @return View_materialinputavg class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_materialinputavg entity
     */
    public eView_materialinputavg() {
    }

    /**
     * @return is View_materialinputavg Empty ?
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * 
     * @return username value
     */
    public java.lang.String getUsername() {
        return this.username;
    }

    /**
     * set username value
     * @param username: new value
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
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
     * @return lastbuytimestamp value
     */
    public java.sql.Timestamp getLastbuytimestamp() {
        return this.lastbuytimestamp;
    }

    /**
     * set lastbuytimestamp value
     * @param lastbuytimestamp: new value
     */
    public void setLastbuytimestamp(java.sql.Timestamp lastbuytimestamp) {
        this.lastbuytimestamp = lastbuytimestamp;
    }

    /**
     * 
     * @return totalamount value
     */
    public float getTotalamount() {
        return this.totalamount;
    }

    /**
     * set totalamount value
     * @param totalamount: new value
     */
    public void setTotalamount(float totalamount) {
        this.totalamount = totalamount;
    }

    /**
     * 
     * @return avgunitprice value
     */
    public double getAvgunitprice() {
        return this.avgunitprice;
    }

    /**
     * set avgunitprice value
     * @param avgunitprice: new value
     */
    public void setAvgunitprice(double avgunitprice) {
        this.avgunitprice = avgunitprice;
    }

    /**
     * 
     * @return totalusedamount value
     */
    public float getTotalusedamount() {
        return this.totalusedamount;
    }

    /**
     * set totalusedamount value
     * @param totalusedamount: new value
     */
    public void setTotalusedamount(float totalusedamount) {
        this.totalusedamount = totalusedamount;
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

}
