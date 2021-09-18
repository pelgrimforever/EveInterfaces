/*
 * IView_order.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 18.8.2021 11:31
 *
 */

package eve.interfaces.logicview;

import data.gis.shape.*;
import data.interfaces.db.View;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import java.awt.image.BufferedImage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * View Interface IView_order
 *
 * extended attributes and methods possibility:
 * view level programming is done here
 *
 * @author Franky Laseure
 */
public interface IView_order extends View {

    public static byte ID = 1;
    public static byte ISOPEN = 2;
    public static byte SYSTEM = 3;
    public static byte EVETYPE = 4;
    public static byte VOLUME_TOTAL = 5;
    public static byte VOLUME_REMAIN = 6;
    public static byte RANGE = 7;
    public static byte RANGE_NUMBER = 8;
    public static byte PRICE = 9;
    public static byte MIN_VOLUME = 10;
    public static byte LOCATION = 11;
    public static byte IS_BUY_ORDER = 12;
    public static byte ISSUED = 13;
    public static byte DURATION = 14;
    public static byte PAGE = 15;
    public static byte STATIONID = 16;
    public static byte STATIONNAME = 17;
    public static byte LOCATIONID = 18;
    public static byte LOCATIONNAME = 19;
    public static byte SYSTEMNAME = 20;
    public static byte CONSTELLATION = 21;
    public static byte CONSTELLATIONNAME = 22;
    public static byte REGION = 23;
    public static byte REGIONNAME = 24;
    public static byte EVETYPENAME = 25;
    public static byte PACKAGED_VOLUME = 26;

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
    public static final int SIZE_STATIONID = 19;
    public static final int SIZE_STATIONNAME = 100;
    public static final int SIZE_LOCATIONID = 19;
    public static final int SIZE_LOCATIONNAME = 100;
    public static final int SIZE_SYSTEMNAME = 30;
    public static final int SIZE_CONSTELLATION = 19;
    public static final int SIZE_CONSTELLATIONNAME = 30;
    public static final int SIZE_REGION = 19;
    public static final int SIZE_REGIONNAME = 30;
    public static final int SIZE_EVETYPENAME = 100;
    public static final int SIZE_PACKAGED_VOLUME = 17;
    public static final String[] fieldnames = { "id", "isopen", "system", "evetype", "volume_total", "volume_remain", "range", "range_number", "price", "min_volume", "location", "is_buy_order", "issued", "duration", "page", "stationid", "stationname", "locationid", "locationname", "systemname", "constellation", "constellationname", "region", "regionname", "evetypename", "packaged_volume" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return id value
     */
    public long getId();

    /**
     * 
     * @return isopen value
     */
    public boolean getIsopen();

    /**
     * 
     * @return system value
     */
    public long getSystem();

    /**
     * 
     * @return evetype value
     */
    public long getEvetype();

    /**
     * 
     * @return volume_total value
     */
    public long getVolume_total();

    /**
     * 
     * @return volume_remain value
     */
    public long getVolume_remain();

    /**
     * 
     * @return range value
     */
    public java.lang.String getRange();

    /**
     * 
     * @return range_number value
     */
    public int getRange_number();

    /**
     * 
     * @return price value
     */
    public double getPrice();

    /**
     * 
     * @return min_volume value
     */
    public int getMin_volume();

    /**
     * 
     * @return location value
     */
    public long getLocation();

    /**
     * 
     * @return is_buy_order value
     */
    public boolean getIs_buy_order();

    /**
     * 
     * @return issued value
     */
    public java.sql.Timestamp getIssued();

    /**
     * 
     * @return duration value
     */
    public int getDuration();

    /**
     * 
     * @return page value
     */
    public int getPage();

    /**
     * 
     * @return stationid value
     */
    public long getStationid();

    /**
     * 
     * @return stationname value
     */
    public java.lang.String getStationname();

    /**
     * 
     * @return locationid value
     */
    public long getLocationid();

    /**
     * 
     * @return locationname value
     */
    public java.lang.String getLocationname();

    /**
     * 
     * @return systemname value
     */
    public java.lang.String getSystemname();

    /**
     * 
     * @return constellation value
     */
    public long getConstellation();

    /**
     * 
     * @return constellationname value
     */
    public java.lang.String getConstellationname();

    /**
     * 
     * @return region value
     */
    public long getRegion();

    /**
     * 
     * @return regionname value
     */
    public java.lang.String getRegionname();

    /**
     * 
     * @return evetypename value
     */
    public java.lang.String getEvetypename();

    /**
     * 
     * @return packaged_volume value
     */
    public double getPackaged_volume();

    
//Custom code, do not change this line
//Put custom functions here

//Custom code, do not change this line
}
