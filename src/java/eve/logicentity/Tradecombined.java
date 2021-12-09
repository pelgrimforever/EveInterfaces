/*
 * Tradecombined.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 9.11.2021 14:30
 *
 */

package eve.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.entity.pk.*;
import eve.interfaces.entity.pk.ITradecombinedPK;
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
 * Entity class Tradecombined
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Tradecombined extends eve.entity.eTradecombined implements ITradecombined {

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty Tradecombined entity
     */
    public Tradecombined() {
    }
    
    /**
     * Constructor
     * build an empty Tradecombined entity with initialized field values
     */
    public Tradecombined(long sell_system, long buy_system, long evetype) {
        super(sell_system, buy_system, evetype);
    }

    /**
     * Constructor
     * build an empty Tradecombined entity with initialized Primarykey parameter
     * @param tradecombinedPK: Tradecombined Primarykey
     */
    public Tradecombined(TradecombinedPK tradecombinedPK) {
        super(tradecombinedPK);
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
