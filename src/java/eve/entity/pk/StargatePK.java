/*
 * StargatePK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 8.5.2021 19:33
 *
 */

package eve.entity.pk;

import data.interfaces.db.EntityPKInterface;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IStargate;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Primarykey class StargatePK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class StargatePK implements EntityPKInterface, IStargatePK {

    private long id;
  
    /** 
     * Constructor
     * Creates an empty StargatePK
     */
    public StargatePK() {
    }

    /**
     * Constructor
     * build an empty StargatePK with initialized field values
     */
    public StargatePK(long id) {
        this.id = id;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields() {
        Object[][] keyfields = { 
            {"stargate.id", id}
        };
        return keyfields;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value) for sql insert statement
     */
    public Object[][] getInsertKeyFields() {
        Object[][] keyfields = { 
            {IStargate.ID, id}
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
     * @return StargatePK constructed from keystring
     */
    public static StargatePK getKey(String keystring) {
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
            return new StargatePK(id);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param stargatePK2: StargatePK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IStargatePK stargatePK2) {
        boolean isequal = stargatePK2!=null;
        if(isequal) {
            isequal = isequal && this.id == stargatePK2.getId();
        }
        return isequal;
    }
}
