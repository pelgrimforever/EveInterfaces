/*
 * Order_histPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 8.5.2021 19:33
 *
 */

package eve.entity.pk;

import data.interfaces.db.EntityPKInterface;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IOrder_hist;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Primarykey class Order_histPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class Order_histPK implements EntityPKInterface, IOrder_histPK {

    private long id;
  
    /** 
     * Constructor
     * Creates an empty Order_histPK
     */
    public Order_histPK() {
    }

    /**
     * Constructor
     * build an empty Order_histPK with initialized field values
     */
    public Order_histPK(long id) {
        this.id = id;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields() {
        Object[][] keyfields = { 
            {"order_hist.id", id}
        };
        return keyfields;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value) for sql insert statement
     */
    public Object[][] getInsertKeyFields() {
        Object[][] keyfields = { 
            {IOrder_hist.ID, id}
        };
        return keyfields;
    }

    /**
     * 
     * @return id value
     */
    public long getId() {
        return this.id;
    }

    /**
     * set id value
     * @param id: new value
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * 
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        key += getId();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return Order_histPK constructed from keystring
     */
    public static Order_histPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long id = Long.valueOf(keys.substring(0, keylength));
            return new Order_histPK(id);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param order_histPK2: Order_histPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IOrder_histPK order_histPK2) {
        boolean isequal = order_histPK2!=null;
        if(isequal) {
            isequal = isequal && this.id == order_histPK2.getId();
        }
        return isequal;
    }
}
