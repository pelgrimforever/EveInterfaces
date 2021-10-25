/*
 * Json_ordersPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2021 15:16
 *
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IJson_orders;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class Json_ordersPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class Json_ordersPK implements IJson_ordersPK {

    private int id;
  
    /** 
     * Constructor
     * Creates an empty Json_ordersPK
     */
    public Json_ordersPK() {
    }

    /**
     * Constructor
     * build an empty Json_ordersPK with initialized field values
     */
    public Json_ordersPK(int id) {
        this.id = id;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"json_orders.id", id}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IJson_orders.ID, id}
        };
        return new Entityvalues(keyfields);
    }

    /**
     * 
     * @return id value
     */
    public int getId() {
        return this.id;
    }

    /**
     * set id value
     * @param id: new value
     */
    public void setId(int id) {
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
     * @return Json_ordersPK constructed from keystring
     */
    public static Json_ordersPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            int id = Integer.valueOf(keys.substring(0, keylength));
            return new Json_ordersPK(id);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param json_ordersPK2: Json_ordersPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IJson_ordersPK json_ordersPK2) {
        boolean isequal = json_ordersPK2!=null;
        if(isequal) {
            isequal = isequal && this.id == json_ordersPK2.getId();
        }
        return isequal;
    }
}
