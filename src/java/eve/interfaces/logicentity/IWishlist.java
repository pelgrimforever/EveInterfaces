/*
 * IWishlist.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.0.2022 16:56
 *
 */

package eve.interfaces.logicentity;

import data.gis.shape.*;
import data.interfaces.Datatypes;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.interfaces.entity.pk.*;
import eve.entity.pk.*;
import java.awt.image.BufferedImage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Entity Interface IWishlist
 *
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public interface IWishlist extends LogicEntity {

    public IWishlistPK getPrimaryKey();
	
    public static short EVETYPE = 1;
    public static short USERNAME = 2;
    public static short MAXPRICE = 3;

    public static final int SIZE_EVETYPE = 19;
    public static final int SIZE_USERNAME = 20;
    public static final int SIZE_MAXPRICE = 17;
    public static final String[] fieldnames = { "evetype", "username", "maxprice" };
    public static final byte[] fieldtypes = { Datatypes.type_long, Datatypes.type_String, Datatypes.type_double };

    public static final String[] evetypePKfields = { "evetype.id" };
    public static final String[] evetypeFKfields = { "wishlist.evetype" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return maxprice value
     */
    public double getMaxprice();

    /**
     * set maxprice value
     * @param maxprice: new value
     */
    public void setMaxprice(double maxprice);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
