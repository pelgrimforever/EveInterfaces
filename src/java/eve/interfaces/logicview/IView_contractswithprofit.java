/*
 * IView_contractswithprofit.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 9.5.2022 11:11
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
 * View Interface IView_contractswithprofit
 *
 * extended attributes and methods possibility:
 * view level programming is done here
 *
 * @author Franky Laseure
 */
public interface IView_contractswithprofit extends View {

    public static byte ID = 1;
    public static byte DATE_EXPIRED = 2;
    public static byte DATE_ISSUED = 3;
    public static byte DAYS_TO_COMPLETE = 4;
    public static byte END_LOCATION_ID = 5;
    public static byte PRICE = 6;
    public static byte REWARD = 7;
    public static byte START_LOCATION_ID = 8;
    public static byte NAME = 9;
    public static byte SYSTEMNAME = 10;
    public static byte REGIONNAME = 11;
    public static byte TITLE = 12;
    public static byte VOLUME = 13;
    public static byte SELLPRICE = 14;
    public static byte BUYPRICE = 15;

    public static final int SIZE_ID = 19;
    public static final int SIZE_DATE_EXPIRED = 29;
    public static final int SIZE_DATE_ISSUED = 29;
    public static final int SIZE_DAYS_TO_COMPLETE = 10;
    public static final int SIZE_END_LOCATION_ID = 19;
    public static final int SIZE_PRICE = 17;
    public static final int SIZE_REWARD = 17;
    public static final int SIZE_START_LOCATION_ID = 19;
    public static final int SIZE_NAME = 100;
    public static final int SIZE_SYSTEMNAME = 30;
    public static final int SIZE_REGIONNAME = 30;
    public static final int SIZE_TITLE = 100;
    public static final int SIZE_VOLUME = 17;
    public static final int SIZE_SELLPRICE = 17;
    public static final int SIZE_BUYPRICE = 17;
    public static final String[] fieldnames = { "id", "date_expired", "date_issued", "days_to_complete", "end_location_id", "price", "reward", "start_location_id", "name", "systemname", "regionname", "title", "volume", "sellprice", "buyprice" };

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
     * @return date_expired value
     */
    public java.sql.Timestamp getDate_expired();

    /**
     * 
     * @return date_issued value
     */
    public java.sql.Timestamp getDate_issued();

    /**
     * 
     * @return days_to_complete value
     */
    public int getDays_to_complete();

    /**
     * 
     * @return end_location_id value
     */
    public long getEnd_location_id();

    /**
     * 
     * @return price value
     */
    public double getPrice();

    /**
     * 
     * @return reward value
     */
    public double getReward();

    /**
     * 
     * @return start_location_id value
     */
    public long getStart_location_id();

    /**
     * 
     * @return name value
     */
    public java.lang.String getName();

    /**
     * 
     * @return systemname value
     */
    public java.lang.String getSystemname();

    /**
     * 
     * @return regionname value
     */
    public java.lang.String getRegionname();

    /**
     * 
     * @return title value
     */
    public java.lang.String getTitle();

    /**
     * 
     * @return volume value
     */
    public double getVolume();

    /**
     * 
     * @return sellprice value
     */
    public double getSellprice();

    /**
     * 
     * @return buyprice value
     */
    public double getBuyprice();

    
//Custom code, do not change this line
//Put custom functions here

//Custom code, do not change this line
}
