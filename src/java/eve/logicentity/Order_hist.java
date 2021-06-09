/*
 * Order_hist.java
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
import eve.interfaces.entity.pk.IOrder_histPK;
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
 * Entity class Order_hist
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Order_hist extends eve.entity.eOrder_hist implements IOrder_hist {

    public static final String SQLSelect = "select order_hist.* from order_hist";
    public static final String SQLWhereevetype = "evetype = :evetype.id:";
    public static final String SQLWheresystem = "system = :system.id:";

//Custom code, do not change this line
    public static final String OrderBy = " order by id";
    public static final String SQLSelectAll = SQLSelect + OrderBy;

    public static final String SQLdeleteall = "delete from order_hist";
    public static final String SQLcopyorders = "insert into order_hist select * from orders where id not in (select id from order_hist)";
//Custom code, do not change this line

    public static final String SQLSelect4evetype = "select * from order_hist where " + SQLWhereevetype + OrderBy;
    public static final String SQLDelete4evetype = "delete from order_hist where " + SQLWhereevetype;
    public static final String SQLSelect4system = "select * from order_hist where " + SQLWheresystem + OrderBy;
    public static final String SQLDelete4system = "delete from order_hist where " + SQLWheresystem;

    /**
     * Constructor
     * Creates an empty Order_hist entity
     */
    public Order_hist() {
    }
    
    /**
     * Constructor
     * build an empty Order_hist entity with initialized field values
     */
    public Order_hist(long id) {
        super(id);
    }

    /**
     * Constructor
     * build an empty Order_hist entity with initialized Primarykey parameter
     * @param order_histPK: Order_hist Primarykey
     */
    public Order_hist(Order_histPK order_histPK) {
        super(order_histPK);
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
