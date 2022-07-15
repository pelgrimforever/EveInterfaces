/*
 * IShipfitorderPK.java
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
 * Primary Key class ShipfitorderPK for entity class Shipfitorder
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IShipfitorderPK extends EntityPK, Serializable {

    /**
     * 
     * @return foreign key shipfitPK, instance of IShipfitPK
     */
    public IShipfitPK getShipfitPK();
    /**
     * set foreign key ShipfitPK
     * @param shipfitPK: instance of IShipfitPK
     */
    public void setShipfitPK(IShipfitPK shipfitPK);

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
     * compare this primary key with second primary key
     * @param shipfitorderPK2: ShipfitorderPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IShipfitorderPK shipfitorderPK2);

}
