/*
 * RacePK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 30.10.2021 10:3
 *
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IRace;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class RacePK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class RacePK implements IRacePK {

    private long id;
  
    /** 
     * Constructor
     * Creates an empty RacePK
     */
    public RacePK() {
    }

    /**
     * Constructor
     * build an empty RacePK with initialized field values
     */
    public RacePK(long id) {
        this.id = id;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"race.id", id}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IRace.ID, id}
        };
        return new Entityvalues(keyfields);
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
     * @return RacePK constructed from keystring
     */
    public static RacePK getKey(String keystring) {
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
            return new RacePK(id);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param racePK2: RacePK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IRacePK racePK2) {
        boolean isequal = racePK2!=null;
        if(isequal) {
            isequal = isequal && this.id == racePK2.getId();
        }
        return isequal;
    }
}
