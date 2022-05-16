/*
 * SystemactivityPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 5.3.2022 17:21
 *
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.ISystemactivity;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class SystemactivityPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class SystemactivityPK implements ISystemactivityPK {

    private ISystemPK systemPK = new SystemPK();
    private java.sql.Timestamp timeslot;
  
    /** 
     * Constructor
     * Creates an empty SystemactivityPK
     */
    public SystemactivityPK() {
    }

    /**
     * Constructor
     * build an empty SystemactivityPK with initialized field values
     */
    public SystemactivityPK(long systemid, java.sql.Timestamp timeslot) {
        this.systemPK = new SystemPK(systemid);
        this.timeslot = timeslot;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"systemactivity.systemid", systemPK.getId()}, 
            {"systemactivity.timeslot", timeslot}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {ISystemactivity.SYSTEMID, systemPK.getId()}, 
            {ISystemactivity.TIMESLOT, timeslot}
        };
        return new Entityvalues(keyfields);
    }

    /**
     * 
     * @return foreign key systemPK, instance of ISystemPK
     */
    public ISystemPK getSystemPK() {
        return this.systemPK;
    }

    /**
     * set foreign key systemPK
     * @param systemPK: instance of ISystemPK
     */
    public void setSystemPK(ISystemPK systemPK) {
        this.systemPK = systemPK;
    }

    /**
     * 
     * @return systemid value
     */
    public long getSystemid() {
        return this.systemPK.getId();
    }

    /**
     * set systemid value
     * @param systemid: new value
     */
    public void setSystemid(long systemid) {
        this.systemPK.setId(systemid);
    }

    /**
     * 
     * @return timeslot value
     */
    public java.sql.Timestamp getTimeslot() {
        return this.timeslot;
    }

    /**
     * set timeslot value
     * @param timeslot: new value
     */
    public void setTimeslot(java.sql.Timestamp timeslot) {
        this.timeslot = timeslot;
    }

    /**
     * 
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        key += getSystemid();
        key += "_";

        if(getTimeslot()!=null) key += getTimeslot().getTime();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return SystemactivityPK constructed from keystring
     */
    public static SystemactivityPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long systemid = Long.valueOf(keys.substring(0, keylength));
            keys = keys.substring(keylength+1);

            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            java.sql.Timestamp timeslot = new Timestamp(Long.valueOf(keys.substring(0, keylength)));
            return new SystemactivityPK(systemid, timeslot);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param systemactivityPK2: SystemactivityPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ISystemactivityPK systemactivityPK2) {
        boolean isequal = systemactivityPK2!=null;
        if(isequal) {
            isequal = isequal && this.systemPK.equals(systemactivityPK2.getSystemPK());
            isequal = isequal && this.timeslot.equals(systemactivityPK2.getTimeslot());
        }
        return isequal;
    }
}
