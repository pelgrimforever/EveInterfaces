/*
 * ISystemjumpsPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2021 15:16
 *
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

/**
 * Primary Key class SystemjumpsPK for entity class Systemjumps
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface ISystemjumpsPK extends EntityPK, Serializable {

    /**
     * 
     * @return foreign key systemPK, instance of ISystemPK
     */
    public ISystemPK getSystemsystem_endPK();
    /**
     * set foreign key SystemPK
     * @param systemPK: instance of ISystemPK
     */
    public void setSystemsystem_endPK(ISystemPK systemPK);

    /**
     * 
     * @return foreign key systemPK, instance of ISystemPK
     */
    public ISystemPK getSystemsystem_startPK();
    /**
     * set foreign key SystemPK
     * @param systemPK: instance of ISystemPK
     */
    public void setSystemsystem_startPK(ISystemPK systemPK);

    /**
     * 
     * @return system_start value
     */
    public long getSystem_start();

    /**
     * set system_start value
     * @param system_start: new value
     */
    public void setSystem_start(long system_start);

    /**
     * 
     * @return system_end value
     */
    public long getSystem_end();

    /**
     * set system_end value
     * @param system_end: new value
     */
    public void setSystem_end(long system_end);


    /**
     * compare this primary key with second primary key
     * @param systemjumpsPK2: SystemjumpsPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ISystemjumpsPK systemjumpsPK2);

}
