/*
 * IView_evetype_order_history_month.java
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
 * View Interface IView_evetype_order_history_month
 *
 * extended attributes and methods possibility:
 * view level programming is done here
 *
 * @author Franky Laseure
 */
public interface IView_evetype_order_history_month extends View {

    public static byte EVETYPE = 1;
    public static byte YEAR = 2;
    public static byte MONTH = 3;
    public static byte AVERAGE = 4;
    public static byte HIGHEST = 5;
    public static byte LOWEST = 6;
    public static byte VOLUME = 7;
    public static byte ORDERCOUNT = 8;

    public static final int SIZE_EVETYPE = 19;
    public static final int SIZE_YEAR = 10;
    public static final int SIZE_MONTH = 10;
    public static final int SIZE_AVERAGE = 17;
    public static final int SIZE_HIGHEST = 17;
    public static final int SIZE_LOWEST = 17;
    public static final int SIZE_VOLUME = 131089;
    public static final int SIZE_ORDERCOUNT = 131089;
    public static final String[] fieldnames = { "evetype", "year", "month", "average", "highest", "lowest", "volume", "ordercount" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return evetype value
     */
    public long getEvetype();

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

    
//Custom code, do not change this line
//Put custom functions here

//Custom code, do not change this line
}
