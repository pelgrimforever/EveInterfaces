/*
 * Systemtrade_order.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 12.6.2021 13:57
 *
 */

package eve.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.entity.pk.*;
import eve.interfaces.entity.pk.ISystemtrade_orderPK;
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
 * Entity class Systemtrade_order
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Systemtrade_order extends eve.entity.eSystemtrade_order implements ISystemtrade_order {

    public static final String SQLSelect = "select systemtrade_order.* from systemtrade_order";
    public static final String SQLWhereordersBuy_order = "buy_order = :orders.id:";
    public static final String SQLWhereordersSell_order = "sell_order = :orders.id:";
    public static final String SQLWheresystemtrade = "sell_system = :systemtrade.sell_system: and buy_system = :systemtrade.buy_system:";

//Custom code, do not change this line
    public static final String OrderBy = " order by sell_system, buy_system, sell_order, buy_order";
    public static final String SQLSelectAll = SQLSelect + OrderBy;
    public static final String SQLdeleteall = "delete from systemtrade_order";
//Custom code, do not change this line

    public static final String SQLSelect4ordersBuy_order = "select * from systemtrade_order where " + SQLWhereordersBuy_order + OrderBy;
    public static final String SQLDelete4ordersBuy_order = "delete from systemtrade_order where " + SQLWhereordersBuy_order;
    public static final String SQLSelect4ordersSell_order = "select * from systemtrade_order where " + SQLWhereordersSell_order + OrderBy;
    public static final String SQLDelete4ordersSell_order = "delete from systemtrade_order where " + SQLWhereordersSell_order;
    public static final String SQLSelect4systemtrade = "select * from systemtrade_order where " + SQLWheresystemtrade + OrderBy;
    public static final String SQLDelete4systemtrade = "delete from systemtrade_order where " + SQLWheresystemtrade;

    /**
     * Constructor
     * Creates an empty Systemtrade_order entity
     */
    public Systemtrade_order() {
    }
    
    /**
     * Constructor
     * build an empty Systemtrade_order entity with initialized field values
     */
    public Systemtrade_order(long sell_system, long buy_system, long sell_order, long buy_order) {
        super(sell_system, buy_system, sell_order, buy_order);
    }

    /**
     * Constructor
     * build an empty Systemtrade_order entity with initialized Primarykey parameter
     * @param systemtrade_orderPK: Systemtrade_order Primarykey
     */
    public Systemtrade_order(Systemtrade_orderPK systemtrade_orderPK) {
        super(systemtrade_orderPK);
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
