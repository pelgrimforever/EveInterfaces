/*
 * eView_tradesystem.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.0.2022 16:56
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
 * View class View_tradesystem
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_tradesystem Entity
 * 
 * @author Franky Laseure
 */
public class eView_tradesystem implements eveDatabaseproperties, EntityView {

    public static final String table = "view_tradesystem";
    private long sell_regionid;
    private java.lang.String sell_regionname;
    private long sell_systemid;
    private java.lang.String sell_systemname;
    private float orders;
    private double buy_total;
    private double sell_total;
    private double totalprofit;
    private double totalvolume;
    private long buy_systemid;
    private java.lang.String buy_systemname;
    private int trade_jumps;
    private int trade_jumpslowsec;
    private int trade_jumpsnullsec;
	  
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eView_tradesystem.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eView_tradesystem.connectionpool;
    }
    
    /**
     * 
     * @return view name for View_tradesystem
     */
    public String getTable() { return table; }

    /**
     * 
     * @return View_tradesystem class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_tradesystem entity
     */
    public eView_tradesystem() {
    }

    /**
     * @return is View_tradesystem Empty ?
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * 
     * @return sell_regionid value
     */
    public long getSell_regionid() {
        return this.sell_regionid;
    }

    /**
     * set sell_regionid value
     * @param sell_regionid: new value
     */
    public void setSell_regionid(long sell_regionid) {
        this.sell_regionid = sell_regionid;
    }

    /**
     * 
     * @return sell_regionname value
     */
    public java.lang.String getSell_regionname() {
        return this.sell_regionname;
    }

    /**
     * set sell_regionname value
     * @param sell_regionname: new value
     */
    public void setSell_regionname(java.lang.String sell_regionname) {
        this.sell_regionname = sell_regionname;
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
     * @return sell_systemname value
     */
    public java.lang.String getSell_systemname() {
        return this.sell_systemname;
    }

    /**
     * set sell_systemname value
     * @param sell_systemname: new value
     */
    public void setSell_systemname(java.lang.String sell_systemname) {
        this.sell_systemname = sell_systemname;
    }

    /**
     * 
     * @return orders value
     */
    public float getOrders() {
        return this.orders;
    }

    /**
     * set orders value
     * @param orders: new value
     */
    public void setOrders(float orders) {
        this.orders = orders;
    }

    /**
     * 
     * @return buy_total value
     */
    public double getBuy_total() {
        return this.buy_total;
    }

    /**
     * set buy_total value
     * @param buy_total: new value
     */
    public void setBuy_total(double buy_total) {
        this.buy_total = buy_total;
    }

    /**
     * 
     * @return sell_total value
     */
    public double getSell_total() {
        return this.sell_total;
    }

    /**
     * set sell_total value
     * @param sell_total: new value
     */
    public void setSell_total(double sell_total) {
        this.sell_total = sell_total;
    }

    /**
     * 
     * @return totalprofit value
     */
    public double getTotalprofit() {
        return this.totalprofit;
    }

    /**
     * set totalprofit value
     * @param totalprofit: new value
     */
    public void setTotalprofit(double totalprofit) {
        this.totalprofit = totalprofit;
    }

    /**
     * 
     * @return totalvolume value
     */
    public double getTotalvolume() {
        return this.totalvolume;
    }

    /**
     * set totalvolume value
     * @param totalvolume: new value
     */
    public void setTotalvolume(double totalvolume) {
        this.totalvolume = totalvolume;
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
     * @return buy_systemname value
     */
    public java.lang.String getBuy_systemname() {
        return this.buy_systemname;
    }

    /**
     * set buy_systemname value
     * @param buy_systemname: new value
     */
    public void setBuy_systemname(java.lang.String buy_systemname) {
        this.buy_systemname = buy_systemname;
    }

    /**
     * 
     * @return trade_jumps value
     */
    public int getTrade_jumps() {
        return this.trade_jumps;
    }

    /**
     * set trade_jumps value
     * @param trade_jumps: new value
     */
    public void setTrade_jumps(int trade_jumps) {
        this.trade_jumps = trade_jumps;
    }

    /**
     * 
     * @return trade_jumpslowsec value
     */
    public int getTrade_jumpslowsec() {
        return this.trade_jumpslowsec;
    }

    /**
     * set trade_jumpslowsec value
     * @param trade_jumpslowsec: new value
     */
    public void setTrade_jumpslowsec(int trade_jumpslowsec) {
        this.trade_jumpslowsec = trade_jumpslowsec;
    }

    /**
     * 
     * @return trade_jumpsnullsec value
     */
    public int getTrade_jumpsnullsec() {
        return this.trade_jumpsnullsec;
    }

    /**
     * set trade_jumpsnullsec value
     * @param trade_jumpsnullsec: new value
     */
    public void setTrade_jumpsnullsec(int trade_jumpsnullsec) {
        this.trade_jumpsnullsec = trade_jumpsnullsec;
    }

}
