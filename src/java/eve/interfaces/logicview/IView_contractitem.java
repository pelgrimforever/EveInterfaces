/*
 * IView_contractitem.java
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
 * View Interface IView_contractitem
 *
 * extended attributes and methods possibility:
 * view level programming is done here
 *
 * @author Franky Laseure
 */
public interface IView_contractitem extends View {

    public static byte ID = 1;
    public static byte CONTRACT = 2;
    public static byte BLUEPRINT_COPY = 3;
    public static byte INCLUDED = 4;
    public static byte QUANTITY = 5;
    public static byte EVETYPE = 6;
    public static byte MATERIAL_EFFICIENCY = 7;
    public static byte RUNS = 8;
    public static byte TIME_EFFICIENCY = 9;
    public static byte PACKAGED_VOLUME = 10;
    public static byte TYPENAME = 11;
    public static byte TYPEGROUPID = 12;
    public static byte GROUPNAME = 13;
    public static byte CATEGORYID = 14;
    public static byte CATEGORYNAME = 15;
    public static byte AVG_BUYORDER = 16;
    public static byte MIN_BUYORDER = 17;
    public static byte MAX_BUYORDER = 18;
    public static byte AVG_SELLORDER = 19;
    public static byte MIN_SELORDER = 20;
    public static byte MAX_SELORDER = 21;
    public static byte AVERAGE = 22;
    public static byte HIGHEST = 23;
    public static byte LOWEST = 24;
    public static byte ORDER_COUNT = 25;

    public static final int SIZE_ID = 19;
    public static final int SIZE_CONTRACT = 19;
    public static final int SIZE_BLUEPRINT_COPY = 1;
    public static final int SIZE_INCLUDED = 1;
    public static final int SIZE_QUANTITY = 19;
    public static final int SIZE_EVETYPE = 19;
    public static final int SIZE_MATERIAL_EFFICIENCY = 10;
    public static final int SIZE_RUNS = 10;
    public static final int SIZE_TIME_EFFICIENCY = 10;
    public static final int SIZE_PACKAGED_VOLUME = 17;
    public static final int SIZE_TYPENAME = 100;
    public static final int SIZE_TYPEGROUPID = 19;
    public static final int SIZE_GROUPNAME = 100;
    public static final int SIZE_CATEGORYID = 19;
    public static final int SIZE_CATEGORYNAME = 30;
    public static final int SIZE_AVG_BUYORDER = 17;
    public static final int SIZE_MIN_BUYORDER = 17;
    public static final int SIZE_MAX_BUYORDER = 17;
    public static final int SIZE_AVG_SELLORDER = 17;
    public static final int SIZE_MIN_SELORDER = 17;
    public static final int SIZE_MAX_SELORDER = 17;
    public static final int SIZE_AVERAGE = 17;
    public static final int SIZE_HIGHEST = 17;
    public static final int SIZE_LOWEST = 17;
    public static final int SIZE_ORDER_COUNT = 19;
    public static final String[] fieldnames = { "id", "contract", "blueprint_copy", "included", "quantity", "evetype", "material_efficiency", "runs", "time_efficiency", "packaged_volume", "typename", "typegroupid", "groupname", "categoryid", "categoryname", "avg_buyorder", "min_buyorder", "max_buyorder", "avg_sellorder", "min_selorder", "max_selorder", "average", "highest", "lowest", "order_count" };

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
     * @return contract value
     */
    public long getContract();

    /**
     * 
     * @return blueprint_copy value
     */
    public boolean getBlueprint_copy();

    /**
     * 
     * @return included value
     */
    public boolean getIncluded();

    /**
     * 
     * @return quantity value
     */
    public long getQuantity();

    /**
     * 
     * @return evetype value
     */
    public long getEvetype();

    /**
     * 
     * @return material_efficiency value
     */
    public int getMaterial_efficiency();

    /**
     * 
     * @return runs value
     */
    public int getRuns();

    /**
     * 
     * @return time_efficiency value
     */
    public int getTime_efficiency();

    /**
     * 
     * @return packaged_volume value
     */
    public double getPackaged_volume();

    /**
     * 
     * @return typename value
     */
    public java.lang.String getTypename();

    /**
     * 
     * @return typegroupid value
     */
    public long getTypegroupid();

    /**
     * 
     * @return groupname value
     */
    public java.lang.String getGroupname();

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
     * @return avg_buyorder value
     */
    public double getAvg_buyorder();

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
     * @return avg_sellorder value
     */
    public double getAvg_sellorder();

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
     * @return order_count value
     */
    public long getOrder_count();

    
//Custom code, do not change this line
//Put custom functions here

//Custom code, do not change this line
}
