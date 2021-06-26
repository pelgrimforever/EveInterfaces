/*
 * Region.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.5.2021 16:2
 *
 */

package eve.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.entity.pk.*;
import eve.interfaces.entity.pk.IRegionPK;
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
 * Entity class Region
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Region extends eve.entity.eRegion implements IRegion {

    public static final String SQLSelect = "select region.* from region";

//Custom code, do not change this line
    public static final String OrderBy = " order by id";
    public static final String SQLwhereaccess = "not noaccess";
    public static final String SQLSelectAllaccess = SQLSelect + " where " + SQLwhereaccess + OrderBy;

    public static final String updateNoaccess1 = "update region set noaccess = :noaccess: where id not in (select region from constellation where noaccess = :constellationnoaccess: group by region)";
    public static final String updateNoaccess2 = "update region set noaccess = :noaccess: where id in (select region from constellation where noaccess = :constellationnoaccess: group by region)";
//Custom code, do not change this line


    /**
     * Constructor
     * Creates an empty Region entity
     */
    public Region() {
    }
    
    /**
     * Constructor
     * build an empty Region entity with initialized field values
     */
    public Region(long id) {
        super(id);
    }

    /**
     * Constructor
     * build an empty Region entity with initialized Primarykey parameter
     * @param regionPK: Region Primarykey
     */
    public Region(RegionPK regionPK) {
        super(regionPK);
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
