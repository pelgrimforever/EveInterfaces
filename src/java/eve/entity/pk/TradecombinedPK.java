/*
 * TradecombinedPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 30.10.2021 10:3
 *
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.ITradecombined;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class TradecombinedPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class TradecombinedPK implements ITradecombinedPK {

    private IEvetypePK evetypePK = new EvetypePK();
    private ISystemPK systemBuy_systemPK = new SystemPK();
    private ISystemPK systemSell_systemPK = new SystemPK();
  
    /** 
     * Constructor
     * Creates an empty TradecombinedPK
     */
    public TradecombinedPK() {
    }

    /**
     * Constructor
     * build an empty TradecombinedPK with initialized field values
     */
    public TradecombinedPK(long sell_system, long buy_system, long evetype) {
        this.evetypePK = new EvetypePK(evetype);
        this.systemBuy_systemPK = new SystemPK(buy_system);
        this.systemSell_systemPK = new SystemPK(sell_system);
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"tradecombined.sell_system", systemSell_systemPK.getId()}, 
            {"tradecombined.buy_system", systemBuy_systemPK.getId()}, 
            {"tradecombined.evetype", evetypePK.getId()}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {ITradecombined.SELL_SYSTEM, systemSell_systemPK.getId()}, 
            {ITradecombined.BUY_SYSTEM, systemBuy_systemPK.getId()}, 
            {ITradecombined.EVETYPE, evetypePK.getId()}
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
     * @return foreign key systemPK1, instance of ISystemPK
     */
    public ISystemPK getSystembuy_systemPK() {
        return this.systemBuy_systemPK;
    }

    /**
     * set foreign key systemBuy_systemPK
     * @param systemPK: instance of ISystemPK
     */
    public void setSystembuy_systemPK(ISystemPK systemPK) {
        this.systemBuy_systemPK = systemPK;
    }

    /**
     * 
     * @return foreign key systemPK, instance of ISystemPK
     */
    public ISystemPK getSystemsell_systemPK() {
        return this.systemSell_systemPK;
    }

    /**
     * set foreign key systemSell_systemPK
     * @param systemPK: instance of ISystemPK
     */
    public void setSystemsell_systemPK(ISystemPK systemPK) {
        this.systemSell_systemPK = systemPK;
    }

    /**
     * 
     * @return sell_system value
     */
    public long getSell_system() {
        return this.systemSell_systemPK.getId();
    }

    /**
     * set sell_system value
     * @param sell_system: new value
     */
    public void setSell_system(long sell_system) {
        this.systemSell_systemPK.setId(sell_system);
    }

    /**
     * 
     * @return buy_system value
     */
    public long getBuy_system() {
        return this.systemBuy_systemPK.getId();
    }

    /**
     * set buy_system value
     * @param buy_system: new value
     */
    public void setBuy_system(long buy_system) {
        this.systemBuy_systemPK.setId(buy_system);
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
        key += getSell_system();
        key += "_";

        key += getBuy_system();
        key += "_";

        key += getEvetype();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return TradecombinedPK constructed from keystring
     */
    public static TradecombinedPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long sell_system = Long.valueOf(keys.substring(0, keylength));
            keys = keys.substring(keylength+1);

            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long buy_system = Long.valueOf(keys.substring(0, keylength));
            keys = keys.substring(keylength+1);

            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long evetype = Long.valueOf(keys.substring(0, keylength));
            return new TradecombinedPK(sell_system, buy_system, evetype);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param tradecombinedPK2: TradecombinedPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ITradecombinedPK tradecombinedPK2) {
        boolean isequal = tradecombinedPK2!=null;
        if(isequal) {
            isequal = isequal && this.evetypePK.equals(tradecombinedPK2.getEvetypePK());
            isequal = isequal && this.systemBuy_systemPK.equals(tradecombinedPK2.getSystembuy_systemPK());
            isequal = isequal && this.systemSell_systemPK.equals(tradecombinedPK2.getSystemsell_systemPK());
        }
        return isequal;
    }
}
