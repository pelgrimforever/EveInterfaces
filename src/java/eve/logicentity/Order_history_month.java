/*
 * Order_history_month.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 9.5.2022 11:11
 *
 */

package eve.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.entity.pk.*;
import eve.interfaces.entity.pk.IOrder_history_monthPK;
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
 * Entity class Order_history_month
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Order_history_month extends eve.entity.eOrder_history_month implements IOrder_history_month {

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty Order_history_month entity
     */
    public Order_history_month() {
    }
    
    /**
     * Constructor
     * build an empty Order_history_month entity with initialized field values
     */
    public Order_history_month(long region, long evetype, int year, int month) {
        super(region, evetype, year, month);
    }

    /**
     * Constructor
     * build an empty Order_history_month entity with initialized Primarykey parameter
     * @param order_history_monthPK: Order_history_month Primarykey
     */
    public Order_history_month(Order_history_monthPK order_history_monthPK) {
        super(order_history_monthPK);
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
