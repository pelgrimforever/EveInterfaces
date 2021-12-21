/*
 * eView_security_island_systemcount.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 16.11.2021 15:45
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
 * View class View_security_island_systemcount
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_security_island_systemcount Entity
 * 
 * @author Franky Laseure
 */
public class eView_security_island_systemcount implements eveDatabaseproperties, EntityView {

    public static final String table = "view_security_island_systemcount";
    private long id;
    private java.lang.String name;
    private long systems;
	  
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eView_security_island_systemcount.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eView_security_island_systemcount.connectionpool;
    }
    
    /**
     * 
     * @return view name for View_security_island_systemcount
     */
    public String getTable() { return table; }

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
