/*
 * eView_systemtradeorders.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2021 15:16
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
 * View class View_systemtradeorders
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_systemtradeorders Entity
 * 
 * @author Franky Laseure
 */
public class eView_systemtradeorders implements eveDatabaseproperties, EntityView {

    public static final String table = "view_systemtradeorders";
    private double buy_totalprice;
    private double sell_totalprice;
    private double cargo_volume;
    private long sellorderid;
    private long buyorderid;
    private long evetype;
    private double packaged_volume;
    private long security_island;
    private long sell_system;
    private long buy_system;
    private int jumps;
	  
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eView_systemtradeorders.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eView_systemtradeorders.connectionpool;
    }
    
    /**
     * 
     * @return view name for View_systemtradeorders
     */
    public String getTable() { return table; }

    /**
     * 
     * @return View_systemtradeorders class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_systemtradeorders entity
     */
    public eView_systemtradeorders() {
    }

    /**
     * @return is View_systemtradeorders Empty ?
     */
    public boolean isEmpty() {
        return false;
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
     * @return sellorderid value
     */
    public long getSellorderid() {
        return this.sellorderid;
    }

    /**
     * set sellorderid value
     * @param sellorderid: new value
     */
    public void setSellorderid(long sellorderid) {
        this.sellorderid = sellorderid;
    }

    /**
     * 
     * @return buyorderid value
     */
    public long getBuyorderid() {
        return this.buyorderid;
    }

    /**
     * set buyorderid value
     * @param buyorderid: new value
     */
    public void setBuyorderid(long buyorderid) {
        this.buyorderid = buyorderid;
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
