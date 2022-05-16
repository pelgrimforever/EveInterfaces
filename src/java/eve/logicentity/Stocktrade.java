/*
 * Stocktrade.java
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
import eve.interfaces.entity.pk.IStocktradePK;
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
 * Entity class Stocktrade
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Stocktrade extends eve.entity.eStocktrade implements IStocktrade {

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty Stocktrade entity
     */
    public Stocktrade() {
    }
    
    /**
     * Constructor
     * build an empty Stocktrade entity with initialized field values
     */
    public Stocktrade(java.lang.String username, long evetype, long orderid) {
        super(username, evetype, orderid);
    }

    /**
     * Constructor
     * build an empty Stocktrade entity with initialized Primarykey parameter
     * @param stocktradePK: Stocktrade Primarykey
     */
    public Stocktrade(StocktradePK stocktradePK) {
        super(stocktradePK);
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
