/*
 * Tmp_system_jumps.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2021 15:16
 *
 */

package eve.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.entity.pk.*;
import eve.interfaces.entity.pk.ITmp_system_jumpsPK;
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
 * Entity class Tmp_system_jumps
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Tmp_system_jumps extends eve.entity.eTmp_system_jumps implements ITmp_system_jumps {

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty Tmp_system_jumps entity
     */
    public Tmp_system_jumps() {
    }
    
    /**
     * Constructor
     * build an empty Tmp_system_jumps entity with initialized field values
     */
    public Tmp_system_jumps(long system) {
        super(system);
    }

    /**
     * Constructor
     * build an empty Tmp_system_jumps entity with initialized Primarykey parameter
     * @param tmp_system_jumpsPK: Tmp_system_jumps Primarykey
     */
    public Tmp_system_jumps(Tmp_system_jumpsPK tmp_system_jumpsPK) {
        super(tmp_system_jumpsPK);
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
