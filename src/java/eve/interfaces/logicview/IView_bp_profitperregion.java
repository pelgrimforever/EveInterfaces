/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
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

public interface IView_bp_profitperregion extends View {

    public static byte CATEGORYID = 1;
    public static byte CATEGORYNAME = 2;
    public static byte TYPEGROUPID = 3;
    public static byte TYPEGROUPNAME = 4;
    public static byte ID = 5;
    public static byte NAME = 6;
    public static byte ESTIMATEDPRODUCTIONCOST = 7;
    public static byte REGION = 8;
    public static byte REGIONNAME = 9;
    public static byte YEAR = 10;
    public static byte MONTH = 11;
    public static byte AVERAGE = 12;
    public static byte HIGHEST = 13;
    public static byte LOWEST = 14;
    public static byte VOLUME = 15;
    public static byte ORDERCOUNT = 16;
    public static byte PERCPROFIT = 17;

    public static final int SIZE_CATEGORYID = 19;
    public static final int SIZE_CATEGORYNAME = 30;
    public static final int SIZE_TYPEGROUPID = 19;
    public static final int SIZE_TYPEGROUPNAME = 100;
    public static final int SIZE_ID = 19;
    public static final int SIZE_NAME = 100;
    public static final int SIZE_ESTIMATEDPRODUCTIONCOST = 17;
    public static final int SIZE_REGION = 19;
    public static final int SIZE_REGIONNAME = 30;
    public static final int SIZE_YEAR = 10;
    public static final int SIZE_MONTH = 10;
    public static final int SIZE_AVERAGE = 17;
    public static final int SIZE_HIGHEST = 17;
    public static final int SIZE_LOWEST = 17;
    public static final int SIZE_VOLUME = 131089;
    public static final int SIZE_ORDERCOUNT = 131089;
    public static final int SIZE_PERCPROFIT = 17;
    public static final String[] fieldnames = { "categoryid", "categoryname", "typegroupid", "typegroupname", "id", "name", "estimatedproductioncost", "region", "regionname", "year", "month", "average", "highest", "lowest", "volume", "ordercount", "percprofit" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return categoryid value
     */
    public long getCategoryid();

    /**
     * 
     * @return categoryname value
     */
    public java.lang.String getCategoryname();

    /**
     * 
     * @return typegroupid value
     */
    public long getTypegroupid();

    /**
     * 
     * @return typegroupname value
     */
    public java.lang.String getTypegroupname();

    /**
     * 
     * @return id value
     */
    public long getId();

    /**
     * 
     * @return name value
     */
    public java.lang.String getName();

    /**
     * 
     * @return estimatedproductioncost value
     */
    public double getEstimatedproductioncost();

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
     * @return year value
     */
    public int getYear();

    /**
     * 
     * @return month value
     */
    public int getMonth();

    /**
     * 
     * @return average value
     */
    public double getAverage();

    /**
     * 
     * @return highest value
     */
    public double getHighest();

    /**
     * 
     * @return lowest value
     */
    public double getLowest();

    /**
     * 
     * @return volume value
     */
    public float getVolume();

    /**
     * 
     * @return ordercount value
     */
    public float getOrdercount();

    /**
     * 
     * @return percprofit value
     */
    public double getPercprofit();

    
//Custom code, do not change this line
//Put custom functions here

//Custom code, do not change this line
}
