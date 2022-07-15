/*
 * IRegion_neighbourPK.java
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
 * Primary Key class Region_neighbourPK for entity class Region_neighbour
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IRegion_neighbourPK extends EntityPK, Serializable {

    /**
     * 
     * @return foreign key regionPK, instance of IRegionPK
     */
    public IRegionPK getRegionregionPK();
    /**
     * set foreign key RegionPK
     * @param regionPK: instance of IRegionPK
     */
    public void setRegionregionPK(IRegionPK regionPK);

    /**
     * 
     * @return foreign key regionPK, instance of IRegionPK
     */
    public IRegionPK getRegionneighbourPK();
    /**
     * set foreign key RegionPK
     * @param regionPK: instance of IRegionPK
     */
    public void setRegionneighbourPK(IRegionPK regionPK);

    /**
     * 
     * @return region value
     */
    public long getRegion();

    /**
     * set region value
     * @param region: new value
     */
    public void setRegion(long region);

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
     * compare this primary key with second primary key
     * @param region_neighbourPK2: Region_neighbourPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IRegion_neighbourPK region_neighbourPK2);

}
