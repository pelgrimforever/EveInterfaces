/*
 * Allnodes_systemPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 16.11.2021 15:46
 *
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IAllnodes_system;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class Allnodes_systemPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class Allnodes_systemPK implements IAllnodes_systemPK {

    private long id;
  
    /** 
     * Constructor
     * Creates an empty Allnodes_systemPK
     */
    public Allnodes_systemPK() {
    }

    /**
     * Constructor
     * build an empty Allnodes_systemPK with initialized field values
     */
    public Allnodes_systemPK(long id) {
        this.id = id;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"allnodes_system.id", id}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IAllnodes_system.ID, id}
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
     * @return Allnodes_systemPK constructed from keystring
     */
    public static Allnodes_systemPK getKey(String keystring) {
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
            return new Allnodes_systemPK(id);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param allnodes_systemPK2: Allnodes_systemPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IAllnodes_systemPK allnodes_systemPK2) {
        boolean isequal = allnodes_systemPK2!=null;
        if(isequal) {
            isequal = isequal && this.id == allnodes_systemPK2.getId();
        }
        return isequal;
    }
}
