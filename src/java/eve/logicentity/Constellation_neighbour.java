/*
 * Constellation_neighbour.java
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
import eve.interfaces.entity.pk.IConstellation_neighbourPK;
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
 * Entity class Constellation_neighbour
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Constellation_neighbour extends eve.entity.eConstellation_neighbour implements IConstellation_neighbour {

    public static final String SQLSelect = "select constellation_neighbour.* from constellation_neighbour";
    public static final String SQLWhereconstellationNeighbour = "neighbour = :constellation.id:";
    public static final String SQLWhereconstellationConstellation = "constellation = :constellation.id:";

//Custom code, do not change this line
    public static final String OrderBy = " order by constellation, neighbour";
    public static final String SQLSelectAll = SQLSelect + OrderBy;
    
    public static final String SQLDeleteAll = "delete from constellation_neighbour";
    public static final String SQLcreateneighours = "insert into constellation_neighbour " +
        "select s1.constellation, s2.constellation from stargate sg " +
        "inner join system s1 on sg.system = s1.id " +
        "inner join system s2 on sg.to_system = s2.id " +
        "where sg.isconstellationborder and s1.constellation <> s2.constellation " +
        "group by s1.constellation, s2.constellation";
//Custom code, do not change this line

    public static final String SQLSelect4constellationNeighbour = "select * from constellation_neighbour where " + SQLWhereconstellationNeighbour + OrderBy;
    public static final String SQLDelete4constellationNeighbour = "delete from constellation_neighbour where " + SQLWhereconstellationNeighbour;
    public static final String SQLSelect4constellationConstellation = "select * from constellation_neighbour where " + SQLWhereconstellationConstellation + OrderBy;
    public static final String SQLDelete4constellationConstellation = "delete from constellation_neighbour where " + SQLWhereconstellationConstellation;

    /**
     * Constructor
     * Creates an empty Constellation_neighbour entity
     */
    public Constellation_neighbour() {
    }
    
    /**
     * Constructor
     * build an empty Constellation_neighbour entity with initialized field values
     */
    public Constellation_neighbour(long constellation, long neighbour) {
        super(constellation, neighbour);
    }

    /**
     * Constructor
     * build an empty Constellation_neighbour entity with initialized Primarykey parameter
     * @param constellation_neighbourPK: Constellation_neighbour Primarykey
     */
    public Constellation_neighbour(Constellation_neighbourPK constellation_neighbourPK) {
        super(constellation_neighbourPK);
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
