/*
 * SystemjumpsPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.5.2021 13:35
 *
 */

package eve.entity.pk;

import data.interfaces.db.EntityPKInterface;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.ISystemjumps;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Primarykey class SystemjumpsPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class SystemjumpsPK implements EntityPKInterface, ISystemjumpsPK {

    private ISystemPK systemSystem_endPK = new SystemPK();
    private ISystemPK systemSystem_startPK = new SystemPK();
  
    /** 
     * Constructor
     * Creates an empty SystemjumpsPK
     */
    public SystemjumpsPK() {
    }

    /**
     * Constructor
     * build an empty SystemjumpsPK with initialized field values
     */
    public SystemjumpsPK(long system_start, long system_end) {
        this.systemSystem_endPK = new SystemPK(system_end);
        this.systemSystem_startPK = new SystemPK(system_start);
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields() {
        Object[][] keyfields = { 
            {"systemjumps.system_start", systemSystem_startPK.getId()}, 
            {"systemjumps.system_end", systemSystem_endPK.getId()}
        };
        return keyfields;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value) for sql insert statement
     */
    public Object[][] getInsertKeyFields() {
        Object[][] keyfields = { 
            {ISystemjumps.SYSTEM_START, systemSystem_startPK.getId()}, 
            {ISystemjumps.SYSTEM_END, systemSystem_endPK.getId()}
        };
        return keyfields;
    }

    /**
     * 
     * @return foreign key systemPK1, instance of ISystemPK
     */
    public ISystemPK getSystemsystem_endPK() {
        return this.systemSystem_endPK;
    }

    /**
     * set foreign key systemSystem_endPK
     * @param systemPK: instance of ISystemPK
     */
    public void setSystemsystem_endPK(ISystemPK systemPK) {
        this.systemSystem_endPK = systemPK;
    }

    /**
     * 
     * @return foreign key systemPK, instance of ISystemPK
     */
    public ISystemPK getSystemsystem_startPK() {
        return this.systemSystem_startPK;
    }

    /**
     * set foreign key systemSystem_startPK
     * @param systemPK: instance of ISystemPK
     */
    public void setSystemsystem_startPK(ISystemPK systemPK) {
        this.systemSystem_startPK = systemPK;
    }

    /**
     * 
     * @return system_start value
     */
    public long getSystem_start() {
        return this.systemSystem_startPK.getId();
    }

    /**
     * set system_start value
     * @param system_start: new value
     */
    public void setSystem_start(long system_start) {
        this.systemSystem_startPK.setId(system_start);
    }

    /**
     * 
     * @return system_end value
     */
    public long getSystem_end() {
        return this.systemSystem_endPK.getId();
    }

    /**
     * set system_end value
     * @param system_end: new value
     */
    public void setSystem_end(long system_end) {
        this.systemSystem_endPK.setId(system_end);
    }

    /**
     * 
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        key += getSystem_start();
        key += "_";

        key += getSystem_end();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return SystemjumpsPK constructed from keystring
     */
    public static SystemjumpsPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long system_start = Long.valueOf(keys.substring(0, keylength));
            keys = keys.substring(keylength+1);

            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long system_end = Long.valueOf(keys.substring(0, keylength));
            return new SystemjumpsPK(system_start, system_end);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param systemjumpsPK2: SystemjumpsPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ISystemjumpsPK systemjumpsPK2) {
        boolean isequal = systemjumpsPK2!=null;
        if(isequal) {
            isequal = isequal && this.systemSystem_endPK.equals(systemjumpsPK2.getSystemsystem_endPK());
            isequal = isequal && this.systemSystem_startPK.equals(systemjumpsPK2.getSystemsystem_startPK());
        }
        return isequal;
    }
}
