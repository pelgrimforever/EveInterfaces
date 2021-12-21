/*
 * IStation_servicePK.java
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
 * Primary Key class Station_servicePK for entity class Station_service
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IStation_servicePK extends EntityPK, Serializable {

    /**
     * 
     * @return foreign key stationPK, instance of IStationPK
     */
    public IStationPK getStationPK();
    /**
     * set foreign key StationPK
     * @param stationPK: instance of IStationPK
     */
    public void setStationPK(IStationPK stationPK);

    /**
     * 
     * @return station value
     */
    public long getStation();

    /**
     * set station value
     * @param station: new value
     */
    public void setStation(long station);

    /**
     * 
     * @return service value
     */
    public java.lang.String getService();

    /**
     * set service value
     * @param service: new value
     */
    public void setService(java.lang.String service);


    /**
     * compare this primary key with second primary key
     * @param station_servicePK2: Station_servicePK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IStation_servicePK station_servicePK2);

}
