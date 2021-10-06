/*
 * IRoutePK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 6.9.2021 16:29
 *
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;

import data.interfaces.db.EntityPKInterface;

/**
 * Primary Key class RoutePK for entity class Route
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IRoutePK extends EntityPKInterface, Serializable {

    /**
     *
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields();

    /**
     * 
     * @return foreign key routetypePK, instance of IRoutetypePK
     */
    public IRoutetypePK getRoutetypePK();
    /**
     * set foreign key RoutetypePK
     * @param routetypePK: instance of IRoutetypePK
     */
    public void setRoutetypePK(IRoutetypePK routetypePK);

    /**
     * 
     * @return foreign key systemPK, instance of ISystemPK
     */
    public ISystemPK getSystemPK();
    /**
     * set foreign key SystemPK
     * @param systemPK: instance of ISystemPK
     */
    public void setSystemPK(ISystemPK systemPK);

    /**
     * 
     * @return routetype value
     */
    public long getRoutetype();

    /**
     * set routetype value
     * @param routetype: new value
     */
    public void setRoutetype(long routetype);

    /**
     * 
     * @return system value
     */
    public long getSystem();

    /**
     * set system value
     * @param system: new value
     */
    public void setSystem(long system);

    /**
     *
     * @return primary key in one formatted string
     */
    public String getKeystring();

    /**
     * compare this primary key with second primary key
     * @param routePK2: RoutePK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IRoutePK routePK2);

}
