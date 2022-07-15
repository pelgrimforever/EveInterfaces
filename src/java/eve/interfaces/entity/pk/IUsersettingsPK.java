/*
 * IUsersettingsPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 9.5.2022 11:11
 *
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

/**
 * Primary Key class UsersettingsPK for entity class Usersettings
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IUsersettingsPK extends EntityPK, Serializable {

    /**
     * 
     * @return foreign key settingsPK, instance of ISettingsPK
     */
    public ISettingsPK getSettingsPK();
    /**
     * set foreign key SettingsPK
     * @param settingsPK: instance of ISettingsPK
     */
    public void setSettingsPK(ISettingsPK settingsPK);

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
     * compare this primary key with second primary key
     * @param usersettingsPK2: UsersettingsPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IUsersettingsPK usersettingsPK2);

}
