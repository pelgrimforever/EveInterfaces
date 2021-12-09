/*
 * IView_stocktrade_orders.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 9.11.2021 14:30
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
 * View Interface IView_stocktrade_orders
 *
 * extended attributes and methods possibility:
 * view level programming is done here
 *
 * @author Franky Laseure
 */
public interface IView_stocktrade_orders extends View {

    public static byte USERNAME = 1;
    public static byte SYSTEM = 2;
    public static byte LOCATIONID = 3;
    public static byte STATIONNAME = 4;
    public static byte LOCATIONNAME = 5;
    public static byte EVETYPEID = 6;
    public static byte EVETYPENAME = 7;
    public static byte PACKAGED_VOLUME = 8;
    public static byte MIN_VOLUME = 9;
    public static byte SELLAMOUNT = 10;

    public static final int SIZE_USERNAME = 20;
    public static final int SIZE_SYSTEM = 19;
    public static final int SIZE_LOCATIONID = 19;
    public static final int SIZE_STATIONNAME = 100;
    public static final int SIZE_LOCATIONNAME = 100;
    public static final int SIZE_EVETYPEID = 19;
    public static final int SIZE_EVETYPENAME = 100;
    public static final int SIZE_PACKAGED_VOLUME = 17;
    public static final int SIZE_MIN_VOLUME = 10;
    public static final int SIZE_SELLAMOUNT = 19;
    public static final String[] fieldnames = { "username", "system", "locationid", "stationname", "locationname", "evetypeid", "evetypename", "packaged_volume", "min_volume", "sellamount" };

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
     * @return system value
     */
    public long getSystem();

    /**
     * 
     * @return locationid value
     */
    public long getLocationid();

    /**
     * 
     * @return stationname value
     */
    public java.lang.String getStationname();

    /**
     * 
     * @return locationname value
     */
    public java.lang.String getLocationname();

    /**
     * 
     * @return evetypeid value
     */
    public long getEvetypeid();

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
     * @return min_volume value
     */
    public int getMin_volume();

    /**
     * 
     * @return sellamount value
     */
    public long getSellamount();

    
//Custom code, do not change this line
//Put custom functions here

//Custom code, do not change this line
}
