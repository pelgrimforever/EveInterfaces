/*
 * eView_shipfitmodule.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 11.4.2022 9:13
 *
 */

package eve.view;

import eve.eveDatabaseproperties;
import data.interfaces.db.EntityView;
import data.interfaces.db.Filedata;
import data.gis.shape.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.HashMap;
import java.util.Iterator;

/**
 * View class View_shipfitmodule
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_shipfitmodule Entity
 * 
 * @author Franky Laseure
 */
public class eView_shipfitmodule implements eveDatabaseproperties, EntityView {

    public static final String table = "view_shipfitmodule";
    private java.lang.String modulename;
    private double packaged_volume;
    private java.lang.String username;
    private java.lang.String shipname;
    private long moduletype;
    private int amount;
	  
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eView_shipfitmodule.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eView_shipfitmodule.connectionpool;
    }
    
    /**
     * 
     * @return view name for View_shipfitmodule
     */
    public String getTable() { return table; }

    /**
     * 
     * @return View_shipfitmodule class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_shipfitmodule entity
     */
    public eView_shipfitmodule() {
    }

    /**
     * @return is View_shipfitmodule Empty ?
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * 
     * @return modulename value
     */
    public java.lang.String getModulename() {
        return this.modulename;
    }

    /**
     * set modulename value
     * @param modulename: new value
     */
    public void setModulename(java.lang.String modulename) {
        this.modulename = modulename;
    }

    /**
     * 
     * @return packaged_volume value
     */
    public double getPackaged_volume() {
        return this.packaged_volume;
    }

    /**
     * set packaged_volume value
     * @param packaged_volume: new value
     */
    public void setPackaged_volume(double packaged_volume) {
        this.packaged_volume = packaged_volume;
    }

    /**
     * 
     * @return username value
     */
    public java.lang.String getUsername() {
        return this.username;
    }

    /**
     * set username value
     * @param username: new value
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    /**
     * 
     * @return shipname value
     */
    public java.lang.String getShipname() {
        return this.shipname;
    }

    /**
     * set shipname value
     * @param shipname: new value
     */
    public void setShipname(java.lang.String shipname) {
        this.shipname = shipname;
    }

    /**
     * 
     * @return moduletype value
     */
    public long getModuletype() {
        return this.moduletype;
    }

    /**
     * set moduletype value
     * @param moduletype: new value
     */
    public void setModuletype(long moduletype) {
        this.moduletype = moduletype;
    }

    /**
     * 
     * @return amount value
     */
    public int getAmount() {
        return this.amount;
    }

    /**
     * set amount value
     * @param amount: new value
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

}
