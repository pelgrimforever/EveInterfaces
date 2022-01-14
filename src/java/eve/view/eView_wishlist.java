/*
 * eView_wishlist.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.0.2022 16:56
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
 * View class View_wishlist
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_wishlist Entity
 * 
 * @author Franky Laseure
 */
public class eView_wishlist implements eveDatabaseproperties, EntityView {

    public static final String table = "view_wishlist";
    private java.lang.String username;
    private double maxprice;
    private long id;
    private java.lang.String name;
    private long typegroup;
    private boolean published;
    private java.lang.String description;
    private double capacity;
    private long graphic;
    private long icon;
    private long market_group;
    private double mass;
    private double packaged_volume;
    private int portion_size;
    private double radius;
    private double volume;
    private double avg_buyorder;
    private double avg_sellorder;
    private double min_buyorder;
    private double max_buyorder;
    private double min_selorder;
    private double max_selorder;
	  
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eView_wishlist.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eView_wishlist.connectionpool;
    }
    
    /**
     * 
     * @return view name for View_wishlist
     */
    public String getTable() { return table; }

    /**
     * 
     * @return View_wishlist class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_wishlist entity
     */
    public eView_wishlist() {
    }

    /**
     * @return is View_wishlist Empty ?
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
     * @return maxprice value
     */
    public double getMaxprice() {
        return this.maxprice;
    }

    /**
     * set maxprice value
     * @param maxprice: new value
     */
    public void setMaxprice(double maxprice) {
        this.maxprice = maxprice;
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
     * @return typegroup value
     */
    public long getTypegroup() {
        return this.typegroup;
    }

    /**
     * set typegroup value
     * @param typegroup: new value
     */
    public void setTypegroup(long typegroup) {
        this.typegroup = typegroup;
    }

    /**
     * 
     * @return published value
     */
    public boolean getPublished() {
        return this.published;
    }

    /**
     * set published value
     * @param published: new value
     */
    public void setPublished(boolean published) {
        this.published = published;
    }

    /**
     * 
     * @return description value
     */
    public java.lang.String getDescription() {
        return this.description;
    }

    /**
     * set description value
     * @param description: new value
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    /**
     * 
     * @return capacity value
     */
    public double getCapacity() {
        return this.capacity;
    }

    /**
     * set capacity value
     * @param capacity: new value
     */
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    /**
     * 
     * @return graphic value
     */
    public long getGraphic() {
        return this.graphic;
    }

    /**
     * set graphic value
     * @param graphic: new value
     */
    public void setGraphic(long graphic) {
        this.graphic = graphic;
    }

    /**
     * 
     * @return icon value
     */
    public long getIcon() {
        return this.icon;
    }

    /**
     * set icon value
     * @param icon: new value
     */
    public void setIcon(long icon) {
        this.icon = icon;
    }

    /**
     * 
     * @return market_group value
     */
    public long getMarket_group() {
        return this.market_group;
    }

    /**
     * set market_group value
     * @param market_group: new value
     */
    public void setMarket_group(long market_group) {
        this.market_group = market_group;
    }

    /**
     * 
     * @return mass value
     */
    public double getMass() {
        return this.mass;
    }

    /**
     * set mass value
     * @param mass: new value
     */
    public void setMass(double mass) {
        this.mass = mass;
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
     * @return portion_size value
     */
    public int getPortion_size() {
        return this.portion_size;
    }

    /**
     * set portion_size value
     * @param portion_size: new value
     */
    public void setPortion_size(int portion_size) {
        this.portion_size = portion_size;
    }

    /**
     * 
     * @return radius value
     */
    public double getRadius() {
        return this.radius;
    }

    /**
     * set radius value
     * @param radius: new value
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * 
     * @return volume value
     */
    public double getVolume() {
        return this.volume;
    }

    /**
     * set volume value
     * @param volume: new value
     */
    public void setVolume(double volume) {
        this.volume = volume;
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

}
