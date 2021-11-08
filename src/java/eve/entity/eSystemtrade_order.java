/*
 * eSystemtrade_order.java
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
import eve.interfaces.logicentity.ISystemtrade_order;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Systemtrade_order
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Systemtrade_order Entity
 * 
 * @author Franky Laseure
 */
public class eSystemtrade_order extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected Systemtrade_orderPK systemtrade_orderPK;
    private long amount;
    private double sellprice;
    private double buyprice;
    private double profit;
    private double cargovolume;
	  
    public static final String table = "systemtrade_order";
	  
    public String getFieldname(short fieldconstant) {
        return ISystemtrade_order.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ISystemtrade_order.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eSystemtrade_order.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eSystemtrade_order.connectionpool;
    }
    
    /**
     * 
     * @return table name for Systemtrade_order
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Systemtrade_order class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Systemtrade_order entity
     */
    public eSystemtrade_order() {
    }

    /**
     * Constructor
     * build an empty Systemtrade_order entity with initialized field values
     */
    public eSystemtrade_order(long sell_system, long buy_system, long sell_order, long buy_order) {
        this.systemtrade_orderPK = new Systemtrade_orderPK(sell_system, buy_system, sell_order, buy_order);
    }
  
    /**
     * Constructor
     * build an empty Systemtrade_order entity with initialized Primarykey parameter
     * @param systemtrade_orderPK: Systemtrade_order Primarykey
     */
    public eSystemtrade_order(Systemtrade_orderPK systemtrade_orderPK) {
        this.systemtrade_orderPK = systemtrade_orderPK;
    }

    /**
     * @return is Systemtrade_order Empty ?
     */
    public boolean isEmpty() {
        return this.systemtrade_orderPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.systemtrade_orderPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.systemtrade_orderPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(ISystemtrade_order.AMOUNT, amount);
        updates.put(ISystemtrade_order.SELLPRICE, sellprice);
        updates.put(ISystemtrade_order.BUYPRICE, buyprice);
        updates.put(ISystemtrade_order.PROFIT, profit);
        updates.put(ISystemtrade_order.CARGOVOLUME, cargovolume);
        return getAllFields();
    }
	
    /**
     * @return Systemtrade_orderPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return Systemtrade_orderPK
     */
    @Override
    public Systemtrade_orderPK getPrimaryKey() {
        return this.systemtrade_orderPK;
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
        updates.put(ISystemtrade_order.AMOUNT, amount);
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
    public void initSellprice(double sellprice) {
        this.sellprice = sellprice;
    }

    /**
     * set sellprice value
     * @param sellprice: new value
     */
    public void setSellprice(double sellprice) {
        updates.put(ISystemtrade_order.SELLPRICE, sellprice);
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
    public void initBuyprice(double buyprice) {
        this.buyprice = buyprice;
    }

    /**
     * set buyprice value
     * @param buyprice: new value
     */
    public void setBuyprice(double buyprice) {
        updates.put(ISystemtrade_order.BUYPRICE, buyprice);
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
    public void initProfit(double profit) {
        this.profit = profit;
    }

    /**
     * set profit value
     * @param profit: new value
     */
    public void setProfit(double profit) {
        updates.put(ISystemtrade_order.PROFIT, profit);
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
    public void initCargovolume(double cargovolume) {
        this.cargovolume = cargovolume;
    }

    /**
     * set cargovolume value
     * @param cargovolume: new value
     */
    public void setCargovolume(double cargovolume) {
        updates.put(ISystemtrade_order.CARGOVOLUME, cargovolume);
        this.cargovolume = cargovolume;
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
