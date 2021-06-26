/*
 * Routetype.java
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
import eve.interfaces.entity.pk.IRoutetypePK;
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
 * Entity class Routetype
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Routetype extends eve.entity.eRoutetype implements IRoutetype {

    public static final String SQLSelect = "select routetype.* from routetype";
    public static final String SQLWheresecurity_island = "security_island = :security_island.id:";

//Custom code, do not change this line
    public static final String OrderBy = " order by id";
    public static final String SQLSelectAll = SQLSelect + OrderBy;
//Custom code, do not change this line

    public static final String SQLSelect4security_island = "select * from routetype where " + SQLWheresecurity_island + OrderBy;
    public static final String SQLDelete4security_island = "delete from routetype where " + SQLWheresecurity_island;

    /**
     * Constructor
     * Creates an empty Routetype entity
     */
    public Routetype() {
    }
    
    /**
     * Constructor
     * build an empty Routetype entity with initialized field values
     */
    public Routetype(long id) {
        super(id);
    }

    /**
     * Constructor
     * build an empty Routetype entity with initialized Primarykey parameter
     * @param routetypePK: Routetype Primarykey
     */
    public Routetype(RoutetypePK routetypePK) {
        super(routetypePK);
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
