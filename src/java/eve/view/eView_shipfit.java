/*
 * eView_shipfit.java
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
 * View class View_shipfit
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_shipfit Entity
 * 
 * @author Franky Laseure
 */
public class eView_shipfit implements eveDatabaseproperties, EntityView {

    public static final String table = "view_shipfit";
    private java.lang.String shiptype;
    private double packaged_volume;
    private java.lang.String username;
    private java.lang.String shipname;
    private long evetype;
	  
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eView_shipfit.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eView_shipfit.connectionpool;
    }
    
    /**
     * 
     * @return view name for View_shipfit
     */
    public String getTable() { return table; }

    /**
     * 
     * @return View_shipfit class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_shipfit entity
     */
    public eView_shipfit() {
    }

    /**
     * @return is View_shipfit Empty ?
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * 
     * @return shiptype value
     */
    public java.lang.String getShiptype() {
        return this.shiptype;
    }

    /**
     * set shiptype value
     * @param shiptype: new value
     */
    public void setShiptype(java.lang.String shiptype) {
        this.shiptype = shiptype;
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
     * @return evetype value
     */
    public long getEvetype() {
        return this.evetype;
    }

    /**
     * set evetype value
     * @param evetype: new value
     */
    public void setEvetype(long evetype) {
        this.evetype = evetype;
    }

}
