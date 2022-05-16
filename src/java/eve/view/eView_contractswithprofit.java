/*
 * eView_contractswithprofit.java
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
 * View class View_contractswithprofit
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_contractswithprofit Entity
 * 
 * @author Franky Laseure
 */
public class eView_contractswithprofit implements eveDatabaseproperties, EntityView {

    public static final String table = "view_contractswithprofit";
    private long id;
    private java.sql.Timestamp date_expired;
    private java.sql.Timestamp date_issued;
    private int days_to_complete;
    private long end_location_id;
    private double price;
    private double reward;
    private long start_location_id;
    private java.lang.String name;
    private java.lang.String systemname;
    private java.lang.String regionname;
    private java.lang.String title;
    private double volume;
    private double sellprice;
    private double buyprice;
	  
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eView_contractswithprofit.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eView_contractswithprofit.connectionpool;
    }
    
    /**
     * 
     * @return view name for View_contractswithprofit
     */
    public String getTable() { return table; }

    /**
     * 
     * @return View_contractswithprofit class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_contractswithprofit entity
     */
    public eView_contractswithprofit() {
    }

    /**
     * @return is View_contractswithprofit Empty ?
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
     * @return date_expired value
     */
    public java.sql.Timestamp getDate_expired() {
        return this.date_expired;
    }

    /**
     * set date_expired value
     * @param date_expired: new value
     */
    public void setDate_expired(java.sql.Timestamp date_expired) {
        this.date_expired = date_expired;
    }

    /**
     * 
     * @return date_issued value
     */
    public java.sql.Timestamp getDate_issued() {
        return this.date_issued;
    }

    /**
     * set date_issued value
     * @param date_issued: new value
     */
    public void setDate_issued(java.sql.Timestamp date_issued) {
        this.date_issued = date_issued;
    }

    /**
     * 
     * @return days_to_complete value
     */
    public int getDays_to_complete() {
        return this.days_to_complete;
    }

    /**
     * set days_to_complete value
     * @param days_to_complete: new value
     */
    public void setDays_to_complete(int days_to_complete) {
        this.days_to_complete = days_to_complete;
    }

    /**
     * 
     * @return end_location_id value
     */
    public long getEnd_location_id() {
        return this.end_location_id;
    }

    /**
     * set end_location_id value
     * @param end_location_id: new value
     */
    public void setEnd_location_id(long end_location_id) {
        this.end_location_id = end_location_id;
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
     * @return reward value
     */
    public double getReward() {
        return this.reward;
    }

    /**
     * set reward value
     * @param reward: new value
     */
    public void setReward(double reward) {
        this.reward = reward;
    }

    /**
     * 
     * @return start_location_id value
     */
    public long getStart_location_id() {
        return this.start_location_id;
    }

    /**
     * set start_location_id value
     * @param start_location_id: new value
     */
    public void setStart_location_id(long start_location_id) {
        this.start_location_id = start_location_id;
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
     * @return title value
     */
    public java.lang.String getTitle() {
        return this.title;
    }

    /**
     * set title value
     * @param title: new value
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    /**
     * 
     * @return volume value
     */
    public double getVolume() {
        return this.volume;
    }

    /**
     * set volume value
     * @param volume: new value
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * 
     * @return sellprice value
     */
    public double getSellprice() {
        return this.sellprice;
    }

    /**
     * set sellprice value
     * @param sellprice: new value
     */
    public void setSellprice(double sellprice) {
        this.sellprice = sellprice;
    }

    /**
     * 
     * @return buyprice value
     */
    public double getBuyprice() {
        return this.buyprice;
    }

    /**
     * set buyprice value
     * @param buyprice: new value
     */
    public void setBuyprice(double buyprice) {
        this.buyprice = buyprice;
    }

}
