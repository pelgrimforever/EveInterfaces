/*
 * MaterialinputPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 19.0.2022 21:56
 *
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IMaterialinput;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class MaterialinputPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class MaterialinputPK implements IMaterialinputPK {

    private IEvetypePK evetypePK = new EvetypePK();
    private java.lang.String username;
    private java.sql.Timestamp addtimestamp;
  
    /** 
     * Constructor
     * Creates an empty MaterialinputPK
     */
    public MaterialinputPK() {
    }

    /**
     * Constructor
     * build an empty MaterialinputPK with initialized field values
     */
    public MaterialinputPK(java.lang.String username, long evetype, java.sql.Timestamp addtimestamp) {
        this.evetypePK = new EvetypePK(evetype);
        this.username = username;
        this.addtimestamp = addtimestamp;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"materialinput.evetype", evetypePK.getId()}, 
            {"materialinput.username", username}, 
            {"materialinput.addtimestamp", addtimestamp}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IMaterialinput.EVETYPE, evetypePK.getId()}, 
            {IMaterialinput.USERNAME, username}, 
            {IMaterialinput.ADDTIMESTAMP, addtimestamp}
        };
        return new Entityvalues(keyfields);
    }

    /**
     * 
     * @return foreign key evetypePK, instance of IEvetypePK
     */
    public IEvetypePK getEvetypePK() {
        return this.evetypePK;
    }

    /**
     * set foreign key evetypePK
     * @param evetypePK: instance of IEvetypePK
     */
    public void setEvetypePK(IEvetypePK evetypePK) {
        this.evetypePK = evetypePK;
    }

    /**
     * 
     * @return evetype value
     */
    public long getEvetype() {
        return this.evetypePK.getId();
    }

    /**
     * set evetype value
     * @param evetype: new value
     */
    public void setEvetype(long evetype) {
        this.evetypePK.setId(evetype);
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
     * @return addtimestamp value
     */
    public java.sql.Timestamp getAddtimestamp() {
        return this.addtimestamp;
    }

    /**
     * set addtimestamp value
     * @param addtimestamp: new value
     */
    public void setAddtimestamp(java.sql.Timestamp addtimestamp) {
        this.addtimestamp = addtimestamp;
    }

    /**
     * 
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        if(getUsername()!=null) key += getUsername().length() + "_" + getUsername();
        key += "_";

        key += getEvetype();
        key += "_";

        if(getAddtimestamp()!=null) key += getAddtimestamp().getTime();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return MaterialinputPK constructed from keystring
     */
    public static MaterialinputPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String username = keys.substring(0, keylength);
            keys = keys.substring(keylength+1);

            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long evetype = Long.valueOf(keys.substring(0, keylength));
            keys = keys.substring(keylength+1);

            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            java.sql.Timestamp addtimestamp = new Timestamp(Long.valueOf(keys.substring(0, keylength)));
            return new MaterialinputPK(username, evetype, addtimestamp);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param materialinputPK2: MaterialinputPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IMaterialinputPK materialinputPK2) {
        boolean isequal = materialinputPK2!=null;
        if(isequal) {
            isequal = isequal && this.evetypePK.equals(materialinputPK2.getEvetypePK());
            isequal = isequal && this.username.equals(materialinputPK2.getUsername());
            isequal = isequal && this.addtimestamp.equals(materialinputPK2.getAddtimestamp());
        }
        return isequal;
    }
}
