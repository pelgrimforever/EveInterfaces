/*
 * Station.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 8.5.2021 19:33
 *
 */

package eve.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.entity.pk.*;
import eve.interfaces.entity.pk.IStationPK;
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
 * Entity class Station
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Station extends eve.entity.eStation implements IStation {

    public static final String SQLSelect = "select station.* from station";
    public static final String SQLWhererace = "race_id = :race.id:";
    public static final String SQLWhereevetype = "type_id = :evetype.id:";
    public static final String SQLWheresystem = "system_id = :system.id:";

//Custom code, do not change this line
    public static final String OrderBy = " order by id";
    public static final String SQLSelectAll = SQLSelect + OrderBy;
    
    public static final String SQLSelect4systemCount = "select count(*) as count from station where " + SQLWheresystem;
//Custom code, do not change this line

    public static final String SQLSelect4race = "select * from station where " + SQLWhererace + OrderBy;
    public static final String SQLDelete4race = "delete from station where " + SQLWhererace;
    public static final String SQLSelect4evetype = "select * from station where " + SQLWhereevetype + OrderBy;
    public static final String SQLDelete4evetype = "delete from station where " + SQLWhereevetype;
    public static final String SQLSelect4system = "select * from station where " + SQLWheresystem + OrderBy;
    public static final String SQLDelete4system = "delete from station where " + SQLWheresystem;

    /**
     * Constructor
     * Creates an empty Station entity
     */
    public Station() {
    }
    
    /**
     * Constructor
     * build an empty Station entity with initialized field values
     */
    public Station(long id) {
        super(id);
    }

    /**
     * Constructor
     * build an empty Station entity with initialized Primarykey parameter
     * @param stationPK: Station Primarykey
     */
    public Station(StationPK stationPK) {
        super(stationPK);
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
