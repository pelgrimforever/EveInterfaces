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

public interface IOrders extends LogicEntity {

    public IOrdersPK getPrimaryKey();
	
    public static short ID = 1;
    public static short ISOPEN = 2;
    public static short SYSTEM = 3;
    public static short EVETYPE = 4;
    public static short VOLUME_TOTAL = 5;
    public static short VOLUME_REMAIN = 6;
    public static short RANGE = 7;
    public static short RANGE_NUMBER = 8;
    public static short PRICE = 9;
    public static short MIN_VOLUME = 10;
    public static short LOCATION = 11;
    public static short IS_BUY_ORDER = 12;
    public static short ISSUED = 13;
    public static short DURATION = 14;
    public static short PAGE = 15;

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
    public static final String[] fieldnames = { "id", "isopen", "system", "evetype", "volume_total", "volume_remain", "range", "range_number", "price", "min_volume", "location", "is_buy_order", "issued", "duration", "page" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_boolean, Datatypes.type_long, Datatypes.type_long, Datatypes.type_long, Datatypes.type_long, Datatypes.type_String, Datatypes.type_int, Datatypes.type_double, Datatypes.type_int, Datatypes.type_long, Datatypes.type_boolean, Datatypes.type_Timestamp, Datatypes.type_int, Datatypes.type_int };

    public static final String[] evetypePKfields = { "evetype.id" };
    public static final String[] evetypeFKfields = { "orders.evetype" };
    public static final String[] systemPKfields = { "system.id" };
    public static final String[] systemFKfields = { "orders.system" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    public boolean getIsopen();

    public void setIsopen(boolean isopen);

    public long getVolume_total();

    public void setVolume_total(long volume_total);

    public long getVolume_remain();

    public void setVolume_remain(long volume_remain);

    public java.lang.String getRange();

    public void setRange(java.lang.String range);

    public int getRange_number();

    public void setRange_number(int range_number);

    public double getPrice();

    public void setPrice(double price);

    public int getMin_volume();

    public void setMin_volume(int min_volume);

    public long getLocation();

    public void setLocation(long location);

    public boolean getIs_buy_order();

    public void setIs_buy_order(boolean is_buy_order);

    public java.sql.Timestamp getIssued();

    public void setIssued(java.sql.Timestamp issued);

    public int getDuration();

    public void setDuration(int duration);

    public int getPage();

    public void setPage(int page);

    public IEvetypePK getEvetypePK();

    public void setEvetypePK(IEvetypePK evetypePK);

    public ISystemPK getSystemPK();

    public void setSystemPK(ISystemPK systemPK);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
