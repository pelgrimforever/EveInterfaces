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

    public java.lang.String getName();

    public void setName(java.lang.String name);

    public java.lang.String getDescription();

    public void setDescription(java.lang.String description);

    public boolean getIs_unique();

    public void setIs_unique(boolean is_unique);

    public double getSize_factor();

    public void setSize_factor(double size_factor);

    public int getStation_count();

    public void setStation_count(int station_count);

    public int getStation_system_count();

    public void setStation_system_count(int station_system_count);

    public long getCorporation();

    public void setCorporation(long corporation);

    public long getMilitia_corporation();

    public void setMilitia_corporation(long militia_corporation);

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
