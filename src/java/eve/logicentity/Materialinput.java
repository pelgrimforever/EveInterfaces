/*
 * Materialinput.java
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
import eve.interfaces.entity.pk.IMaterialinputPK;
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
 * Entity class Materialinput
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Materialinput extends eve.entity.eMaterialinput implements IMaterialinput {

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty Materialinput entity
     */
    public Materialinput() {
    }
    
    /**
     * Constructor
     * build an empty Materialinput entity with initialized field values
     */
    public Materialinput(java.lang.String username, long evetype, java.sql.Timestamp addtimestamp) {
        super(username, evetype, addtimestamp);
    }

    /**
     * Constructor
     * build an empty Materialinput entity with initialized Primarykey parameter
     * @param materialinputPK: Materialinput Primarykey
     */
    public Materialinput(MaterialinputPK materialinputPK) {
        super(materialinputPK);
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
