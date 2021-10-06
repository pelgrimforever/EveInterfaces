/*
 * StockPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 6.9.2021 16:29
 *
 */

package eve.entity.pk;

import data.interfaces.db.EntityPKInterface;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IStock;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Primarykey class StockPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class StockPK implements EntityPKInterface, IStockPK {

    private IEvetypePK evetypePK = new EvetypePK();
    private java.lang.String username;
  
    /** 
     * Constructor
     * Creates an empty StockPK
     */
    public StockPK() {
    }

    /**
     * Constructor
     * build an empty StockPK with initialized field values
     */
    public StockPK(java.lang.String username, long evetype) {
        this.evetypePK = new EvetypePK(evetype);
        this.username = username;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields() {
        Object[][] keyfields = { 
            {"stock.evetype", evetypePK.getId()}, 
            {"stock.username", username}
        };
        return keyfields;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value) for sql insert statement
     */
    public Object[][] getInsertKeyFields() {
        Object[][] keyfields = { 
            {IStock.EVETYPE, evetypePK.getId()}, 
            {IStock.USERNAME, username}
        };
        return keyfields;
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
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        if(getUsername()!=null) key += getUsername().length() + "_" + getUsername();


        key += "_";

        key += getEvetype();

        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return StockPK constructed from keystring
     */
    public static StockPK getKey(String keystring) {
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

            return new StockPK(username, evetype);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param stockPK2: StockPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IStockPK stockPK2) {
        boolean isequal = stockPK2!=null;
        if(isequal) {
            isequal = isequal && this.evetypePK.equals(stockPK2.getEvetypePK());
            isequal = isequal && this.username.equals(stockPK2.getUsername());
        }
        return isequal;
    }
}
