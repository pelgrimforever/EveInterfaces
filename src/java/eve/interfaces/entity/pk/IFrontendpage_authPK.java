/*
 * IFrontendpage_authPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 19.1.2022 9:42
 *
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

/**
 * Primary Key class Frontendpage_authPK for entity class Frontendpage_auth
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IFrontendpage_authPK extends EntityPK, Serializable {

    /**
     * 
     * @return foreign key frontendpagePK, instance of IFrontendpagePK
     */
    public IFrontendpagePK getFrontendpagePK();
    /**
     * set foreign key FrontendpagePK
     * @param frontendpagePK: instance of IFrontendpagePK
     */
    public void setFrontendpagePK(IFrontendpagePK frontendpagePK);

    /**
     * 
     * @return foreign key eveuserPK, instance of IEveuserPK
     */
    public IEveuserPK getEveuserPK();
    /**
     * set foreign key EveuserPK
     * @param eveuserPK: instance of IEveuserPK
     */
    public void setEveuserPK(IEveuserPK eveuserPK);

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
     * @return frontendpage value
     */
    public java.lang.String getFrontendpage();

    /**
     * set frontendpage value
     * @param frontendpage: new value
     */
    public void setFrontendpage(java.lang.String frontendpage);


    /**
     * compare this primary key with second primary key
     * @param frontendpage_authPK2: Frontendpage_authPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IFrontendpage_authPK frontendpage_authPK2);

}
