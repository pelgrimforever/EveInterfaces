/*
 * UsersettingsPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 11.4.2022 9:13
 *
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IUsersettings;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class UsersettingsPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class UsersettingsPK implements IUsersettingsPK {

    private ISettingsPK settingsPK = new SettingsPK();
    private java.lang.String username;
  
    /** 
     * Constructor
     * Creates an empty UsersettingsPK
     */
    public UsersettingsPK() {
    }

    /**
     * Constructor
     * build an empty UsersettingsPK with initialized field values
     */
    public UsersettingsPK(java.lang.String username, java.lang.String name) {
        this.settingsPK = new SettingsPK(name);
        this.username = username;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"usersettings.name", settingsPK.getName()}, 
            {"usersettings.username", username}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IUsersettings.NAME, settingsPK.getName()}, 
            {IUsersettings.USERNAME, username}
        };
        return new Entityvalues(keyfields);
    }

    /**
     * 
     * @return foreign key settingsPK, instance of ISettingsPK
     */
    public ISettingsPK getSettingsPK() {
        return this.settingsPK;
    }

    /**
     * set foreign key settingsPK
     * @param settingsPK: instance of ISettingsPK
     */
    public void setSettingsPK(ISettingsPK settingsPK) {
        this.settingsPK = settingsPK;
    }

    /**
     * 
     * @return name value
     */
    public java.lang.String getName() {
        return this.settingsPK.getName();
    }

    /**
     * set name value
     * @param name: new value
     */
    public void setName(java.lang.String name) {
        this.settingsPK.setName(name);
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
        key += "_";

        if(getName()!=null) key += getName().length() + "_" + getName();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return UsersettingsPK constructed from keystring
     */
    public static UsersettingsPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String username = keys.substring(0, keylength);
            keys = keys.substring(keylength+1);

            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String name = keys.substring(0, keylength);
            return new UsersettingsPK(username, name);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param usersettingsPK2: UsersettingsPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IUsersettingsPK usersettingsPK2) {
        boolean isequal = usersettingsPK2!=null;
        if(isequal) {
            isequal = isequal && this.settingsPK.equals(usersettingsPK2.getSettingsPK());
            isequal = isequal && this.username.equals(usersettingsPK2.getUsername());
        }
        return isequal;
    }
}
