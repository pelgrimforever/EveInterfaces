/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.5.2022 11:23
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
	  
    @Override
    public String getDbtool() {
        return databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return connectionpool;
    }
    
    @Override
    public String getTable() { return table; }

    @Override
    public String getClassName() { return this.getClass().getName(); };
	  
    public eView_materialinput() {
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public java.lang.String getUsername() {
        return this.username;
    }

    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    public long getEvetype() {
        return this.evetype;
    }

    public void setEvetype(long evetype) {
        this.evetype = evetype;
    }

    public java.sql.Timestamp getAddtimestamp() {
        return this.addtimestamp;
    }

    public void setAddtimestamp(java.sql.Timestamp addtimestamp) {
        this.addtimestamp = addtimestamp;
    }

    public long getAmount() {
        return this.amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public double getUnitprice() {
        return this.unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }

    public long getUsedamount() {
        return this.usedamount;
    }

    public void setUsedamount(long usedamount) {
        this.usedamount = usedamount;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public double getPackaged_volume() {
        return this.packaged_volume;
    }

    public void setPackaged_volume(double packaged_volume) {
        this.packaged_volume = packaged_volume;
    }

    public double getAverage() {
        return this.average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public double getHighest() {
        return this.highest;
    }

    public void setHighest(double highest) {
        this.highest = highest;
    }

    public double getLowest() {
        return this.lowest;
    }

    public void setLowest(double lowest) {
        this.lowest = lowest;
    }

}
