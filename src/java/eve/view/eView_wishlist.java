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
	  
    @Override
    public String getDbtool() {
        return eView_wishlist.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eView_wishlist.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eView_wishlist() {
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

    public double getMaxprice() {
        return this.maxprice;
    }

    public void setMaxprice(double maxprice) {
        this.maxprice = maxprice;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public long getTypegroup() {
        return this.typegroup;
    }

    public void setTypegroup(long typegroup) {
        this.typegroup = typegroup;
    }

    public boolean getPublished() {
        return this.published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public java.lang.String getDescription() {
        return this.description;
    }

    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public long getGraphic() {
        return this.graphic;
    }

    public void setGraphic(long graphic) {
        this.graphic = graphic;
    }

    public long getIcon() {
        return this.icon;
    }

    public void setIcon(long icon) {
        this.icon = icon;
    }

    public long getMarket_group() {
        return this.market_group;
    }

    public void setMarket_group(long market_group) {
        this.market_group = market_group;
    }

    public double getMass() {
        return this.mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getPackaged_volume() {
        return this.packaged_volume;
    }

    public void setPackaged_volume(double packaged_volume) {
        this.packaged_volume = packaged_volume;
    }

    public int getPortion_size() {
        return this.portion_size;
    }

    public void setPortion_size(int portion_size) {
        this.portion_size = portion_size;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getVolume() {
        return this.volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getAvg_buyorder() {
        return this.avg_buyorder;
    }

    public void setAvg_buyorder(double avg_buyorder) {
        this.avg_buyorder = avg_buyorder;
    }

    public double getAvg_sellorder() {
        return this.avg_sellorder;
    }

    public void setAvg_sellorder(double avg_sellorder) {
        this.avg_sellorder = avg_sellorder;
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

}
