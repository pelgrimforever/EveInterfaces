/*
 * TypegroupPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2021 15:16
 *
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.ITypegroup;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class TypegroupPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class TypegroupPK implements ITypegroupPK {

    private long id;
  
    /** 
     * Constructor
     * Creates an empty TypegroupPK
     */
    public TypegroupPK() {
    }

    /**
     * Constructor
     * build an empty TypegroupPK with initialized field values
     */
    public TypegroupPK(long id) {
        this.id = id;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"typegroup.id", id}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {ITypegroup.ID, id}
        };
        return new Entityvalues(keyfields);
    }

    /**
     * 
     * @return id value
     */
    public long getId() {
        return this.id;
    }

    /**
     * set id value
     * @param id: new value
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * 
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        key += getId();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return TypegroupPK constructed from keystring
     */
    public static TypegroupPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long id = Long.valueOf(keys.substring(0, keylength));
            return new TypegroupPK(id);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param typegroupPK2: TypegroupPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ITypegroupPK typegroupPK2) {
        boolean isequal = typegroupPK2!=null;
        if(isequal) {
            isequal = isequal && this.id == typegroupPK2.getId();
        }
        return isequal;
    }
}
