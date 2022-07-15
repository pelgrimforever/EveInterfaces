/*
 * StocktradePK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 9.5.2022 11:11
 *
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IStocktrade;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class StocktradePK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class StocktradePK implements IStocktradePK {

    private IStockPK stockPK = new StockPK();
    private long orderid;
  
    /** 
     * Constructor
     * Creates an empty StocktradePK
     */
    public StocktradePK() {
    }

    /**
     * Constructor
     * build an empty StocktradePK with initialized field values
     */
    public StocktradePK(java.lang.String username, long evetype, long orderid) {
        this.stockPK = new StockPK(username, evetype);
        this.orderid = orderid;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"stocktrade.username", stockPK.getUsername()}, 
            {"stocktrade.evetype", stockPK.getEvetype()}, 
            {"stocktrade.orderid", orderid}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IStocktrade.USERNAME, stockPK.getUsername()}, 
            {IStocktrade.EVETYPE, stockPK.getEvetype()}, 
            {IStocktrade.ORDERID, orderid}
        };
        return new Entityvalues(keyfields);
    }

    /**
     * 
     * @return foreign key stockPK, instance of IStockPK
     */
    public IStockPK getStockPK() {
        return this.stockPK;
    }

    /**
     * set foreign key stockPK
     * @param stockPK: instance of IStockPK
     */
    public void setStockPK(IStockPK stockPK) {
        this.stockPK = stockPK;
    }

    /**
     * 
     * @return username value
     */
    public java.lang.String getUsername() {
        return this.stockPK.getUsername();
    }

    /**
     * set username value
     * @param username: new value
     */
    public void setUsername(java.lang.String username) {
        this.stockPK.setUsername(username);
    }

    /**
     * 
     * @return evetype value
     */
    public long getEvetype() {
        return this.stockPK.getEvetype();
    }

    /**
     * set evetype value
     * @param evetype: new value
     */
    public void setEvetype(long evetype) {
        this.stockPK.setEvetype(evetype);
    }

    /**
     * 
     * @return orderid value
     */
    public long getOrderid() {
        return this.orderid;
    }

    /**
     * set orderid value
     * @param orderid: new value
     */
    public void setOrderid(long orderid) {
        this.orderid = orderid;
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
        key += "_";

        key += getOrderid();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return StocktradePK constructed from keystring
     */
    public static StocktradePK getKey(String keystring) {
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
            keys = keys.substring(keylength+1);

            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long orderid = Long.valueOf(keys.substring(0, keylength));
            return new StocktradePK(username, evetype, orderid);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param stocktradePK2: StocktradePK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IStocktradePK stocktradePK2) {
        boolean isequal = stocktradePK2!=null;
        if(isequal) {
            isequal = isequal && this.stockPK.equals(stocktradePK2.getStockPK());
            isequal = isequal && this.orderid == stocktradePK2.getOrderid();
        }
        return isequal;
    }
}
