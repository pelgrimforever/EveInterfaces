/*
 * Allnodes_stargate.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.0.2022 16:56
 *
 */

package eve.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.entity.pk.*;
import eve.interfaces.entity.pk.IAllnodes_stargatePK;
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
 * Entity class Allnodes_stargate
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Allnodes_stargate extends eve.entity.eAllnodes_stargate implements IAllnodes_stargate {

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty Allnodes_stargate entity
     */
    public Allnodes_stargate() {
    }
    
    /**
     * Constructor
     * build an empty Allnodes_stargate entity with initialized field values
     */
    public Allnodes_stargate(long id) {
        super(id);
    }

    /**
     * Constructor
     * build an empty Allnodes_stargate entity with initialized Primarykey parameter
     * @param allnodes_stargatePK: Allnodes_stargate Primarykey
     */
    public Allnodes_stargate(Allnodes_stargatePK allnodes_stargatePK) {
        super(allnodes_stargatePK);
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
