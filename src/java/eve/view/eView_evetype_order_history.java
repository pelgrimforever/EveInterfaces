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

public class eView_evetype_order_history implements eveDatabaseproperties, EntityView {

    public static final String table = "view_evetype_order_history";
    private long evetype;
    private java.sql.Date date;
    private double average;
    private double highest;
    private double lowest;
    private long volume;
    private long ordercount;
	  
    @Override
    public String getDbtool() {
        return eView_evetype_order_history.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eView_evetype_order_history.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eView_evetype_order_history() {
    }

    public boolean isEmpty() {
        return false;
    }

    public long getEvetype() {
        return this.evetype;
    }

    public void setEvetype(long evetype) {
        this.evetype = evetype;
    }

    public java.sql.Date getDate() {
        return this.date;
    }

    public void setDate(java.sql.Date date) {
        this.date = date;
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

    public long getVolume() {
        return this.volume;
    }

    public void setVolume(long volume) {
        this.volume = volume;
    }

    public long getOrdercount() {
        return this.ordercount;
    }

    public void setOrdercount(long ordercount) {
        this.ordercount = ordercount;
    }

}
