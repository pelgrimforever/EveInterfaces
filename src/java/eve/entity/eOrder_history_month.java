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
import eve.interfaces.logicentity.IOrder_history_month;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

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
        
    @Override
    public String getDbtool() {
        return eOrder_history_month.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eOrder_history_month.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eOrder_history_month() {
    }

    public eOrder_history_month(long region, long evetype, int year, int month) {
        this.order_history_monthPK = new Order_history_monthPK(region, evetype, year, month);
    }
  
    public eOrder_history_month(Order_history_monthPK order_history_monthPK) {
        this.order_history_monthPK = order_history_monthPK;
    }

    public boolean isEmpty() {
        return this.order_history_monthPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.order_history_monthPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.order_history_monthPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(IOrder_history_month.AVERAGE, average);
        updates.put(IOrder_history_month.HIGHEST, highest);
        updates.put(IOrder_history_month.LOWEST, lowest);
        updates.put(IOrder_history_month.VOLUME, volume);
        updates.put(IOrder_history_month.ORDER_COUNT, order_count);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public Order_history_monthPK getPrimaryKey() {
        return this.order_history_monthPK;
    }

    public double getAverage() {
        return this.average;
    }

    public void initAverage(double average) {
        this.average = average;
    }

    public void setAverage(double average) {
        updates.put(IOrder_history_month.AVERAGE, average);
        this.average = average;
    }

    public double getHighest() {
        return this.highest;
    }

    public void initHighest(double highest) {
        this.highest = highest;
    }

    public void setHighest(double highest) {
        updates.put(IOrder_history_month.HIGHEST, highest);
        this.highest = highest;
    }

    public double getLowest() {
        return this.lowest;
    }

    public void initLowest(double lowest) {
        this.lowest = lowest;
    }

    public void setLowest(double lowest) {
        updates.put(IOrder_history_month.LOWEST, lowest);
        this.lowest = lowest;
    }

    public long getVolume() {
        return this.volume;
    }

    public void initVolume(long volume) {
        this.volume = volume;
    }

    public void setVolume(long volume) {
        updates.put(IOrder_history_month.VOLUME, volume);
        this.volume = volume;
    }

    public long getOrder_count() {
        return this.order_count;
    }

    public void initOrder_count(long order_count) {
        this.order_count = order_count;
    }

    public void setOrder_count(long order_count) {
        updates.put(IOrder_history_month.ORDER_COUNT, order_count);
        this.order_count = order_count;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
