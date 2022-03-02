/*
 * eView_evetypes.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 21.1.2022 12:4
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
 * View class View_evetypes
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_evetypes Entity
 * 
 * @author Franky Laseure
 */
public class eView_evetypes implements eveDatabaseproperties, EntityView {

    public static final String table = "view_evetypes";
    private long category;
    private long typegroupid;
    private java.lang.String typegroupname;
    private long id;
    private java.lang.String name;
    private boolean configuredbp;
	  
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eView_evetypes.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eView_evetypes.connectionpool;
    }
    
    /**
     * 
     * @return view name for View_evetypes
     */
    public String getTable() { return table; }

    /**
     * 
     * @return View_evetypes class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_evetypes entity
     */
    public eView_evetypes() {
    }

    /**
     * @return is View_evetypes Empty ?
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * 
     * @return category value
     */
    public long getCategory() {
        return this.category;
    }

    /**
     * set category value
     * @param category: new value
     */
    public void setCategory(long category) {
        this.category = category;
    }

    /**
     * 
     * @return typegroupid value
     */
    public long getTypegroupid() {
        return this.typegroupid;
    }

    /**
     * set typegroupid value
     * @param typegroupid: new value
     */
    public void setTypegroupid(long typegroupid) {
        this.typegroupid = typegroupid;
    }

    /**
     * 
     * @return typegroupname value
     */
    public java.lang.String getTypegroupname() {
        return this.typegroupname;
    }

    /**
     * set typegroupname value
     * @param typegroupname: new value
     */
    public void setTypegroupname(java.lang.String typegroupname) {
        this.typegroupname = typegroupname;
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
     * @return configuredbp value
     */
    public boolean getConfiguredbp() {
        return this.configuredbp;
    }

    /**
     * set configuredbp value
     * @param configuredbp: new value
     */
    public void setConfiguredbp(boolean configuredbp) {
        this.configuredbp = configuredbp;
    }

}
