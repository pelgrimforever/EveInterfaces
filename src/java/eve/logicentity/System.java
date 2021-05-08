/*
 * System.java
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
import eve.interfaces.entity.pk.ISystemPK;
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
 * Entity class System
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class System extends eve.entity.eSystem implements ISystem {

    public static final String SQLSelect = "select system.* from system";
    public static final String SQLWhereconstellation = "constellation = :constellation.id:";

//Custom code, do not change this line
    public static final String OrderBy = " order by id";
    public static final String SQLSelectAll = SQLSelect + OrderBy;
//Custom code, do not change this line

    public static final String SQLSelect4constellation = "select * from system where " + SQLWhereconstellation + OrderBy;
    public static final String SQLDelete4constellation = "delete from system where " + SQLWhereconstellation + OrderBy;

    /**
     * Constructor
     * Creates an empty System entity
     */
    public System() {
    }
    
    /**
     * Constructor
     * build an empty System entity with initialized field values
     */
    public System(long id) {
        super(id);
    }

    /**
     * Constructor
     * build an empty System entity with initialized Primarykey parameter
     * @param systemPK: System Primarykey
     */
    public System(SystemPK systemPK) {
        super(systemPK);
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
