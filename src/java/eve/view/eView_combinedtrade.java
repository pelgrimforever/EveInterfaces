/*
 * eView_combinedtrade.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 8.10.2021 7:21
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
 * View class View_combinedtrade
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_combinedtrade Entity
 * 
 * @author Franky Laseure
 */
public class eView_combinedtrade implements eveDatabaseproperties, EntityView {

    public static final String table = "view_combinedtrade";
    private java.lang.String sellregion;
    private java.lang.String buyregion;
    private long sell_systemid;
    private java.lang.String sellsystem;
    private long buy_systemid;
    private java.lang.String buysystem;
    private double total_volume;
    private double buy_order_value;
    private double sell_order_value;
    private double profit;
    private int jumps;
    private long runs;
    private long ordercount;
	  
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eView_combinedtrade.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eView_combinedtrade.connectionpool;
    }
    
    /**
     * 
     * @return view name for View_combinedtrade
     */
    public String getTable() { return table; }

    /**
     * 
     * @return View_combinedtrade class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_combinedtrade entity
     */
    public eView_combinedtrade() {
    }

    /**
     * @return is View_combinedtrade Empty ?
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * 
     * @return sellregion value
     */
    public java.lang.String getSellregion() {
        return this.sellregion;
    }

    /**
     * set sellregion value
     * @param sellregion: new value
     */
    public void setSellregion(java.lang.String sellregion) {
        this.sellregion = sellregion;
    }

    /**
     * 
     * @return buyregion value
     */
    public java.lang.String getBuyregion() {
        return this.buyregion;
    }

    /**
     * set buyregion value
     * @param buyregion: new value
     */
    public void setBuyregion(java.lang.String buyregion) {
        this.buyregion = buyregion;
    }

    /**
     * 
     * @return sell_systemid value
     */
    public long getSell_systemid() {
        return this.sell_systemid;
    }

    /**
     * set sell_systemid value
     * @param sell_systemid: new value
     */
    public void setSell_systemid(long sell_systemid) {
        this.sell_systemid = sell_systemid;
    }

    /**
     * 
     * @return sellsystem value
     */
    public java.lang.String getSellsystem() {
        return this.sellsystem;
    }

    /**
     * set sellsystem value
     * @param sellsystem: new value
     */
    public void setSellsystem(java.lang.String sellsystem) {
        this.sellsystem = sellsystem;
    }

    /**
     * 
     * @return buy_systemid value
     */
    public long getBuy_systemid() {
        return this.buy_systemid;
    }

    /**
     * set buy_systemid value
     * @param buy_systemid: new value
     */
    public void setBuy_systemid(long buy_systemid) {
        this.buy_systemid = buy_systemid;
    }

    /**
     * 
     * @return buysystem value
     */
    public java.lang.String getBuysystem() {
        return this.buysystem;
    }

    /**
     * set buysystem value
     * @param buysystem: new value
     */
    public void setBuysystem(java.lang.String buysystem) {
        this.buysystem = buysystem;
    }

    /**
     * 
     * @return total_volume value
     */
    public double getTotal_volume() {
        return this.total_volume;
    }

    /**
     * set total_volume value
     * @param total_volume: new value
     */
    public void setTotal_volume(double total_volume) {
        this.total_volume = total_volume;
    }

    /**
     * 
     * @return buy_order_value value
     */
    public double getBuy_order_value() {
        return this.buy_order_value;
    }

    /**
     * set buy_order_value value
     * @param buy_order_value: new value
     */
    public void setBuy_order_value(double buy_order_value) {
        this.buy_order_value = buy_order_value;
    }

    /**
     * 
     * @return sell_order_value value
     */
    public double getSell_order_value() {
        return this.sell_order_value;
    }

    /**
     * set sell_order_value value
     * @param sell_order_value: new value
     */
    public void setSell_order_value(double sell_order_value) {
        this.sell_order_value = sell_order_value;
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
     * @return runs value
     */
    public long getRuns() {
        return this.runs;
    }

    /**
     * set runs value
     * @param runs: new value
     */
    public void setRuns(long runs) {
        this.runs = runs;
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
