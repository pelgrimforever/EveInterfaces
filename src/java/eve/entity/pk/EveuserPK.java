/*
 * EveuserPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 9.5.2022 11:11
 *
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IEveuser;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class EveuserPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class EveuserPK implements IEveuserPK {

    private java.lang.String username;
  
    /** 
     * Constructor
     * Creates an empty EveuserPK
     */
    public EveuserPK() {
    }

    /**
     * Constructor
     * build an empty EveuserPK with initialized field values
     */
    public EveuserPK(java.lang.String username) {
        this.username = username;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"eveuser.username", username}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IEveuser.USERNAME, username}
        };
        return new Entityvalues(keyfields);
    }

    /**
     * 
     * @return username value
     */
    public java.lang.String getUsername() {
        return this.username;
    }

    /**
     * set username value
     * @param username: new value
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    /**
     * 
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        if(getUsername()!=null) key += getUsername().length() + "_" + getUsername();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return EveuserPK constructed from keystring
     */
    public static EveuserPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String username = keys.substring(0, keylength);
            return new EveuserPK(username);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param eveuserPK2: EveuserPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IEveuserPK eveuserPK2) {
        boolean isequal = eveuserPK2!=null;
        if(isequal) {
            isequal = isequal && this.username.equals(eveuserPK2.getUsername());
        }
        return isequal;
    }
}
