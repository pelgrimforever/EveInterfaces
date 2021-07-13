/*
 * IEvetype.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 12.6.2021 13:57
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
 * Entity Interface IEvetype
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
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
    public static final String[] fieldnames = { "id", "name", "typegroup", "published", "description", "capacity", "graphic", "icon", "market_group", "mass", "packaged_volume", "portion_size", "radius", "volume", "avg_buyorder", "avg_sellorder", "min_buyorder", "max_buyorder", "min_selorder", "max_selorder" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_String, Datatypes.type_long, Datatypes.type_boolean, Datatypes.type_String, Datatypes.type_double, Datatypes.type_long, Datatypes.type_long, Datatypes.type_long, Datatypes.type_double, Datatypes.type_double, Datatypes.type_int, Datatypes.type_double, Datatypes.type_double, Datatypes.type_double, Datatypes.type_double, Datatypes.type_double, Datatypes.type_double, Datatypes.type_double, Datatypes.type_double };

    public static final String[] market_groupPKfields = { "market_group.id" };
    public static final String[] market_groupFKfields = { "evetype.market_group" };
    public static final String[] typegroupPKfields = { "typegroup.id" };
    public static final String[] typegroupFKfields = { "evetype.typegroup" };
    public static final String[] graphicPKfields = { "graphic.id" };
    public static final String[] graphicFKfields = { "evetype.graphic" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return name value
     */
    public java.lang.String getName();

    /**
     * set name value
     * @param name: new value
     */
    public void setName(java.lang.String name);

    /**
     * 
     * @return published value
     */
    public boolean getPublished();

    /**
     * set published value
     * @param published: new value
     */
    public void setPublished(boolean published);

    /**
     * 
     * @return description value
     */
    public java.lang.String getDescription();

    /**
     * set description value
     * @param description: new value
     */
    public void setDescription(java.lang.String description);

    /**
     * 
     * @return capacity value
     */
    public double getCapacity();

    /**
     * set capacity value
     * @param capacity: new value
     */
    public void setCapacity(double capacity);

    /**
     * 
     * @return icon value
     */
    public long getIcon();

    /**
     * set icon value
     * @param icon: new value
     */
    public void setIcon(long icon);

    /**
     * 
     * @return mass value
     */
    public double getMass();

    /**
     * set mass value
     * @param mass: new value
     */
    public void setMass(double mass);

    /**
     * 
     * @return packaged_volume value
     */
    public double getPackaged_volume();

    /**
     * set packaged_volume value
     * @param packaged_volume: new value
     */
    public void setPackaged_volume(double packaged_volume);

    /**
     * 
     * @return portion_size value
     */
    public int getPortion_size();

    /**
     * set portion_size value
     * @param portion_size: new value
     */
    public void setPortion_size(int portion_size);

    /**
     * 
     * @return radius value
     */
    public double getRadius();

    /**
     * set radius value
     * @param radius: new value
     */
    public void setRadius(double radius);

    /**
     * 
     * @return volume value
     */
    public double getVolume();

    /**
     * set volume value
     * @param volume: new value
     */
    public void setVolume(double volume);

    /**
     * 
     * @return avg_buyorder value
     */
    public double getAvg_buyorder();

    /**
     * set avg_buyorder value
     * @param avg_buyorder: new value
     */
    public void setAvg_buyorder(double avg_buyorder);

    /**
     * 
     * @return avg_sellorder value
     */
    public double getAvg_sellorder();

    /**
     * set avg_sellorder value
     * @param avg_sellorder: new value
     */
    public void setAvg_sellorder(double avg_sellorder);

    /**
     * 
     * @return min_buyorder value
     */
    public double getMin_buyorder();

    /**
     * set min_buyorder value
     * @param min_buyorder: new value
     */
    public void setMin_buyorder(double min_buyorder);

    /**
     * 
     * @return max_buyorder value
     */
    public double getMax_buyorder();

    /**
     * set max_buyorder value
     * @param max_buyorder: new value
     */
    public void setMax_buyorder(double max_buyorder);

    /**
     * 
     * @return min_selorder value
     */
    public double getMin_selorder();

    /**
     * set min_selorder value
     * @param min_selorder: new value
     */
    public void setMin_selorder(double min_selorder);

    /**
     * 
     * @return max_selorder value
     */
    public double getMax_selorder();

    /**
     * set max_selorder value
     * @param max_selorder: new value
     */
    public void setMax_selorder(double max_selorder);

    /**
     * 
     * @return foreign key market_groupPK, instance of Market_groupPK
     */
    public IMarket_groupPK getMarket_groupPK();

    /**
     * set foreign key market_group
     * @param market_groupPK: instance of Market_groupPK
     */
    public void setMarket_groupPK(IMarket_groupPK market_groupPK);

    /**
     * 
     * @return foreign key typegroupPK, instance of TypegroupPK
     */
    public ITypegroupPK getTypegroupPK();

    /**
     * set foreign key typegroup
     * @param typegroupPK: instance of TypegroupPK
     */
    public void setTypegroupPK(ITypegroupPK typegroupPK);

    /**
     * 
     * @return foreign key graphicPK, instance of GraphicPK
     */
    public IGraphicPK getGraphicPK();

    /**
     * set foreign key graphic
     * @param graphicPK: instance of GraphicPK
     */
    public void setGraphicPK(IGraphicPK graphicPK);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
