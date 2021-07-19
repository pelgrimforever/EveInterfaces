/*
 * ISystemtradePK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 18.6.2021 14:35
 *
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;

import data.interfaces.db.EntityPKInterface;

/**
 * Primary Key class SystemtradePK for entity class Systemtrade
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface ISystemtradePK extends EntityPKInterface, Serializable {

    /**
     *
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields();

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
     * @return primary key in one formatted string
     */
    public String getKeystring();

    /**
     * compare this primary key with second primary key
     * @param systemtradePK2: SystemtradePK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ISystemtradePK systemtradePK2);

}
