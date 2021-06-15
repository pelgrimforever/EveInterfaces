/*
 * IOrder_historyPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.5.2021 13:35
 *
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;

import data.interfaces.db.EntityPKInterface;

/**
 * Primary Key class Order_historyPK for entity class Order_history
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IOrder_historyPK extends EntityPKInterface, Serializable {

    /**
     *
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields();

    /**
     * 
     * @return foreign key evetypePK, instance of IEvetypePK
     */
    public IEvetypePK getEvetypePK();
    /**
     * set foreign key EvetypePK
     * @param evetypePK: instance of IEvetypePK
     */
    public void setEvetypePK(IEvetypePK evetypePK);

    /**
     * 
     * @return foreign key regionPK, instance of IRegionPK
     */
    public IRegionPK getRegionPK();
    /**
     * set foreign key RegionPK
     * @param regionPK: instance of IRegionPK
     */
    public void setRegionPK(IRegionPK regionPK);

    /**
     * 
     * @return region value
     */
    public long getRegion();

    /**
     * set region value
     * @param region: new value
     */
    public void setRegion(long region);

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
     * @return date value
     */
    public java.sql.Date getDate();

    /**
     * set date value
     * @param date: new value
     */
    public void setDate(java.sql.Date date);

    /**
     *
     * @return primary key in one formatted string
     */
    public String getKeystring();

    /**
     * compare this primary key with second primary key
     * @param order_historyPK2: Order_historyPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IOrder_historyPK order_historyPK2);

}
