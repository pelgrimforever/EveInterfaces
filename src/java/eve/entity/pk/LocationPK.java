/*
 * LocationPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 6.9.2021 16:29
 *
 */

package eve.entity.pk;

import data.interfaces.db.EntityPKInterface;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.ILocation;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Primarykey class LocationPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class LocationPK implements EntityPKInterface, ILocationPK {

    private long id;
  
    /** 
     * Constructor
     * Creates an empty LocationPK
     */
    public LocationPK() {
    }

    /**
     * Constructor
     * build an empty LocationPK with initialized field values
     */
    public LocationPK(long id) {
        this.id = id;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields() {
        Object[][] keyfields = { 
            {"location.id", id}
        };
        return keyfields;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value) for sql insert statement
     */
    public Object[][] getInsertKeyFields() {
        Object[][] keyfields = { 
            {ILocation.ID, id}
        };
        return keyfields;
    }

    /**
     * 
     * @return id value
     */
    public long getId() {
        return this.id;
    }

    /**
     * set id value
     * @param id: new value
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * 
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        key += getId();

        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return LocationPK constructed from keystring
     */
    public static LocationPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }

            long id = Long.valueOf(keys.substring(0, keylength));

            return new LocationPK(id);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param locationPK2: LocationPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ILocationPK locationPK2) {
        boolean isequal = locationPK2!=null;
        if(isequal) {
            isequal = isequal && this.id == locationPK2.getId();
        }
        return isequal;
    }
}
