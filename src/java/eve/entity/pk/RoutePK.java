/*
 * RoutePK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 8.10.2021 7:21
 *
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IRoute;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class RoutePK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class RoutePK implements IRoutePK {

    private IRoutetypePK routetypePK = new RoutetypePK();
    private ISystemPK systemPK = new SystemPK();
  
    /** 
     * Constructor
     * Creates an empty RoutePK
     */
    public RoutePK() {
    }

    /**
     * Constructor
     * build an empty RoutePK with initialized field values
     */
    public RoutePK(long routetype, long system) {
        this.routetypePK = new RoutetypePK(routetype);
        this.systemPK = new SystemPK(system);
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"route.routetype", routetypePK.getId()}, 
            {"route.system", systemPK.getId()}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IRoute.ROUTETYPE, routetypePK.getId()}, 
            {IRoute.SYSTEM, systemPK.getId()}
        };
        return new Entityvalues(keyfields);
    }

    /**
     * 
     * @return foreign key routetypePK, instance of IRoutetypePK
     */
    public IRoutetypePK getRoutetypePK() {
        return this.routetypePK;
    }

    /**
     * set foreign key routetypePK
     * @param routetypePK: instance of IRoutetypePK
     */
    public void setRoutetypePK(IRoutetypePK routetypePK) {
        this.routetypePK = routetypePK;
    }

    /**
     * 
     * @return foreign key systemPK, instance of ISystemPK
     */
    public ISystemPK getSystemPK() {
        return this.systemPK;
    }

    /**
     * set foreign key systemPK
     * @param systemPK: instance of ISystemPK
     */
    public void setSystemPK(ISystemPK systemPK) {
        this.systemPK = systemPK;
    }

    /**
     * 
     * @return routetype value
     */
    public long getRoutetype() {
        return this.routetypePK.getId();
    }

    /**
     * set routetype value
     * @param routetype: new value
     */
    public void setRoutetype(long routetype) {
        this.routetypePK.setId(routetype);
    }

    /**
     * 
     * @return system value
     */
    public long getSystem() {
        return this.systemPK.getId();
    }

    /**
     * set system value
     * @param system: new value
     */
    public void setSystem(long system) {
        this.systemPK.setId(system);
    }

    /**
     * 
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        key += getRoutetype();
        key += "_";

        key += getSystem();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return RoutePK constructed from keystring
     */
    public static RoutePK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long routetype = Long.valueOf(keys.substring(0, keylength));
            keys = keys.substring(keylength+1);

            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long system = Long.valueOf(keys.substring(0, keylength));
            return new RoutePK(routetype, system);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param routePK2: RoutePK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IRoutePK routePK2) {
        boolean isequal = routePK2!=null;
        if(isequal) {
            isequal = isequal && this.routetypePK.equals(routePK2.getRoutetypePK());
            isequal = isequal && this.systemPK.equals(routePK2.getSystemPK());
        }
        return isequal;
    }
}
