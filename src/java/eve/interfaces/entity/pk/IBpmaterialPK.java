/*
 * IBpmaterialPK.java
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
 * Primary Key class BpmaterialPK for entity class Bpmaterial
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IBpmaterialPK extends EntityPK, Serializable {

    /**
     * 
     * @return foreign key evetypePK, instance of IEvetypePK
     */
    public IEvetypePK getEvetypebpPK();
    /**
     * set foreign key EvetypePK
     * @param evetypePK: instance of IEvetypePK
     */
    public void setEvetypebpPK(IEvetypePK evetypePK);

    /**
     * 
     * @return foreign key evetypePK, instance of IEvetypePK
     */
    public IEvetypePK getEvetypematerialPK();
    /**
     * set foreign key EvetypePK
     * @param evetypePK: instance of IEvetypePK
     */
    public void setEvetypematerialPK(IEvetypePK evetypePK);

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
     * @return material value
     */
    public long getMaterial();

    /**
     * set material value
     * @param material: new value
     */
    public void setMaterial(long material);


    /**
     * compare this primary key with second primary key
     * @param bpmaterialPK2: BpmaterialPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IBpmaterialPK bpmaterialPK2);

}
