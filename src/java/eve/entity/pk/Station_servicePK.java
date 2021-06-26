/*
 * Station_servicePK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.5.2021 16:2
 *
 */

package eve.entity.pk;

import data.interfaces.db.EntityPKInterface;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IStation_service;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Primarykey class Station_servicePK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class Station_servicePK implements EntityPKInterface, IStation_servicePK {

    private IStationPK stationPK = new StationPK();
    private java.lang.String service;
  
    /** 
     * Constructor
     * Creates an empty Station_servicePK
     */
    public Station_servicePK() {
    }

    /**
     * Constructor
     * build an empty Station_servicePK with initialized field values
     */
    public Station_servicePK(long station, java.lang.String service) {
        this.stationPK = new StationPK(station);
        this.service = service;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields() {
        Object[][] keyfields = { 
            {"station_service.station", stationPK.getId()}, 
            {"station_service.service", service}
        };
        return keyfields;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value) for sql insert statement
     */
    public Object[][] getInsertKeyFields() {
        Object[][] keyfields = { 
            {IStation_service.STATION, stationPK.getId()}, 
            {IStation_service.SERVICE, service}
        };
        return keyfields;
    }

    /**
     * 
     * @return foreign key stationPK, instance of IStationPK
     */
    public IStationPK getStationPK() {
        return this.stationPK;
    }

    /**
     * set foreign key stationPK
     * @param stationPK: instance of IStationPK
     */
    public void setStationPK(IStationPK stationPK) {
        this.stationPK = stationPK;
    }

    /**
     * 
     * @return station value
     */
    public long getStation() {
        return this.stationPK.getId();
    }

    /**
     * set station value
     * @param station: new value
     */
    public void setStation(long station) {
        this.stationPK.setId(station);
    }

    /**
     * 
     * @return service value
     */
    public java.lang.String getService() {
        return this.service;
    }

    /**
     * set service value
     * @param service: new value
     */
    public void setService(java.lang.String service) {
        this.service = service;
    }

    /**
     * 
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        key += getStation();
        key += "_";

        if(getService()!=null) key += getService().length() + "_" + getService();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return Station_servicePK constructed from keystring
     */
    public static Station_servicePK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long station = Long.valueOf(keys.substring(0, keylength));
            keys = keys.substring(keylength+1);

            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String service = keys.substring(0, keylength);
            return new Station_servicePK(station, service);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param station_servicePK2: Station_servicePK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IStation_servicePK station_servicePK2) {
        boolean isequal = station_servicePK2!=null;
        if(isequal) {
            isequal = isequal && this.stationPK.equals(station_servicePK2.getStationPK());
            isequal = isequal && this.service.equals(station_servicePK2.getService());
        }
        return isequal;
    }
}
