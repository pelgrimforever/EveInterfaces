/*
 * eOrder_history_month.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 11.4.2022 9:13
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
import eve.interfaces.logicentity.IOrder_history_month;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Order_history_month
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Order_history_month Entity
 * 
 * @author Franky Laseure
 */
public class eOrder_history_month extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected Order_history_monthPK order_history_monthPK;
    private double average;
    private double highest;
    private double lowest;
    private long volume;
    private long order_count;
	  
    public static final String table = "order_history_month";
	  
    public String getFieldname(short fieldconstant) {
        return IOrder_history_month.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IOrder_history_month.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eOrder_history_month.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eOrder_history_month.connectionpool;
    }
    
    /**
     * 
     * @return table name for Order_history_month
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Order_history_month class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Order_history_month entity
     */
    public eOrder_history_month() {
    }

    /**
     * Constructor
     * build an empty Order_history_month entity with initialized field values
     */
    public eOrder_history_month(long region, long evetype, int year, int month) {
        this.order_history_monthPK = new Order_history_monthPK(region, evetype, year, month);
    }
  
    /**
     * Constructor
     * build an empty Order_history_month entity with initialized Primarykey parameter
     * @param order_history_monthPK: Order_history_month Primarykey
     */
    public eOrder_history_month(Order_history_monthPK order_history_monthPK) {
        this.order_history_monthPK = order_history_monthPK;
    }

    /**
     * @return is Order_history_month Empty ?
     */
    public boolean isEmpty() {
        return this.order_history_monthPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.order_history_monthPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.order_history_monthPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(IOrder_history_month.AVERAGE, average);
        updates.put(IOrder_history_month.HIGHEST, highest);
        updates.put(IOrder_history_month.LOWEST, lowest);
        updates.put(IOrder_history_month.VOLUME, volume);
        updates.put(IOrder_history_month.ORDER_COUNT, order_count);
        return getAllFields();
    }
	
    /**
     * @return Order_history_monthPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return Order_history_monthPK
     */
    @Override
    public Order_history_monthPK getPrimaryKey() {
        return this.order_history_monthPK;
    }

    /**
     * 
     * @return average value
     */
    public double getAverage() {
        return this.average;
    }

    /**
     * set average value
     * @param average: new value
     */
    public void initAverage(double average) {
        this.average = average;
    }

    /**
     * set average value
     * @param average: new value
     */
    public void setAverage(double average) {
        updates.put(IOrder_history_month.AVERAGE, average);
        this.average = average;
    }

    /**
     * 
     * @return highest value
     */
    public double getHighest() {
        return this.highest;
    }

    /**
     * set highest value
     * @param highest: new value
     */
    public void initHighest(double highest) {
        this.highest = highest;
    }

    /**
     * set highest value
     * @param highest: new value
     */
    public void setHighest(double highest) {
        updates.put(IOrder_history_month.HIGHEST, highest);
        this.highest = highest;
    }

    /**
     * 
     * @return lowest value
     */
    public double getLowest() {
        return this.lowest;
    }

    /**
     * set lowest value
     * @param lowest: new value
     */
    public void initLowest(double lowest) {
        this.lowest = lowest;
    }

    /**
     * set lowest value
     * @param lowest: new value
     */
    public void setLowest(double lowest) {
        updates.put(IOrder_history_month.LOWEST, lowest);
        this.lowest = lowest;
    }

    /**
     * 
     * @return volume value
     */
    public long getVolume() {
        return this.volume;
    }

    /**
     * set volume value
     * @param volume: new value
     */
    public void initVolume(long volume) {
        this.volume = volume;
    }

    /**
     * set volume value
     * @param volume: new value
     */
    public void setVolume(long volume) {
        updates.put(IOrder_history_month.VOLUME, volume);
        this.volume = volume;
    }

    /**
     * 
     * @return order_count value
     */
    public long getOrder_count() {
        return this.order_count;
    }

    /**
     * set order_count value
     * @param order_count: new value
     */
    public void initOrder_count(long order_count) {
        this.order_count = order_count;
    }

    /**
     * set order_count value
     * @param order_count: new value
     */
    public void setOrder_count(long order_count) {
        updates.put(IOrder_history_month.ORDER_COUNT, order_count);
        this.order_count = order_count;
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
