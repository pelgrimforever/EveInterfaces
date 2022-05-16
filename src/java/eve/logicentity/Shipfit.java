/*
 * Shipfit.java
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
import eve.interfaces.entity.pk.IShipfitPK;
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
 * Entity class Shipfit
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Shipfit extends eve.entity.eShipfit implements IShipfit {

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty Shipfit entity
     */
    public Shipfit() {
    }
    
    /**
     * Constructor
     * build an empty Shipfit entity with initialized field values
     */
    public Shipfit(java.lang.String username, java.lang.String shipname) {
        super(username, shipname);
    }

    /**
     * Constructor
     * build an empty Shipfit entity with initialized Primarykey parameter
     * @param shipfitPK: Shipfit Primarykey
     */
    public Shipfit(ShipfitPK shipfitPK) {
        super(shipfitPK);
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
