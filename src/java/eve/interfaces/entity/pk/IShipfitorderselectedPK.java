/*
 * IShipfitorderselectedPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 9.5.2022 11:11
 *
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

/**
 * Primary Key class ShipfitorderselectedPK for entity class Shipfitorderselected
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IShipfitorderselectedPK extends EntityPK, Serializable {

    /**
     * 
     * @return foreign key ordersPK, instance of IOrdersPK
     */
    public IOrdersPK getOrdersPK();
    /**
     * set foreign key OrdersPK
     * @param ordersPK: instance of IOrdersPK
     */
    public void setOrdersPK(IOrdersPK ordersPK);

    /**
     * 
     * @return foreign key shipfitorderPK, instance of IShipfitorderPK
     */
    public IShipfitorderPK getShipfitorderPK();
    /**
     * set foreign key ShipfitorderPK
     * @param shipfitorderPK: instance of IShipfitorderPK
     */
    public void setShipfitorderPK(IShipfitorderPK shipfitorderPK);

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
     * 
     * @return shipname value
     */
    public java.lang.String getShipname();

    /**
     * set shipname value
     * @param shipname: new value
     */
    public void setShipname(java.lang.String shipname);

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
     * @return orderid value
     */
    public long getOrderid();

    /**
     * set orderid value
     * @param orderid: new value
     */
    public void setOrderid(long orderid);


    /**
     * compare this primary key with second primary key
     * @param shipfitorderselectedPK2: ShipfitorderselectedPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IShipfitorderselectedPK shipfitorderselectedPK2);

}
