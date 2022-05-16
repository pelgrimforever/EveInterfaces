/*
 * eView_activemodules.java
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
 * View class View_activemodules
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_activemodules Entity
 * 
 * @author Franky Laseure
 */
public class eView_activemodules implements eveDatabaseproperties, EntityView {

    public static final String table = "view_activemodules";
    private long typegroupid;
    private java.lang.String typegroupname;
    private long id;
    private java.lang.String name;
	  
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eView_activemodules.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eView_activemodules.connectionpool;
    }
    
    /**
     * 
     * @return view name for View_activemodules
     */
    public String getTable() { return table; }

    /**
     * 
     * @return View_activemodules class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_activemodules entity
     */
    public eView_activemodules() {
    }

    /**
     * @return is View_activemodules Empty ?
     */
    public boolean isEmpty() {
        return false;
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

}
