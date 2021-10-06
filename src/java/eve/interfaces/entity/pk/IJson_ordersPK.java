/*
 * IJson_ordersPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 6.9.2021 16:29
 *
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;

import data.interfaces.db.EntityPKInterface;

/**
 * Primary Key class Json_ordersPK for entity class Json_orders
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IJson_ordersPK extends EntityPKInterface, Serializable {

    /**
     *
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields();

    /**
     * 
     * @return id value
     */
    public int getId();

    /**
     * set id value
     * @param id: new value
     */
    public void setId(int id);

    /**
     *
     * @return primary key in one formatted string
     */
    public String getKeystring();

    /**
     * compare this primary key with second primary key
     * @param json_ordersPK2: Json_ordersPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IJson_ordersPK json_ordersPK2);

}
