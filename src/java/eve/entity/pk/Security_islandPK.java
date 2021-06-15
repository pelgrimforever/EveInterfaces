/*
 * Security_islandPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.5.2021 13:35
 *
 */

package eve.entity.pk;

import data.interfaces.db.EntityPKInterface;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.ISecurity_island;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Primarykey class Security_islandPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class Security_islandPK implements EntityPKInterface, ISecurity_islandPK {

    private long id;
  
    /** 
     * Constructor
     * Creates an empty Security_islandPK
     */
    public Security_islandPK() {
    }

    /**
     * Constructor
     * build an empty Security_islandPK with initialized field values
     */
    public Security_islandPK(long id) {
        this.id = id;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields() {
        Object[][] keyfields = { 
            {"security_island.id", id}
        };
        return keyfields;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value) for sql insert statement
     */
    public Object[][] getInsertKeyFields() {
        Object[][] keyfields = { 
            {ISecurity_island.ID, id}
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
     * @return Security_islandPK constructed from keystring
     */
    public static Security_islandPK getKey(String keystring) {
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
            return new Security_islandPK(id);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param security_islandPK2: Security_islandPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ISecurity_islandPK security_islandPK2) {
        boolean isequal = security_islandPK2!=null;
        if(isequal) {
            isequal = isequal && this.id == security_islandPK2.getId();
        }
        return isequal;
    }
}
