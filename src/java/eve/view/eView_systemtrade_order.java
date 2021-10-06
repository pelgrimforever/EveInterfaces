/*
 * eView_systemtrade_order.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 6.9.2021 16:29
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
 * View class View_systemtrade_order
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_systemtrade_order Entity
 * 
 * @author Franky Laseure
 */
public class eView_systemtrade_order implements EntityViewInterface {

    private long sell_system;
    private long buy_system;
    private long sell_order;
    private long buy_order;
    private long amount;
    private double sellprice;
    private double buyprice;
    private double profit;
    private double cargovolume;
    private long evetype;
    private java.lang.String evetypename;
    private long sell_volume_remain;
    private double sell_price;
    private long sell_station;
    private java.lang.String sell_stationname;
    private long buy_volume_remain;
    private double buy_price;
    private long buy_station;
    private java.lang.String buy_stationname;
	  
    public static final String table = "view_systemtrade_order";
    public static final String SQLSelectAll = "select view_systemtrade_order.* from view_systemtrade_order";
	  
    /**
     * 
     * @return view name for View_systemtrade_order
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL select statement for all View_systemtrade_orders
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

    /**
     * 
     * @return View_systemtrade_order class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_systemtrade_order entity
     */
    public eView_systemtrade_order() {
    }

    /**
     * @return is View_systemtrade_order Empty ?
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
     * @return sell_order value
     */
    public long getSell_order() {
        return this.sell_order;
    }

    /**
     * set sell_order value
     * @param sell_order: new value
     */
    public void setSell_order(long sell_order) {
        this.sell_order = sell_order;
    }

    /**
     * 
     * @return buy_order value
     */
    public long getBuy_order() {
        return this.buy_order;
    }

    /**
     * set buy_order value
     * @param buy_order: new value
     */
    public void setBuy_order(long buy_order) {
        this.buy_order = buy_order;
    }

    /**
     * 
     * @return amount value
     */
    public long getAmount() {
        return this.amount;
    }

    /**
     * set amount value
     * @param amount: new value
     */
    public void setAmount(long amount) {
        this.amount = amount;
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
     * @return cargovolume value
     */
    public double getCargovolume() {
        return this.cargovolume;
    }

    /**
     * set cargovolume value
     * @param cargovolume: new value
     */
    public void setCargovolume(double cargovolume) {
        this.cargovolume = cargovolume;
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
     * @return sell_station value
     */
    public long getSell_station() {
        return this.sell_station;
    }

    /**
     * set sell_station value
     * @param sell_station: new value
     */
    public void setSell_station(long sell_station) {
        this.sell_station = sell_station;
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
     * @return buy_station value
     */
    public long getBuy_station() {
        return this.buy_station;
    }

    /**
     * set buy_station value
     * @param buy_station: new value
     */
    public void setBuy_station(long buy_station) {
        this.buy_station = buy_station;
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
