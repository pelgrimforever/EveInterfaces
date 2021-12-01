/*
 * Order_history.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 30.10.2021 10:3
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

//Custom code, do not change this line
//Custom code, do not change this line

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
