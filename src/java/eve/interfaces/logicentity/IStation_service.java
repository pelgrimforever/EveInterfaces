/*
 * IStation_service.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 11.4.2022 9:13
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
 * Entity Interface IStation_service
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface IStation_service extends LogicEntity {

    public IStation_servicePK getPrimaryKey();
	
    public static short STATION = 1;
    public static short SERVICE = 2;

    public static final int SIZE_STATION = 19;
    public static final int SIZE_SERVICE = 20;
    public static final String[] fieldnames = { "station", "service" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_String };

    public static final String[] stationPKfields = { "station.id" };
    public static final String[] stationFKfields = { "station_service.station" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
