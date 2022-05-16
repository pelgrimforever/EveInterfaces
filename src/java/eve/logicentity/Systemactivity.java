/*
 * Systemactivity.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 5.3.2022 17:21
 *
 */

package eve.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.entity.pk.*;
import eve.interfaces.entity.pk.ISystemactivityPK;
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
 * Entity class Systemactivity
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Systemactivity extends eve.entity.eSystemactivity implements ISystemactivity {

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty Systemactivity entity
     */
    public Systemactivity() {
    }
    
    /**
     * Constructor
     * build an empty Systemactivity entity with initialized field values
     */
    public Systemactivity(long systemid, java.sql.Timestamp timeslot) {
        super(systemid, timeslot);
    }

    /**
     * Constructor
     * build an empty Systemactivity entity with initialized Primarykey parameter
     * @param systemactivityPK: Systemactivity Primarykey
     */
    public Systemactivity(SystemactivityPK systemactivityPK) {
        super(systemactivityPK);
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
