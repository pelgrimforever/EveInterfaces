/*
 * eView_security_island_systemcount.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.5.2021 13:35
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
 * View class View_security_island_systemcount
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_security_island_systemcount Entity
 * 
 * @author Franky Laseure
 */
public class eView_security_island_systemcount implements EntityViewInterface {

    private long id;
    private java.lang.String name;
    private long systems;
	  
    public static final String table = "view_security_island_systemcount";
    public static final String SQLSelectAll = "select view_security_island_systemcount.* from view_security_island_systemcount";
	  
    /**
     * 
     * @return view name for View_security_island_systemcount
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL select statement for all View_security_island_systemcounts
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

    /**
     * 
     * @return View_security_island_systemcount class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_security_island_systemcount entity
     */
    public eView_security_island_systemcount() {
    }

    /**
     * @return is View_security_island_systemcount Empty ?
     */
    public boolean isEmpty() {
        return false;
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
     * @return systems value
     */
    public long getSystems() {
        return this.systems;
    }

    /**
     * set systems value
     * @param systems: new value
     */
    public void setSystems(long systems) {
        this.systems = systems;
    }

}
