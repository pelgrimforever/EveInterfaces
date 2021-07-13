/*
 * RegionPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 12.6.2021 13:57
 *
 */

package eve.entity.pk;

import data.interfaces.db.EntityPKInterface;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IRegion;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Primarykey class RegionPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class RegionPK implements EntityPKInterface, IRegionPK {

    private long id;
  
    /** 
     * Constructor
     * Creates an empty RegionPK
     */
    public RegionPK() {
    }

    /**
     * Constructor
     * build an empty RegionPK with initialized field values
     */
    public RegionPK(long id) {
        this.id = id;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields() {
        Object[][] keyfields = { 
            {"region.id", id}
        };
        return keyfields;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value) for sql insert statement
     */
    public Object[][] getInsertKeyFields() {
        Object[][] keyfields = { 
            {IRegion.ID, id}
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
     * @return RegionPK constructed from keystring
     */
    public static RegionPK getKey(String keystring) {
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
            return new RegionPK(id);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param regionPK2: RegionPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IRegionPK regionPK2) {
        boolean isequal = regionPK2!=null;
        if(isequal) {
            isequal = isequal && this.id == regionPK2.getId();
        }
        return isequal;
    }
}
