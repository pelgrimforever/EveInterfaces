/*
 * IFactionPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 30.10.2021 10:3
 *
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

/**
 * Primary Key class FactionPK for entity class Faction
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IFactionPK extends EntityPK, Serializable {

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
     * @param factionPK2: FactionPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IFactionPK factionPK2);

}
