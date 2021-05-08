/*
 * Constellation.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 8.4.2021 13:20
 *
 */

package eve.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import eve.entity.pk.*;
import eve.interfaces.entity.pk.IConstellationPK;
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
 * Entity class Constellation
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Constellation extends eve.entity.eConstellation implements IConstellation {

    public static final String SQLSelect = "select constellation.* from constellation";
    public static final String SQLWhereregion = "region = :region.id:";

//Custom code, do not change this line
    public static final String OrderBy = " order by id";
    public static final String SQLSelectAll = SQLSelect + OrderBy;
//Custom code, do not change this line

    public static final String SQLSelect4region = "select * from constellation where " + SQLWhereregion + OrderBy;
    public static final String SQLDelete4region = "delete from constellation where " + SQLWhereregion + OrderBy;

    /**
     * Constructor
     * Creates an empty Constellation entity
     */
    public Constellation() {
    }
    
    /**
     * Constructor
     * build an empty Constellation entity with initialized field values
     */
    public Constellation(long id) {
        super(id);
    }

    /**
     * Constructor
     * build an empty Constellation entity with initialized Primarykey parameter
     * @param constellationPK: Constellation Primarykey
     */
    public Constellation(ConstellationPK constellationPK) {
        super(constellationPK);
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
