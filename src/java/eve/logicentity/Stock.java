/*
 * Stock.java
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
import eve.interfaces.entity.pk.IStockPK;
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
 * Entity class Stock
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Stock extends eve.entity.eStock implements IStock {

    public static final String SQLSelect = "select stock.* from stock";
    public static final String SQLWhereevetype = "evetype = :evetype.id:";

//Custom code, do not change this line
    public static final String OrderBy = " order by username, evetype";
    public static final String SQLSelectAll = SQLSelect + OrderBy;
//Custom code, do not change this line

    public static final String SQLSelect4evetype = "select * from stock where " + SQLWhereevetype + OrderBy;
    public static final String SQLDelete4evetype = "delete from stock where " + SQLWhereevetype;

    /**
     * Constructor
     * Creates an empty Stock entity
     */
    public Stock() {
    }
    
    /**
     * Constructor
     * build an empty Stock entity with initialized field values
     */
    public Stock(java.lang.String username, long evetype) {
        super(username, evetype);
    }

    /**
     * Constructor
     * build an empty Stock entity with initialized Primarykey parameter
     * @param stockPK: Stock Primarykey
     */
    public Stock(StockPK stockPK) {
        super(stockPK);
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
