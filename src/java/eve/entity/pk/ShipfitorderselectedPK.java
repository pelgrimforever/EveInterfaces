/*
 * ShipfitorderselectedPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 20.11.2021 17:22
 *
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IShipfitorderselected;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class ShipfitorderselectedPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class ShipfitorderselectedPK implements IShipfitorderselectedPK {

    private IOrdersPK ordersPK = new OrdersPK();
    private IShipfitorderPK shipfitorderPK = new ShipfitorderPK();
  
    /** 
     * Constructor
     * Creates an empty ShipfitorderselectedPK
     */
    public ShipfitorderselectedPK() {
    }

    /**
     * Constructor
     * build an empty ShipfitorderselectedPK with initialized field values
     */
    public ShipfitorderselectedPK(java.lang.String username, java.lang.String shipname, long evetype, long orderid) {
        this.ordersPK = new OrdersPK(orderid);
        this.shipfitorderPK = new ShipfitorderPK(username, shipname, evetype);
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"shipfitorderselected.username", shipfitorderPK.getUsername()}, 
            {"shipfitorderselected.shipname", shipfitorderPK.getShipname()}, 
            {"shipfitorderselected.evetype", shipfitorderPK.getEvetype()}, 
            {"shipfitorderselected.orderid", ordersPK.getId()}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IShipfitorderselected.USERNAME, shipfitorderPK.getUsername()}, 
            {IShipfitorderselected.SHIPNAME, shipfitorderPK.getShipname()}, 
            {IShipfitorderselected.EVETYPE, shipfitorderPK.getEvetype()}, 
            {IShipfitorderselected.ORDERID, ordersPK.getId()}
        };
        return new Entityvalues(keyfields);
    }

    /**
     * 
     * @return foreign key ordersPK, instance of IOrdersPK
     */
    public IOrdersPK getOrdersPK() {
        return this.ordersPK;
    }

    /**
     * set foreign key ordersPK
     * @param ordersPK: instance of IOrdersPK
     */
    public void setOrdersPK(IOrdersPK ordersPK) {
        this.ordersPK = ordersPK;
    }

    /**
     * 
     * @return foreign key shipfitorderPK, instance of IShipfitorderPK
     */
    public IShipfitorderPK getShipfitorderPK() {
        return this.shipfitorderPK;
    }

    /**
     * set foreign key shipfitorderPK
     * @param shipfitorderPK: instance of IShipfitorderPK
     */
    public void setShipfitorderPK(IShipfitorderPK shipfitorderPK) {
        this.shipfitorderPK = shipfitorderPK;
    }

    /**
     * 
     * @return username value
     */
    public java.lang.String getUsername() {
        return this.shipfitorderPK.getUsername();
    }

    /**
     * set username value
     * @param username: new value
     */
    public void setUsername(java.lang.String username) {
        this.shipfitorderPK.setUsername(username);
    }

    /**
     * 
     * @return shipname value
     */
    public java.lang.String getShipname() {
        return this.shipfitorderPK.getShipname();
    }

    /**
     * set shipname value
     * @param shipname: new value
     */
    public void setShipname(java.lang.String shipname) {
        this.shipfitorderPK.setShipname(shipname);
    }

    /**
     * 
     * @return evetype value
     */
    public long getEvetype() {
        return this.shipfitorderPK.getEvetype();
    }

    /**
     * set evetype value
     * @param evetype: new value
     */
    public void setEvetype(long evetype) {
        this.shipfitorderPK.setEvetype(evetype);
    }

    /**
     * 
     * @return orderid value
     */
    public long getOrderid() {
        return this.ordersPK.getId();
    }

    /**
     * set orderid value
     * @param orderid: new value
     */
    public void setOrderid(long orderid) {
        this.ordersPK.setId(orderid);
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
        key += "_";

        key += getOrderid();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return ShipfitorderselectedPK constructed from keystring
     */
    public static ShipfitorderselectedPK getKey(String keystring) {
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
            keys = keys.substring(keylength+1);

            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long orderid = Long.valueOf(keys.substring(0, keylength));
            return new ShipfitorderselectedPK(username, shipname, evetype, orderid);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param shipfitorderselectedPK2: ShipfitorderselectedPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IShipfitorderselectedPK shipfitorderselectedPK2) {
        boolean isequal = shipfitorderselectedPK2!=null;
        if(isequal) {
            isequal = isequal && this.ordersPK.equals(shipfitorderselectedPK2.getOrdersPK());
            isequal = isequal && this.shipfitorderPK.equals(shipfitorderselectedPK2.getShipfitorderPK());
        }
        return isequal;
    }
}
