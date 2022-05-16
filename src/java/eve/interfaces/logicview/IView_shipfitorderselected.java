/*
 * IView_shipfitorderselected.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 11.4.2022 9:13
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
 * View Interface IView_shipfitorderselected
 *
 * extended attributes and methods possibility:
 * view level programming is done here
 *
 * @author Franky Laseure
 */
public interface IView_shipfitorderselected extends View {

    public static byte USERNAME = 1;
    public static byte SHIPNAME = 2;
    public static byte AMOUNTNEEDED = 3;
    public static byte ID = 4;
    public static byte ISOPEN = 5;
    public static byte SYSTEM = 6;
    public static byte EVETYPE = 7;
    public static byte VOLUME_TOTAL = 8;
    public static byte VOLUME_REMAIN = 9;
    public static byte RANGE = 10;
    public static byte RANGE_NUMBER = 11;
    public static byte PRICE = 12;
    public static byte MIN_VOLUME = 13;
    public static byte LOCATION = 14;
    public static byte IS_BUY_ORDER = 15;
    public static byte ISSUED = 16;
    public static byte DURATION = 17;
    public static byte PAGE = 18;
    public static byte STATIONID = 19;
    public static byte STATIONNAME = 20;
    public static byte LOCATIONID = 21;
    public static byte LOCATIONNAME = 22;
    public static byte SYSTEMNAME = 23;
    public static byte SECURITY_STATUS = 24;
    public static byte CONSTELLATION = 25;
    public static byte CONSTELLATIONNAME = 26;
    public static byte REGION = 27;
    public static byte REGIONNAME = 28;
    public static byte EVETYPENAME = 29;
    public static byte PACKAGED_VOLUME = 30;
    public static byte AVG_BUYORDER = 31;
    public static byte AVG_SELLORDER = 32;

    public static final int SIZE_USERNAME = 20;
    public static final int SIZE_SHIPNAME = 50;
    public static final int SIZE_AMOUNTNEEDED = 10;
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
    public static final int SIZE_SECURITY_STATUS = 17;
    public static final int SIZE_CONSTELLATION = 19;
    public static final int SIZE_CONSTELLATIONNAME = 30;
    public static final int SIZE_REGION = 19;
    public static final int SIZE_REGIONNAME = 30;
    public static final int SIZE_EVETYPENAME = 100;
    public static final int SIZE_PACKAGED_VOLUME = 17;
    public static final int SIZE_AVG_BUYORDER = 17;
    public static final int SIZE_AVG_SELLORDER = 17;
    public static final String[] fieldnames = { "username", "shipname", "amountneeded", "id", "isopen", "system", "evetype", "volume_total", "volume_remain", "range", "range_number", "price", "min_volume", "location", "is_buy_order", "issued", "duration", "page", "stationid", "stationname", "locationid", "locationname", "systemname", "security_status", "constellation", "constellationname", "region", "regionname", "evetypename", "packaged_volume", "avg_buyorder", "avg_sellorder" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return username value
     */
    public java.lang.String getUsername();

    /**
     * 
     * @return shipname value
     */
    public java.lang.String getShipname();

    /**
     * 
     * @return amountneeded value
     */
    public int getAmountneeded();

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
     * @return security_status value
     */
    public double getSecurity_status();

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

    /**
     * 
     * @return avg_buyorder value
     */
    public double getAvg_buyorder();

    /**
     * 
     * @return avg_sellorder value
     */
    public double getAvg_sellorder();

    
//Custom code, do not change this line
//Put custom functions here

//Custom code, do not change this line
}
