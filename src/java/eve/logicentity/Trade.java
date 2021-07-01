/*
 * Trade.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 30.5.2021 15:39
 *
 */

package eve.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.entity.pk.*;
import eve.interfaces.entity.pk.ITradePK;
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
 * Entity class Trade
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Trade extends eve.entity.eTrade implements ITrade {

    public static final String SQLSelect = "select trade.* from trade";
    public static final String SQLWhereordersSell_order_id = "sell_order_id = :orders.id:";
    public static final String SQLWhereordersBuy_order_id = "buy_order_id = :orders.id:";

//Custom code, do not change this line
    public static final String OrderBy = " order by sell_order_id, buy_order_id";
    public static final String SQLSelectAll = SQLSelect + OrderBy;
    
    public static final String SQLSellBuyOrders = SQLSelect + " where sell_order_id = :trade.sell_order_id: or buy_order_id = :trade.buy_order_id:";

    public static final String SQLdeleteall = "delete from trade";
//Custom code, do not change this line

    public static final String SQLSelect4ordersSell_order_id = "select * from trade where " + SQLWhereordersSell_order_id + OrderBy;
    public static final String SQLDelete4ordersSell_order_id = "delete from trade where " + SQLWhereordersSell_order_id;
    public static final String SQLSelect4ordersBuy_order_id = "select * from trade where " + SQLWhereordersBuy_order_id + OrderBy;
    public static final String SQLDelete4ordersBuy_order_id = "delete from trade where " + SQLWhereordersBuy_order_id;

    /**
     * Constructor
     * Creates an empty Trade entity
     */
    public Trade() {
    }
    
    /**
     * Constructor
     * build an empty Trade entity with initialized field values
     */
    public Trade(long sell_order_id, long buy_order_id) {
        super(sell_order_id, buy_order_id);
    }

    /**
     * Constructor
     * build an empty Trade entity with initialized Primarykey parameter
     * @param tradePK: Trade Primarykey
     */
    public Trade(TradePK tradePK) {
        super(tradePK);
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
