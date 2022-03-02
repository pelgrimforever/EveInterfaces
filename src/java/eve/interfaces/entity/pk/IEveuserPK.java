/*
 * IEveuserPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 13.1.2022 17:48
 *
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

/**
 * Primary Key class EveuserPK for entity class Eveuser
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IEveuserPK extends EntityPK, Serializable {

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
     * @param eveuserPK2: EveuserPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IEveuserPK eveuserPK2);

}
