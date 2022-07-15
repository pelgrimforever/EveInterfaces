/*
 * Userbp.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 9.5.2022 11:11
 *
 */

package eve.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.entity.pk.*;
import eve.interfaces.entity.pk.IUserbpPK;
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
 * Entity class Userbp
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Userbp extends eve.entity.eUserbp implements IUserbp {

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty Userbp entity
     */
    public Userbp() {
    }
    
    /**
     * Constructor
     * build an empty Userbp entity with initialized field values
     */
    public Userbp(java.lang.String username, long bp, int serialnumber) {
        super(username, bp, serialnumber);
    }

    /**
     * Constructor
     * build an empty Userbp entity with initialized Primarykey parameter
     * @param userbpPK: Userbp Primarykey
     */
    public Userbp(UserbpPK userbpPK) {
        super(userbpPK);
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
