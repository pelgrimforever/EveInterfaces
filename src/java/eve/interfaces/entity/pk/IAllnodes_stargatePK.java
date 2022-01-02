/*
 * IAllnodes_stargatePK.java
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
 * Primary Key class Allnodes_stargatePK for entity class Allnodes_stargate
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IAllnodes_stargatePK extends EntityPK, Serializable {

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
     * @param allnodes_stargatePK2: Allnodes_stargatePK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IAllnodes_stargatePK allnodes_stargatePK2);

}