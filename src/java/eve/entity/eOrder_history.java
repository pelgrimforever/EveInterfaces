/*
 * eOrder_history.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 12.6.2021 13:57
 *
 */

package eve.entity;

import data.interfaces.db.AbstractEntity;
import data.interfaces.db.EntityInterface;
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

/**
 * Entity class Order_history
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Order_history Entity
 * 
 * @author Franky Laseure
 */
public class eOrder_history extends AbstractEntity implements EntityInterface {

    protected Order_historyPK order_historyPK;
    private double average;
    private double highest;
    private double lowest;
    private int volume;
    private int order_count;
	  
    public static final String table = "order_history";
    public static final String SQLWhere1 = "region = :order_history.region: and evetype = :order_history.evetype: and date = :order_history.date:";
    public static final String SQLSelect1 = "select order_history.* from order_history where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from order_history where " + SQLWhere1;
    public static final String SQLSelectAll = "select order_history.* from order_history";
	  
    public String getFieldname(short fieldconstant) {
        return IOrder_history.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IOrder_history.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Order_history
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Order_history (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Order_history (=Primarykey)
     */
    public String getSQLSelect1() { return SQLSelect1; };

    /**
     * @return Select statement for Primary key, with count field as result
     * count = 1: exists
     * count = 0: not found
     */
    public String getSQLPKExcists() { return SQLSelectPKexists; };
    
    /**
     * 
     * @return SQL select statement for all Order_historys
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

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
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.order_historyPK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.order_historyPK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
        updates.put(IOrder_history.AVERAGE, average);
        updates.put(IOrder_history.HIGHEST, highest);
        updates.put(IOrder_history.LOWEST, lowest);
        updates.put(IOrder_history.VOLUME, volume);
        updates.put(IOrder_history.ORDER_COUNT, order_count);
        return getAllFields();
    }
	
    /* (non-Javadoc)
     * @see .interfaces.db.EntityInterface#getKey()
     */
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return Primary Key Object
     */
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
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
