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

public interface IStation extends LogicEntity {

    public IStationPK getPrimaryKey();
	
    public static short ID = 1;
    public static short NAME = 2;
    public static short OFFICE_RENTAL_COST = 3;
    public static short RACE_ID = 4;
    public static short REPROCESSING_EFFICIENCY = 5;
    public static short REPROCESSING_STATIONS_TAKE = 6;
    public static short SYSTEM_ID = 7;
    public static short TYPE_ID = 8;
    public static short MAX_DOCKABLE_SHIP_VOLUME = 9;
    public static short OWNER = 10;
    public static short DOWNLOADDATE = 11;

    public static final int SIZE_ID = 19;
    public static final int SIZE_NAME = 100;
    public static final int SIZE_OFFICE_RENTAL_COST = 17;
    public static final int SIZE_RACE_ID = 19;
    public static final int SIZE_REPROCESSING_EFFICIENCY = 17;
    public static final int SIZE_REPROCESSING_STATIONS_TAKE = 17;
    public static final int SIZE_SYSTEM_ID = 19;
    public static final int SIZE_TYPE_ID = 19;
    public static final int SIZE_MAX_DOCKABLE_SHIP_VOLUME = 17;
    public static final int SIZE_OWNER = 19;
    public static final int SIZE_DOWNLOADDATE = 13;
    public static final String[] fieldnames = { "id", "name", "office_rental_cost", "race_id", "reprocessing_efficiency", "reprocessing_stations_take", "system_id", "type_id", "max_dockable_ship_volume", "owner", "downloaddate" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_String, Datatypes.type_double, Datatypes.type_long, Datatypes.type_double, Datatypes.type_double, Datatypes.type_long, Datatypes.type_long, Datatypes.type_double, Datatypes.type_long, Datatypes.type_Date };

    public static final String[] racePKfields = { "race.id" };
    public static final String[] raceFKfields = { "station.race_id" };
    public static final String[] evetypePKfields = { "evetype.id" };
    public static final String[] evetypeFKfields = { "station.type_id" };
    public static final String[] systemPKfields = { "system.id" };
    public static final String[] systemFKfields = { "station.system_id" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    public java.lang.String getName();

    public void setName(java.lang.String name);

    public double getOffice_rental_cost();

    public void setOffice_rental_cost(double office_rental_cost);

    public double getReprocessing_efficiency();

    public void setReprocessing_efficiency(double reprocessing_efficiency);

    public double getReprocessing_stations_take();

    public void setReprocessing_stations_take(double reprocessing_stations_take);

    public double getMax_dockable_ship_volume();

    public void setMax_dockable_ship_volume(double max_dockable_ship_volume);

    public long getOwner();

    public void setOwner(long owner);

    public java.sql.Date getDownloaddate();

    public void setDownloaddate(java.sql.Date downloaddate);

    public IRacePK getRacePK();

    public void setRacePK(IRacePK racePK);

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
