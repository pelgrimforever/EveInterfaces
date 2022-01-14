/*
 * eWishlist.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.0.2022 16:56
 *
 */

package eve.entity;

import eve.eveDatabaseproperties;
import data.interfaces.db.AbstractEntity;
import data.interfaces.db.Entity;
import data.interfaces.db.Filedata;
import data.gis.shape.*;
import data.json.piJson;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Iterator;

import eve.entity.pk.*;
import eve.interfaces.logicentity.IWishlist;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Wishlist
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Wishlist Entity
 * 
 * @author Franky Laseure
 */
public class eWishlist extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected WishlistPK wishlistPK;
    private double maxprice;
	  
    public static final String table = "wishlist";
	  
    public String getFieldname(short fieldconstant) {
        return IWishlist.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IWishlist.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eWishlist.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eWishlist.connectionpool;
    }
    
    /**
     * 
     * @return table name for Wishlist
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Wishlist class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Wishlist entity
     */
    public eWishlist() {
    }

    /**
     * Constructor
     * build an empty Wishlist entity with initialized field values
     */
    public eWishlist(long evetype, java.lang.String username) {
        this.wishlistPK = new WishlistPK(evetype, username);
    }
  
    /**
     * Constructor
     * build an empty Wishlist entity with initialized Primarykey parameter
     * @param wishlistPK: Wishlist Primarykey
     */
    public eWishlist(WishlistPK wishlistPK) {
        this.wishlistPK = wishlistPK;
    }

    /**
     * @return is Wishlist Empty ?
     */
    public boolean isEmpty() {
        return this.wishlistPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.wishlistPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.wishlistPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(IWishlist.MAXPRICE, maxprice);
        return getAllFields();
    }
	
    /**
     * @return WishlistPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return WishlistPK
     */
    @Override
    public WishlistPK getPrimaryKey() {
        return this.wishlistPK;
    }

    /**
     * 
     * @return maxprice value
     */
    public double getMaxprice() {
        return this.maxprice;
    }

    /**
     * set maxprice value
     * @param maxprice: new value
     */
    public void initMaxprice(double maxprice) {
        this.maxprice = maxprice;
    }

    /**
     * set maxprice value
     * @param maxprice: new value
     */
    public void setMaxprice(double maxprice) {
        updates.put(IWishlist.MAXPRICE, maxprice);
        this.maxprice = maxprice;
    }

    /**
     * 
     * @return Primarykey string value
     */
    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
