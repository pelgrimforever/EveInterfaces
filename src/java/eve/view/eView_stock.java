/*
 * eView_stock.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 9.11.2021 14:30
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
 * View class View_stock
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_stock Entity
 * 
 * @author Franky Laseure
 */
public class eView_stock implements eveDatabaseproperties, EntityView {

    public static final String table = "view_stock";
    private java.lang.String username;
    private long evetype;
    private long amount;
    private java.lang.String name;
	  
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eView_stock.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eView_stock.connectionpool;
    }
    
    /**
     * 
     * @return view name for View_stock
     */
    public String getTable() { return table; }

    /**
     * 
     * @return View_stock class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_stock entity
     */
    public eView_stock() {
    }

    /**
     * @return is View_stock Empty ?
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
     * @return amount value
     */
    public long getAmount() {
        return this.amount;
    }

    /**
     * set amount value
     * @param amount: new value
     */
    public void setAmount(long amount) {
        this.amount = amount;
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

}
