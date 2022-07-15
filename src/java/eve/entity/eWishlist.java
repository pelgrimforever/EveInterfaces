/*
 * eWishlist.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.5.2022 11:24
 *
 */

package eve.entity;

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

import eve.eveDatabaseproperties;
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
	  
    @Override
    public String getDbtool() {
        return databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return connectionpool;
    }

    public static final String table = "wishlist";
	  
    @Override
    public String getTable() { return table; }

    @Override
    public String getClassName() { return this.getClass().getName(); };

    public String getFieldname(short fieldconstant) {
        return IWishlist.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IWishlist.fieldtypes[fieldconstant-1];
    }
        
    public eWishlist() {
    }

    public eWishlist(long evetype, java.lang.String username) {
        this.wishlistPK = new WishlistPK(evetype, username);
    }
  
    public eWishlist(WishlistPK wishlistPK) {
        this.wishlistPK = wishlistPK;
    }

    @Override
    public boolean isEmpty() {
        return this.wishlistPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.wishlistPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.wishlistPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(IWishlist.MAXPRICE, maxprice);
        return getAllFields();
    }
	
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

    public double getMaxprice() {
        return this.maxprice;
    }

    public void initMaxprice(double maxprice) {
        this.maxprice = maxprice;
    }

    public void setMaxprice(double maxprice) {
        updates.put(IWishlist.MAXPRICE, maxprice);
        this.maxprice = maxprice;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
