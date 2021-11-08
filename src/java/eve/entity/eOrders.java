/*
 * eOrders.java
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
import eve.interfaces.logicentity.IOrders;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Orders
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Orders Entity
 * 
 * @author Franky Laseure
 */
public class eOrders extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected OrdersPK ordersPK;
    private EvetypePK evetypePK;
    private SystemPK systemPK;
    private boolean isopen;
    private long volume_total;
    private long volume_remain;
    private java.lang.String range;
    private int range_number;
    private double price;
    private int min_volume;
    private long location;
    private boolean is_buy_order;
    private java.sql.Timestamp issued;
    private int duration;
    private int page;
	  
    public static final String table = "orders";
	  
    public String getFieldname(short fieldconstant) {
        return IOrders.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IOrders.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eOrders.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eOrders.connectionpool;
    }
    
    /**
     * 
     * @return table name for Orders
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Orders class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Orders entity
     */
    public eOrders() {
    }

    /**
     * Constructor
     * build an empty Orders entity with initialized field values
     */
    public eOrders(long id) {
        this.ordersPK = new OrdersPK(id);
    }
  
    /**
     * Constructor
     * build an empty Orders entity with initialized Primarykey parameter
     * @param ordersPK: Orders Primarykey
     */
    public eOrders(OrdersPK ordersPK) {
        this.ordersPK = ordersPK;
    }

    /**
     * @return is Orders Empty ?
     */
    public boolean isEmpty() {
        return this.ordersPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.ordersPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.ordersPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(IOrders.EVETYPE, this.evetypePK.getId());

        updates.put(IOrders.SYSTEM, this.systemPK.getId());

        updates.put(IOrders.ISOPEN, isopen);
        updates.put(IOrders.VOLUME_TOTAL, volume_total);
        updates.put(IOrders.VOLUME_REMAIN, volume_remain);
        updates.put(IOrders.RANGE, range);
        updates.put(IOrders.RANGE_NUMBER, range_number);
        updates.put(IOrders.PRICE, price);
        updates.put(IOrders.MIN_VOLUME, min_volume);
        updates.put(IOrders.LOCATION, location);
        updates.put(IOrders.IS_BUY_ORDER, is_buy_order);
        updates.put(IOrders.ISSUED, issued);
        updates.put(IOrders.DURATION, duration);
        updates.put(IOrders.PAGE, page);
        return getAllFields();
    }
	
    /**
     * @return OrdersPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return OrdersPK
     */
    @Override
    public OrdersPK getPrimaryKey() {
        return this.ordersPK;
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
        updates.put(IOrders.ISOPEN, isopen);
        this.isopen = isopen;
    }

    /**
     * 
     * @return volume_total value
     */
    public long getVolume_total() {
        return this.volume_total;
    }

    /**
     * set volume_total value
     * @param volume_total: new value
     */
    public void initVolume_total(long volume_total) {
        this.volume_total = volume_total;
    }

    /**
     * set volume_total value
     * @param volume_total: new value
     */
    public void setVolume_total(long volume_total) {
        updates.put(IOrders.VOLUME_TOTAL, volume_total);
        this.volume_total = volume_total;
    }

    /**
     * 
     * @return volume_remain value
     */
    public long getVolume_remain() {
        return this.volume_remain;
    }

    /**
     * set volume_remain value
     * @param volume_remain: new value
     */
    public void initVolume_remain(long volume_remain) {
        this.volume_remain = volume_remain;
    }

    /**
     * set volume_remain value
     * @param volume_remain: new value
     */
    public void setVolume_remain(long volume_remain) {
        updates.put(IOrders.VOLUME_REMAIN, volume_remain);
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
            updates.put(IOrders.RANGE, range);
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
        updates.put(IOrders.RANGE_NUMBER, range_number);
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
        updates.put(IOrders.PRICE, price);
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
        updates.put(IOrders.MIN_VOLUME, min_volume);
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
        updates.put(IOrders.LOCATION, location);
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
        updates.put(IOrders.IS_BUY_ORDER, is_buy_order);
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
        updates.put(IOrders.ISSUED, issued);
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
        updates.put(IOrders.DURATION, duration);
        this.duration = duration;
    }

    /**
     * 
     * @return page value
     */
    public int getPage() {
        return this.page;
    }

    /**
     * set page value
     * @param page: new value
     */
    public void initPage(int page) {
        this.page = page;
    }

    /**
     * set page value
     * @param page: new value
     */
    public void setPage(int page) {
        updates.put(IOrders.PAGE, page);
        this.page = page;
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
                updates.put(IOrders.EVETYPE, null);
            } else {
                updates.put(IOrders.EVETYPE, evetypePK.getId());
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
                updates.put(IOrders.SYSTEM, null);
            } else {
                updates.put(IOrders.SYSTEM, systemPK.getId());
            }
        }
        this.systemPK = (SystemPK)systemPK;
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
