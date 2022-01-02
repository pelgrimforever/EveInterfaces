/*
 * Shipfitorderselected.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 20.11.2021 17:22
 *
 */

package eve.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.entity.pk.*;
import eve.interfaces.entity.pk.IShipfitorderselectedPK;
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
 * Entity class Shipfitorderselected
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Shipfitorderselected extends eve.entity.eShipfitorderselected implements IShipfitorderselected {

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty Shipfitorderselected entity
     */
    public Shipfitorderselected() {
    }
    
    /**
     * Constructor
     * build an empty Shipfitorderselected entity with initialized field values
     */
    public Shipfitorderselected(java.lang.String username, java.lang.String shipname, long evetype, long orderid) {
        super(username, shipname, evetype, orderid);
    }

    /**
     * Constructor
     * build an empty Shipfitorderselected entity with initialized Primarykey parameter
     * @param shipfitorderselectedPK: Shipfitorderselected Primarykey
     */
    public Shipfitorderselected(ShipfitorderselectedPK shipfitorderselectedPK) {
        super(shipfitorderselectedPK);
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