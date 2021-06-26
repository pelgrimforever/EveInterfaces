/*
 * IOrder_histPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.5.2021 16:2
 *
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;

import data.interfaces.db.EntityPKInterface;

/**
 * Primary Key class Order_histPK for entity class Order_hist
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IOrder_histPK extends EntityPKInterface, Serializable {

    /**
     *
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields();

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
     *
     * @return primary key in one formatted string
     */
    public String getKeystring();

    /**
     * compare this primary key with second primary key
     * @param order_histPK2: Order_histPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IOrder_histPK order_histPK2);

}
