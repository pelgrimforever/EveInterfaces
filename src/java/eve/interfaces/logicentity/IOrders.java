/*
 * IOrders.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 30.10.2021 10:3
 *
 */

package eve.interfaces.logicentity;

import data.gis.shape.*;
import data.interfaces.Datatypes;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.interfaces.entity.pk.*;
import eve.entity.pk.*;
import java.awt.image.BufferedImage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Entity Interface IOrders
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface IOrders extends LogicEntity {

    public IOrdersPK getPrimaryKey();
	
    public static short ID = 1;
    public static short ISOPEN = 2;
    public static short SYSTEM = 3;
    public static short EVETYPE = 4;
    public static short VOLUME_TOTAL = 5;
    public static short VOLUME_REMAIN = 6;
    public static short RANGE = 7;
    public static short RANGE_NUMBER = 8;
    public static short PRICE = 9;
    public static short MIN_VOLUME = 10;
    public static short LOCATION = 11;
    public static short IS_BUY_ORDER = 12;
    public static short ISSUED = 13;
    public static short DURATION = 14;
    public static short PAGE = 15;

    public static final int SIZE_ID = 19;
    public static final int SIZE_ISOPEN = 1;
    public static final int SIZE_SYSTEM = 19;
    public static final int SIZE_EVETYPE = 19;
    public static final int SIZE_VOLUME_TOTAL = 19;
    public static final int SIZE_VOLUME_REMAIN = 19;
    public static final int SIZE_RANGE = 20;
    public static final int SIZE_RANGE_NUMBER = 10;
    public static final int SIZE_PRICE = 17;
    public static final int SIZE_MIN_VOLUME = 10;
    public static final int SIZE_LOCATION = 19;
    public static final int SIZE_IS_BUY_ORDER = 1;
    public static final int SIZE_ISSUED = 29;
    public static final int SIZE_DURATION = 10;
    public static final int SIZE_PAGE = 10;
    public static final String[] fieldnames = { "id", "isopen", "system", "evetype", "volume_total", "volume_remain", "range", "range_number", "price", "min_volume", "location", "is_buy_order", "issued", "duration", "page" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_boolean, Datatypes.type_long, Datatypes.type_long, Datatypes.type_long, Datatypes.type_long, Datatypes.type_String, Datatypes.type_int, Datatypes.type_double, Datatypes.type_int, Datatypes.type_long, Datatypes.type_boolean, Datatypes.type_Timestamp, Datatypes.type_int, Datatypes.type_int };

    public static final String[] evetypePKfields = { "evetype.id" };
    public static final String[] evetypeFKfields = { "orders.evetype" };
    public static final String[] systemPKfields = { "system.id" };
    public static final String[] systemFKfields = { "orders.system" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return isopen value
     */
    public boolean getIsopen();

    /**
     * set isopen value
     * @param isopen: new value
     */
    public void setIsopen(boolean isopen);

    /**
     * 
     * @return volume_total value
     */
    public long getVolume_total();

    /**
     * set volume_total value
     * @param volume_total: new value
     */
    public void setVolume_total(long volume_total);

    /**
     * 
     * @return volume_remain value
     */
    public long getVolume_remain();

    /**
     * set volume_remain value
     * @param volume_remain: new value
     */
    public void setVolume_remain(long volume_remain);

    /**
     * 
     * @return range value
     */
    public java.lang.String getRange();

    /**
     * set range value
     * @param range: new value
     */
    public void setRange(java.lang.String range);

    /**
     * 
     * @return range_number value
     */
    public int getRange_number();

    /**
     * set range_number value
     * @param range_number: new value
     */
    public void setRange_number(int range_number);

    /**
     * 
     * @return price value
     */
    public double getPrice();

    /**
     * set price value
     * @param price: new value
     */
    public void setPrice(double price);

    /**
     * 
     * @return min_volume value
     */
    public int getMin_volume();

    /**
     * set min_volume value
     * @param min_volume: new value
     */
    public void setMin_volume(int min_volume);

    /**
     * 
     * @return location value
     */
    public long getLocation();

    /**
     * set location value
     * @param location: new value
     */
    public void setLocation(long location);

    /**
     * 
     * @return is_buy_order value
     */
    public boolean getIs_buy_order();

    /**
     * set is_buy_order value
     * @param is_buy_order: new value
     */
    public void setIs_buy_order(boolean is_buy_order);

    /**
     * 
     * @return issued value
     */
    public java.sql.Timestamp getIssued();

    /**
     * set issued value
     * @param issued: new value
     */
    public void setIssued(java.sql.Timestamp issued);

    /**
     * 
     * @return duration value
     */
    public int getDuration();

    /**
     * set duration value
     * @param duration: new value
     */
    public void setDuration(int duration);

    /**
     * 
     * @return page value
     */
    public int getPage();

    /**
     * set page value
     * @param page: new value
     */
    public void setPage(int page);

    /**
     * 
     * @return foreign key evetypePK, instance of EvetypePK
     */
    public IEvetypePK getEvetypePK();

    /**
     * set foreign key evetype
     * @param evetypePK: instance of EvetypePK
     */
    public void setEvetypePK(IEvetypePK evetypePK);

    /**
     * 
     * @return foreign key systemPK, instance of SystemPK
     */
    public ISystemPK getSystemPK();

    /**
     * set foreign key system
     * @param systemPK: instance of SystemPK
     */
    public void setSystemPK(ISystemPK systemPK);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
