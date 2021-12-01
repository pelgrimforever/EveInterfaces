/*
 * SettingsPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 30.10.2021 10:3
 *
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.ISettings;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class SettingsPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class SettingsPK implements ISettingsPK {

    private java.lang.String name;
  
    /** 
     * Constructor
     * Creates an empty SettingsPK
     */
    public SettingsPK() {
    }

    /**
     * Constructor
     * build an empty SettingsPK with initialized field values
     */
    public SettingsPK(java.lang.String name) {
        this.name = name;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"settings.name", name}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {ISettings.NAME, name}
        };
        return new Entityvalues(keyfields);
    }

    /**
     * 
     * @return name value
     */
    public java.lang.String getName() {
        return this.name;
    }

    /**
     * set name value
     * @param name: new value
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    /**
     * 
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        if(getName()!=null) key += getName().length() + "_" + getName();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return SettingsPK constructed from keystring
     */
    public static SettingsPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String name = keys.substring(0, keylength);
            return new SettingsPK(name);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param settingsPK2: SettingsPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ISettingsPK settingsPK2) {
        boolean isequal = settingsPK2!=null;
        if(isequal) {
            isequal = isequal && this.name.equals(settingsPK2.getName());
        }
        return isequal;
    }
}
