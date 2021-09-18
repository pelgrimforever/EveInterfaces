/*
 * eView_stocktrade_system.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 18.8.2021 11:31
 *
 */

package eve.view;

import data.interfaces.db.EntityViewInterface;
import data.interfaces.db.Filedata;
import data.gis.shape.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.HashMap;
import java.util.Iterator;

/**
 * View class View_stocktrade_system
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_stocktrade_system Entity
 * 
 * @author Franky Laseure
 */
public class eView_stocktrade_system implements EntityViewInterface {

    private java.lang.String username;
    private long id;
    private java.lang.String name;
    private double sellprice;
    private double totalvolume;
	  
    public static final String table = "view_stocktrade_system";
    public static final String SQLSelectAll = "select view_stocktrade_system.* from view_stocktrade_system";
	  
    /**
     * 
     * @return view name for View_stocktrade_system
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL select statement for all View_stocktrade_systems
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

    /**
     * 
     * @return View_stocktrade_system class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_stocktrade_system entity
     */
    public eView_stocktrade_system() {
    }

    /**
     * @return is View_stocktrade_system Empty ?
     */
    public boolean isEmpty() {
        return false;
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
     * @return name value
     */
    public java.lang.String getName() {
        return this.name;
    }

    /**
     * set name value
     * @param name: new value
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    /**
     * 
     * @return sellprice value
     */
    public double getSellprice() {
        return this.sellprice;
    }

    /**
     * set sellprice value
     * @param sellprice: new value
     */
    public void setSellprice(double sellprice) {
        this.sellprice = sellprice;
    }

    /**
     * 
     * @return totalvolume value
     */
    public double getTotalvolume() {
        return this.totalvolume;
    }

    /**
     * set totalvolume value
     * @param totalvolume: new value
     */
    public void setTotalvolume(double totalvolume) {
        this.totalvolume = totalvolume;
    }

}
