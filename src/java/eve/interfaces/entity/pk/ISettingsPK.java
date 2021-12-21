/*
 * ISettingsPK.java
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
 * Primary Key class SettingsPK for entity class Settings
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface ISettingsPK extends EntityPK, Serializable {

    /**
     * 
     * @return name value
     */
    public java.lang.String getName();

    /**
     * set name value
     * @param name: new value
     */
    public void setName(java.lang.String name);


    /**
     * compare this primary key with second primary key
     * @param settingsPK2: SettingsPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ISettingsPK settingsPK2);

}
