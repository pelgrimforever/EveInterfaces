/*
 * IFaction.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.5.2021 16:2
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
 * Entity Interface IFaction
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface IFaction extends LogicEntity {

	public IFactionPK getPrimaryKey();
	
    public static short ID = 1;
    public static short NAME = 2;
    public static short DESCRIPTION = 3;
    public static short IS_UNIQUE = 4;
    public static short SIZE_FACTOR = 5;
    public static short STATION_COUNT = 6;
    public static short STATION_SYSTEM_COUNT = 7;
    public static short CORPORATION = 8;
    public static short MILITIA_CORPORATION = 9;
    public static short SOLAR_SYSTEM = 10;

    public static final int SIZE_ID = 19;
    public static final int SIZE_NAME = 50;
    public static final int SIZE_DESCRIPTION = 2147483647;
    public static final int SIZE_IS_UNIQUE = 1;
    public static final int SIZE_SIZE_FACTOR = 17;
    public static final int SIZE_STATION_COUNT = 10;
    public static final int SIZE_STATION_SYSTEM_COUNT = 10;
    public static final int SIZE_CORPORATION = 19;
    public static final int SIZE_MILITIA_CORPORATION = 19;
    public static final int SIZE_SOLAR_SYSTEM = 19;
    public static final String[] fieldnames = { "id", "name", "description", "is_unique", "size_factor", "station_count", "station_system_count", "corporation", "militia_corporation", "solar_system" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_String, Datatypes.type_String, Datatypes.type_boolean, Datatypes.type_double, Datatypes.type_int, Datatypes.type_int, Datatypes.type_long, Datatypes.type_long, Datatypes.type_long };

    public static final String[] systemPKfields = { "system.id" };
    public static final String[] systemFKfields = { "faction.solar_system" };

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
     * @return is_unique value
     */
    public boolean getIs_unique();

    /**
     * set is_unique value
     * @param is_unique: new value
     */
    public void setIs_unique(boolean is_unique);

    /**
     * 
     * @return size_factor value
     */
    public double getSize_factor();

    /**
     * set size_factor value
     * @param size_factor: new value
     */
    public void setSize_factor(double size_factor);

    /**
     * 
     * @return station_count value
     */
    public int getStation_count();

    /**
     * set station_count value
     * @param station_count: new value
     */
    public void setStation_count(int station_count);

    /**
     * 
     * @return station_system_count value
     */
    public int getStation_system_count();

    /**
     * set station_system_count value
     * @param station_system_count: new value
     */
    public void setStation_system_count(int station_system_count);

    /**
     * 
     * @return corporation value
     */
    public long getCorporation();

    /**
     * set corporation value
     * @param corporation: new value
     */
    public void setCorporation(long corporation);

    /**
     * 
     * @return militia_corporation value
     */
    public long getMilitia_corporation();

    /**
     * set militia_corporation value
     * @param militia_corporation: new value
     */
    public void setMilitia_corporation(long militia_corporation);

    /**
     * 
     * @return foreign key systemPK, instance of SystemPK
     */
    public ISystemPK getSystemPK();

    /**
     * set foreign key system
     * @param systemPK: instance of SystemPK
     */
    public void setSystemPK(ISystemPK systemPK);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
