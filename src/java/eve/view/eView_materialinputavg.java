/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
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

public class eView_materialinputavg implements eveDatabaseproperties, EntityView {

    public static final String table = "view_materialinputavg";
    private java.lang.String username;
    private long evetype;
    private java.sql.Timestamp lastbuytimestamp;
    private float totalamount;
    private double avgunitprice;
    private float totalusedamount;
    private java.lang.String name;
    private double packaged_volume;
    private double average;
    private double highest;
    private double lowest;
	  
    @Override
    public String getDbtool() {
        return eView_materialinputavg.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eView_materialinputavg.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eView_materialinputavg() {
    }

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

    public java.sql.Timestamp getLastbuytimestamp() {
        return this.lastbuytimestamp;
    }

    public void setLastbuytimestamp(java.sql.Timestamp lastbuytimestamp) {
        this.lastbuytimestamp = lastbuytimestamp;
    }

    public float getTotalamount() {
        return this.totalamount;
    }

    public void setTotalamount(float totalamount) {
        this.totalamount = totalamount;
    }

    public double getAvgunitprice() {
        return this.avgunitprice;
    }

    public void setAvgunitprice(double avgunitprice) {
        this.avgunitprice = avgunitprice;
    }

    public float getTotalusedamount() {
        return this.totalusedamount;
    }

    public void setTotalusedamount(float totalusedamount) {
        this.totalusedamount = totalusedamount;
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
