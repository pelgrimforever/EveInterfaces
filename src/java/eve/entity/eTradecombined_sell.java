/*
 * eTradecombined_sell.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.5.2022 11:24
 *
 */

package eve.entity;

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

import eve.eveDatabaseproperties;
import eve.entity.pk.*;
import eve.interfaces.logicentity.ITradecombined_sell;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Tradecombined_sell
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Tradecombined_sell Entity
 * 
 * @author Franky Laseure
 */
public class eTradecombined_sell extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected Tradecombined_sellPK tradecombined_sellPK;
    private long amount;
    private double buy_order_value;
    private double sell_order_value;
    private double profit;
	  
    @Override
    public String getDbtool() {
        return databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return connectionpool;
    }

    public static final String table = "tradecombined_sell";
	  
    @Override
    public String getTable() { return table; }

    @Override
    public String getClassName() { return this.getClass().getName(); };

    public String getFieldname(short fieldconstant) {
        return ITradecombined_sell.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ITradecombined_sell.fieldtypes[fieldconstant-1];
    }
        
    public eTradecombined_sell() {
    }

    public eTradecombined_sell(long sell_system, long buy_system, long evetype, long buy_order_id, long sell_order_id) {
        this.tradecombined_sellPK = new Tradecombined_sellPK(sell_system, buy_system, evetype, buy_order_id, sell_order_id);
    }
  
    public eTradecombined_sell(Tradecombined_sellPK tradecombined_sellPK) {
        this.tradecombined_sellPK = tradecombined_sellPK;
    }

    @Override
    public boolean isEmpty() {
        return this.tradecombined_sellPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.tradecombined_sellPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.tradecombined_sellPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(ITradecombined_sell.AMOUNT, amount);
        updates.put(ITradecombined_sell.BUY_ORDER_VALUE, buy_order_value);
        updates.put(ITradecombined_sell.SELL_ORDER_VALUE, sell_order_value);
        updates.put(ITradecombined_sell.PROFIT, profit);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return Tradecombined_sellPK
     */
    @Override
    public Tradecombined_sellPK getPrimaryKey() {
        return this.tradecombined_sellPK;
    }

    public long getAmount() {
        return this.amount;
    }

    public void initAmount(long amount) {
        this.amount = amount;
    }

    public void setAmount(long amount) {
        updates.put(ITradecombined_sell.AMOUNT, amount);
        this.amount = amount;
    }

    public double getBuy_order_value() {
        return this.buy_order_value;
    }

    public void initBuy_order_value(double buy_order_value) {
        this.buy_order_value = buy_order_value;
    }

    public void setBuy_order_value(double buy_order_value) {
        updates.put(ITradecombined_sell.BUY_ORDER_VALUE, buy_order_value);
        this.buy_order_value = buy_order_value;
    }

    public double getSell_order_value() {
        return this.sell_order_value;
    }

    public void initSell_order_value(double sell_order_value) {
        this.sell_order_value = sell_order_value;
    }

    public void setSell_order_value(double sell_order_value) {
        updates.put(ITradecombined_sell.SELL_ORDER_VALUE, sell_order_value);
        this.sell_order_value = sell_order_value;
    }

    public double getProfit() {
        return this.profit;
    }

    public void initProfit(double profit) {
        this.profit = profit;
    }

    public void setProfit(double profit) {
        updates.put(ITradecombined_sell.PROFIT, profit);
        this.profit = profit;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
