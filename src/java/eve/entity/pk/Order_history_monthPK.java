/*
 * Order_history_monthPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 9.5.2022 11:11
 *
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IOrder_history_month;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class Order_history_monthPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class Order_history_monthPK implements IOrder_history_monthPK {

    private IEvetypePK evetypePK = new EvetypePK();
    private IRegionPK regionPK = new RegionPK();
    private int year;
    private int month;
  
    /** 
     * Constructor
     * Creates an empty Order_history_monthPK
     */
    public Order_history_monthPK() {
    }

    /**
     * Constructor
     * build an empty Order_history_monthPK with initialized field values
     */
    public Order_history_monthPK(long region, long evetype, int year, int month) {
        this.evetypePK = new EvetypePK(evetype);
        this.regionPK = new RegionPK(region);
        this.year = year;
        this.month = month;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"order_history_month.region", regionPK.getId()}, 
            {"order_history_month.evetype", evetypePK.getId()}, 
            {"order_history_month.year", year}, 
            {"order_history_month.month", month}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IOrder_history_month.REGION, regionPK.getId()}, 
            {IOrder_history_month.EVETYPE, evetypePK.getId()}, 
            {IOrder_history_month.YEAR, year}, 
            {IOrder_history_month.MONTH, month}
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
     * @return year value
     */
    public int getYear() {
        return this.year;
    }

    /**
     * set year value
     * @param year: new value
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * 
     * @return month value
     */
    public int getMonth() {
        return this.month;
    }

    /**
     * set month value
     * @param month: new value
     */
    public void setMonth(int month) {
        this.month = month;
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

        key += getYear();
        key += "_";

        key += getMonth();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return Order_history_monthPK constructed from keystring
     */
    public static Order_history_monthPK getKey(String keystring) {
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
            int year = Integer.valueOf(keys.substring(0, keylength));
            keys = keys.substring(keylength+1);

            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            int month = Integer.valueOf(keys.substring(0, keylength));
            return new Order_history_monthPK(region, evetype, year, month);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param order_history_monthPK2: Order_history_monthPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IOrder_history_monthPK order_history_monthPK2) {
        boolean isequal = order_history_monthPK2!=null;
        if(isequal) {
            isequal = isequal && this.evetypePK.equals(order_history_monthPK2.getEvetypePK());
            isequal = isequal && this.regionPK.equals(order_history_monthPK2.getRegionPK());
            isequal = isequal && this.year == order_history_monthPK2.getYear();
            isequal = isequal && this.month == order_history_monthPK2.getMonth();
        }
        return isequal;
    }
}
