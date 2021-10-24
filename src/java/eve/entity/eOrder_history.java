/*
 * eOrder_history.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 24.9.2021 14:40
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
import eve.interfaces.logicentity.IOrder_history;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Order_history
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Order_history Entity
 * 
 * @author Franky Laseure
 */
public class eOrder_history extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected Order_historyPK order_historyPK;
    private double average;
    private double highest;
    private double lowest;
    private int volume;
    private int order_count;
	  
    public static final String table = "order_history";
	  
    public String getFieldname(short fieldconstant) {
        return IOrder_history.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IOrder_history.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eOrder_history.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eOrder_history.connectionpool;
    }
    
    /**
     * 
     * @return table name for Order_history
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Order_history class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Order_history entity
     */
    public eOrder_history() {
    }

    /**
     * Constructor
     * build an empty Order_history entity with initialized field values
     */
    public eOrder_history(long region, long evetype, java.sql.Date date) {
        this.order_historyPK = new Order_historyPK(region, evetype, date);
    }
  
    /**
     * Constructor
     * build an empty Order_history entity with initialized Primarykey parameter
     * @param order_historyPK: Order_history Primarykey
     */
    public eOrder_history(Order_historyPK order_historyPK) {
        this.order_historyPK = order_historyPK;
    }

    /**
     * @return is Order_history Empty ?
     */
    public boolean isEmpty() {
        return this.order_historyPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.order_historyPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.order_historyPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(IOrder_history.AVERAGE, average);
        updates.put(IOrder_history.HIGHEST, highest);
        updates.put(IOrder_history.LOWEST, lowest);
        updates.put(IOrder_history.VOLUME, volume);
        updates.put(IOrder_history.ORDER_COUNT, order_count);
        return getAllFields();
    }
	
    /**
     * @return Order_historyPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return Order_historyPK
     */
    @Override
    public Order_historyPK getPrimaryKey() {
        return this.order_historyPK;
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
        updates.put(IOrder_history.AVERAGE, average);
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
        updates.put(IOrder_history.HIGHEST, highest);
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
        updates.put(IOrder_history.LOWEST, lowest);
        this.lowest = lowest;
    }

    /**
     * 
     * @return volume value
     */
    public int getVolume() {
        return this.volume;
    }

    /**
     * set volume value
     * @param volume: new value
     */
    public void initVolume(int volume) {
        this.volume = volume;
    }

    /**
     * set volume value
     * @param volume: new value
     */
    public void setVolume(int volume) {
        updates.put(IOrder_history.VOLUME, volume);
        this.volume = volume;
    }

    /**
     * 
     * @return order_count value
     */
    public int getOrder_count() {
        return this.order_count;
    }

    /**
     * set order_count value
     * @param order_count: new value
     */
    public void initOrder_count(int order_count) {
        this.order_count = order_count;
    }

    /**
     * set order_count value
     * @param order_count: new value
     */
    public void setOrder_count(int order_count) {
        updates.put(IOrder_history.ORDER_COUNT, order_count);
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
