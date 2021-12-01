/*
 * eView_stocktrade_orders.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 30.10.2021 10:3
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
 * View class View_stocktrade_orders
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_stocktrade_orders Entity
 * 
 * @author Franky Laseure
 */
public class eView_stocktrade_orders implements eveDatabaseproperties, EntityView {

    public static final String table = "view_stocktrade_orders";
    private java.lang.String username;
    private long system;
    private long locationid;
    private java.lang.String stationname;
    private java.lang.String locationname;
    private long evetypeid;
    private java.lang.String evetypename;
    private double packaged_volume;
    private int min_volume;
    private long sellamount;
	  
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eView_stocktrade_orders.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eView_stocktrade_orders.connectionpool;
    }
    
    /**
     * 
     * @return view name for View_stocktrade_orders
     */
    public String getTable() { return table; }

    /**
     * 
     * @return View_stocktrade_orders class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_stocktrade_orders entity
     */
    public eView_stocktrade_orders() {
    }

    /**
     * @return is View_stocktrade_orders Empty ?
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
     * @return evetypeid value
     */
    public long getEvetypeid() {
        return this.evetypeid;
    }

    /**
     * set evetypeid value
     * @param evetypeid: new value
     */
    public void setEvetypeid(long evetypeid) {
        this.evetypeid = evetypeid;
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
     * @return sellamount value
     */
    public long getSellamount() {
        return this.sellamount;
    }

    /**
     * set sellamount value
     * @param sellamount: new value
     */
    public void setSellamount(long sellamount) {
        this.sellamount = sellamount;
    }

}
