/*
 * eView_userbpmaterial.java
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
 * View class View_userbpmaterial
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_userbpmaterial Entity
 * 
 * @author Franky Laseure
 */
public class eView_userbpmaterial implements eveDatabaseproperties, EntityView {

    public static final String table = "view_userbpmaterial";
    private java.lang.String username;
    private int serialnumber;
    private long bp;
    private long material;
    private long amount;
    private long category;
    private long typegroupid;
    private java.lang.String typegroupname;
    private java.lang.String name;
    private double marketaverage;
    private double materialinputaverage;
	  
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eView_userbpmaterial.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eView_userbpmaterial.connectionpool;
    }
    
    /**
     * 
     * @return view name for View_userbpmaterial
     */
    public String getTable() { return table; }

    /**
     * 
     * @return View_userbpmaterial class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_userbpmaterial entity
     */
    public eView_userbpmaterial() {
    }

    /**
     * @return is View_userbpmaterial Empty ?
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
     * @return serialnumber value
     */
    public int getSerialnumber() {
        return this.serialnumber;
    }

    /**
     * set serialnumber value
     * @param serialnumber: new value
     */
    public void setSerialnumber(int serialnumber) {
        this.serialnumber = serialnumber;
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

    /**
     * 
     * @return marketaverage value
     */
    public double getMarketaverage() {
        return this.marketaverage;
    }

    /**
     * set marketaverage value
     * @param marketaverage: new value
     */
    public void setMarketaverage(double marketaverage) {
        this.marketaverage = marketaverage;
    }

    /**
     * 
     * @return materialinputaverage value
     */
    public double getMaterialinputaverage() {
        return this.materialinputaverage;
    }

    /**
     * set materialinputaverage value
     * @param materialinputaverage: new value
     */
    public void setMaterialinputaverage(double materialinputaverage) {
        this.materialinputaverage = materialinputaverage;
    }

}
