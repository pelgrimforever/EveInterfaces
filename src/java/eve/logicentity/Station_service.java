/*
 * Station_service.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 30.5.2021 15:39
 *
 */

package eve.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.entity.pk.*;
import eve.interfaces.entity.pk.IStation_servicePK;
import eve.interfaces.logicentity.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

/**
 * Entity class Station_service
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Station_service extends eve.entity.eStation_service implements IStation_service {

    public static final String SQLSelect = "select station_service.* from station_service";
    public static final String SQLWherestation = "station = :station.id:";

//Custom code, do not change this line
    public static final String OrderBy = " order by station";
    public static final String SQLSelectAll = SQLSelect + OrderBy;
//Custom code, do not change this line

    public static final String SQLSelect4station = "select * from station_service where " + SQLWherestation + OrderBy;
    public static final String SQLDelete4station = "delete from station_service where " + SQLWherestation;

    /**
     * Constructor
     * Creates an empty Station_service entity
     */
    public Station_service() {
    }
    
    /**
     * Constructor
     * build an empty Station_service entity with initialized field values
     */
    public Station_service(long station, java.lang.String service) {
        super(station, service);
    }

    /**
     * Constructor
     * build an empty Station_service entity with initialized Primarykey parameter
     * @param station_servicePK: Station_service Primarykey
     */
    public Station_service(Station_servicePK station_servicePK) {
        super(station_servicePK);
    }

//Custom code, do not change this line
    /**
     * @return Entity string representation
     */
    public String toString() {
        return super.toString();
    }
//Custom code, do not change this line
}
