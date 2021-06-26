/*
 * ITmp_system_jumpsPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.5.2021 16:2
 *
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;

import data.interfaces.db.EntityPKInterface;

/**
 * Primary Key class Tmp_system_jumpsPK for entity class Tmp_system_jumps
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface ITmp_system_jumpsPK extends EntityPKInterface, Serializable {

    /**
     *
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields();

    /**
     * 
     * @return system value
     */
    public long getSystem();

    /**
     * set system value
     * @param system: new value
     */
    public void setSystem(long system);

    /**
     *
     * @return primary key in one formatted string
     */
    public String getKeystring();

    /**
     * compare this primary key with second primary key
     * @param tmp_system_jumpsPK2: Tmp_system_jumpsPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ITmp_system_jumpsPK tmp_system_jumpsPK2);

}
