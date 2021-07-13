/*
 * Route.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 12.6.2021 13:57
 *
 */

package eve.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.entity.pk.*;
import eve.interfaces.entity.pk.IRoutePK;
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
 * Entity class Route
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Route extends eve.entity.eRoute implements IRoute {

    public static final String SQLSelect = "select route.* from route";
    public static final String SQLWhereroutetype = "routetype = :routetype.id:";
    public static final String SQLWheresystem = "system = :system.id:";

//Custom code, do not change this line
    public static final String OrderBy = " order by routetype, system";
    public static final String SQLSelectAll = SQLSelect + OrderBy;
//Custom code, do not change this line

    public static final String SQLSelect4routetype = "select * from route where " + SQLWhereroutetype + OrderBy;
    public static final String SQLDelete4routetype = "delete from route where " + SQLWhereroutetype;
    public static final String SQLSelect4system = "select * from route where " + SQLWheresystem + OrderBy;
    public static final String SQLDelete4system = "delete from route where " + SQLWheresystem;

    /**
     * Constructor
     * Creates an empty Route entity
     */
    public Route() {
    }
    
    /**
     * Constructor
     * build an empty Route entity with initialized field values
     */
    public Route(long routetype, long system) {
        super(routetype, system);
    }

    /**
     * Constructor
     * build an empty Route entity with initialized Primarykey parameter
     * @param routePK: Route Primarykey
     */
    public Route(RoutePK routePK) {
        super(routePK);
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
