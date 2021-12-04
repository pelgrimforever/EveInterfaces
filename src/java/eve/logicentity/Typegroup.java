/*
 * Typegroup.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.11.2021 14:51
 *
 */

package eve.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.entity.pk.*;
import eve.interfaces.entity.pk.ITypegroupPK;
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
 * Entity class Typegroup
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Typegroup extends eve.entity.eTypegroup implements ITypegroup {

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty Typegroup entity
     */
    public Typegroup() {
    }
    
    /**
     * Constructor
     * build an empty Typegroup entity with initialized field values
     */
    public Typegroup(long id) {
        super(id);
    }

    /**
     * Constructor
     * build an empty Typegroup entity with initialized Primarykey parameter
     * @param typegroupPK: Typegroup Primarykey
     */
    public Typegroup(TypegroupPK typegroupPK) {
        super(typegroupPK);
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
