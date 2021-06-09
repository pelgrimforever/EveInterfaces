/*
 * Order_history.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 8.5.2021 19:33
 *
 */

package eve.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.entity.pk.*;
import eve.interfaces.entity.pk.IOrder_historyPK;
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
 * Entity class Order_history
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Order_history extends eve.entity.eOrder_history implements IOrder_history {

    public static final String SQLSelect = "select order_history.* from order_history";
    public static final String SQLWhereevetype = "evetype = :evetype.id:";
    public static final String SQLWhereregion = "region = :region.id:";

//Custom code, do not change this line
    public static final String OrderBy = " order by region, evetype, date";
    public static final String SQLSelectAll = SQLSelect + OrderBy;
    
    public static final String SQLdeleteall = "Delete from order_history";
//Custom code, do not change this line

    public static final String SQLSelect4evetype = "select * from order_history where " + SQLWhereevetype + OrderBy;
    public static final String SQLDelete4evetype = "delete from order_history where " + SQLWhereevetype;
    public static final String SQLSelect4region = "select * from order_history where " + SQLWhereregion + OrderBy;
    public static final String SQLDelete4region = "delete from order_history where " + SQLWhereregion;

    /**
     * Constructor
     * Creates an empty Order_history entity
     */
    public Order_history() {
    }
    
    /**
     * Constructor
     * build an empty Order_history entity with initialized field values
     */
    public Order_history(long region, long evetype, java.sql.Date date) {
        super(region, evetype, date);
    }

    /**
     * Constructor
     * build an empty Order_history entity with initialized Primarykey parameter
     * @param order_historyPK: Order_history Primarykey
     */
    public Order_history(Order_historyPK order_historyPK) {
        super(order_historyPK);
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
