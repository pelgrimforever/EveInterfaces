/*
 * RoutetypePK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.11.2021 14:51
 *
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IRoutetype;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class RoutetypePK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class RoutetypePK implements IRoutetypePK {

    private long id;
  
    /** 
     * Constructor
     * Creates an empty RoutetypePK
     */
    public RoutetypePK() {
    }

    /**
     * Constructor
     * build an empty RoutetypePK with initialized field values
     */
    public RoutetypePK(long id) {
        this.id = id;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"routetype.id", id}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IRoutetype.ID, id}
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
     * @return RoutetypePK constructed from keystring
     */
    public static RoutetypePK getKey(String keystring) {
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
            return new RoutetypePK(id);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param routetypePK2: RoutetypePK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IRoutetypePK routetypePK2) {
        boolean isequal = routetypePK2!=null;
        if(isequal) {
            isequal = isequal && this.id == routetypePK2.getId();
        }
        return isequal;
    }
}
