/*
 * eOrder_hist.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.5.2021 13:35
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
import eve.interfaces.logicentity.IOrder_hist;
import eve.interfaces.entity.pk.*;

/**
 * Entity class Order_hist
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Order_hist Entity
 * 
 * @author Franky Laseure
 */
public class eOrder_hist extends AbstractEntity implements EntityInterface {

    protected Order_histPK order_histPK;
    private EvetypePK evetypePK;
    private SystemPK systemPK;
    private boolean isopen;
    private int volume_total;
    private int volume_remain;
    private java.lang.String range;
    private int range_number;
    private double price;
    private int min_volume;
    private long location;
    private boolean is_buy_order;
    private java.sql.Timestamp issued;
    private int duration;
	  
    public static final String table = "order_hist";
    public static final String SQLWhere1 = "id = :order_hist.id:";
    public static final String SQLSelect1 = "select order_hist.* from order_hist where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from order_hist where " + SQLWhere1;
    public static final String SQLSelectAll = "select order_hist.* from order_hist";
	  
    public String getFieldname(short fieldconstant) {
        return IOrder_hist.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IOrder_hist.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Order_hist
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Order_hist (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Order_hist (=Primarykey)
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
     * @return SQL select statement for all Order_hists
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

    /**
     * 
     * @return Order_hist class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Order_hist entity
     */
    public eOrder_hist() {
    }

    /**
     * Constructor
     * build an empty Order_hist entity with initialized field values
     */
    public eOrder_hist(long id) {
        this.order_histPK = new Order_histPK(id);
    }
  
    /**
     * Constructor
     * build an empty Order_hist entity with initialized Primarykey parameter
     * @param order_histPK: Order_hist Primarykey
     */
    public eOrder_hist(Order_histPK order_histPK) {
        this.order_histPK = order_histPK;
    }

    /**
     * @return is Order_hist Empty ?
     */
    public boolean isEmpty() {
        return this.order_histPK == null;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.order_histPK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.order_histPK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
        updates.put(IOrder_hist.EVETYPE, this.evetypePK.getId());

        updates.put(IOrder_hist.SYSTEM, this.systemPK.getId());

        updates.put(IOrder_hist.ISOPEN, isopen);
        updates.put(IOrder_hist.VOLUME_TOTAL, volume_total);
        updates.put(IOrder_hist.VOLUME_REMAIN, volume_remain);
        updates.put(IOrder_hist.RANGE, range);
        updates.put(IOrder_hist.RANGE_NUMBER, range_number);
        updates.put(IOrder_hist.PRICE, price);
        updates.put(IOrder_hist.MIN_VOLUME, min_volume);
        updates.put(IOrder_hist.LOCATION, location);
        updates.put(IOrder_hist.IS_BUY_ORDER, is_buy_order);
        updates.put(IOrder_hist.ISSUED, issued);
        updates.put(IOrder_hist.DURATION, duration);
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
    public Order_histPK getPrimaryKey() {
        return this.order_histPK;
    }

    /**
     * 
     * @return isopen value
     */
    public boolean getIsopen() {
        return this.isopen;
    }

    /**
     * set isopen value
     * @param isopen: new value
     */
    public void initIsopen(boolean isopen) {
        this.isopen = isopen;
    }

    /**
     * set isopen value
     * @param isopen: new value
     */
    public void setIsopen(boolean isopen) {
        updates.put(IOrder_hist.ISOPEN, isopen);
        this.isopen = isopen;
    }

    /**
     * 
     * @return volume_total value
     */
    public int getVolume_total() {
        return this.volume_total;
    }

    /**
     * set volume_total value
     * @param volume_total: new value
     */
    public void initVolume_total(int volume_total) {
        this.volume_total = volume_total;
    }

    /**
     * set volume_total value
     * @param volume_total: new value
     */
    public void setVolume_total(int volume_total) {
        updates.put(IOrder_hist.VOLUME_TOTAL, volume_total);
        this.volume_total = volume_total;
    }

    /**
     * 
     * @return volume_remain value
     */
    public int getVolume_remain() {
        return this.volume_remain;
    }

    /**
     * set volume_remain value
     * @param volume_remain: new value
     */
    public void initVolume_remain(int volume_remain) {
        this.volume_remain = volume_remain;
    }

    /**
     * set volume_remain value
     * @param volume_remain: new value
     */
    public void setVolume_remain(int volume_remain) {
        updates.put(IOrder_hist.VOLUME_REMAIN, volume_remain);
        this.volume_remain = volume_remain;
    }

    /**
     * 
     * @return range value
     */
    public java.lang.String getRange() {
        return this.range;
    }

    /**
     * set range value
     * @param range: new value
     */
    public void initRange(java.lang.String range) {
        this.range = range;
    }

    /**
     * set range value
     * @param range: new value
     */
    public void setRange(java.lang.String range) {
	if(range==null && range!=this.range || range!=null && !range.equals(this.range)) {
            updates.put(IOrder_hist.RANGE, range);
        }
        this.range = range;
    }

    /**
     * 
     * @return range_number value
     */
    public int getRange_number() {
        return this.range_number;
    }

    /**
     * set range_number value
     * @param range_number: new value
     */
    public void initRange_number(int range_number) {
        this.range_number = range_number;
    }

    /**
     * set range_number value
     * @param range_number: new value
     */
    public void setRange_number(int range_number) {
        updates.put(IOrder_hist.RANGE_NUMBER, range_number);
        this.range_number = range_number;
    }

    /**
     * 
     * @return price value
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * set price value
     * @param price: new value
     */
    public void initPrice(double price) {
        this.price = price;
    }

    /**
     * set price value
     * @param price: new value
     */
    public void setPrice(double price) {
        updates.put(IOrder_hist.PRICE, price);
        this.price = price;
    }

    /**
     * 
     * @return min_volume value
     */
    public int getMin_volume() {
        return this.min_volume;
    }

    /**
     * set min_volume value
     * @param min_volume: new value
     */
    public void initMin_volume(int min_volume) {
        this.min_volume = min_volume;
    }

    /**
     * set min_volume value
     * @param min_volume: new value
     */
    public void setMin_volume(int min_volume) {
        updates.put(IOrder_hist.MIN_VOLUME, min_volume);
        this.min_volume = min_volume;
    }

    /**
     * 
     * @return location value
     */
    public long getLocation() {
        return this.location;
    }

    /**
     * set location value
     * @param location: new value
     */
    public void initLocation(long location) {
        this.location = location;
    }

    /**
     * set location value
     * @param location: new value
     */
    public void setLocation(long location) {
        updates.put(IOrder_hist.LOCATION, location);
        this.location = location;
    }

    /**
     * 
     * @return is_buy_order value
     */
    public boolean getIs_buy_order() {
        return this.is_buy_order;
    }

    /**
     * set is_buy_order value
     * @param is_buy_order: new value
     */
    public void initIs_buy_order(boolean is_buy_order) {
        this.is_buy_order = is_buy_order;
    }

    /**
     * set is_buy_order value
     * @param is_buy_order: new value
     */
    public void setIs_buy_order(boolean is_buy_order) {
        updates.put(IOrder_hist.IS_BUY_ORDER, is_buy_order);
        this.is_buy_order = is_buy_order;
    }

    /**
     * 
     * @return issued value
     */
    public java.sql.Timestamp getIssued() {
        return this.issued;
    }

    /**
     * set issued value
     * @param issued: new value
     */
    public void initIssued(java.sql.Timestamp issued) {
        this.issued = issued;
    }

    /**
     * set issued value
     * @param issued: new value
     */
    public void setIssued(java.sql.Timestamp issued) {
        updates.put(IOrder_hist.ISSUED, issued);
        this.issued = issued;
    }

    /**
     * 
     * @return duration value
     */
    public int getDuration() {
        return this.duration;
    }

    /**
     * set duration value
     * @param duration: new value
     */
    public void initDuration(int duration) {
        this.duration = duration;
    }

    /**
     * set duration value
     * @param duration: new value
     */
    public void setDuration(int duration) {
        updates.put(IOrder_hist.DURATION, duration);
        this.duration = duration;
    }

    /**
     * 
     * @return foreign key evetypePK, instance of EvetypePK
     */
    public EvetypePK getEvetypePK() {
        return this.evetypePK;
    }

    /**
     * set foreign key evetype
     * @param evetypePK: instance of EvetypePK
     */
    public void initEvetypePK(IEvetypePK evetypePK) {
        this.evetypePK = (EvetypePK)evetypePK;
    }

    /**
     * set foreign key evetype
     * @param evetypePK: instance of EvetypePK
     */
    public void setEvetypePK(IEvetypePK evetypePK) {
	if(evetypePK==null && evetypePK!=this.evetypePK || evetypePK!=null) {
            if(evetypePK==null) {
                updates.put(IOrder_hist.EVETYPE, null);
            } else {
                updates.put(IOrder_hist.EVETYPE, evetypePK.getId());
            }
        }
        this.evetypePK = (EvetypePK)evetypePK;
    }

    /**
     * 
     * @return foreign key systemPK, instance of SystemPK
     */
    public SystemPK getSystemPK() {
        return this.systemPK;
    }

    /**
     * set foreign key system
     * @param systemPK: instance of SystemPK
     */
    public void initSystemPK(ISystemPK systemPK) {
        this.systemPK = (SystemPK)systemPK;
    }

    /**
     * set foreign key system
     * @param systemPK: instance of SystemPK
     */
    public void setSystemPK(ISystemPK systemPK) {
	if(systemPK==null && systemPK!=this.systemPK || systemPK!=null) {
            if(systemPK==null) {
                updates.put(IOrder_hist.SYSTEM, null);
            } else {
                updates.put(IOrder_hist.SYSTEM, systemPK.getId());
            }
        }
        this.systemPK = (SystemPK)systemPK;
    }

    /**
     * 
     * @return Primarykey string value
     */
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
