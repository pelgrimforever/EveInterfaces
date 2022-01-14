/*
 * eView_trade.java
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
 * View class View_trade
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_trade Entity
 * 
 * @author Franky Laseure
 */
public class eView_trade implements eveDatabaseproperties, EntityView {

    public static final String table = "view_trade";
    private long sell_regionid;
    private java.lang.String sell_regionname;
    private long sell_systemid;
    private java.lang.String sell_systemname;
    private long sell_locationid;
    private java.lang.String sell_stationname;
    private long evetype_id;
    private java.lang.String evetype_name;
    private double packaged_volume;
    private long sell_id;
    private long buy_id;
    private long sell_volume_remain;
    private double sell_price;
    private double buy_price;
    private long buy_systemid;
    private java.lang.String buy_systemname;
    private long buy_locationid;
    private java.lang.String buy_stationname;
    private long buy_volume_remain;
    private double total_volume;
    private double sell_total;
    private double buy_total;
    private double trade_profit;
    private int trade_jumps;
    private int trade_jumpslowsec;
    private int trade_jumpsnullsec;
    private double trade_profit_per_jump;
    private int trade_runs;
    private int trade_total_jumps;
    private double trade_singlerunprofit;
    private int trade_maxunits_per_run;
	  
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eView_trade.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eView_trade.connectionpool;
    }
    
    /**
     * 
     * @return view name for View_trade
     */
    public String getTable() { return table; }

    /**
     * 
     * @return View_trade class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_trade entity
     */
    public eView_trade() {
    }

    /**
     * @return is View_trade Empty ?
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
     * @return trade_profit value
     */
    public double getTrade_profit() {
        return this.trade_profit;
    }

    /**
     * set trade_profit value
     * @param trade_profit: new value
     */
    public void setTrade_profit(double trade_profit) {
        this.trade_profit = trade_profit;
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

    /**
     * 
     * @return trade_profit_per_jump value
     */
    public double getTrade_profit_per_jump() {
        return this.trade_profit_per_jump;
    }

    /**
     * set trade_profit_per_jump value
     * @param trade_profit_per_jump: new value
     */
    public void setTrade_profit_per_jump(double trade_profit_per_jump) {
        this.trade_profit_per_jump = trade_profit_per_jump;
    }

    /**
     * 
     * @return trade_runs value
     */
    public int getTrade_runs() {
        return this.trade_runs;
    }

    /**
     * set trade_runs value
     * @param trade_runs: new value
     */
    public void setTrade_runs(int trade_runs) {
        this.trade_runs = trade_runs;
    }

    /**
     * 
     * @return trade_total_jumps value
     */
    public int getTrade_total_jumps() {
        return this.trade_total_jumps;
    }

    /**
     * set trade_total_jumps value
     * @param trade_total_jumps: new value
     */
    public void setTrade_total_jumps(int trade_total_jumps) {
        this.trade_total_jumps = trade_total_jumps;
    }

    /**
     * 
     * @return trade_singlerunprofit value
     */
    public double getTrade_singlerunprofit() {
        return this.trade_singlerunprofit;
    }

    /**
     * set trade_singlerunprofit value
     * @param trade_singlerunprofit: new value
     */
    public void setTrade_singlerunprofit(double trade_singlerunprofit) {
        this.trade_singlerunprofit = trade_singlerunprofit;
    }

    /**
     * 
     * @return trade_maxunits_per_run value
     */
    public int getTrade_maxunits_per_run() {
        return this.trade_maxunits_per_run;
    }

    /**
     * set trade_maxunits_per_run value
     * @param trade_maxunits_per_run: new value
     */
    public void setTrade_maxunits_per_run(int trade_maxunits_per_run) {
        this.trade_maxunits_per_run = trade_maxunits_per_run;
    }

}
