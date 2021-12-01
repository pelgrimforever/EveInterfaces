/*
 * ISystemtrade_orderPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 30.10.2021 10:3
 *
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

/**
 * Primary Key class Systemtrade_orderPK for entity class Systemtrade_order
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface ISystemtrade_orderPK extends EntityPK, Serializable {

    /**
     * 
     * @return foreign key ordersPK, instance of IOrdersPK
     */
    public IOrdersPK getOrdersbuy_orderPK();
    /**
     * set foreign key OrdersPK
     * @param ordersPK: instance of IOrdersPK
     */
    public void setOrdersbuy_orderPK(IOrdersPK ordersPK);

    /**
     * 
     * @return foreign key ordersPK, instance of IOrdersPK
     */
    public IOrdersPK getOrderssell_orderPK();
    /**
     * set foreign key OrdersPK
     * @param ordersPK: instance of IOrdersPK
     */
    public void setOrderssell_orderPK(IOrdersPK ordersPK);

    /**
     * 
     * @return foreign key systemtradePK, instance of ISystemtradePK
     */
    public ISystemtradePK getSystemtradePK();
    /**
     * set foreign key SystemtradePK
     * @param systemtradePK: instance of ISystemtradePK
     */
    public void setSystemtradePK(ISystemtradePK systemtradePK);

    /**
     * 
     * @return sell_system value
     */
    public long getSell_system();

    /**
     * set sell_system value
     * @param sell_system: new value
     */
    public void setSell_system(long sell_system);

    /**
     * 
     * @return buy_system value
     */
    public long getBuy_system();

    /**
     * set buy_system value
     * @param buy_system: new value
     */
    public void setBuy_system(long buy_system);

    /**
     * 
     * @return sell_order value
     */
    public long getSell_order();

    /**
     * set sell_order value
     * @param sell_order: new value
     */
    public void setSell_order(long sell_order);

    /**
     * 
     * @return buy_order value
     */
    public long getBuy_order();

    /**
     * set buy_order value
     * @param buy_order: new value
     */
    public void setBuy_order(long buy_order);


    /**
     * compare this primary key with second primary key
     * @param systemtrade_orderPK2: Systemtrade_orderPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ISystemtrade_orderPK systemtrade_orderPK2);

}
