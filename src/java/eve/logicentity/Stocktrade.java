/*
 * Stocktrade.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 18.8.2021 11:31
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

    public static final String SQLSelect = "select stocktrade.* from stocktrade";
    public static final String SQLWherestock = "username = :stock.username: and evetype = :stock.evetype:";

//Custom code, do not change this line
    public static final String OrderBy = " order by username, evetype, order";
    public static final String SQLSelectAll = SQLSelect + OrderBy;
    public static final String SQLdeleteall = "delete from stocktrade";
//Custom code, do not change this line

    public static final String SQLSelect4stock = "select * from stocktrade where " + SQLWherestock + OrderBy;
    public static final String SQLDelete4stock = "delete from stocktrade where " + SQLWherestock;

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
