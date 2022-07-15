/*
 * ITradecombined_sellPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 9.5.2022 11:11
 *
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

/**
 * Primary Key class Tradecombined_sellPK for entity class Tradecombined_sell
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface ITradecombined_sellPK extends EntityPK, Serializable {

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
     * @return foreign key tradecombinedPK, instance of ITradecombinedPK
     */
    public ITradecombinedPK getTradecombinedPK();
    /**
     * set foreign key TradecombinedPK
     * @param tradecombinedPK: instance of ITradecombinedPK
     */
    public void setTradecombinedPK(ITradecombinedPK tradecombinedPK);

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
     * @return evetype value
     */
    public long getEvetype();

    /**
     * set evetype value
     * @param evetype: new value
     */
    public void setEvetype(long evetype);

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
     * @return sell_order_id value
     */
    public long getSell_order_id();

    /**
     * set sell_order_id value
     * @param sell_order_id: new value
     */
    public void setSell_order_id(long sell_order_id);


    /**
     * compare this primary key with second primary key
     * @param tradecombined_sellPK2: Tradecombined_sellPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ITradecombined_sellPK tradecombined_sellPK2);

}
