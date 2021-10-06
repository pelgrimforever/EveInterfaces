/*
 * Systemtrade_orderPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 6.9.2021 16:29
 *
 */

package eve.entity.pk;

import data.interfaces.db.EntityPKInterface;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.ISystemtrade_order;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Primarykey class Systemtrade_orderPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class Systemtrade_orderPK implements EntityPKInterface, ISystemtrade_orderPK {

    private IOrdersPK ordersBuy_orderPK = new OrdersPK();
    private IOrdersPK ordersSell_orderPK = new OrdersPK();
    private ISystemtradePK systemtradePK = new SystemtradePK();
  
    /** 
     * Constructor
     * Creates an empty Systemtrade_orderPK
     */
    public Systemtrade_orderPK() {
    }

    /**
     * Constructor
     * build an empty Systemtrade_orderPK with initialized field values
     */
    public Systemtrade_orderPK(long sell_system, long buy_system, long sell_order, long buy_order) {
        this.ordersBuy_orderPK = new OrdersPK(buy_order);
        this.ordersSell_orderPK = new OrdersPK(sell_order);
        this.systemtradePK = new SystemtradePK(buy_system, sell_system);
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields() {
        Object[][] keyfields = { 
            {"systemtrade_order.sell_system", systemtradePK.getSell_system()}, 
            {"systemtrade_order.buy_system", systemtradePK.getBuy_system()}, 
            {"systemtrade_order.sell_order", ordersSell_orderPK.getId()}, 
            {"systemtrade_order.buy_order", ordersBuy_orderPK.getId()}
        };
        return keyfields;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value) for sql insert statement
     */
    public Object[][] getInsertKeyFields() {
        Object[][] keyfields = { 
            {ISystemtrade_order.SELL_SYSTEM, systemtradePK.getSell_system()}, 
            {ISystemtrade_order.BUY_SYSTEM, systemtradePK.getBuy_system()}, 
            {ISystemtrade_order.SELL_ORDER, ordersSell_orderPK.getId()}, 
            {ISystemtrade_order.BUY_ORDER, ordersBuy_orderPK.getId()}
        };
        return keyfields;
    }

    /**
     * 
     * @return foreign key ordersPK1, instance of IOrdersPK
     */
    public IOrdersPK getOrdersbuy_orderPK() {
        return this.ordersBuy_orderPK;
    }

    /**
     * set foreign key ordersBuy_orderPK
     * @param ordersPK: instance of IOrdersPK
     */
    public void setOrdersbuy_orderPK(IOrdersPK ordersPK) {
        this.ordersBuy_orderPK = ordersPK;
    }

    /**
     * 
     * @return foreign key ordersPK, instance of IOrdersPK
     */
    public IOrdersPK getOrderssell_orderPK() {
        return this.ordersSell_orderPK;
    }

    /**
     * set foreign key ordersSell_orderPK
     * @param ordersPK: instance of IOrdersPK
     */
    public void setOrderssell_orderPK(IOrdersPK ordersPK) {
        this.ordersSell_orderPK = ordersPK;
    }

    /**
     * 
     * @return foreign key systemtradePK, instance of ISystemtradePK
     */
    public ISystemtradePK getSystemtradePK() {
        return this.systemtradePK;
    }

    /**
     * set foreign key systemtradePK
     * @param systemtradePK: instance of ISystemtradePK
     */
    public void setSystemtradePK(ISystemtradePK systemtradePK) {
        this.systemtradePK = systemtradePK;
    }

    /**
     * 
     * @return sell_system value
     */
    public long getSell_system() {
        return this.systemtradePK.getSell_system();
    }

    /**
     * set sell_system value
     * @param sell_system: new value
     */
    public void setSell_system(long sell_system) {
        this.systemtradePK.setSell_system(sell_system);
    }

    /**
     * 
     * @return buy_system value
     */
    public long getBuy_system() {
        return this.systemtradePK.getBuy_system();
    }

    /**
     * set buy_system value
     * @param buy_system: new value
     */
    public void setBuy_system(long buy_system) {
        this.systemtradePK.setBuy_system(buy_system);
    }

    /**
     * 
     * @return sell_order value
     */
    public long getSell_order() {
        return this.ordersSell_orderPK.getId();
    }

    /**
     * set sell_order value
     * @param sell_order: new value
     */
    public void setSell_order(long sell_order) {
        this.ordersSell_orderPK.setId(sell_order);
    }

    /**
     * 
     * @return buy_order value
     */
    public long getBuy_order() {
        return this.ordersBuy_orderPK.getId();
    }

    /**
     * set buy_order value
     * @param buy_order: new value
     */
    public void setBuy_order(long buy_order) {
        this.ordersBuy_orderPK.setId(buy_order);
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

        key += getSell_order();


        key += "_";

        key += getBuy_order();

        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return Systemtrade_orderPK constructed from keystring
     */
    public static Systemtrade_orderPK getKey(String keystring) {
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

            long sell_order = Long.valueOf(keys.substring(0, keylength));


            keys = keys.substring(keylength+1);

            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }

            long buy_order = Long.valueOf(keys.substring(0, keylength));

            return new Systemtrade_orderPK(sell_system, buy_system, sell_order, buy_order);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param systemtrade_orderPK2: Systemtrade_orderPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ISystemtrade_orderPK systemtrade_orderPK2) {
        boolean isequal = systemtrade_orderPK2!=null;
        if(isequal) {
            isequal = isequal && this.ordersBuy_orderPK.equals(systemtrade_orderPK2.getOrdersbuy_orderPK());
            isequal = isequal && this.ordersSell_orderPK.equals(systemtrade_orderPK2.getOrderssell_orderPK());
            isequal = isequal && this.systemtradePK.equals(systemtrade_orderPK2.getSystemtradePK());
        }
        return isequal;
    }
}
