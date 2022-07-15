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
public class eView_contractitem implements eveDatabaseproperties, EntityView {

    public static final String table = "view_contractitem";
    private long id;
    private long contract;
    private boolean blueprint_copy;
    private boolean included;
    private long quantity;
    private long evetype;
    private int material_efficiency;
    private int runs;
    private int time_efficiency;
    private double packaged_volume;
    private java.lang.String typename;
    private long typegroupid;
    private java.lang.String groupname;
    private long categoryid;
    private java.lang.String categoryname;
    private double avg_buyorder;
    private double min_buyorder;
    private double max_buyorder;
    private double avg_sellorder;
    private double min_selorder;
    private double max_selorder;
    private double average;
    private double highest;
    private double lowest;
    private long order_count;
	  
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
	  
    public eView_contractitem() {
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getContract() {
        return this.contract;
    }

    public void setContract(long contract) {
        this.contract = contract;
    }

    public boolean getBlueprint_copy() {
        return this.blueprint_copy;
    }

    public void setBlueprint_copy(boolean blueprint_copy) {
        this.blueprint_copy = blueprint_copy;
    }

    public boolean getIncluded() {
        return this.included;
    }

    public void setIncluded(boolean included) {
        this.included = included;
    }

    public long getQuantity() {
        return this.quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public long getEvetype() {
        return this.evetype;
    }

    public void setEvetype(long evetype) {
        this.evetype = evetype;
    }

    public int getMaterial_efficiency() {
        return this.material_efficiency;
    }

    public void setMaterial_efficiency(int material_efficiency) {
        this.material_efficiency = material_efficiency;
    }

    public int getRuns() {
        return this.runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getTime_efficiency() {
        return this.time_efficiency;
    }

    public void setTime_efficiency(int time_efficiency) {
        this.time_efficiency = time_efficiency;
    }

    public double getPackaged_volume() {
        return this.packaged_volume;
    }

    public void setPackaged_volume(double packaged_volume) {
        this.packaged_volume = packaged_volume;
    }

    public java.lang.String getTypename() {
        return this.typename;
    }

    public void setTypename(java.lang.String typename) {
        this.typename = typename;
    }

    public long getTypegroupid() {
        return this.typegroupid;
    }

    public void setTypegroupid(long typegroupid) {
        this.typegroupid = typegroupid;
    }

    public java.lang.String getGroupname() {
        return this.groupname;
    }

    public void setGroupname(java.lang.String groupname) {
        this.groupname = groupname;
    }

    public long getCategoryid() {
        return this.categoryid;
    }

    public void setCategoryid(long categoryid) {
        this.categoryid = categoryid;
    }

    public java.lang.String getCategoryname() {
        return this.categoryname;
    }

    public void setCategoryname(java.lang.String categoryname) {
        this.categoryname = categoryname;
    }

    public double getAvg_buyorder() {
        return this.avg_buyorder;
    }

    public void setAvg_buyorder(double avg_buyorder) {
        this.avg_buyorder = avg_buyorder;
    }

    public double getMin_buyorder() {
        return this.min_buyorder;
    }

    public void setMin_buyorder(double min_buyorder) {
        this.min_buyorder = min_buyorder;
    }

    public double getMax_buyorder() {
        return this.max_buyorder;
    }

    public void setMax_buyorder(double max_buyorder) {
        this.max_buyorder = max_buyorder;
    }

    public double getAvg_sellorder() {
        return this.avg_sellorder;
    }

    public void setAvg_sellorder(double avg_sellorder) {
        this.avg_sellorder = avg_sellorder;
    }

    public double getMin_selorder() {
        return this.min_selorder;
    }

    public void setMin_selorder(double min_selorder) {
        this.min_selorder = min_selorder;
    }

    public double getMax_selorder() {
        return this.max_selorder;
    }

    public void setMax_selorder(double max_selorder) {
        this.max_selorder = max_selorder;
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

    public long getOrder_count() {
        return this.order_count;
    }

    public void setOrder_count(long order_count) {
        this.order_count = order_count;
    }

}
