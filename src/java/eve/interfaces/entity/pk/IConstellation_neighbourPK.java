/*
 * IConstellation_neighbourPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 8.5.2021 19:33
 *
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;

import data.interfaces.db.EntityPKInterface;

/**
 * Primary Key class Constellation_neighbourPK for entity class Constellation_neighbour
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IConstellation_neighbourPK extends EntityPKInterface, Serializable {

    /**
     *
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields();

    /**
     * 
     * @return foreign key constellationPK, instance of IConstellationPK
     */
    public IConstellationPK getConstellationneighbourPK();
    /**
     * set foreign key ConstellationPK
     * @param constellationPK: instance of IConstellationPK
     */
    public void setConstellationneighbourPK(IConstellationPK constellationPK);

    /**
     * 
     * @return foreign key constellationPK, instance of IConstellationPK
     */
    public IConstellationPK getConstellationconstellationPK();
    /**
     * set foreign key ConstellationPK
     * @param constellationPK: instance of IConstellationPK
     */
    public void setConstellationconstellationPK(IConstellationPK constellationPK);

    /**
     * 
     * @return constellation value
     */
    public long getConstellation();

    /**
     * set constellation value
     * @param constellation: new value
     */
    public void setConstellation(long constellation);

    /**
     * 
     * @return neighbour value
     */
    public long getNeighbour();

    /**
     * set neighbour value
     * @param neighbour: new value
     */
    public void setNeighbour(long neighbour);

    /**
     *
     * @return primary key in one formatted string
     */
    public String getKeystring();

    /**
     * compare this primary key with second primary key
     * @param constellation_neighbourPK2: Constellation_neighbourPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IConstellation_neighbourPK constellation_neighbourPK2);

}
