/*
 * IOrder_history_monthPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 16.11.2021 15:45
 *
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

/**
 * Primary Key class Order_history_monthPK for entity class Order_history_month
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IOrder_history_monthPK extends EntityPK, Serializable {

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
     * @return year value
     */
    public int getYear();

    /**
     * set year value
     * @param year: new value
     */
    public void setYear(int year);

    /**
     * 
     * @return month value
     */
    public int getMonth();

    /**
     * set month value
     * @param month: new value
     */
    public void setMonth(int month);


    /**
     * compare this primary key with second primary key
     * @param order_history_monthPK2: Order_history_monthPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IOrder_history_monthPK order_history_monthPK2);

}
