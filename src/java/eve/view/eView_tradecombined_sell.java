/*
 * eView_tradecombined_sell.java
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
 * View class View_tradecombined_sell
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_tradecombined_sell Entity
 * 
 * @author Franky Laseure
 */
public class eView_tradecombined_sell implements eveDatabaseproperties, EntityView {

    public static final String table = "view_tradecombined_sell";
    private long sell_system;
    private long buy_system;
    private long orderamount;
    private double buy_order_value;
    private double sell_order_value;
    private double profit;
    private long sell_locationid;
    private java.lang.String sell_stationname;
    private long evetype_id;
    private java.lang.String evetype_name;
    private double packaged_volume;
    private long sell_id;
    private long sell_volume_total;
    private long sell_volume_remain;
    private int sell_min_volume;
    private long sell_updated;
    private long buy_id;
    private double sell_price;
    private long buy_volume_total;
    private long buy_volume_remain;
    private int buy_min_volume;
    private long buy_updated;
    private double buy_price;
    private long buy_locationid;
    private java.lang.String buy_stationname;
	  
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eView_tradecombined_sell.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eView_tradecombined_sell.connectionpool;
    }
    
    /**
     * 
     * @return view name for View_tradecombined_sell
     */
    public String getTable() { return table; }

    /**
     * 
     * @return View_tradecombined_sell class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_tradecombined_sell entity
     */
    public eView_tradecombined_sell() {
    }

    /**
     * @return is View_tradecombined_sell Empty ?
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
     * @return orderamount value
     */
    public long getOrderamount() {
        return this.orderamount;
    }

    /**
     * set orderamount value
     * @param orderamount: new value
     */
    public void setOrderamount(long orderamount) {
        this.orderamount = orderamount;
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
     * @return sell_locationid value
     */
    public long getSell_locationid() {
        return this.sell_locationid;
    }

    /**
     * set sell_locationid value
     * @param sell_locationid: new value
     */
    public void setSell_locationid(long sell_locationid) {
        this.sell_locationid = sell_locationid;
    }

    /**
     * 
     * @return sell_stationname value
     */
    public java.lang.String getSell_stationname() {
        return this.sell_stationname;
    }

    /**
     * set sell_stationname value
     * @param sell_stationname: new value
     */
    public void setSell_stationname(java.lang.String sell_stationname) {
        this.sell_stationname = sell_stationname;
    }

    /**
     * 
     * @return evetype_id value
     */
    public long getEvetype_id() {
        return this.evetype_id;
    }

    /**
     * set evetype_id value
     * @param evetype_id: new value
     */
    public void setEvetype_id(long evetype_id) {
        this.evetype_id = evetype_id;
    }

    /**
     * 
     * @return evetype_name value
     */
    public java.lang.String getEvetype_name() {
        return this.evetype_name;
    }

    /**
     * set evetype_name value
     * @param evetype_name: new value
     */
    public void setEvetype_name(java.lang.String evetype_name) {
        this.evetype_name = evetype_name;
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
     * @return sell_id value
     */
    public long getSell_id() {
        return this.sell_id;
    }

    /**
     * set sell_id value
     * @param sell_id: new value
     */
    public void setSell_id(long sell_id) {
        this.sell_id = sell_id;
    }

    /**
     * 
     * @return sell_volume_total value
     */
    public long getSell_volume_total() {
        return this.sell_volume_total;
    }

    /**
     * set sell_volume_total value
     * @param sell_volume_total: new value
     */
    public void setSell_volume_total(long sell_volume_total) {
        this.sell_volume_total = sell_volume_total;
    }

    /**
     * 
     * @return sell_volume_remain value
     */
    public long getSell_volume_remain() {
        return this.sell_volume_remain;
    }

    /**
     * set sell_volume_remain value
     * @param sell_volume_remain: new value
     */
    public void setSell_volume_remain(long sell_volume_remain) {
        this.sell_volume_remain = sell_volume_remain;
    }

    /**
     * 
     * @return sell_min_volume value
     */
    public int getSell_min_volume() {
        return this.sell_min_volume;
    }

    /**
     * set sell_min_volume value
     * @param sell_min_volume: new value
     */
    public void setSell_min_volume(int sell_min_volume) {
        this.sell_min_volume = sell_min_volume;
    }

    /**
     * 
     * @return sell_updated value
     */
    public long getSell_updated() {
        return this.sell_updated;
    }

    /**
     * set sell_updated value
     * @param sell_updated: new value
     */
    public void setSell_updated(long sell_updated) {
        this.sell_updated = sell_updated;
    }

    /**
     * 
     * @return buy_id value
     */
    public long getBuy_id() {
        return this.buy_id;
    }

    /**
     * set buy_id value
     * @param buy_id: new value
     */
    public void setBuy_id(long buy_id) {
        this.buy_id = buy_id;
    }

    /**
     * 
     * @return sell_price value
     */
    public double getSell_price() {
        return this.sell_price;
    }

    /**
     * set sell_price value
     * @param sell_price: new value
     */
    public void setSell_price(double sell_price) {
        this.sell_price = sell_price;
    }

    /**
     * 
     * @return buy_volume_total value
     */
    public long getBuy_volume_total() {
        return this.buy_volume_total;
    }

    /**
     * set buy_volume_total value
     * @param buy_volume_total: new value
     */
    public void setBuy_volume_total(long buy_volume_total) {
        this.buy_volume_total = buy_volume_total;
    }

    /**
     * 
     * @return buy_volume_remain value
     */
    public long getBuy_volume_remain() {
        return this.buy_volume_remain;
    }

    /**
     * set buy_volume_remain value
     * @param buy_volume_remain: new value
     */
    public void setBuy_volume_remain(long buy_volume_remain) {
        this.buy_volume_remain = buy_volume_remain;
    }

    /**
     * 
     * @return buy_min_volume value
     */
    public int getBuy_min_volume() {
        return this.buy_min_volume;
    }

    /**
     * set buy_min_volume value
     * @param buy_min_volume: new value
     */
    public void setBuy_min_volume(int buy_min_volume) {
        this.buy_min_volume = buy_min_volume;
    }

    /**
     * 
     * @return buy_updated value
     */
    public long getBuy_updated() {
        return this.buy_updated;
    }

    /**
     * set buy_updated value
     * @param buy_updated: new value
     */
    public void setBuy_updated(long buy_updated) {
        this.buy_updated = buy_updated;
    }

    /**
     * 
     * @return buy_price value
     */
    public double getBuy_price() {
        return this.buy_price;
    }

    /**
     * set buy_price value
     * @param buy_price: new value
     */
    public void setBuy_price(double buy_price) {
        this.buy_price = buy_price;
    }

    /**
     * 
     * @return buy_locationid value
     */
    public long getBuy_locationid() {
        return this.buy_locationid;
    }

    /**
     * set buy_locationid value
     * @param buy_locationid: new value
     */
    public void setBuy_locationid(long buy_locationid) {
        this.buy_locationid = buy_locationid;
    }

    /**
     * 
     * @return buy_stationname value
     */
    public java.lang.String getBuy_stationname() {
        return this.buy_stationname;
    }

    /**
     * set buy_stationname value
     * @param buy_stationname: new value
     */
    public void setBuy_stationname(java.lang.String buy_stationname) {
        this.buy_stationname = buy_stationname;
    }

}
