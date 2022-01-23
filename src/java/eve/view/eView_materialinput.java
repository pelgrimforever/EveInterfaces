/*
 * eView_materialinput.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 19.0.2022 21:56
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
 * View class View_materialinput
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_materialinput Entity
 * 
 * @author Franky Laseure
 */
public class eView_materialinput implements eveDatabaseproperties, EntityView {

    public static final String table = "view_materialinput";
    private java.lang.String username;
    private long evetype;
    private java.sql.Timestamp addtimestamp;
    private long amount;
    private double unitprice;
    private long usedamount;
    private java.lang.String name;
    private double packaged_volume;
    private double average;
    private double highest;
    private double lowest;
	  
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eView_materialinput.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eView_materialinput.connectionpool;
    }
    
    /**
     * 
     * @return view name for View_materialinput
     */
    public String getTable() { return table; }

    /**
     * 
     * @return View_materialinput class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_materialinput entity
     */
    public eView_materialinput() {
    }

    /**
     * @return is View_materialinput Empty ?
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
     * @return addtimestamp value
     */
    public java.sql.Timestamp getAddtimestamp() {
        return this.addtimestamp;
    }

    /**
     * set addtimestamp value
     * @param addtimestamp: new value
     */
    public void setAddtimestamp(java.sql.Timestamp addtimestamp) {
        this.addtimestamp = addtimestamp;
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
     * @return unitprice value
     */
    public double getUnitprice() {
        return this.unitprice;
    }

    /**
     * set unitprice value
     * @param unitprice: new value
     */
    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }

    /**
     * 
     * @return usedamount value
     */
    public long getUsedamount() {
        return this.usedamount;
    }

    /**
     * set usedamount value
     * @param usedamount: new value
     */
    public void setUsedamount(long usedamount) {
        this.usedamount = usedamount;
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
     * @return average value
     */
    public double getAverage() {
        return this.average;
    }

    /**
     * set average value
     * @param average: new value
     */
    public void setAverage(double average) {
        this.average = average;
    }

    /**
     * 
     * @return highest value
     */
    public double getHighest() {
        return this.highest;
    }

    /**
     * set highest value
     * @param highest: new value
     */
    public void setHighest(double highest) {
        this.highest = highest;
    }

    /**
     * 
     * @return lowest value
     */
    public double getLowest() {
        return this.lowest;
    }

    /**
     * set lowest value
     * @param lowest: new value
     */
    public void setLowest(double lowest) {
        this.lowest = lowest;
    }

}
