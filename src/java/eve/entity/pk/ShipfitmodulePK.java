/*
 * ShipfitmodulePK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.0.2022 16:56
 *
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IShipfitmodule;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class ShipfitmodulePK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class ShipfitmodulePK implements IShipfitmodulePK {

    private IEvetypePK evetypePK = new EvetypePK();
    private IShipfitPK shipfitPK = new ShipfitPK();
  
    /** 
     * Constructor
     * Creates an empty ShipfitmodulePK
     */
    public ShipfitmodulePK() {
    }

    /**
     * Constructor
     * build an empty ShipfitmodulePK with initialized field values
     */
    public ShipfitmodulePK(java.lang.String username, java.lang.String shipname, long moduletype) {
        this.evetypePK = new EvetypePK(moduletype);
        this.shipfitPK = new ShipfitPK(username, shipname);
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"shipfitmodule.username", shipfitPK.getUsername()}, 
            {"shipfitmodule.shipname", shipfitPK.getShipname()}, 
            {"shipfitmodule.moduletype", evetypePK.getId()}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IShipfitmodule.USERNAME, shipfitPK.getUsername()}, 
            {IShipfitmodule.SHIPNAME, shipfitPK.getShipname()}, 
            {IShipfitmodule.MODULETYPE, evetypePK.getId()}
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
     * @return foreign key shipfitPK, instance of IShipfitPK
     */
    public IShipfitPK getShipfitPK() {
        return this.shipfitPK;
    }

    /**
     * set foreign key shipfitPK
     * @param shipfitPK: instance of IShipfitPK
     */
    public void setShipfitPK(IShipfitPK shipfitPK) {
        this.shipfitPK = shipfitPK;
    }

    /**
     * 
     * @return username value
     */
    public java.lang.String getUsername() {
        return this.shipfitPK.getUsername();
    }

    /**
     * set username value
     * @param username: new value
     */
    public void setUsername(java.lang.String username) {
        this.shipfitPK.setUsername(username);
    }

    /**
     * 
     * @return shipname value
     */
    public java.lang.String getShipname() {
        return this.shipfitPK.getShipname();
    }

    /**
     * set shipname value
     * @param shipname: new value
     */
    public void setShipname(java.lang.String shipname) {
        this.shipfitPK.setShipname(shipname);
    }

    /**
     * 
     * @return moduletype value
     */
    public long getModuletype() {
        return this.evetypePK.getId();
    }

    /**
     * set moduletype value
     * @param moduletype: new value
     */
    public void setModuletype(long moduletype) {
        this.evetypePK.setId(moduletype);
    }

    /**
     * 
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        if(getUsername()!=null) key += getUsername().length() + "_" + getUsername();
        key += "_";

        if(getShipname()!=null) key += getShipname().length() + "_" + getShipname();
        key += "_";

        key += getModuletype();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return ShipfitmodulePK constructed from keystring
     */
    public static ShipfitmodulePK getKey(String keystring) {
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
            String shipname = keys.substring(0, keylength);
            keys = keys.substring(keylength+1);

            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long moduletype = Long.valueOf(keys.substring(0, keylength));
            return new ShipfitmodulePK(username, shipname, moduletype);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param shipfitmodulePK2: ShipfitmodulePK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IShipfitmodulePK shipfitmodulePK2) {
        boolean isequal = shipfitmodulePK2!=null;
        if(isequal) {
            isequal = isequal && this.evetypePK.equals(shipfitmodulePK2.getEvetypePK());
            isequal = isequal && this.shipfitPK.equals(shipfitmodulePK2.getShipfitPK());
        }
        return isequal;
    }
}
