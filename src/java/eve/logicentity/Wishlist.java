/*
 * Wishlist.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 11.4.2022 9:13
 *
 */

package eve.logicentity;

import data.gis.shape.*;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import data.json.piJson;
import eve.entity.pk.*;
import eve.interfaces.entity.pk.IWishlistPK;
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
 * Entity class Wishlist
 *
 * Attributes: Database independent SQL-construction strings adjusments
 * extended attributes and methods possibility:
 * table level programming is done here
 *
 * @author Franky Laseure
 */
public class Wishlist extends eve.entity.eWishlist implements IWishlist {

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Constructor
     * Creates an empty Wishlist entity
     */
    public Wishlist() {
    }
    
    /**
     * Constructor
     * build an empty Wishlist entity with initialized field values
     */
    public Wishlist(long evetype, java.lang.String username) {
        super(evetype, username);
    }

    /**
     * Constructor
     * build an empty Wishlist entity with initialized Primarykey parameter
     * @param wishlistPK: Wishlist Primarykey
     */
    public Wishlist(WishlistPK wishlistPK) {
        super(wishlistPK);
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
