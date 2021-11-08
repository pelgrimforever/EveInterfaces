/*
 * Systemjumps.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 8.10.2021 7:21
 *
 */

package eve.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.entity.pk.*;
import eve.interfaces.entity.pk.ISystemjumpsPK;
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
 * Entity class Systemjumps
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Systemjumps extends eve.entity.eSystemjumps implements ISystemjumps {

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty Systemjumps entity
     */
    public Systemjumps() {
    }
    
    /**
     * Constructor
     * build an empty Systemjumps entity with initialized field values
     */
    public Systemjumps(long system_start, long system_end) {
        super(system_start, system_end);
    }

    /**
     * Constructor
     * build an empty Systemjumps entity with initialized Primarykey parameter
     * @param systemjumpsPK: Systemjumps Primarykey
     */
    public Systemjumps(SystemjumpsPK systemjumpsPK) {
        super(systemjumpsPK);
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
