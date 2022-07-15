/*
 * eEvetype.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.5.2022 11:24
 *
 */

package eve.entity;

import data.interfaces.db.AbstractEntity;
import data.interfaces.db.Entity;
import data.interfaces.db.Filedata;
import data.gis.shape.*;
import data.json.piJson;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Iterator;

import eve.eveDatabaseproperties;
import eve.entity.pk.*;
import eve.interfaces.logicentity.IEvetype;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Evetype
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Evetype Entity
 * 
 * @author Franky Laseure
 */
public class eEvetype extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected EvetypePK evetypePK;
    private Market_groupPK market_groupPK;
    private TypegroupPK typegroupPK;
    private GraphicPK graphicPK;
    private java.lang.String name;
    private boolean published;
    private java.lang.String description;
    private double capacity;
    private long icon;
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
    private double average;
    private double highest;
    private double lowest;
    private long order_count;
    private boolean configuredbp;
    private double estimatedproductioncost;
	  
    @Override
    public String getDbtool() {
        return databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return connectionpool;
    }

    public static final String table = "evetype";
	  
    @Override
    public String getTable() { return table; }

    @Override
    public String getClassName() { return this.getClass().getName(); };

    public String getFieldname(short fieldconstant) {
        return IEvetype.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IEvetype.fieldtypes[fieldconstant-1];
    }
        
    public eEvetype() {
    }

    public eEvetype(long id) {
        this.evetypePK = new EvetypePK(id);
    }
  
    public eEvetype(EvetypePK evetypePK) {
        this.evetypePK = evetypePK;
    }

    @Override
    public boolean isEmpty() {
        return this.evetypePK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.evetypePK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.evetypePK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(IEvetype.MARKET_GROUP, this.market_groupPK.getId());

        updates.put(IEvetype.TYPEGROUP, this.typegroupPK.getId());

        updates.put(IEvetype.GRAPHIC, this.graphicPK.getId());

        updates.put(IEvetype.NAME, name);
        updates.put(IEvetype.PUBLISHED, published);
        updates.put(IEvetype.DESCRIPTION, description);
        updates.put(IEvetype.CAPACITY, capacity);
        updates.put(IEvetype.ICON, icon);
        updates.put(IEvetype.MASS, mass);
        updates.put(IEvetype.PACKAGED_VOLUME, packaged_volume);
        updates.put(IEvetype.PORTION_SIZE, portion_size);
        updates.put(IEvetype.RADIUS, radius);
        updates.put(IEvetype.VOLUME, volume);
        updates.put(IEvetype.AVG_BUYORDER, avg_buyorder);
        updates.put(IEvetype.AVG_SELLORDER, avg_sellorder);
        updates.put(IEvetype.MIN_BUYORDER, min_buyorder);
        updates.put(IEvetype.MAX_BUYORDER, max_buyorder);
        updates.put(IEvetype.MIN_SELORDER, min_selorder);
        updates.put(IEvetype.MAX_SELORDER, max_selorder);
        updates.put(IEvetype.AVERAGE, average);
        updates.put(IEvetype.HIGHEST, highest);
        updates.put(IEvetype.LOWEST, lowest);
        updates.put(IEvetype.ORDER_COUNT, order_count);
        updates.put(IEvetype.CONFIGUREDBP, configuredbp);
        updates.put(IEvetype.ESTIMATEDPRODUCTIONCOST, estimatedproductioncost);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return EvetypePK
     */
    @Override
    public EvetypePK getPrimaryKey() {
        return this.evetypePK;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void initName(java.lang.String name) {
        this.name = name;
    }

    public void setName(java.lang.String name) {
	if(name==null && name!=this.name || name!=null && !name.equals(this.name)) {
            updates.put(IEvetype.NAME, name);
        }
        this.name = name;
    }

    public boolean getPublished() {
        return this.published;
    }

    public void initPublished(boolean published) {
        this.published = published;
    }

    public void setPublished(boolean published) {
        updates.put(IEvetype.PUBLISHED, published);
        this.published = published;
    }

    public java.lang.String getDescription() {
        return this.description;
    }

    public void initDescription(java.lang.String description) {
        this.description = description;
    }

    public void setDescription(java.lang.String description) {
	if(description==null && description!=this.description || description!=null && !description.equals(this.description)) {
            updates.put(IEvetype.DESCRIPTION, description);
        }
        this.description = description;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public void initCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setCapacity(double capacity) {
        updates.put(IEvetype.CAPACITY, capacity);
        this.capacity = capacity;
    }

    public long getIcon() {
        return this.icon;
    }

    public void initIcon(long icon) {
        this.icon = icon;
    }

    public void setIcon(long icon) {
        updates.put(IEvetype.ICON, icon);
        this.icon = icon;
    }

    public double getMass() {
        return this.mass;
    }

    public void initMass(double mass) {
        this.mass = mass;
    }

    public void setMass(double mass) {
        updates.put(IEvetype.MASS, mass);
        this.mass = mass;
    }

    public double getPackaged_volume() {
        return this.packaged_volume;
    }

    public void initPackaged_volume(double packaged_volume) {
        this.packaged_volume = packaged_volume;
    }

    public void setPackaged_volume(double packaged_volume) {
        updates.put(IEvetype.PACKAGED_VOLUME, packaged_volume);
        this.packaged_volume = packaged_volume;
    }

    public int getPortion_size() {
        return this.portion_size;
    }

    public void initPortion_size(int portion_size) {
        this.portion_size = portion_size;
    }

    public void setPortion_size(int portion_size) {
        updates.put(IEvetype.PORTION_SIZE, portion_size);
        this.portion_size = portion_size;
    }

    public double getRadius() {
        return this.radius;
    }

    public void initRadius(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        updates.put(IEvetype.RADIUS, radius);
        this.radius = radius;
    }

    public double getVolume() {
        return this.volume;
    }

    public void initVolume(double volume) {
        this.volume = volume;
    }

    public void setVolume(double volume) {
        updates.put(IEvetype.VOLUME, volume);
        this.volume = volume;
    }

    public double getAvg_buyorder() {
        return this.avg_buyorder;
    }

    public void initAvg_buyorder(double avg_buyorder) {
        this.avg_buyorder = avg_buyorder;
    }

    public void setAvg_buyorder(double avg_buyorder) {
        updates.put(IEvetype.AVG_BUYORDER, avg_buyorder);
        this.avg_buyorder = avg_buyorder;
    }

    public double getAvg_sellorder() {
        return this.avg_sellorder;
    }

    public void initAvg_sellorder(double avg_sellorder) {
        this.avg_sellorder = avg_sellorder;
    }

    public void setAvg_sellorder(double avg_sellorder) {
        updates.put(IEvetype.AVG_SELLORDER, avg_sellorder);
        this.avg_sellorder = avg_sellorder;
    }

    public double getMin_buyorder() {
        return this.min_buyorder;
    }

    public void initMin_buyorder(double min_buyorder) {
        this.min_buyorder = min_buyorder;
    }

    public void setMin_buyorder(double min_buyorder) {
        updates.put(IEvetype.MIN_BUYORDER, min_buyorder);
        this.min_buyorder = min_buyorder;
    }

    public double getMax_buyorder() {
        return this.max_buyorder;
    }

    public void initMax_buyorder(double max_buyorder) {
        this.max_buyorder = max_buyorder;
    }

    public void setMax_buyorder(double max_buyorder) {
        updates.put(IEvetype.MAX_BUYORDER, max_buyorder);
        this.max_buyorder = max_buyorder;
    }

    public double getMin_selorder() {
        return this.min_selorder;
    }

    public void initMin_selorder(double min_selorder) {
        this.min_selorder = min_selorder;
    }

    public void setMin_selorder(double min_selorder) {
        updates.put(IEvetype.MIN_SELORDER, min_selorder);
        this.min_selorder = min_selorder;
    }

    public double getMax_selorder() {
        return this.max_selorder;
    }

    public void initMax_selorder(double max_selorder) {
        this.max_selorder = max_selorder;
    }

    public void setMax_selorder(double max_selorder) {
        updates.put(IEvetype.MAX_SELORDER, max_selorder);
        this.max_selorder = max_selorder;
    }

    public double getAverage() {
        return this.average;
    }

    public void initAverage(double average) {
        this.average = average;
    }

    public void setAverage(double average) {
        updates.put(IEvetype.AVERAGE, average);
        this.average = average;
    }

    public double getHighest() {
        return this.highest;
    }

    public void initHighest(double highest) {
        this.highest = highest;
    }

    public void setHighest(double highest) {
        updates.put(IEvetype.HIGHEST, highest);
        this.highest = highest;
    }

    public double getLowest() {
        return this.lowest;
    }

    public void initLowest(double lowest) {
        this.lowest = lowest;
    }

    public void setLowest(double lowest) {
        updates.put(IEvetype.LOWEST, lowest);
        this.lowest = lowest;
    }

    public long getOrder_count() {
        return this.order_count;
    }

    public void initOrder_count(long order_count) {
        this.order_count = order_count;
    }

    public void setOrder_count(long order_count) {
        updates.put(IEvetype.ORDER_COUNT, order_count);
        this.order_count = order_count;
    }

    public boolean getConfiguredbp() {
        return this.configuredbp;
    }

    public void initConfiguredbp(boolean configuredbp) {
        this.configuredbp = configuredbp;
    }

    public void setConfiguredbp(boolean configuredbp) {
        updates.put(IEvetype.CONFIGUREDBP, configuredbp);
        this.configuredbp = configuredbp;
    }

    public double getEstimatedproductioncost() {
        return this.estimatedproductioncost;
    }

    public void initEstimatedproductioncost(double estimatedproductioncost) {
        this.estimatedproductioncost = estimatedproductioncost;
    }

    public void setEstimatedproductioncost(double estimatedproductioncost) {
        updates.put(IEvetype.ESTIMATEDPRODUCTIONCOST, estimatedproductioncost);
        this.estimatedproductioncost = estimatedproductioncost;
    }

    public Market_groupPK getMarket_groupPK() {
        return this.market_groupPK;
    }

    public void initMarket_groupPK(IMarket_groupPK market_groupPK) {
        this.market_groupPK = (Market_groupPK)market_groupPK;
    }

    public void setMarket_groupPK(IMarket_groupPK market_groupPK) {
	if(market_groupPK==null && market_groupPK!=this.market_groupPK || market_groupPK!=null) {
            if(market_groupPK==null) {
                updates.put(IEvetype.MARKET_GROUP, null);
            } else {
                updates.put(IEvetype.MARKET_GROUP, market_groupPK.getId());
            }
        }
        this.market_groupPK = (Market_groupPK)market_groupPK;
    }

    public TypegroupPK getTypegroupPK() {
        return this.typegroupPK;
    }

    public void initTypegroupPK(ITypegroupPK typegroupPK) {
        this.typegroupPK = (TypegroupPK)typegroupPK;
    }

    public void setTypegroupPK(ITypegroupPK typegroupPK) {
	if(typegroupPK==null && typegroupPK!=this.typegroupPK || typegroupPK!=null) {
            if(typegroupPK==null) {
                updates.put(IEvetype.TYPEGROUP, null);
            } else {
                updates.put(IEvetype.TYPEGROUP, typegroupPK.getId());
            }
        }
        this.typegroupPK = (TypegroupPK)typegroupPK;
    }

    public GraphicPK getGraphicPK() {
        return this.graphicPK;
    }

    public void initGraphicPK(IGraphicPK graphicPK) {
        this.graphicPK = (GraphicPK)graphicPK;
    }

    public void setGraphicPK(IGraphicPK graphicPK) {
	if(graphicPK==null && graphicPK!=this.graphicPK || graphicPK!=null) {
            if(graphicPK==null) {
                updates.put(IEvetype.GRAPHIC, null);
            } else {
                updates.put(IEvetype.GRAPHIC, graphicPK.getId());
            }
        }
        this.graphicPK = (GraphicPK)graphicPK;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
