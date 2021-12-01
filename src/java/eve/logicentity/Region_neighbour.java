/*
 * Region_neighbour.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 30.10.2021 10:3
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

//Custom code, do not change this line
//Custom code, do not change this line

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
