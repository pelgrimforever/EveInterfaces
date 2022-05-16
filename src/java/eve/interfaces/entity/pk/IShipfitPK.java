/*
 * IShipfitPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 11.4.2022 9:13
 *
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

/**
 * Primary Key class ShipfitPK for entity class Shipfit
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IShipfitPK extends EntityPK, Serializable {

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
     * compare this primary key with second primary key
     * @param shipfitPK2: ShipfitPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IShipfitPK shipfitPK2);

}
