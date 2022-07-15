/*
 * IUserbpPK.java
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
 * Primary Key class UserbpPK for entity class Userbp
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IUserbpPK extends EntityPK, Serializable {

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
     * @return bp value
     */
    public long getBp();

    /**
     * set bp value
     * @param bp: new value
     */
    public void setBp(long bp);

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
     * @return serialnumber value
     */
    public int getSerialnumber();

    /**
     * set serialnumber value
     * @param serialnumber: new value
     */
    public void setSerialnumber(int serialnumber);


    /**
     * compare this primary key with second primary key
     * @param userbpPK2: UserbpPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IUserbpPK userbpPK2);

}
