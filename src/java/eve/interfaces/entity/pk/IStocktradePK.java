/*
 * IStocktradePK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.0.2022 16:56
 *
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

/**
 * Primary Key class StocktradePK for entity class Stocktrade
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IStocktradePK extends EntityPK, Serializable {

    /**
     * 
     * @return foreign key stockPK, instance of IStockPK
     */
    public IStockPK getStockPK();
    /**
     * set foreign key StockPK
     * @param stockPK: instance of IStockPK
     */
    public void setStockPK(IStockPK stockPK);

    /**
     * 
     * @return username value
     */
    public java.lang.String getUsername();

    /**
     * set username value
     * @param username: new value
     */
    public void setUsername(java.lang.String username);

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
     * @return orderid value
     */
    public long getOrderid();

    /**
     * set orderid value
     * @param orderid: new value
     */
    public void setOrderid(long orderid);


    /**
     * compare this primary key with second primary key
     * @param stocktradePK2: StocktradePK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IStocktradePK stocktradePK2);

}
