/*
 * ShipfitPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 17.11.2021 15:34
 *
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IShipfit;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class ShipfitPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class ShipfitPK implements IShipfitPK {

    private java.lang.String username;
    private java.lang.String shipname;
  
    /** 
     * Constructor
     * Creates an empty ShipfitPK
     */
    public ShipfitPK() {
    }

    /**
     * Constructor
     * build an empty ShipfitPK with initialized field values
     */
    public ShipfitPK(java.lang.String username, java.lang.String shipname) {
        this.username = username;
        this.shipname = shipname;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"shipfit.username", username}, 
            {"shipfit.shipname", shipname}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IShipfit.USERNAME, username}, 
            {IShipfit.SHIPNAME, shipname}
        };
        return new Entityvalues(keyfields);
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
     * @return shipname value
     */
    public java.lang.String getShipname() {
        return this.shipname;
    }

    /**
     * set shipname value
     * @param shipname: new value
     */
    public void setShipname(java.lang.String shipname) {
        this.shipname = shipname;
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
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return ShipfitPK constructed from keystring
     */
    public static ShipfitPK getKey(String keystring) {
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
            return new ShipfitPK(username, shipname);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param shipfitPK2: ShipfitPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IShipfitPK shipfitPK2) {
        boolean isequal = shipfitPK2!=null;
        if(isequal) {
            isequal = isequal && this.username.equals(shipfitPK2.getUsername());
            isequal = isequal && this.shipname.equals(shipfitPK2.getShipname());
        }
        return isequal;
    }
}
