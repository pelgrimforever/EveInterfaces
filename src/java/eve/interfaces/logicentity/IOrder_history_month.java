/*
 * IOrder_history_month.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 16.11.2021 15:45
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
 * Entity Interface IOrder_history_month
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface IOrder_history_month extends LogicEntity {

    public IOrder_history_monthPK getPrimaryKey();
	
    public static short REGION = 1;
    public static short EVETYPE = 2;
    public static short YEAR = 3;
    public static short MONTH = 4;
    public static short AVERAGE = 5;
    public static short HIGHEST = 6;
    public static short LOWEST = 7;
    public static short VOLUME = 8;
    public static short ORDER_COUNT = 9;

    public static final int SIZE_REGION = 19;
    public static final int SIZE_EVETYPE = 19;
    public static final int SIZE_YEAR = 10;
    public static final int SIZE_MONTH = 10;
    public static final int SIZE_AVERAGE = 17;
    public static final int SIZE_HIGHEST = 17;
    public static final int SIZE_LOWEST = 17;
    public static final int SIZE_VOLUME = 19;
    public static final int SIZE_ORDER_COUNT = 19;
    public static final String[] fieldnames = { "region", "evetype", "year", "month", "average", "highest", "lowest", "volume", "order_count" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_long, Datatypes.type_int, Datatypes.type_int, Datatypes.type_double, Datatypes.type_double, Datatypes.type_double, Datatypes.type_long, Datatypes.type_long };

    public static final String[] evetypePKfields = { "evetype.id" };
    public static final String[] evetypeFKfields = { "order_history_month.evetype" };
    public static final String[] regionPKfields = { "region.id" };
    public static final String[] regionFKfields = { "order_history_month.region" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return average value
     */
    public double getAverage();

    /**
     * set average value
     * @param average: new value
     */
    public void setAverage(double average);

    /**
     * 
     * @return highest value
     */
    public double getHighest();

    /**
     * set highest value
     * @param highest: new value
     */
    public void setHighest(double highest);

    /**
     * 
     * @return lowest value
     */
    public double getLowest();

    /**
     * set lowest value
     * @param lowest: new value
     */
    public void setLowest(double lowest);

    /**
     * 
     * @return volume value
     */
    public long getVolume();

    /**
     * set volume value
     * @param volume: new value
     */
    public void setVolume(long volume);

    /**
     * 
     * @return order_count value
     */
    public long getOrder_count();

    /**
     * set order_count value
     * @param order_count: new value
     */
    public void setOrder_count(long order_count);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
