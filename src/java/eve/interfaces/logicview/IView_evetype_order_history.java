/*
 * IView_evetype_order_history.java
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
 * View Interface IView_evetype_order_history
 *
 * extended attributes and methods possibility:
 * view level programming is done here
 *
 * @author Franky Laseure
 */
public interface IView_evetype_order_history extends View {

    public static byte EVETYPE = 1;
    public static byte DATE = 2;
    public static byte AVERAGE = 3;
    public static byte HIGHEST = 4;
    public static byte LOWEST = 5;
    public static byte VOLUME = 6;
    public static byte ORDERCOUNT = 7;

    public static final int SIZE_EVETYPE = 19;
    public static final int SIZE_DATE = 13;
    public static final int SIZE_AVERAGE = 17;
    public static final int SIZE_HIGHEST = 17;
    public static final int SIZE_LOWEST = 17;
    public static final int SIZE_VOLUME = 19;
    public static final int SIZE_ORDERCOUNT = 19;
    public static final String[] fieldnames = { "evetype", "date", "average", "highest", "lowest", "volume", "ordercount" };

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
     * @return date value
     */
    public java.sql.Date getDate();

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
    public long getVolume();

    /**
     * 
     * @return ordercount value
     */
    public long getOrdercount();

    
//Custom code, do not change this line
//Put custom functions here

//Custom code, do not change this line
}
