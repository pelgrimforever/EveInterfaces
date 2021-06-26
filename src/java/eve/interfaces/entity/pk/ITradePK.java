/*
 * ITradePK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.5.2021 16:2
 *
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;

import data.interfaces.db.EntityPKInterface;

/**
 * Primary Key class TradePK for entity class Trade
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface ITradePK extends EntityPKInterface, Serializable {

    /**
     *
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields();

    /**
     * 
     * @return foreign key ordersPK, instance of IOrdersPK
     */
    public IOrdersPK getOrderssell_order_idPK();
    /**
     * set foreign key OrdersPK
     * @param ordersPK: instance of IOrdersPK
     */
    public void setOrderssell_order_idPK(IOrdersPK ordersPK);

    /**
     * 
     * @return foreign key ordersPK, instance of IOrdersPK
     */
    public IOrdersPK getOrdersbuy_order_idPK();
    /**
     * set foreign key OrdersPK
     * @param ordersPK: instance of IOrdersPK
     */
    public void setOrdersbuy_order_idPK(IOrdersPK ordersPK);

    /**
     * 
     * @return sell_order_id value
     */
    public long getSell_order_id();

    /**
     * set sell_order_id value
     * @param sell_order_id: new value
     */
    public void setSell_order_id(long sell_order_id);

    /**
     * 
     * @return buy_order_id value
     */
    public long getBuy_order_id();

    /**
     * set buy_order_id value
     * @param buy_order_id: new value
     */
    public void setBuy_order_id(long buy_order_id);

    /**
     *
     * @return primary key in one formatted string
     */
    public String getKeystring();

    /**
     * compare this primary key with second primary key
     * @param tradePK2: TradePK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ITradePK tradePK2);

}
