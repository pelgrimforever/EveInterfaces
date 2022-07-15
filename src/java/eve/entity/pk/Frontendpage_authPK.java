/*
 * Frontendpage_authPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 9.5.2022 11:11
 *
 */

package eve.entity.pk;

import data.interfaces.db.EntityPK;
import eve.interfaces.entity.pk.*;
import eve.interfaces.logicentity.IFrontendpage_auth;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class Frontendpage_authPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class Frontendpage_authPK implements IFrontendpage_authPK {

    private IFrontendpagePK frontendpagePK = new FrontendpagePK();
    private IEveuserPK eveuserPK = new EveuserPK();
  
    /** 
     * Constructor
     * Creates an empty Frontendpage_authPK
     */
    public Frontendpage_authPK() {
    }

    /**
     * Constructor
     * build an empty Frontendpage_authPK with initialized field values
     */
    public Frontendpage_authPK(java.lang.String username, java.lang.String frontendpage) {
        this.frontendpagePK = new FrontendpagePK(frontendpage);
        this.eveuserPK = new EveuserPK(username);
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"frontendpage_auth.username", eveuserPK.getUsername()}, 
            {"frontendpage_auth.frontendpage", frontendpagePK.getName()}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IFrontendpage_auth.USERNAME, eveuserPK.getUsername()}, 
            {IFrontendpage_auth.FRONTENDPAGE, frontendpagePK.getName()}
        };
        return new Entityvalues(keyfields);
    }

    /**
     * 
     * @return foreign key frontendpagePK, instance of IFrontendpagePK
     */
    public IFrontendpagePK getFrontendpagePK() {
        return this.frontendpagePK;
    }

    /**
     * set foreign key frontendpagePK
     * @param frontendpagePK: instance of IFrontendpagePK
     */
    public void setFrontendpagePK(IFrontendpagePK frontendpagePK) {
        this.frontendpagePK = frontendpagePK;
    }

    /**
     * 
     * @return foreign key eveuserPK, instance of IEveuserPK
     */
    public IEveuserPK getEveuserPK() {
        return this.eveuserPK;
    }

    /**
     * set foreign key eveuserPK
     * @param eveuserPK: instance of IEveuserPK
     */
    public void setEveuserPK(IEveuserPK eveuserPK) {
        this.eveuserPK = eveuserPK;
    }

    /**
     * 
     * @return username value
     */
    public java.lang.String getUsername() {
        return this.eveuserPK.getUsername();
    }

    /**
     * set username value
     * @param username: new value
     */
    public void setUsername(java.lang.String username) {
        this.eveuserPK.setUsername(username);
    }

    /**
     * 
     * @return frontendpage value
     */
    public java.lang.String getFrontendpage() {
        return this.frontendpagePK.getName();
    }

    /**
     * set frontendpage value
     * @param frontendpage: new value
     */
    public void setFrontendpage(java.lang.String frontendpage) {
        this.frontendpagePK.setName(frontendpage);
    }

    /**
     * 
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        if(getUsername()!=null) key += getUsername().length() + "_" + getUsername();
        key += "_";

        if(getFrontendpage()!=null) key += getFrontendpage().length() + "_" + getFrontendpage();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return Frontendpage_authPK constructed from keystring
     */
    public static Frontendpage_authPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String username = keys.substring(0, keylength);
            keys = keys.substring(keylength+1);

            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String frontendpage = keys.substring(0, keylength);
            return new Frontendpage_authPK(username, frontendpage);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param frontendpage_authPK2: Frontendpage_authPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IFrontendpage_authPK frontendpage_authPK2) {
        boolean isequal = frontendpage_authPK2!=null;
        if(isequal) {
            isequal = isequal && this.frontendpagePK.equals(frontendpage_authPK2.getFrontendpagePK());
            isequal = isequal && this.eveuserPK.equals(frontendpage_authPK2.getEveuserPK());
        }
        return isequal;
    }
}
