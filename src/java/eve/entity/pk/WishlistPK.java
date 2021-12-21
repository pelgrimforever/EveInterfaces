/*
 * WishlistPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 16.11.2021 17:36
 *
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

/**
 * Primarykey class WishlistPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class WishlistPK implements IWishlistPK {

    private IEvetypePK evetypePK = new EvetypePK();
    private java.lang.String username;
  
    /** 
     * Constructor
     * Creates an empty WishlistPK
     */
    public WishlistPK() {
    }

    /**
     * Constructor
     * build an empty WishlistPK with initialized field values
     */
    public WishlistPK(long evetype, java.lang.String username) {
        this.evetypePK = new EvetypePK(evetype);
        this.username = username;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"wishlist.evetype", evetypePK.getId()}, 
            {"wishlist.username", username}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IWishlist.EVETYPE, evetypePK.getId()}, 
            {IWishlist.USERNAME, username}
        };
        return new Entityvalues(keyfields);
    }

    /**
     * 
     * @return foreign key evetypePK, instance of IEvetypePK
     */
    public IEvetypePK getEvetypePK() {
        return this.evetypePK;
    }

    /**
     * set foreign key evetypePK
     * @param evetypePK: instance of IEvetypePK
     */
    public void setEvetypePK(IEvetypePK evetypePK) {
        this.evetypePK = evetypePK;
    }

    /**
     * 
     * @return evetype value
     */
    public long getEvetype() {
        return this.evetypePK.getId();
    }

    /**
     * set evetype value
     * @param evetype: new value
     */
    public void setEvetype(long evetype) {
        this.evetypePK.setId(evetype);
    }

    /**
     * 
     * @return username value
     */
    public java.lang.String getUsername() {
        return this.username;
    }

    /**
     * set username value
     * @param username: new value
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    /**
     * 
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        key += getEvetype();
        key += "_";

        if(getUsername()!=null) key += getUsername().length() + "_" + getUsername();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return WishlistPK constructed from keystring
     */
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

    /**
     * compare this primary key with second primary key
     * @param wishlistPK2: WishlistPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IWishlistPK wishlistPK2) {
        boolean isequal = wishlistPK2!=null;
        if(isequal) {
            isequal = isequal && this.evetypePK.equals(wishlistPK2.getEvetypePK());
            isequal = isequal && this.username.equals(wishlistPK2.getUsername());
        }
        return isequal;
    }
}
