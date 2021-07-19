/*
 * eView_systemtrade.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 18.6.2021 14:35
 *
 */

package eve.view;

import data.interfaces.db.EntityViewInterface;
import data.interfaces.db.Filedata;
import data.gis.shape.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.HashMap;
import java.util.Iterator;

/**
 * View class View_systemtrade
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_systemtrade Entity
 * 
 * @author Franky Laseure
 */
public class eView_systemtrade implements EntityViewInterface {

    private long sell_system;
    private long buy_system;
    private long ordercount;
    private double totalsell;
    private double totalbuy;
    private double profit;
    private double total_cargo_volume;
    private int jumps;
    private java.lang.String regionsellname;
    private java.lang.String systemsellname;
    private java.lang.String regionbuyname;
    private java.lang.String systembuyname;
	  
    public static final String table = "view_systemtrade";
    public static final String SQLSelectAll = "select view_systemtrade.* from view_systemtrade";
	  
    /**
     * 
     * @return view name for View_systemtrade
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL select statement for all View_systemtrades
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

    /**
     * 
     * @return View_systemtrade class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_systemtrade entity
     */
    public eView_systemtrade() {
    }

    /**
     * @return is View_systemtrade Empty ?
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * 
     * @return sell_system value
     */
    public long getSell_system() {
        return this.sell_system;
    }

    /**
     * set sell_system value
     * @param sell_system: new value
     */
    public void setSell_system(long sell_system) {
        this.sell_system = sell_system;
    }

    /**
     * 
     * @return buy_system value
     */
    public long getBuy_system() {
        return this.buy_system;
    }

    /**
     * set buy_system value
     * @param buy_system: new value
     */
    public void setBuy_system(long buy_system) {
        this.buy_system = buy_system;
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

    /**
     * 
     * @return totalsell value
     */
    public double getTotalsell() {
        return this.totalsell;
    }

    /**
     * set totalsell value
     * @param totalsell: new value
     */
    public void setTotalsell(double totalsell) {
        this.totalsell = totalsell;
    }

    /**
     * 
     * @return totalbuy value
     */
    public double getTotalbuy() {
        return this.totalbuy;
    }

    /**
     * set totalbuy value
     * @param totalbuy: new value
     */
    public void setTotalbuy(double totalbuy) {
        this.totalbuy = totalbuy;
    }

    /**
     * 
     * @return profit value
     */
    public double getProfit() {
        return this.profit;
    }

    /**
     * set profit value
     * @param profit: new value
     */
    public void setProfit(double profit) {
        this.profit = profit;
    }

    /**
     * 
     * @return total_cargo_volume value
     */
    public double getTotal_cargo_volume() {
        return this.total_cargo_volume;
    }

    /**
     * set total_cargo_volume value
     * @param total_cargo_volume: new value
     */
    public void setTotal_cargo_volume(double total_cargo_volume) {
        this.total_cargo_volume = total_cargo_volume;
    }

    /**
     * 
     * @return jumps value
     */
    public int getJumps() {
        return this.jumps;
    }

    /**
     * set jumps value
     * @param jumps: new value
     */
    public void setJumps(int jumps) {
        this.jumps = jumps;
    }

    /**
     * 
     * @return regionsellname value
     */
    public java.lang.String getRegionsellname() {
        return this.regionsellname;
    }

    /**
     * set regionsellname value
     * @param regionsellname: new value
     */
    public void setRegionsellname(java.lang.String regionsellname) {
        this.regionsellname = regionsellname;
    }

    /**
     * 
     * @return systemsellname value
     */
    public java.lang.String getSystemsellname() {
        return this.systemsellname;
    }

    /**
     * set systemsellname value
     * @param systemsellname: new value
     */
    public void setSystemsellname(java.lang.String systemsellname) {
        this.systemsellname = systemsellname;
    }

    /**
     * 
     * @return regionbuyname value
     */
    public java.lang.String getRegionbuyname() {
        return this.regionbuyname;
    }

    /**
     * set regionbuyname value
     * @param regionbuyname: new value
     */
    public void setRegionbuyname(java.lang.String regionbuyname) {
        this.regionbuyname = regionbuyname;
    }

    /**
     * 
     * @return systembuyname value
     */
    public java.lang.String getSystembuyname() {
        return this.systembuyname;
    }

    /**
     * set systembuyname value
     * @param systembuyname: new value
     */
    public void setSystembuyname(java.lang.String systembuyname) {
        this.systembuyname = systembuyname;
    }

}
