/*
 * Allnodes_stargatePK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 9.5.2022 11:11
 *
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IAllnodes_stargate;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class Allnodes_stargatePK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class Allnodes_stargatePK implements IAllnodes_stargatePK {

    private long id;
  
    /** 
     * Constructor
     * Creates an empty Allnodes_stargatePK
     */
    public Allnodes_stargatePK() {
    }

    /**
     * Constructor
     * build an empty Allnodes_stargatePK with initialized field values
     */
    public Allnodes_stargatePK(long id) {
        this.id = id;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"allnodes_stargate.id", id}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IAllnodes_stargate.ID, id}
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
     * @return Allnodes_stargatePK constructed from keystring
     */
    public static Allnodes_stargatePK getKey(String keystring) {
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
            return new Allnodes_stargatePK(id);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param allnodes_stargatePK2: Allnodes_stargatePK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IAllnodes_stargatePK allnodes_stargatePK2) {
        boolean isequal = allnodes_stargatePK2!=null;
        if(isequal) {
            isequal = isequal && this.id == allnodes_stargatePK2.getId();
        }
        return isequal;
    }
}
