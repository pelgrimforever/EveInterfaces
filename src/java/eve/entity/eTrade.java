/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
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
    private int jumpslowsec;
    private int jumpsnullsec;
	  
    public static final String table = "trade";
	  
    public String getFieldname(short fieldconstant) {
        return ITrade.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ITrade.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return eTrade.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eTrade.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eTrade() {
    }

    public eTrade(long sell_order_id, long buy_order_id) {
        this.tradePK = new TradePK(sell_order_id, buy_order_id);
    }
  
    public eTrade(TradePK tradePK) {
        this.tradePK = tradePK;
    }

    public boolean isEmpty() {
        return this.tradePK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.tradePK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.tradePK.getPrimarykeyvalues();	  
    }
  
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
        updates.put(ITrade.JUMPSLOWSEC, jumpslowsec);
        updates.put(ITrade.JUMPSNULLSEC, jumpsnullsec);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public TradePK getPrimaryKey() {
        return this.tradePK;
    }

    public double getTotal_volume() {
        return this.total_volume;
    }

    public void initTotal_volume(double total_volume) {
        this.total_volume = total_volume;
    }

    public void setTotal_volume(double total_volume) {
        updates.put(ITrade.TOTAL_VOLUME, total_volume);
        this.total_volume = total_volume;
    }

    public double getBuy_order_value() {
        return this.buy_order_value;
    }

    public void initBuy_order_value(double buy_order_value) {
        this.buy_order_value = buy_order_value;
    }

    public void setBuy_order_value(double buy_order_value) {
        updates.put(ITrade.BUY_ORDER_VALUE, buy_order_value);
        this.buy_order_value = buy_order_value;
    }

    public double getSell_order_value() {
        return this.sell_order_value;
    }

    public void initSell_order_value(double sell_order_value) {
        this.sell_order_value = sell_order_value;
    }

    public void setSell_order_value(double sell_order_value) {
        updates.put(ITrade.SELL_ORDER_VALUE, sell_order_value);
        this.sell_order_value = sell_order_value;
    }

    public double getProfit() {
        return this.profit;
    }

    public void initProfit(double profit) {
        this.profit = profit;
    }

    public void setProfit(double profit) {
        updates.put(ITrade.PROFIT, profit);
        this.profit = profit;
    }

    public int getJumps() {
        return this.jumps;
    }

    public void initJumps(int jumps) {
        this.jumps = jumps;
    }

    public void setJumps(int jumps) {
        updates.put(ITrade.JUMPS, jumps);
        this.jumps = jumps;
    }

    public int getRuns() {
        return this.runs;
    }

    public void initRuns(int runs) {
        this.runs = runs;
    }

    public void setRuns(int runs) {
        updates.put(ITrade.RUNS, runs);
        this.runs = runs;
    }

    public int getTotal_jumps() {
        return this.total_jumps;
    }

    public void initTotal_jumps(int total_jumps) {
        this.total_jumps = total_jumps;
    }

    public void setTotal_jumps(int total_jumps) {
        updates.put(ITrade.TOTAL_JUMPS, total_jumps);
        this.total_jumps = total_jumps;
    }

    public double getProfit_per_jump() {
        return this.profit_per_jump;
    }

    public void initProfit_per_jump(double profit_per_jump) {
        this.profit_per_jump = profit_per_jump;
    }

    public void setProfit_per_jump(double profit_per_jump) {
        updates.put(ITrade.PROFIT_PER_JUMP, profit_per_jump);
        this.profit_per_jump = profit_per_jump;
    }

    public double getSinglerun_profit_per_jump() {
        return this.singlerun_profit_per_jump;
    }

    public void initSinglerun_profit_per_jump(double singlerun_profit_per_jump) {
        this.singlerun_profit_per_jump = singlerun_profit_per_jump;
    }

    public void setSinglerun_profit_per_jump(double singlerun_profit_per_jump) {
        updates.put(ITrade.SINGLERUN_PROFIT_PER_JUMP, singlerun_profit_per_jump);
        this.singlerun_profit_per_jump = singlerun_profit_per_jump;
    }

    public int getMaxunits_per_run() {
        return this.maxunits_per_run;
    }

    public void initMaxunits_per_run(int maxunits_per_run) {
        this.maxunits_per_run = maxunits_per_run;
    }

    public void setMaxunits_per_run(int maxunits_per_run) {
        updates.put(ITrade.MAXUNITS_PER_RUN, maxunits_per_run);
        this.maxunits_per_run = maxunits_per_run;
    }

    public int getJumpslowsec() {
        return this.jumpslowsec;
    }

    public void initJumpslowsec(int jumpslowsec) {
        this.jumpslowsec = jumpslowsec;
    }

    public void setJumpslowsec(int jumpslowsec) {
        updates.put(ITrade.JUMPSLOWSEC, jumpslowsec);
        this.jumpslowsec = jumpslowsec;
    }

    public int getJumpsnullsec() {
        return this.jumpsnullsec;
    }

    public void initJumpsnullsec(int jumpsnullsec) {
        this.jumpsnullsec = jumpsnullsec;
    }

    public void setJumpsnullsec(int jumpsnullsec) {
        updates.put(ITrade.JUMPSNULLSEC, jumpsnullsec);
        this.jumpsnullsec = jumpsnullsec;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
