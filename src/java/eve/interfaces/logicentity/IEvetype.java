/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
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

public interface IEvetype extends LogicEntity {

    public IEvetypePK getPrimaryKey();
	
    public static short ID = 1;
    public static short NAME = 2;
    public static short TYPEGROUP = 3;
    public static short PUBLISHED = 4;
    public static short DESCRIPTION = 5;
    public static short CAPACITY = 6;
    public static short GRAPHIC = 7;
    public static short ICON = 8;
    public static short MARKET_GROUP = 9;
    public static short MASS = 10;
    public static short PACKAGED_VOLUME = 11;
    public static short PORTION_SIZE = 12;
    public static short RADIUS = 13;
    public static short VOLUME = 14;
    public static short AVG_BUYORDER = 15;
    public static short AVG_SELLORDER = 16;
    public static short MIN_BUYORDER = 17;
    public static short MAX_BUYORDER = 18;
    public static short MIN_SELORDER = 19;
    public static short MAX_SELORDER = 20;
    public static short AVERAGE = 21;
    public static short HIGHEST = 22;
    public static short LOWEST = 23;
    public static short ORDER_COUNT = 24;
    public static short CONFIGUREDBP = 25;
    public static short ESTIMATEDPRODUCTIONCOST = 26;

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
    public static final int SIZE_AVERAGE = 17;
    public static final int SIZE_HIGHEST = 17;
    public static final int SIZE_LOWEST = 17;
    public static final int SIZE_ORDER_COUNT = 19;
    public static final int SIZE_CONFIGUREDBP = 1;
    public static final int SIZE_ESTIMATEDPRODUCTIONCOST = 17;
    public static final String[] fieldnames = { "id", "name", "typegroup", "published", "description", "capacity", "graphic", "icon", "market_group", "mass", "packaged_volume", "portion_size", "radius", "volume", "avg_buyorder", "avg_sellorder", "min_buyorder", "max_buyorder", "min_selorder", "max_selorder", "average", "highest", "lowest", "order_count", "configuredbp", "estimatedproductioncost" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_String, Datatypes.type_long, Datatypes.type_boolean, Datatypes.type_String, Datatypes.type_double, Datatypes.type_long, Datatypes.type_long, Datatypes.type_long, Datatypes.type_double, Datatypes.type_double, Datatypes.type_int, Datatypes.type_double, Datatypes.type_double, Datatypes.type_double, Datatypes.type_double, Datatypes.type_double, Datatypes.type_double, Datatypes.type_double, Datatypes.type_double, Datatypes.type_double, Datatypes.type_double, Datatypes.type_double, Datatypes.type_long, Datatypes.type_boolean, Datatypes.type_double };

    public static final String[] market_groupPKfields = { "market_group.id" };
    public static final String[] market_groupFKfields = { "evetype.market_group" };
    public static final String[] typegroupPKfields = { "typegroup.id" };
    public static final String[] typegroupFKfields = { "evetype.typegroup" };
    public static final String[] graphicPKfields = { "graphic.id" };
    public static final String[] graphicFKfields = { "evetype.graphic" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    public java.lang.String getName();

    public void setName(java.lang.String name);

    public boolean getPublished();

    public void setPublished(boolean published);

    public java.lang.String getDescription();

    public void setDescription(java.lang.String description);

    public double getCapacity();

    public void setCapacity(double capacity);

    public long getIcon();

    public void setIcon(long icon);

    public double getMass();

    public void setMass(double mass);

    public double getPackaged_volume();

    public void setPackaged_volume(double packaged_volume);

    public int getPortion_size();

    public void setPortion_size(int portion_size);

    public double getRadius();

    public void setRadius(double radius);

    public double getVolume();

    public void setVolume(double volume);

    public double getAvg_buyorder();

    public void setAvg_buyorder(double avg_buyorder);

    public double getAvg_sellorder();

    public void setAvg_sellorder(double avg_sellorder);

    public double getMin_buyorder();

    public void setMin_buyorder(double min_buyorder);

    public double getMax_buyorder();

    public void setMax_buyorder(double max_buyorder);

    public double getMin_selorder();

    public void setMin_selorder(double min_selorder);

    public double getMax_selorder();

    public void setMax_selorder(double max_selorder);

    public double getAverage();

    public void setAverage(double average);

    public double getHighest();

    public void setHighest(double highest);

    public double getLowest();

    public void setLowest(double lowest);

    public long getOrder_count();

    public void setOrder_count(long order_count);

    public boolean getConfiguredbp();

    public void setConfiguredbp(boolean configuredbp);

    public double getEstimatedproductioncost();

    public void setEstimatedproductioncost(double estimatedproductioncost);

    public IMarket_groupPK getMarket_groupPK();

    public void setMarket_groupPK(IMarket_groupPK market_groupPK);

    public ITypegroupPK getTypegroupPK();

    public void setTypegroupPK(ITypegroupPK typegroupPK);

    public IGraphicPK getGraphicPK();

    public void setGraphicPK(IGraphicPK graphicPK);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
