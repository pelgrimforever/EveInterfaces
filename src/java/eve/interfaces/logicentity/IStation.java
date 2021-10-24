/*
 * IStation.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 24.9.2021 14:40
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
 * Entity Interface IStation
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
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
    public static final String[] fieldnames = { "id", "name", "office_rental_cost", "race_id", "reprocessing_efficiency", "reprocessing_stations_take", "system_id", "type_id", "max_dockable_ship_volume", "owner" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_String, Datatypes.type_double, Datatypes.type_long, Datatypes.type_double, Datatypes.type_double, Datatypes.type_long, Datatypes.type_long, Datatypes.type_double, Datatypes.type_long };

    public static final String[] racePKfields = { "race.id" };
    public static final String[] raceFKfields = { "station.race_id" };
    public static final String[] evetypePKfields = { "evetype.id" };
    public static final String[] evetypeFKfields = { "station.type_id" };
    public static final String[] systemPKfields = { "system.id" };
    public static final String[] systemFKfields = { "station.system_id" };

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
     * @return office_rental_cost value
     */
    public double getOffice_rental_cost();

    /**
     * set office_rental_cost value
     * @param office_rental_cost: new value
     */
    public void setOffice_rental_cost(double office_rental_cost);

    /**
     * 
     * @return reprocessing_efficiency value
     */
    public double getReprocessing_efficiency();

    /**
     * set reprocessing_efficiency value
     * @param reprocessing_efficiency: new value
     */
    public void setReprocessing_efficiency(double reprocessing_efficiency);

    /**
     * 
     * @return reprocessing_stations_take value
     */
    public double getReprocessing_stations_take();

    /**
     * set reprocessing_stations_take value
     * @param reprocessing_stations_take: new value
     */
    public void setReprocessing_stations_take(double reprocessing_stations_take);

    /**
     * 
     * @return max_dockable_ship_volume value
     */
    public double getMax_dockable_ship_volume();

    /**
     * set max_dockable_ship_volume value
     * @param max_dockable_ship_volume: new value
     */
    public void setMax_dockable_ship_volume(double max_dockable_ship_volume);

    /**
     * 
     * @return owner value
     */
    public long getOwner();

    /**
     * set owner value
     * @param owner: new value
     */
    public void setOwner(long owner);

    /**
     * 
     * @return foreign key racePK, instance of RacePK
     */
    public IRacePK getRacePK();

    /**
     * set foreign key race
     * @param racePK: instance of RacePK
     */
    public void setRacePK(IRacePK racePK);

    /**
     * 
     * @return foreign key evetypePK, instance of EvetypePK
     */
    public IEvetypePK getEvetypePK();

    /**
     * set foreign key evetype
     * @param evetypePK: instance of EvetypePK
     */
    public void setEvetypePK(IEvetypePK evetypePK);

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
