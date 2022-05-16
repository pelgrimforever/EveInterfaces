/*
 * IShipfitmodulePK.java
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
 * Primary Key class ShipfitmodulePK for entity class Shipfitmodule
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IShipfitmodulePK extends EntityPK, Serializable {

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
     * @return moduletype value
     */
    public long getModuletype();

    /**
     * set moduletype value
     * @param moduletype: new value
     */
    public void setModuletype(long moduletype);


    /**
     * compare this primary key with second primary key
     * @param shipfitmodulePK2: ShipfitmodulePK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IShipfitmodulePK shipfitmodulePK2);

}
