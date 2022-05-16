/*
 * eView_evetype_order_history.java
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
 * View class View_evetype_order_history
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_evetype_order_history Entity
 * 
 * @author Franky Laseure
 */
public class eView_evetype_order_history implements eveDatabaseproperties, EntityView {

    public static final String table = "view_evetype_order_history";
    private long evetype;
    private java.sql.Date date;
    private double average;
    private double highest;
    private double lowest;
    private long volume;
    private long ordercount;
	  
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eView_evetype_order_history.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eView_evetype_order_history.connectionpool;
    }
    
    /**
     * 
     * @return view name for View_evetype_order_history
     */
    public String getTable() { return table; }

    /**
     * 
     * @return View_evetype_order_history class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_evetype_order_history entity
     */
    public eView_evetype_order_history() {
    }

    /**
     * @return is View_evetype_order_history Empty ?
     */
    public boolean isEmpty() {
        return false;
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
     * @return date value
     */
    public java.sql.Date getDate() {
        return this.date;
    }

    /**
     * set date value
     * @param date: new value
     */
    public void setDate(java.sql.Date date) {
        this.date = date;
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
    public long getVolume() {
        return this.volume;
    }

    /**
     * set volume value
     * @param volume: new value
     */
    public void setVolume(long volume) {
        this.volume = volume;
    }

    /**
     * 
     * @return ordercount value
     */
    public long getOrdercount() {
        return this.ordercount;
    }

    /**
     * set ordercount value
     * @param ordercount: new value
     */
    public void setOrdercount(long ordercount) {
        this.ordercount = ordercount;
    }

}
