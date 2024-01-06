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
import eve.interfaces.logicentity.IOrders;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

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
        
    @Override
    public String getDbtool() {
        return eOrders.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eOrders.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eOrders() {
    }

    public eOrders(long id) {
        this.ordersPK = new OrdersPK(id);
    }
  
    public eOrders(OrdersPK ordersPK) {
        this.ordersPK = ordersPK;
    }

    public boolean isEmpty() {
        return this.ordersPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.ordersPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.ordersPK.getPrimarykeyvalues();	  
    }
  
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
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public OrdersPK getPrimaryKey() {
        return this.ordersPK;
    }

    public boolean getIsopen() {
        return this.isopen;
    }

    public void initIsopen(boolean isopen) {
        this.isopen = isopen;
    }

    public void setIsopen(boolean isopen) {
        updates.put(IOrders.ISOPEN, isopen);
        this.isopen = isopen;
    }

    public long getVolume_total() {
        return this.volume_total;
    }

    public void initVolume_total(long volume_total) {
        this.volume_total = volume_total;
    }

    public void setVolume_total(long volume_total) {
        updates.put(IOrders.VOLUME_TOTAL, volume_total);
        this.volume_total = volume_total;
    }

    public long getVolume_remain() {
        return this.volume_remain;
    }

    public void initVolume_remain(long volume_remain) {
        this.volume_remain = volume_remain;
    }

    public void setVolume_remain(long volume_remain) {
        updates.put(IOrders.VOLUME_REMAIN, volume_remain);
        this.volume_remain = volume_remain;
    }

    public java.lang.String getRange() {
        return this.range;
    }

    public void initRange(java.lang.String range) {
        this.range = range;
    }

    public void setRange(java.lang.String range) {
	if(range==null && range!=this.range || range!=null && !range.equals(this.range)) {
            updates.put(IOrders.RANGE, range);
        }
        this.range = range;
    }

    public int getRange_number() {
        return this.range_number;
    }

    public void initRange_number(int range_number) {
        this.range_number = range_number;
    }

    public void setRange_number(int range_number) {
        updates.put(IOrders.RANGE_NUMBER, range_number);
        this.range_number = range_number;
    }

    public double getPrice() {
        return this.price;
    }

    public void initPrice(double price) {
        this.price = price;
    }

    public void setPrice(double price) {
        updates.put(IOrders.PRICE, price);
        this.price = price;
    }

    public int getMin_volume() {
        return this.min_volume;
    }

    public void initMin_volume(int min_volume) {
        this.min_volume = min_volume;
    }

    public void setMin_volume(int min_volume) {
        updates.put(IOrders.MIN_VOLUME, min_volume);
        this.min_volume = min_volume;
    }

    public long getLocation() {
        return this.location;
    }

    public void initLocation(long location) {
        this.location = location;
    }

    public void setLocation(long location) {
        updates.put(IOrders.LOCATION, location);
        this.location = location;
    }

    public boolean getIs_buy_order() {
        return this.is_buy_order;
    }

    public void initIs_buy_order(boolean is_buy_order) {
        this.is_buy_order = is_buy_order;
    }

    public void setIs_buy_order(boolean is_buy_order) {
        updates.put(IOrders.IS_BUY_ORDER, is_buy_order);
        this.is_buy_order = is_buy_order;
    }

    public java.sql.Timestamp getIssued() {
        return this.issued;
    }

    public void initIssued(java.sql.Timestamp issued) {
        this.issued = issued;
    }

    public void setIssued(java.sql.Timestamp issued) {
        updates.put(IOrders.ISSUED, issued);
        this.issued = issued;
    }

    public int getDuration() {
        return this.duration;
    }

    public void initDuration(int duration) {
        this.duration = duration;
    }

    public void setDuration(int duration) {
        updates.put(IOrders.DURATION, duration);
        this.duration = duration;
    }

    public int getPage() {
        return this.page;
    }

    public void initPage(int page) {
        this.page = page;
    }

    public void setPage(int page) {
        updates.put(IOrders.PAGE, page);
        this.page = page;
    }

    public EvetypePK getEvetypePK() {
        return this.evetypePK;
    }

    public void initEvetypePK(IEvetypePK evetypePK) {
        this.evetypePK = (EvetypePK)evetypePK;
    }

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

    public SystemPK getSystemPK() {
        return this.systemPK;
    }

    public void initSystemPK(ISystemPK systemPK) {
        this.systemPK = (SystemPK)systemPK;
    }

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

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
