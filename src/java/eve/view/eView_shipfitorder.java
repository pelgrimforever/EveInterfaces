/*
 * eView_shipfitorder.java
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
 * View class View_shipfitorder
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_shipfitorder Entity
 * 
 * @author Franky Laseure
 */
public class eView_shipfitorder implements eveDatabaseproperties, EntityView {

    public static final String table = "view_shipfitorder";
    private java.lang.String evetypename;
    private double packaged_volume;
    private java.lang.String username;
    private java.lang.String shipname;
    private long evetype;
    private int amountwanted;
    private int amountinstock;
    private long amountplanned;
	  
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eView_shipfitorder.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eView_shipfitorder.connectionpool;
    }
    
    /**
     * 
     * @return view name for View_shipfitorder
     */
    public String getTable() { return table; }

    /**
     * 
     * @return View_shipfitorder class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_shipfitorder entity
     */
    public eView_shipfitorder() {
    }

    /**
     * @return is View_shipfitorder Empty ?
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * 
     * @return evetypename value
     */
    public java.lang.String getEvetypename() {
        return this.evetypename;
    }

    /**
     * set evetypename value
     * @param evetypename: new value
     */
    public void setEvetypename(java.lang.String evetypename) {
        this.evetypename = evetypename;
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

    /**
     * 
     * @return amountwanted value
     */
    public int getAmountwanted() {
        return this.amountwanted;
    }

    /**
     * set amountwanted value
     * @param amountwanted: new value
     */
    public void setAmountwanted(int amountwanted) {
        this.amountwanted = amountwanted;
    }

    /**
     * 
     * @return amountinstock value
     */
    public int getAmountinstock() {
        return this.amountinstock;
    }

    /**
     * set amountinstock value
     * @param amountinstock: new value
     */
    public void setAmountinstock(int amountinstock) {
        this.amountinstock = amountinstock;
    }

    /**
     * 
     * @return amountplanned value
     */
    public long getAmountplanned() {
        return this.amountplanned;
    }

    /**
     * set amountplanned value
     * @param amountplanned: new value
     */
    public void setAmountplanned(long amountplanned) {
        this.amountplanned = amountplanned;
    }

}
