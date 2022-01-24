/*
 * Bpmaterial.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 24.0.2022 16:47
 *
 */

package eve.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.entity.pk.*;
import eve.interfaces.entity.pk.IBpmaterialPK;
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
 * Entity class Bpmaterial
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Bpmaterial extends eve.entity.eBpmaterial implements IBpmaterial {

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty Bpmaterial entity
     */
    public Bpmaterial() {
    }
    
    /**
     * Constructor
     * build an empty Bpmaterial entity with initialized field values
     */
    public Bpmaterial(long bp, long material) {
        super(bp, material);
    }

    /**
     * Constructor
     * build an empty Bpmaterial entity with initialized Primarykey parameter
     * @param bpmaterialPK: Bpmaterial Primarykey
     */
    public Bpmaterial(BpmaterialPK bpmaterialPK) {
        super(bpmaterialPK);
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