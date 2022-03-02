/*
 * Eveuser.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 13.1.2022 17:48
 *
 */

package eve.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.entity.pk.*;
import eve.interfaces.entity.pk.IEveuserPK;
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
 * Entity class Eveuser
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Eveuser extends eve.entity.eEveuser implements IEveuser {

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty Eveuser entity
     */
    public Eveuser() {
    }
    
    /**
     * Constructor
     * build an empty Eveuser entity with initialized field values
     */
    public Eveuser(java.lang.String username) {
        super(username);
    }

    /**
     * Constructor
     * build an empty Eveuser entity with initialized Primarykey parameter
     * @param eveuserPK: Eveuser Primarykey
     */
    public Eveuser(EveuserPK eveuserPK) {
        super(eveuserPK);
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
