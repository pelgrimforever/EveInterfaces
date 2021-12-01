/*
 * Constellation_neighbourPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 30.10.2021 10:3
 *
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IConstellation_neighbour;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class Constellation_neighbourPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class Constellation_neighbourPK implements IConstellation_neighbourPK {

    private IConstellationPK constellationNeighbourPK = new ConstellationPK();
    private IConstellationPK constellationConstellationPK = new ConstellationPK();
  
    /** 
     * Constructor
     * Creates an empty Constellation_neighbourPK
     */
    public Constellation_neighbourPK() {
    }

    /**
     * Constructor
     * build an empty Constellation_neighbourPK with initialized field values
     */
    public Constellation_neighbourPK(long constellation, long neighbour) {
        this.constellationNeighbourPK = new ConstellationPK(neighbour);
        this.constellationConstellationPK = new ConstellationPK(constellation);
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"constellation_neighbour.constellation", constellationConstellationPK.getId()}, 
            {"constellation_neighbour.neighbour", constellationNeighbourPK.getId()}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IConstellation_neighbour.CONSTELLATION, constellationConstellationPK.getId()}, 
            {IConstellation_neighbour.NEIGHBOUR, constellationNeighbourPK.getId()}
        };
        return new Entityvalues(keyfields);
    }

    /**
     * 
     * @return foreign key constellationPK1, instance of IConstellationPK
     */
    public IConstellationPK getConstellationneighbourPK() {
        return this.constellationNeighbourPK;
    }

    /**
     * set foreign key constellationNeighbourPK
     * @param constellationPK: instance of IConstellationPK
     */
    public void setConstellationneighbourPK(IConstellationPK constellationPK) {
        this.constellationNeighbourPK = constellationPK;
    }

    /**
     * 
     * @return foreign key constellationPK, instance of IConstellationPK
     */
    public IConstellationPK getConstellationconstellationPK() {
        return this.constellationConstellationPK;
    }

    /**
     * set foreign key constellationConstellationPK
     * @param constellationPK: instance of IConstellationPK
     */
    public void setConstellationconstellationPK(IConstellationPK constellationPK) {
        this.constellationConstellationPK = constellationPK;
    }

    /**
     * 
     * @return constellation value
     */
    public long getConstellation() {
        return this.constellationConstellationPK.getId();
    }

    /**
     * set constellation value
     * @param constellation: new value
     */
    public void setConstellation(long constellation) {
        this.constellationConstellationPK.setId(constellation);
    }

    /**
     * 
     * @return neighbour value
     */
    public long getNeighbour() {
        return this.constellationNeighbourPK.getId();
    }

    /**
     * set neighbour value
     * @param neighbour: new value
     */
    public void setNeighbour(long neighbour) {
        this.constellationNeighbourPK.setId(neighbour);
    }

    /**
     * 
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        key += getConstellation();
        key += "_";

        key += getNeighbour();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return Constellation_neighbourPK constructed from keystring
     */
    public static Constellation_neighbourPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long constellation = Long.valueOf(keys.substring(0, keylength));
            keys = keys.substring(keylength+1);

            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long neighbour = Long.valueOf(keys.substring(0, keylength));
            return new Constellation_neighbourPK(constellation, neighbour);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param constellation_neighbourPK2: Constellation_neighbourPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IConstellation_neighbourPK constellation_neighbourPK2) {
        boolean isequal = constellation_neighbourPK2!=null;
        if(isequal) {
            isequal = isequal && this.constellationNeighbourPK.equals(constellation_neighbourPK2.getConstellationneighbourPK());
            isequal = isequal && this.constellationConstellationPK.equals(constellation_neighbourPK2.getConstellationconstellationPK());
        }
        return isequal;
    }
}
