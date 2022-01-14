/*
 * AlliancePK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.0.2022 16:56
 *
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IAlliance;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class AlliancePK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class AlliancePK implements IAlliancePK {

    private long id;
  
    /** 
     * Constructor
     * Creates an empty AlliancePK
     */
    public AlliancePK() {
    }

    /**
     * Constructor
     * build an empty AlliancePK with initialized field values
     */
    public AlliancePK(long id) {
        this.id = id;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"alliance.id", id}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IAlliance.ID, id}
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
     * @return AlliancePK constructed from keystring
     */
    public static AlliancePK getKey(String keystring) {
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
            return new AlliancePK(id);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param alliancePK2: AlliancePK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IAlliancePK alliancePK2) {
        boolean isequal = alliancePK2!=null;
        if(isequal) {
            isequal = isequal && this.id == alliancePK2.getId();
        }
        return isequal;
    }
}
