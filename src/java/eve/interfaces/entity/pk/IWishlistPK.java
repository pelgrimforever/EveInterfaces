/*
 * IWishlistPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 16.11.2021 17:36
 *
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

/**
 * Primary Key class WishlistPK for entity class Wishlist
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IWishlistPK extends EntityPK, Serializable {

    /**
     * 
     * @return foreign key evetypePK, instance of IEvetypePK
     */
    public IEvetypePK getEvetypePK();
    /**
     * set foreign key EvetypePK
     * @param evetypePK: instance of IEvetypePK
     */
    public void setEvetypePK(IEvetypePK evetypePK);

    /**
     * 
     * @return evetype value
     */
    public long getEvetype();

    /**
     * set evetype value
     * @param evetype: new value
     */
    public void setEvetype(long evetype);

    /**
     * 
     * @return username value
     */
    public java.lang.String getUsername();

    /**
     * set username value
     * @param username: new value
     */
    public void setUsername(java.lang.String username);


    /**
     * compare this primary key with second primary key
     * @param wishlistPK2: WishlistPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IWishlistPK wishlistPK2);

}
