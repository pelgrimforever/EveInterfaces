/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
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

    public double getMaxprice();

    public void setMaxprice(double maxprice);

    
//Custom code, do not change this line
//Put custom functions here
    /**
     * @return Entity string representation
     */
    public String toString();
//Custom code, do not change this line
}
