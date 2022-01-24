/*
 * eView_bpmaterial.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 24.0.2022 17:38
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
 * View class View_bpmaterial
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_bpmaterial Entity
 * 
 * @author Franky Laseure
 */
public class eView_bpmaterial implements eveDatabaseproperties, EntityView {

    public static final String table = "view_bpmaterial";
    private long bp;
    private long material;
    private long amount;
    private long category;
    private long typegroupid;
    private java.lang.String typegroupname;
    private java.lang.String name;
	  
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eView_bpmaterial.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eView_bpmaterial.connectionpool;
    }
    
    /**
     * 
     * @return view name for View_bpmaterial
     */
    public String getTable() { return table; }

    /**
     * 
     * @return View_bpmaterial class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_bpmaterial entity
     */
    public eView_bpmaterial() {
    }

    /**
     * @return is View_bpmaterial Empty ?
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * 
     * @return bp value
     */
    public long getBp() {
        return this.bp;
    }

    /**
     * set bp value
     * @param bp: new value
     */
    public void setBp(long bp) {
        this.bp = bp;
    }

    /**
     * 
     * @return material value
     */
    public long getMaterial() {
        return this.material;
    }

    /**
     * set material value
     * @param material: new value
     */
    public void setMaterial(long material) {
        this.material = material;
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
