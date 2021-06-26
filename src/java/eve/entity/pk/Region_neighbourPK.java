/*
 * Region_neighbourPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.5.2021 16:2
 *
 */

package eve.entity.pk;

import data.interfaces.db.EntityPKInterface;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IRegion_neighbour;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Primarykey class Region_neighbourPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class Region_neighbourPK implements EntityPKInterface, IRegion_neighbourPK {

    private IRegionPK regionRegionPK = new RegionPK();
    private IRegionPK regionNeighbourPK = new RegionPK();
  
    /** 
     * Constructor
     * Creates an empty Region_neighbourPK
     */
    public Region_neighbourPK() {
    }

    /**
     * Constructor
     * build an empty Region_neighbourPK with initialized field values
     */
    public Region_neighbourPK(long region, long neighbour) {
        this.regionRegionPK = new RegionPK(region);
        this.regionNeighbourPK = new RegionPK(neighbour);
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields() {
        Object[][] keyfields = { 
            {"region_neighbour.region", regionRegionPK.getId()}, 
            {"region_neighbour.neighbour", regionNeighbourPK.getId()}
        };
        return keyfields;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value) for sql insert statement
     */
    public Object[][] getInsertKeyFields() {
        Object[][] keyfields = { 
            {IRegion_neighbour.REGION, regionRegionPK.getId()}, 
            {IRegion_neighbour.NEIGHBOUR, regionNeighbourPK.getId()}
        };
        return keyfields;
    }

    /**
     * 
     * @return foreign key regionPK1, instance of IRegionPK
     */
    public IRegionPK getRegionregionPK() {
        return this.regionRegionPK;
    }

    /**
     * set foreign key regionRegionPK
     * @param regionPK: instance of IRegionPK
     */
    public void setRegionregionPK(IRegionPK regionPK) {
        this.regionRegionPK = regionPK;
    }

    /**
     * 
     * @return foreign key regionPK, instance of IRegionPK
     */
    public IRegionPK getRegionneighbourPK() {
        return this.regionNeighbourPK;
    }

    /**
     * set foreign key regionNeighbourPK
     * @param regionPK: instance of IRegionPK
     */
    public void setRegionneighbourPK(IRegionPK regionPK) {
        this.regionNeighbourPK = regionPK;
    }

    /**
     * 
     * @return region value
     */
    public long getRegion() {
        return this.regionRegionPK.getId();
    }

    /**
     * set region value
     * @param region: new value
     */
    public void setRegion(long region) {
        this.regionRegionPK.setId(region);
    }

    /**
     * 
     * @return neighbour value
     */
    public long getNeighbour() {
        return this.regionNeighbourPK.getId();
    }

    /**
     * set neighbour value
     * @param neighbour: new value
     */
    public void setNeighbour(long neighbour) {
        this.regionNeighbourPK.setId(neighbour);
    }

    /**
     * 
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        key += getRegion();
        key += "_";

        key += getNeighbour();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return Region_neighbourPK constructed from keystring
     */
    public static Region_neighbourPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long region = Long.valueOf(keys.substring(0, keylength));
            keys = keys.substring(keylength+1);

            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long neighbour = Long.valueOf(keys.substring(0, keylength));
            return new Region_neighbourPK(region, neighbour);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param region_neighbourPK2: Region_neighbourPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IRegion_neighbourPK region_neighbourPK2) {
        boolean isequal = region_neighbourPK2!=null;
        if(isequal) {
            isequal = isequal && this.regionRegionPK.equals(region_neighbourPK2.getRegionregionPK());
            isequal = isequal && this.regionNeighbourPK.equals(region_neighbourPK2.getRegionneighbourPK());
        }
        return isequal;
    }
}
