/*
 * Order_historyPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 9.11.2021 14:30
 *
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IOrder_history;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class Order_historyPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class Order_historyPK implements IOrder_historyPK {

    private IEvetypePK evetypePK = new EvetypePK();
    private IRegionPK regionPK = new RegionPK();
    private java.sql.Date date;
  
    /** 
     * Constructor
     * Creates an empty Order_historyPK
     */
    public Order_historyPK() {
    }

    /**
     * Constructor
     * build an empty Order_historyPK with initialized field values
     */
    public Order_historyPK(long region, long evetype, java.sql.Date date) {
        this.evetypePK = new EvetypePK(evetype);
        this.regionPK = new RegionPK(region);
        this.date = date;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"order_history.region", regionPK.getId()}, 
            {"order_history.evetype", evetypePK.getId()}, 
            {"order_history.date", date}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IOrder_history.REGION, regionPK.getId()}, 
            {IOrder_history.EVETYPE, evetypePK.getId()}, 
            {IOrder_history.DATE, date}
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
     * @return foreign key regionPK, instance of IRegionPK
     */
    public IRegionPK getRegionPK() {
        return this.regionPK;
    }

    /**
     * set foreign key regionPK
     * @param regionPK: instance of IRegionPK
     */
    public void setRegionPK(IRegionPK regionPK) {
        this.regionPK = regionPK;
    }

    /**
     * 
     * @return region value
     */
    public long getRegion() {
        return this.regionPK.getId();
    }

    /**
     * set region value
     * @param region: new value
     */
    public void setRegion(long region) {
        this.regionPK.setId(region);
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
     * @return date value
     */
    public java.sql.Date getDate() {
        return this.date;
    }

    /**
     * set date value
     * @param date: new value
     */
    public void setDate(java.sql.Date date) {
        this.date = date;
    }

    /**
     * 
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        key += getRegion();
        key += "_";

        key += getEvetype();
        key += "_";

        if(getDate()!=null) key += getDate().getTime();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return Order_historyPK constructed from keystring
     */
    public static Order_historyPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long region = Long.valueOf(keys.substring(0, keylength));
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
            java.sql.Date date = new Date(Long.valueOf(keys.substring(0, keylength)));
            return new Order_historyPK(region, evetype, date);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param order_historyPK2: Order_historyPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IOrder_historyPK order_historyPK2) {
        boolean isequal = order_historyPK2!=null;
        if(isequal) {
            isequal = isequal && this.evetypePK.equals(order_historyPK2.getEvetypePK());
            isequal = isequal && this.regionPK.equals(order_historyPK2.getRegionPK());
            isequal = isequal && this.date.equals(order_historyPK2.getDate());
        }
        return isequal;
    }
}
