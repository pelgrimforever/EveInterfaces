/*
 * IStationPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 6.9.2021 16:29
 *
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;

import data.interfaces.db.EntityPKInterface;

/**
 * Primary Key class StationPK for entity class Station
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IStationPK extends EntityPKInterface, Serializable {

    /**
     *
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields();

    /**
     * 
     * @return id value
     */
    public long getId();

    /**
     * set id value
     * @param id: new value
     */
    public void setId(long id);

    /**
     *
     * @return primary key in one formatted string
     */
    public String getKeystring();

    /**
     * compare this primary key with second primary key
     * @param stationPK2: StationPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IStationPK stationPK2);

}
