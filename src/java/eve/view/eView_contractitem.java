/*
 * eView_contractitem.java
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
 * View class View_contractitem
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_contractitem Entity
 * 
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
	  
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eView_contractitem.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eView_contractitem.connectionpool;
    }
    
    /**
     * 
     * @return view name for View_contractitem
     */
    public String getTable() { return table; }

    /**
     * 
     * @return View_contractitem class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_contractitem entity
     */
    public eView_contractitem() {
    }

    /**
     * @return is View_contractitem Empty ?
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
     * @return contract value
     */
    public long getContract() {
        return this.contract;
    }

    /**
     * set contract value
     * @param contract: new value
     */
    public void setContract(long contract) {
        this.contract = contract;
    }

    /**
     * 
     * @return blueprint_copy value
     */
    public boolean getBlueprint_copy() {
        return this.blueprint_copy;
    }

    /**
     * set blueprint_copy value
     * @param blueprint_copy: new value
     */
    public void setBlueprint_copy(boolean blueprint_copy) {
        this.blueprint_copy = blueprint_copy;
    }

    /**
     * 
     * @return included value
     */
    public boolean getIncluded() {
        return this.included;
    }

    /**
     * set included value
     * @param included: new value
     */
    public void setIncluded(boolean included) {
        this.included = included;
    }

    /**
     * 
     * @return quantity value
     */
    public long getQuantity() {
        return this.quantity;
    }

    /**
     * set quantity value
     * @param quantity: new value
     */
    public void setQuantity(long quantity) {
        this.quantity = quantity;
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
     * @return material_efficiency value
     */
    public int getMaterial_efficiency() {
        return this.material_efficiency;
    }

    /**
     * set material_efficiency value
     * @param material_efficiency: new value
     */
    public void setMaterial_efficiency(int material_efficiency) {
        this.material_efficiency = material_efficiency;
    }

    /**
     * 
     * @return runs value
     */
    public int getRuns() {
        return this.runs;
    }

    /**
     * set runs value
     * @param runs: new value
     */
    public void setRuns(int runs) {
        this.runs = runs;
    }

    /**
     * 
     * @return time_efficiency value
     */
    public int getTime_efficiency() {
        return this.time_efficiency;
    }

    /**
     * set time_efficiency value
     * @param time_efficiency: new value
     */
    public void setTime_efficiency(int time_efficiency) {
        this.time_efficiency = time_efficiency;
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
     * @return typename value
     */
    public java.lang.String getTypename() {
        return this.typename;
    }

    /**
     * set typename value
     * @param typename: new value
     */
    public void setTypename(java.lang.String typename) {
        this.typename = typename;
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
     * @return groupname value
     */
    public java.lang.String getGroupname() {
        return this.groupname;
    }

    /**
     * set groupname value
     * @param groupname: new value
     */
    public void setGroupname(java.lang.String groupname) {
        this.groupname = groupname;
    }

    /**
     * 
     * @return categoryid value
     */
    public long getCategoryid() {
        return this.categoryid;
    }

    /**
     * set categoryid value
     * @param categoryid: new value
     */
    public void setCategoryid(long categoryid) {
        this.categoryid = categoryid;
    }

    /**
     * 
     * @return categoryname value
     */
    public java.lang.String getCategoryname() {
        return this.categoryname;
    }

    /**
     * set categoryname value
     * @param categoryname: new value
     */
    public void setCategoryname(java.lang.String categoryname) {
        this.categoryname = categoryname;
    }

    /**
     * 
     * @return avg_buyorder value
     */
    public double getAvg_buyorder() {
        return this.avg_buyorder;
    }

    /**
     * set avg_buyorder value
     * @param avg_buyorder: new value
     */
    public void setAvg_buyorder(double avg_buyorder) {
        this.avg_buyorder = avg_buyorder;
    }

    /**
     * 
     * @return min_buyorder value
     */
    public double getMin_buyorder() {
        return this.min_buyorder;
    }

    /**
     * set min_buyorder value
     * @param min_buyorder: new value
     */
    public void setMin_buyorder(double min_buyorder) {
        this.min_buyorder = min_buyorder;
    }

    /**
     * 
     * @return max_buyorder value
     */
    public double getMax_buyorder() {
        return this.max_buyorder;
    }

    /**
     * set max_buyorder value
     * @param max_buyorder: new value
     */
    public void setMax_buyorder(double max_buyorder) {
        this.max_buyorder = max_buyorder;
    }

    /**
     * 
     * @return avg_sellorder value
     */
    public double getAvg_sellorder() {
        return this.avg_sellorder;
    }

    /**
     * set avg_sellorder value
     * @param avg_sellorder: new value
     */
    public void setAvg_sellorder(double avg_sellorder) {
        this.avg_sellorder = avg_sellorder;
    }

    /**
     * 
     * @return min_selorder value
     */
    public double getMin_selorder() {
        return this.min_selorder;
    }

    /**
     * set min_selorder value
     * @param min_selorder: new value
     */
    public void setMin_selorder(double min_selorder) {
        this.min_selorder = min_selorder;
    }

    /**
     * 
     * @return max_selorder value
     */
    public double getMax_selorder() {
        return this.max_selorder;
    }

    /**
     * set max_selorder value
     * @param max_selorder: new value
     */
    public void setMax_selorder(double max_selorder) {
        this.max_selorder = max_selorder;
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

    /**
     * 
     * @return order_count value
     */
    public long getOrder_count() {
        return this.order_count;
    }

    /**
     * set order_count value
     * @param order_count: new value
     */
    public void setOrder_count(long order_count) {
        this.order_count = order_count;
    }

}
