/*
 * Orders.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 8.10.2021 7:21
 *
 */

package eve.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.entity.pk.*;
import eve.interfaces.entity.pk.IOrdersPK;
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
 * Entity class Orders
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Orders extends eve.entity.eOrders implements IOrders {

//Custom code, do not change this line
    private double packaged_volume = 0;
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty Orders entity
     */
    public Orders() {
    }
    
    /**
     * Constructor
     * build an empty Orders entity with initialized field values
     */
    public Orders(long id) {
        super(id);
    }

    /**
     * Constructor
     * build an empty Orders entity with initialized Primarykey parameter
     * @param ordersPK: Orders Primarykey
     */
    public Orders(OrdersPK ordersPK) {
        super(ordersPK);
    }

//Custom code, do not change this line
    public void setPackaged_volume(double packaged_volume) {
        this.packaged_volume = packaged_volume;
    }
    
    public double getPackaged_volume() {
        return this.packaged_volume;
    }
    
    /**
     * @return Entity string representation
     */
    public String toString() {
        return super.toString();
    }
//Custom code, do not change this line
}
