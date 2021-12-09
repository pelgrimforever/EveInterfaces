/*
 * ITradecombinedPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 9.11.2021 14:30
 *
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

/**
 * Primary Key class TradecombinedPK for entity class Tradecombined
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface ITradecombinedPK extends EntityPK, Serializable {

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
     * @return foreign key systemPK, instance of ISystemPK
     */
    public ISystemPK getSystembuy_systemPK();
    /**
     * set foreign key SystemPK
     * @param systemPK: instance of ISystemPK
     */
    public void setSystembuy_systemPK(ISystemPK systemPK);

    /**
     * 
     * @return foreign key systemPK, instance of ISystemPK
     */
    public ISystemPK getSystemsell_systemPK();
    /**
     * set foreign key SystemPK
     * @param systemPK: instance of ISystemPK
     */
    public void setSystemsell_systemPK(ISystemPK systemPK);

    /**
     * 
     * @return sell_system value
     */
    public long getSell_system();

    /**
     * set sell_system value
     * @param sell_system: new value
     */
    public void setSell_system(long sell_system);

    /**
     * 
     * @return buy_system value
     */
    public long getBuy_system();

    /**
     * set buy_system value
     * @param buy_system: new value
     */
    public void setBuy_system(long buy_system);

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
     * compare this primary key with second primary key
     * @param tradecombinedPK2: TradecombinedPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ITradecombinedPK tradecombinedPK2);

}
