/*
 * ISystemactivityPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 5.3.2022 17:21
 *
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

/**
 * Primary Key class SystemactivityPK for entity class Systemactivity
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface ISystemactivityPK extends EntityPK, Serializable {

    /**
     * 
     * @return foreign key systemPK, instance of ISystemPK
     */
    public ISystemPK getSystemPK();
    /**
     * set foreign key SystemPK
     * @param systemPK: instance of ISystemPK
     */
    public void setSystemPK(ISystemPK systemPK);

    /**
     * 
     * @return systemid value
     */
    public long getSystemid();

    /**
     * set systemid value
     * @param systemid: new value
     */
    public void setSystemid(long systemid);

    /**
     * 
     * @return timeslot value
     */
    public java.sql.Timestamp getTimeslot();

    /**
     * set timeslot value
     * @param timeslot: new value
     */
    public void setTimeslot(java.sql.Timestamp timeslot);


    /**
     * compare this primary key with second primary key
     * @param systemactivityPK2: SystemactivityPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ISystemactivityPK systemactivityPK2);

}
