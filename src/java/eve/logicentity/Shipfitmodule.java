/*
 * Shipfitmodule.java
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
import eve.interfaces.entity.pk.IShipfitmodulePK;
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
 * Entity class Shipfitmodule
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Shipfitmodule extends eve.entity.eShipfitmodule implements IShipfitmodule {

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty Shipfitmodule entity
     */
    public Shipfitmodule() {
    }
    
    /**
     * Constructor
     * build an empty Shipfitmodule entity with initialized field values
     */
    public Shipfitmodule(java.lang.String username, java.lang.String shipname, long moduletype) {
        super(username, shipname, moduletype);
    }

    /**
     * Constructor
     * build an empty Shipfitmodule entity with initialized Primarykey parameter
     * @param shipfitmodulePK: Shipfitmodule Primarykey
     */
    public Shipfitmodule(ShipfitmodulePK shipfitmodulePK) {
        super(shipfitmodulePK);
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
