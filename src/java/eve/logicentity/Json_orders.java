/*
 * Json_orders.java
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
import eve.interfaces.entity.pk.IJson_ordersPK;
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
 * Entity class Json_orders
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Json_orders extends eve.entity.eJson_orders implements IJson_orders {

    public static final String SQLSelect = "select json_orders.* from json_orders";

//Custom code, do not change this line
    public static final String OrderBy = " order by id";
    public static final String SQLSelectAll = SQLSelect + OrderBy;
//Custom code, do not change this line


    /**
     * Constructor
     * Creates an empty Json_orders entity
     */
    public Json_orders() {
    }
    
    /**
     * Constructor
     * build an empty Json_orders entity with initialized field values
     */
    public Json_orders(int id) {
        super(id);
    }

    /**
     * Constructor
     * build an empty Json_orders entity with initialized Primarykey parameter
     * @param json_ordersPK: Json_orders Primarykey
     */
    public Json_orders(Json_ordersPK json_ordersPK) {
        super(json_ordersPK);
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
