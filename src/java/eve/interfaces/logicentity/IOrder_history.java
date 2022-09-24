/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
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

public interface IOrder_history extends LogicEntity {

    public IOrder_historyPK getPrimaryKey();
	
    public static short REGION = 1;
    public static short EVETYPE = 2;
    public static short DATE = 3;
    public static short AVERAGE = 4;
    public static short HIGHEST = 5;
    public static short LOWEST = 6;
    public static short VOLUME = 7;
    public static short ORDER_COUNT = 8;

    public static final int SIZE_REGION = 19;
    public static final int SIZE_EVETYPE = 19;
    public static final int SIZE_DATE = 13;
    public static final int SIZE_AVERAGE = 17;
    public static final int SIZE_HIGHEST = 17;
    public static final int SIZE_LOWEST = 17;
    public static final int SIZE_VOLUME = 10;
    public static final int SIZE_ORDER_COUNT = 10;
    public static final String[] fieldnames = { "region", "evetype", "date", "average", "highest", "lowest", "volume", "order_count" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_long, Datatypes.type_Date, Datatypes.type_double, Datatypes.type_double, Datatypes.type_double, Datatypes.type_int, Datatypes.type_int };

    public static final String[] evetypePKfields = { "evetype.id" };
    public static final String[] evetypeFKfields = { "order_history.evetype" };
    public static final String[] regionPKfields = { "region.id" };
    public static final String[] regionFKfields = { "order_history.region" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    public double getAverage();

    public void setAverage(double average);

    public double getHighest();

    public void setHighest(double highest);

    public double getLowest();

    public void setLowest(double lowest);

    public int getVolume();

    public void setVolume(int volume);

    public int getOrder_count();

    public void setOrder_count(int order_count);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
