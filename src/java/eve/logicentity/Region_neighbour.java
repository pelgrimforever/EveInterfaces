/*
 * Region_neighbour.java
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
import eve.interfaces.entity.pk.IRegion_neighbourPK;
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
 * Entity class Region_neighbour
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Region_neighbour extends eve.entity.eRegion_neighbour implements IRegion_neighbour {

    public static final String SQLSelect = "select region_neighbour.* from region_neighbour";
    public static final String SQLWhereregionRegion = "region = :region.id:";
    public static final String SQLWhereregionNeighbour = "neighbour = :region.id:";

//Custom code, do not change this line
    public static final String OrderBy = " order by region, neighbour";
    public static final String SQLSelectAll = SQLSelect + OrderBy;

    public static final String SQLDeleteAll = "delete from region_neighbour";
    public static final String SQLcreateneighours = "insert into region_neighbour " +
        "select c1.region, c2.region from stargate sg " +
        "inner join system s1 on sg.system = s1.id " +
        "inner join constellation c1 on s1.constellation = c1.id " +
        "inner join system s2 on sg.to_system = s2.id " +
        "inner join constellation c2 on s2.constellation = c2.id " +
        "where sg.isregionborder and c1.region <> c2.region " +
        "group by c1.region, c2.region";
//Custom code, do not change this line

    public static final String SQLSelect4regionRegion = "select * from region_neighbour where " + SQLWhereregionRegion + OrderBy;
    public static final String SQLDelete4regionRegion = "delete from region_neighbour where " + SQLWhereregionRegion;
    public static final String SQLSelect4regionNeighbour = "select * from region_neighbour where " + SQLWhereregionNeighbour + OrderBy;
    public static final String SQLDelete4regionNeighbour = "delete from region_neighbour where " + SQLWhereregionNeighbour;

    /**
     * Constructor
     * Creates an empty Region_neighbour entity
     */
    public Region_neighbour() {
    }
    
    /**
     * Constructor
     * build an empty Region_neighbour entity with initialized field values
     */
    public Region_neighbour(long region, long neighbour) {
        super(region, neighbour);
    }

    /**
     * Constructor
     * build an empty Region_neighbour entity with initialized Primarykey parameter
     * @param region_neighbourPK: Region_neighbour Primarykey
     */
    public Region_neighbour(Region_neighbourPK region_neighbourPK) {
        super(region_neighbourPK);
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
