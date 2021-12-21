/*
 * ShipfitorderPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 19.11.2021 16:16
 *
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IShipfitorder;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class ShipfitorderPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class ShipfitorderPK implements IShipfitorderPK {

    private IShipfitPK shipfitPK = new ShipfitPK();
    private IEvetypePK evetypePK = new EvetypePK();
  
    /** 
     * Constructor
     * Creates an empty ShipfitorderPK
     */
    public ShipfitorderPK() {
    }

    /**
     * Constructor
     * build an empty ShipfitorderPK with initialized field values
     */
    public ShipfitorderPK(java.lang.String username, java.lang.String shipname, long evetype) {
        this.shipfitPK = new ShipfitPK(username, shipname);
        this.evetypePK = new EvetypePK(evetype);
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"shipfitorder.username", shipfitPK.getUsername()}, 
            {"shipfitorder.shipname", shipfitPK.getShipname()}, 
            {"shipfitorder.evetype", evetypePK.getId()}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IShipfitorder.USERNAME, shipfitPK.getUsername()}, 
            {IShipfitorder.SHIPNAME, shipfitPK.getShipname()}, 
            {IShipfitorder.EVETYPE, evetypePK.getId()}
        };
        return new Entityvalues(keyfields);
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
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        if(getUsername()!=null) key += getUsername().length() + "_" + getUsername();
        key += "_";

        if(getShipname()!=null) key += getShipname().length() + "_" + getShipname();
        key += "_";

        key += getEvetype();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return ShipfitorderPK constructed from keystring
     */
    public static ShipfitorderPK getKey(String keystring) {
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
            long evetype = Long.valueOf(keys.substring(0, keylength));
            return new ShipfitorderPK(username, shipname, evetype);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param shipfitorderPK2: ShipfitorderPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IShipfitorderPK shipfitorderPK2) {
        boolean isequal = shipfitorderPK2!=null;
        if(isequal) {
            isequal = isequal && this.shipfitPK.equals(shipfitorderPK2.getShipfitPK());
            isequal = isequal && this.evetypePK.equals(shipfitorderPK2.getEvetypePK());
        }
        return isequal;
    }
}
