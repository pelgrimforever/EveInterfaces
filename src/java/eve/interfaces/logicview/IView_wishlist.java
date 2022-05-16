/*
 * IView_wishlist.java
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
 * View Interface IView_wishlist
 *
 * extended attributes and methods possibility:
 * view level programming is done here
 *
 * @author Franky Laseure
 */
public interface IView_wishlist extends View {

    public static byte USERNAME = 1;
    public static byte MAXPRICE = 2;
    public static byte ID = 3;
    public static byte NAME = 4;
    public static byte TYPEGROUP = 5;
    public static byte PUBLISHED = 6;
    public static byte DESCRIPTION = 7;
    public static byte CAPACITY = 8;
    public static byte GRAPHIC = 9;
    public static byte ICON = 10;
    public static byte MARKET_GROUP = 11;
    public static byte MASS = 12;
    public static byte PACKAGED_VOLUME = 13;
    public static byte PORTION_SIZE = 14;
    public static byte RADIUS = 15;
    public static byte VOLUME = 16;
    public static byte AVG_BUYORDER = 17;
    public static byte AVG_SELLORDER = 18;
    public static byte MIN_BUYORDER = 19;
    public static byte MAX_BUYORDER = 20;
    public static byte MIN_SELORDER = 21;
    public static byte MAX_SELORDER = 22;

    public static final int SIZE_USERNAME = 20;
    public static final int SIZE_MAXPRICE = 17;
    public static final int SIZE_ID = 19;
    public static final int SIZE_NAME = 100;
    public static final int SIZE_TYPEGROUP = 19;
    public static final int SIZE_PUBLISHED = 1;
    public static final int SIZE_DESCRIPTION = 2147483647;
    public static final int SIZE_CAPACITY = 17;
    public static final int SIZE_GRAPHIC = 19;
    public static final int SIZE_ICON = 19;
    public static final int SIZE_MARKET_GROUP = 19;
    public static final int SIZE_MASS = 17;
    public static final int SIZE_PACKAGED_VOLUME = 17;
    public static final int SIZE_PORTION_SIZE = 10;
    public static final int SIZE_RADIUS = 17;
    public static final int SIZE_VOLUME = 17;
    public static final int SIZE_AVG_BUYORDER = 17;
    public static final int SIZE_AVG_SELLORDER = 17;
    public static final int SIZE_MIN_BUYORDER = 17;
    public static final int SIZE_MAX_BUYORDER = 17;
    public static final int SIZE_MIN_SELORDER = 17;
    public static final int SIZE_MAX_SELORDER = 17;
    public static final String[] fieldnames = { "username", "maxprice", "id", "name", "typegroup", "published", "description", "capacity", "graphic", "icon", "market_group", "mass", "packaged_volume", "portion_size", "radius", "volume", "avg_buyorder", "avg_sellorder", "min_buyorder", "max_buyorder", "min_selorder", "max_selorder" };

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
     * @return maxprice value
     */
    public double getMaxprice();

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
     * @return typegroup value
     */
    public long getTypegroup();

    /**
     * 
     * @return published value
     */
    public boolean getPublished();

    /**
     * 
     * @return description value
     */
    public java.lang.String getDescription();

    /**
     * 
     * @return capacity value
     */
    public double getCapacity();

    /**
     * 
     * @return graphic value
     */
    public long getGraphic();

    /**
     * 
     * @return icon value
     */
    public long getIcon();

    /**
     * 
     * @return market_group value
     */
    public long getMarket_group();

    /**
     * 
     * @return mass value
     */
    public double getMass();

    /**
     * 
     * @return packaged_volume value
     */
    public double getPackaged_volume();

    /**
     * 
     * @return portion_size value
     */
    public int getPortion_size();

    /**
     * 
     * @return radius value
     */
    public double getRadius();

    /**
     * 
     * @return volume value
     */
    public double getVolume();

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

    /**
     * 
     * @return min_buyorder value
     */
    public double getMin_buyorder();

    /**
     * 
     * @return max_buyorder value
     */
    public double getMax_buyorder();

    /**
     * 
     * @return min_selorder value
     */
    public double getMin_selorder();

    /**
     * 
     * @return max_selorder value
     */
    public double getMax_selorder();

    
//Custom code, do not change this line
//Put custom functions here

//Custom code, do not change this line
}
