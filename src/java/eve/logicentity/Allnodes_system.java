/*
 * Allnodes_system.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 11.4.2022 9:13
 *
 */

package eve.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.entity.pk.*;
import eve.interfaces.entity.pk.IAllnodes_systemPK;
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
 * Entity class Allnodes_system
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Allnodes_system extends eve.entity.eAllnodes_system implements IAllnodes_system {

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty Allnodes_system entity
     */
    public Allnodes_system() {
    }
    
    /**
     * Constructor
     * build an empty Allnodes_system entity with initialized field values
     */
    public Allnodes_system(long id) {
        super(id);
    }

    /**
     * Constructor
     * build an empty Allnodes_system entity with initialized Primarykey parameter
     * @param allnodes_systemPK: Allnodes_system Primarykey
     */
    public Allnodes_system(Allnodes_systemPK allnodes_systemPK) {
        super(allnodes_systemPK);
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
