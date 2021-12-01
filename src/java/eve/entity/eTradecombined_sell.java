/*
 * eTradecombined_sell.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 30.10.2021 10:3
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
	  
    public static final String table = "tradecombined_sell";
	  
    public String getFieldname(short fieldconstant) {
        return ITradecombined_sell.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ITradecombined_sell.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eTradecombined_sell.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eTradecombined_sell.connectionpool;
    }
    
    /**
     * 
     * @return table name for Tradecombined_sell
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Tradecombined_sell class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Tradecombined_sell entity
     */
    public eTradecombined_sell() {
    }

    /**
     * Constructor
     * build an empty Tradecombined_sell entity with initialized field values
     */
    public eTradecombined_sell(long sell_system, long buy_system, long evetype, long buy_order_id, long sell_order_id) {
        this.tradecombined_sellPK = new Tradecombined_sellPK(sell_system, buy_system, evetype, buy_order_id, sell_order_id);
    }
  
    /**
     * Constructor
     * build an empty Tradecombined_sell entity with initialized Primarykey parameter
     * @param tradecombined_sellPK: Tradecombined_sell Primarykey
     */
    public eTradecombined_sell(Tradecombined_sellPK tradecombined_sellPK) {
        this.tradecombined_sellPK = tradecombined_sellPK;
    }

    /**
     * @return is Tradecombined_sell Empty ?
     */
    public boolean isEmpty() {
        return this.tradecombined_sellPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.tradecombined_sellPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.tradecombined_sellPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(ITradecombined_sell.AMOUNT, amount);
        updates.put(ITradecombined_sell.BUY_ORDER_VALUE, buy_order_value);
        updates.put(ITradecombined_sell.SELL_ORDER_VALUE, sell_order_value);
        updates.put(ITradecombined_sell.PROFIT, profit);
        return getAllFields();
    }
	
    /**
     * @return Tradecombined_sellPK
     */
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
    public void initAmount(long amount) {
        this.amount = amount;
    }

    /**
     * set amount value
     * @param amount: new value
     */
    public void setAmount(long amount) {
        updates.put(ITradecombined_sell.AMOUNT, amount);
        this.amount = amount;
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
        updates.put(ITradecombined_sell.BUY_ORDER_VALUE, buy_order_value);
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
        updates.put(ITradecombined_sell.SELL_ORDER_VALUE, sell_order_value);
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
        updates.put(ITradecombined_sell.PROFIT, profit);
        this.profit = profit;
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
