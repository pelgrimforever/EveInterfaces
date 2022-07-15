/*
 * eOrder_history.java
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
	  
    @Override
    public String getDbtool() {
        return databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return connectionpool;
    }

    public static final String table = "order_history";
	  
    @Override
    public String getTable() { return table; }

    @Override
    public String getClassName() { return this.getClass().getName(); };

    public String getFieldname(short fieldconstant) {
        return IOrder_history.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IOrder_history.fieldtypes[fieldconstant-1];
    }
        
    public eOrder_history() {
    }

    public eOrder_history(long region, long evetype, java.sql.Date date) {
        this.order_historyPK = new Order_historyPK(region, evetype, date);
    }
  
    public eOrder_history(Order_historyPK order_historyPK) {
        this.order_historyPK = order_historyPK;
    }

    @Override
    public boolean isEmpty() {
        return this.order_historyPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.order_historyPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.order_historyPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(IOrder_history.AVERAGE, average);
        updates.put(IOrder_history.HIGHEST, highest);
        updates.put(IOrder_history.LOWEST, lowest);
        updates.put(IOrder_history.VOLUME, volume);
        updates.put(IOrder_history.ORDER_COUNT, order_count);
        return getAllFields();
    }
	
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

    public double getAverage() {
        return this.average;
    }

    public void initAverage(double average) {
        this.average = average;
    }

    public void setAverage(double average) {
        updates.put(IOrder_history.AVERAGE, average);
        this.average = average;
    }

    public double getHighest() {
        return this.highest;
    }

    public void initHighest(double highest) {
        this.highest = highest;
    }

    public void setHighest(double highest) {
        updates.put(IOrder_history.HIGHEST, highest);
        this.highest = highest;
    }

    public double getLowest() {
        return this.lowest;
    }

    public void initLowest(double lowest) {
        this.lowest = lowest;
    }

    public void setLowest(double lowest) {
        updates.put(IOrder_history.LOWEST, lowest);
        this.lowest = lowest;
    }

    public int getVolume() {
        return this.volume;
    }

    public void initVolume(int volume) {
        this.volume = volume;
    }

    public void setVolume(int volume) {
        updates.put(IOrder_history.VOLUME, volume);
        this.volume = volume;
    }

    public int getOrder_count() {
        return this.order_count;
    }

    public void initOrder_count(int order_count) {
        this.order_count = order_count;
    }

    public void setOrder_count(int order_count) {
        updates.put(IOrder_history.ORDER_COUNT, order_count);
        this.order_count = order_count;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
