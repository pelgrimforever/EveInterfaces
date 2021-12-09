/*
 * eEvetype.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 9.11.2021 14:30
 *
 */

package eve.entity;

import eve.eveDatabaseproperties;
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
	  
    public static final String table = "evetype";
	  
    public String getFieldname(short fieldconstant) {
        return IEvetype.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IEvetype.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eEvetype.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eEvetype.connectionpool;
    }
    
    /**
     * 
     * @return table name for Evetype
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Evetype class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Evetype entity
     */
    public eEvetype() {
    }

    /**
     * Constructor
     * build an empty Evetype entity with initialized field values
     */
    public eEvetype(long id) {
        this.evetypePK = new EvetypePK(id);
    }
  
    /**
     * Constructor
     * build an empty Evetype entity with initialized Primarykey parameter
     * @param evetypePK: Evetype Primarykey
     */
    public eEvetype(EvetypePK evetypePK) {
        this.evetypePK = evetypePK;
    }

    /**
     * @return is Evetype Empty ?
     */
    public boolean isEmpty() {
        return this.evetypePK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.evetypePK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.evetypePK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
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
        return getAllFields();
    }
	
    /**
     * @return EvetypePK
     */
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
    public void initName(java.lang.String name) {
        this.name = name;
    }

    /**
     * set name value
     * @param name: new value
     */
    public void setName(java.lang.String name) {
	if(name==null && name!=this.name || name!=null && !name.equals(this.name)) {
            updates.put(IEvetype.NAME, name);
        }
        this.name = name;
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
    public void initPublished(boolean published) {
        this.published = published;
    }

    /**
     * set published value
     * @param published: new value
     */
    public void setPublished(boolean published) {
        updates.put(IEvetype.PUBLISHED, published);
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
    public void initDescription(java.lang.String description) {
        this.description = description;
    }

    /**
     * set description value
     * @param description: new value
     */
    public void setDescription(java.lang.String description) {
	if(description==null && description!=this.description || description!=null && !description.equals(this.description)) {
            updates.put(IEvetype.DESCRIPTION, description);
        }
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
    public void initCapacity(double capacity) {
        this.capacity = capacity;
    }

    /**
     * set capacity value
     * @param capacity: new value
     */
    public void setCapacity(double capacity) {
        updates.put(IEvetype.CAPACITY, capacity);
        this.capacity = capacity;
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
    public void initIcon(long icon) {
        this.icon = icon;
    }

    /**
     * set icon value
     * @param icon: new value
     */
    public void setIcon(long icon) {
        updates.put(IEvetype.ICON, icon);
        this.icon = icon;
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
    public void initMass(double mass) {
        this.mass = mass;
    }

    /**
     * set mass value
     * @param mass: new value
     */
    public void setMass(double mass) {
        updates.put(IEvetype.MASS, mass);
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
    public void initPackaged_volume(double packaged_volume) {
        this.packaged_volume = packaged_volume;
    }

    /**
     * set packaged_volume value
     * @param packaged_volume: new value
     */
    public void setPackaged_volume(double packaged_volume) {
        updates.put(IEvetype.PACKAGED_VOLUME, packaged_volume);
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
    public void initPortion_size(int portion_size) {
        this.portion_size = portion_size;
    }

    /**
     * set portion_size value
     * @param portion_size: new value
     */
    public void setPortion_size(int portion_size) {
        updates.put(IEvetype.PORTION_SIZE, portion_size);
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
    public void initRadius(double radius) {
        this.radius = radius;
    }

    /**
     * set radius value
     * @param radius: new value
     */
    public void setRadius(double radius) {
        updates.put(IEvetype.RADIUS, radius);
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
    public void initVolume(double volume) {
        this.volume = volume;
    }

    /**
     * set volume value
     * @param volume: new value
     */
    public void setVolume(double volume) {
        updates.put(IEvetype.VOLUME, volume);
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
    public void initAvg_buyorder(double avg_buyorder) {
        this.avg_buyorder = avg_buyorder;
    }

    /**
     * set avg_buyorder value
     * @param avg_buyorder: new value
     */
    public void setAvg_buyorder(double avg_buyorder) {
        updates.put(IEvetype.AVG_BUYORDER, avg_buyorder);
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
    public void initAvg_sellorder(double avg_sellorder) {
        this.avg_sellorder = avg_sellorder;
    }

    /**
     * set avg_sellorder value
     * @param avg_sellorder: new value
     */
    public void setAvg_sellorder(double avg_sellorder) {
        updates.put(IEvetype.AVG_SELLORDER, avg_sellorder);
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
    public void initMin_buyorder(double min_buyorder) {
        this.min_buyorder = min_buyorder;
    }

    /**
     * set min_buyorder value
     * @param min_buyorder: new value
     */
    public void setMin_buyorder(double min_buyorder) {
        updates.put(IEvetype.MIN_BUYORDER, min_buyorder);
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
    public void initMax_buyorder(double max_buyorder) {
        this.max_buyorder = max_buyorder;
    }

    /**
     * set max_buyorder value
     * @param max_buyorder: new value
     */
    public void setMax_buyorder(double max_buyorder) {
        updates.put(IEvetype.MAX_BUYORDER, max_buyorder);
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
    public void initMin_selorder(double min_selorder) {
        this.min_selorder = min_selorder;
    }

    /**
     * set min_selorder value
     * @param min_selorder: new value
     */
    public void setMin_selorder(double min_selorder) {
        updates.put(IEvetype.MIN_SELORDER, min_selorder);
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
    public void initMax_selorder(double max_selorder) {
        this.max_selorder = max_selorder;
    }

    /**
     * set max_selorder value
     * @param max_selorder: new value
     */
    public void setMax_selorder(double max_selorder) {
        updates.put(IEvetype.MAX_SELORDER, max_selorder);
        this.max_selorder = max_selorder;
    }

    /**
     * 
     * @return foreign key market_groupPK, instance of Market_groupPK
     */
    public Market_groupPK getMarket_groupPK() {
        return this.market_groupPK;
    }

    /**
     * set foreign key market_group
     * @param market_groupPK: instance of Market_groupPK
     */
    public void initMarket_groupPK(IMarket_groupPK market_groupPK) {
        this.market_groupPK = (Market_groupPK)market_groupPK;
    }

    /**
     * set foreign key market_group
     * @param market_groupPK: instance of Market_groupPK
     */
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

    /**
     * 
     * @return foreign key typegroupPK, instance of TypegroupPK
     */
    public TypegroupPK getTypegroupPK() {
        return this.typegroupPK;
    }

    /**
     * set foreign key typegroup
     * @param typegroupPK: instance of TypegroupPK
     */
    public void initTypegroupPK(ITypegroupPK typegroupPK) {
        this.typegroupPK = (TypegroupPK)typegroupPK;
    }

    /**
     * set foreign key typegroup
     * @param typegroupPK: instance of TypegroupPK
     */
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

    /**
     * 
     * @return foreign key graphicPK, instance of GraphicPK
     */
    public GraphicPK getGraphicPK() {
        return this.graphicPK;
    }

    /**
     * set foreign key graphic
     * @param graphicPK: instance of GraphicPK
     */
    public void initGraphicPK(IGraphicPK graphicPK) {
        this.graphicPK = (GraphicPK)graphicPK;
    }

    /**
     * set foreign key graphic
     * @param graphicPK: instance of GraphicPK
     */
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

    /**
     * 
     * @return Primarykey string value
     */
    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
