/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IWishlist;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class WishlistPK implements IWishlistPK {

    private IEvetypePK evetypePK = new EvetypePK();
    private java.lang.String username;
  
    public WishlistPK() {
    }

    public WishlistPK(long evetype, java.lang.String username) {
        this.evetypePK = new EvetypePK(evetype);
        this.username = username;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"wishlist.evetype", evetypePK.getId()}, 
            {"wishlist.username", username}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IWishlist.EVETYPE, evetypePK.getId()}, 
            {IWishlist.USERNAME, username}
        };
        return new Entityvalues(keyfields);
    }

    public IEvetypePK getEvetypePK() {
        return this.evetypePK;
    }

    public void setEvetypePK(IEvetypePK evetypePK) {
        this.evetypePK = evetypePK;
    }

    public long getEvetype() {
        return this.evetypePK.getId();
    }

    public void setEvetype(long evetype) {
        this.evetypePK.setId(evetype);
    }

    public java.lang.String getUsername() {
        return this.username;
    }

    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    public String getKeystring() {
        String key = "";
        key += getEvetype();
        key += "_";

        if(getUsername()!=null) key += getUsername().length() + "_" + getUsername();
        return key;
    }

    public static WishlistPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long evetype = Long.valueOf(keys.substring(0, keylength));
            keys = keys.substring(keylength+1);

            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String username = keys.substring(0, keylength);
            return new WishlistPK(evetype, username);
        }
    }

    public boolean equals(IWishlistPK wishlistPK2) {
        boolean isequal = wishlistPK2!=null;
        if(isequal) {
            isequal = isequal && this.evetypePK.equals(wishlistPK2.getEvetypePK());
            isequal = isequal && this.username.equals(wishlistPK2.getUsername());
        }
        return isequal;
    }
}
