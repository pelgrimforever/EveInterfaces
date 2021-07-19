/*
 * eView_tradeorders.java
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
 * View class View_tradeorders
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_tradeorders Entity
 * 
 * @author Franky Laseure
 */
public class eView_tradeorders implements EntityViewInterface {

    private long tradevolume;
    private double buy_totalprice;
    private double sell_totalprice;
    private double cargo_volume;
    private long sell_id;
    private long sell_system;
    private long sell_location;
    private long sell_evetype;
    private double sell_packaged_volume;
    private long sell_volume_remain;
    private double sell_price;
    private long security_island;
    private long buy_id;
    private long buy_system;
    private long buy_location;
    private long buy_volume_remain;
    private double buy_price;
    private int jumps;
	  
    public static final String table = "view_tradeorders";
    public static final String SQLSelectAll = "select view_tradeorders.* from view_tradeorders";
	  
    /**
     * 
     * @return view name for View_tradeorders
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL select statement for all View_tradeorderss
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

    /**
     * 
     * @return View_tradeorders class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_tradeorders entity
     */
    public eView_tradeorders() {
    }

    /**
     * @return is View_tradeorders Empty ?
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * 
     * @return tradevolume value
     */
    public long getTradevolume() {
        return this.tradevolume;
    }

    /**
     * set tradevolume value
     * @param tradevolume: new value
     */
    public void setTradevolume(long tradevolume) {
        this.tradevolume = tradevolume;
    }

    /**
     * 
     * @return buy_totalprice value
     */
    public double getBuy_totalprice() {
        return this.buy_totalprice;
    }

    /**
     * set buy_totalprice value
     * @param buy_totalprice: new value
     */
    public void setBuy_totalprice(double buy_totalprice) {
        this.buy_totalprice = buy_totalprice;
    }

    /**
     * 
     * @return sell_totalprice value
     */
    public double getSell_totalprice() {
        return this.sell_totalprice;
    }

    /**
     * set sell_totalprice value
     * @param sell_totalprice: new value
     */
    public void setSell_totalprice(double sell_totalprice) {
        this.sell_totalprice = sell_totalprice;
    }

    /**
     * 
     * @return cargo_volume value
     */
    public double getCargo_volume() {
        return this.cargo_volume;
    }

    /**
     * set cargo_volume value
     * @param cargo_volume: new value
     */
    public void setCargo_volume(double cargo_volume) {
        this.cargo_volume = cargo_volume;
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
     * @return sell_location value
     */
    public long getSell_location() {
        return this.sell_location;
    }

    /**
     * set sell_location value
     * @param sell_location: new value
     */
    public void setSell_location(long sell_location) {
        this.sell_location = sell_location;
    }

    /**
     * 
     * @return sell_evetype value
     */
    public long getSell_evetype() {
        return this.sell_evetype;
    }

    /**
     * set sell_evetype value
     * @param sell_evetype: new value
     */
    public void setSell_evetype(long sell_evetype) {
        this.sell_evetype = sell_evetype;
    }

    /**
     * 
     * @return sell_packaged_volume value
     */
    public double getSell_packaged_volume() {
        return this.sell_packaged_volume;
    }

    /**
     * set sell_packaged_volume value
     * @param sell_packaged_volume: new value
     */
    public void setSell_packaged_volume(double sell_packaged_volume) {
        this.sell_packaged_volume = sell_packaged_volume;
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
     * @return security_island value
     */
    public long getSecurity_island() {
        return this.security_island;
    }

    /**
     * set security_island value
     * @param security_island: new value
     */
    public void setSecurity_island(long security_island) {
        this.security_island = security_island;
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
     * @return buy_location value
     */
    public long getBuy_location() {
        return this.buy_location;
    }

    /**
     * set buy_location value
     * @param buy_location: new value
     */
    public void setBuy_location(long buy_location) {
        this.buy_location = buy_location;
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

}
