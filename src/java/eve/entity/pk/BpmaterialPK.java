/*
 * BpmaterialPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 11.4.2022 9:13
 *
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IBpmaterial;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class BpmaterialPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class BpmaterialPK implements IBpmaterialPK {

    private IEvetypePK evetypeBpPK = new EvetypePK();
    private IEvetypePK evetypeMaterialPK = new EvetypePK();
  
    /** 
     * Constructor
     * Creates an empty BpmaterialPK
     */
    public BpmaterialPK() {
    }

    /**
     * Constructor
     * build an empty BpmaterialPK with initialized field values
     */
    public BpmaterialPK(long bp, long material) {
        this.evetypeBpPK = new EvetypePK(bp);
        this.evetypeMaterialPK = new EvetypePK(material);
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"bpmaterial.bp", evetypeBpPK.getId()}, 
            {"bpmaterial.material", evetypeMaterialPK.getId()}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IBpmaterial.BP, evetypeBpPK.getId()}, 
            {IBpmaterial.MATERIAL, evetypeMaterialPK.getId()}
        };
        return new Entityvalues(keyfields);
    }

    /**
     * 
     * @return foreign key evetypePK1, instance of IEvetypePK
     */
    public IEvetypePK getEvetypebpPK() {
        return this.evetypeBpPK;
    }

    /**
     * set foreign key evetypeBpPK
     * @param evetypePK: instance of IEvetypePK
     */
    public void setEvetypebpPK(IEvetypePK evetypePK) {
        this.evetypeBpPK = evetypePK;
    }

    /**
     * 
     * @return foreign key evetypePK, instance of IEvetypePK
     */
    public IEvetypePK getEvetypematerialPK() {
        return this.evetypeMaterialPK;
    }

    /**
     * set foreign key evetypeMaterialPK
     * @param evetypePK: instance of IEvetypePK
     */
    public void setEvetypematerialPK(IEvetypePK evetypePK) {
        this.evetypeMaterialPK = evetypePK;
    }

    /**
     * 
     * @return bp value
     */
    public long getBp() {
        return this.evetypeBpPK.getId();
    }

    /**
     * set bp value
     * @param bp: new value
     */
    public void setBp(long bp) {
        this.evetypeBpPK.setId(bp);
    }

    /**
     * 
     * @return material value
     */
    public long getMaterial() {
        return this.evetypeMaterialPK.getId();
    }

    /**
     * set material value
     * @param material: new value
     */
    public void setMaterial(long material) {
        this.evetypeMaterialPK.setId(material);
    }

    /**
     * 
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        key += getBp();
        key += "_";

        key += getMaterial();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return BpmaterialPK constructed from keystring
     */
    public static BpmaterialPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long bp = Long.valueOf(keys.substring(0, keylength));
            keys = keys.substring(keylength+1);

            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long material = Long.valueOf(keys.substring(0, keylength));
            return new BpmaterialPK(bp, material);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param bpmaterialPK2: BpmaterialPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IBpmaterialPK bpmaterialPK2) {
        boolean isequal = bpmaterialPK2!=null;
        if(isequal) {
            isequal = isequal && this.evetypeBpPK.equals(bpmaterialPK2.getEvetypebpPK());
            isequal = isequal && this.evetypeMaterialPK.equals(bpmaterialPK2.getEvetypematerialPK());
        }
        return isequal;
    }
}
