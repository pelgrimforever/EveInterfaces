/*
 * IEvetypePK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.11.2021 14:51
 *
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

/**
 * Primary Key class EvetypePK for entity class Evetype
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IEvetypePK extends EntityPK, Serializable {

    /**
     * 
     * @return id value
     */
    public long getId();

    /**
     * set id value
     * @param id: new value
     */
    public void setId(long id);


    /**
     * compare this primary key with second primary key
     * @param evetypePK2: EvetypePK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IEvetypePK evetypePK2);

}
