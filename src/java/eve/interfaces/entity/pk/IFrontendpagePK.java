/*
 * IFrontendpagePK.java
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
 * Primary Key class FrontendpagePK for entity class Frontendpage
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IFrontendpagePK extends EntityPK, Serializable {

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
     * @param frontendpagePK2: FrontendpagePK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IFrontendpagePK frontendpagePK2);

}
