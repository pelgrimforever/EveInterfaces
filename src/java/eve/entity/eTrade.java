/*
 * eTrade.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 8.10.2021 7:21
 *
 */

package eve.entity;

import eve.eveDatabaseproperties;
import data.interfaces.db.AbstractEntity;
import data.interfaces.db.Entity;
import data.interfaces.db.Filedata;
import data.gis.shape.*;
import data.json.piJson;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Iterator;

import eve.entity.pk.*;
import eve.interfaces.logicentity.ITrade;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Trade
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Trade Entity
 * 
 * @author Franky Laseure
 */
public class eTrade extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected TradePK tradePK;
    private double total_volume;
    private double buy_order_value;
    private double sell_order_value;
    private double profit;
    private int jumps;
    private int runs;
    private int total_jumps;
    private double profit_per_jump;
    private double singlerun_profit_per_jump;
    private int maxunits_per_run;
	  
    public static final String table = "trade";
	  
    public String getFieldname(short fieldconstant) {
        return ITrade.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ITrade.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eTrade.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eTrade.connectionpool;
    }
    
    /**
     * 
     * @return table name for Trade
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Trade class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Trade entity
     */
    public eTrade() {
    }

    /**
     * Constructor
     * build an empty Trade entity with initialized field values
     */
    public eTrade(long sell_order_id, long buy_order_id) {
        this.tradePK = new TradePK(sell_order_id, buy_order_id);
    }
  
    /**
     * Constructor
     * build an empty Trade entity with initialized Primarykey parameter
     * @param tradePK: Trade Primarykey
     */
    public eTrade(TradePK tradePK) {
        this.tradePK = tradePK;
    }

    /**
     * @return is Trade Empty ?
     */
    public boolean isEmpty() {
        return this.tradePK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.tradePK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.tradePK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(ITrade.TOTAL_VOLUME, total_volume);
        updates.put(ITrade.BUY_ORDER_VALUE, buy_order_value);
        updates.put(ITrade.SELL_ORDER_VALUE, sell_order_value);
        updates.put(ITrade.PROFIT, profit);
        updates.put(ITrade.JUMPS, jumps);
        updates.put(ITrade.RUNS, runs);
        updates.put(ITrade.TOTAL_JUMPS, total_jumps);
        updates.put(ITrade.PROFIT_PER_JUMP, profit_per_jump);
        updates.put(ITrade.SINGLERUN_PROFIT_PER_JUMP, singlerun_profit_per_jump);
        updates.put(ITrade.MAXUNITS_PER_RUN, maxunits_per_run);
        return getAllFields();
    }
	
    /**
     * @return TradePK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return TradePK
     */
    @Override
    public TradePK getPrimaryKey() {
        return this.tradePK;
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
    public void initTotal_volume(double total_volume) {
        this.total_volume = total_volume;
    }

    /**
     * set total_volume value
     * @param total_volume: new value
     */
    public void setTotal_volume(double total_volume) {
        updates.put(ITrade.TOTAL_VOLUME, total_volume);
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
    public void initBuy_order_value(double buy_order_value) {
        this.buy_order_value = buy_order_value;
    }

    /**
     * set buy_order_value value
     * @param buy_order_value: new value
     */
    public void setBuy_order_value(double buy_order_value) {
        updates.put(ITrade.BUY_ORDER_VALUE, buy_order_value);
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
    public void initSell_order_value(double sell_order_value) {
        this.sell_order_value = sell_order_value;
    }

    /**
     * set sell_order_value value
     * @param sell_order_value: new value
     */
    public void setSell_order_value(double sell_order_value) {
        updates.put(ITrade.SELL_ORDER_VALUE, sell_order_value);
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
    public void initProfit(double profit) {
        this.profit = profit;
    }

    /**
     * set profit value
     * @param profit: new value
     */
    public void setProfit(double profit) {
        updates.put(ITrade.PROFIT, profit);
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
    public void initJumps(int jumps) {
        this.jumps = jumps;
    }

    /**
     * set jumps value
     * @param jumps: new value
     */
    public void setJumps(int jumps) {
        updates.put(ITrade.JUMPS, jumps);
        this.jumps = jumps;
    }

    /**
     * 
     * @return runs value
     */
    public int getRuns() {
        return this.runs;
    }

    /**
     * set runs value
     * @param runs: new value
     */
    public void initRuns(int runs) {
        this.runs = runs;
    }

    /**
     * set runs value
     * @param runs: new value
     */
    public void setRuns(int runs) {
        updates.put(ITrade.RUNS, runs);
        this.runs = runs;
    }

    /**
     * 
     * @return total_jumps value
     */
    public int getTotal_jumps() {
        return this.total_jumps;
    }

    /**
     * set total_jumps value
     * @param total_jumps: new value
     */
    public void initTotal_jumps(int total_jumps) {
        this.total_jumps = total_jumps;
    }

    /**
     * set total_jumps value
     * @param total_jumps: new value
     */
    public void setTotal_jumps(int total_jumps) {
        updates.put(ITrade.TOTAL_JUMPS, total_jumps);
        this.total_jumps = total_jumps;
    }

    /**
     * 
     * @return profit_per_jump value
     */
    public double getProfit_per_jump() {
        return this.profit_per_jump;
    }

    /**
     * set profit_per_jump value
     * @param profit_per_jump: new value
     */
    public void initProfit_per_jump(double profit_per_jump) {
        this.profit_per_jump = profit_per_jump;
    }

    /**
     * set profit_per_jump value
     * @param profit_per_jump: new value
     */
    public void setProfit_per_jump(double profit_per_jump) {
        updates.put(ITrade.PROFIT_PER_JUMP, profit_per_jump);
        this.profit_per_jump = profit_per_jump;
    }

    /**
     * 
     * @return singlerun_profit_per_jump value
     */
    public double getSinglerun_profit_per_jump() {
        return this.singlerun_profit_per_jump;
    }

    /**
     * set singlerun_profit_per_jump value
     * @param singlerun_profit_per_jump: new value
     */
    public void initSinglerun_profit_per_jump(double singlerun_profit_per_jump) {
        this.singlerun_profit_per_jump = singlerun_profit_per_jump;
    }

    /**
     * set singlerun_profit_per_jump value
     * @param singlerun_profit_per_jump: new value
     */
    public void setSinglerun_profit_per_jump(double singlerun_profit_per_jump) {
        updates.put(ITrade.SINGLERUN_PROFIT_PER_JUMP, singlerun_profit_per_jump);
        this.singlerun_profit_per_jump = singlerun_profit_per_jump;
    }

    /**
     * 
     * @return maxunits_per_run value
     */
    public int getMaxunits_per_run() {
        return this.maxunits_per_run;
    }

    /**
     * set maxunits_per_run value
     * @param maxunits_per_run: new value
     */
    public void initMaxunits_per_run(int maxunits_per_run) {
        this.maxunits_per_run = maxunits_per_run;
    }

    /**
     * set maxunits_per_run value
     * @param maxunits_per_run: new value
     */
    public void setMaxunits_per_run(int maxunits_per_run) {
        updates.put(ITrade.MAXUNITS_PER_RUN, maxunits_per_run);
        this.maxunits_per_run = maxunits_per_run;
    }

    /**
     * 
     * @return Primarykey string value
     */
    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
