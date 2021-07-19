/*
 * Tmp_system_jumpsPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 18.6.2021 14:35
 *
 */

package eve.entity.pk;

import data.interfaces.db.EntityPKInterface;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.ITmp_system_jumps;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Primarykey class Tmp_system_jumpsPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class Tmp_system_jumpsPK implements EntityPKInterface, ITmp_system_jumpsPK {

    private long system;
  
    /** 
     * Constructor
     * Creates an empty Tmp_system_jumpsPK
     */
    public Tmp_system_jumpsPK() {
    }

    /**
     * Constructor
     * build an empty Tmp_system_jumpsPK with initialized field values
     */
    public Tmp_system_jumpsPK(long system) {
        this.system = system;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields() {
        Object[][] keyfields = { 
            {"tmp_system_jumps.system", system}
        };
        return keyfields;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value) for sql insert statement
     */
    public Object[][] getInsertKeyFields() {
        Object[][] keyfields = { 
            {ITmp_system_jumps.SYSTEM, system}
        };
        return keyfields;
    }

    /**
     * 
     * @return system value
     */
    public long getSystem() {
        return this.system;
    }

    /**
     * set system value
     * @param system: new value
     */
    public void setSystem(long system) {
        this.system = system;
    }

    /**
     * 
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        key += getSystem();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return Tmp_system_jumpsPK constructed from keystring
     */
    public static Tmp_system_jumpsPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long system = Long.valueOf(keys.substring(0, keylength));
            return new Tmp_system_jumpsPK(system);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param tmp_system_jumpsPK2: Tmp_system_jumpsPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ITmp_system_jumpsPK tmp_system_jumpsPK2) {
        boolean isequal = tmp_system_jumpsPK2!=null;
        if(isequal) {
            isequal = isequal && this.system == tmp_system_jumpsPK2.getSystem();
        }
        return isequal;
    }
}
