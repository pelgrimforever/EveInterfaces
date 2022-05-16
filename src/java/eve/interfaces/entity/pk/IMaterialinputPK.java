/*
 * IMaterialinputPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 11.4.2022 9:13
 *
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

/**
 * Primary Key class MaterialinputPK for entity class Materialinput
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IMaterialinputPK extends EntityPK, Serializable {

    /**
     * 
     * @return foreign key evetypePK, instance of IEvetypePK
     */
    public IEvetypePK getEvetypePK();
    /**
     * set foreign key EvetypePK
     * @param evetypePK: instance of IEvetypePK
     */
    public void setEvetypePK(IEvetypePK evetypePK);

    /**
     * 
     * @return evetype value
     */
    public long getEvetype();

    /**
     * set evetype value
     * @param evetype: new value
     */
    public void setEvetype(long evetype);

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
     * 
     * @return addtimestamp value
     */
    public java.sql.Timestamp getAddtimestamp();

    /**
     * set addtimestamp value
     * @param addtimestamp: new value
     */
    public void setAddtimestamp(java.sql.Timestamp addtimestamp);


    /**
     * compare this primary key with second primary key
     * @param materialinputPK2: MaterialinputPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IMaterialinputPK materialinputPK2);

}
