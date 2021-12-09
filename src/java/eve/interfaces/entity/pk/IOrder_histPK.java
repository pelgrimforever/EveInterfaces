/*
 * IOrder_histPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 9.11.2021 14:30
 *
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

/**
 * Primary Key class Order_histPK for entity class Order_hist
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IOrder_histPK extends EntityPK, Serializable {

    /**
     * 
     * @return id value
     */
    public long getId();

    /**
     * set id value
     * @param id: new value
     */
    public void setId(long id);


    /**
     * compare this primary key with second primary key
     * @param order_histPK2: Order_histPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IOrder_histPK order_histPK2);

}
