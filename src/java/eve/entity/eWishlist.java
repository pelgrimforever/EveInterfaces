/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
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
        
    @Override
    public String getDbtool() {
        return eWishlist.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eWishlist.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eWishlist() {
    }

    public eWishlist(long evetype, java.lang.String username) {
        this.wishlistPK = new WishlistPK(evetype, username);
    }
  
    public eWishlist(WishlistPK wishlistPK) {
        this.wishlistPK = wishlistPK;
    }

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
