/*
 * SystemtradePK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2021 15:16
 *
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.ISystemtrade;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class SystemtradePK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class SystemtradePK implements ISystemtradePK {

    private ISystemPK systemSell_systemPK = new SystemPK();
    private ISystemPK systemBuy_systemPK = new SystemPK();
  
    /** 
     * Constructor
     * Creates an empty SystemtradePK
     */
    public SystemtradePK() {
    }

    /**
     * Constructor
     * build an empty SystemtradePK with initialized field values
     */
    public SystemtradePK(long sell_system, long buy_system) {
        this.systemSell_systemPK = new SystemPK(sell_system);
        this.systemBuy_systemPK = new SystemPK(buy_system);
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"systemtrade.sell_system", systemSell_systemPK.getId()}, 
            {"systemtrade.buy_system", systemBuy_systemPK.getId()}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {ISystemtrade.SELL_SYSTEM, systemSell_systemPK.getId()}, 
            {ISystemtrade.BUY_SYSTEM, systemBuy_systemPK.getId()}
        };
        return new Entityvalues(keyfields);
    }

    /**
     * 
     * @return foreign key systemPK1, instance of ISystemPK
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
     * @return foreign key systemPK, instance of ISystemPK
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
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        key += getSell_system();
        key += "_";

        key += getBuy_system();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return SystemtradePK constructed from keystring
     */
    public static SystemtradePK getKey(String keystring) {
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
            return new SystemtradePK(sell_system, buy_system);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param systemtradePK2: SystemtradePK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ISystemtradePK systemtradePK2) {
        boolean isequal = systemtradePK2!=null;
        if(isequal) {
            isequal = isequal && this.systemSell_systemPK.equals(systemtradePK2.getSystemsell_systemPK());
            isequal = isequal && this.systemBuy_systemPK.equals(systemtradePK2.getSystembuy_systemPK());
        }
        return isequal;
    }
}
