/*
 * eStargate.java
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
import eve.interfaces.logicentity.IStargate;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Stargate
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Stargate Entity
 * 
 * @author Franky Laseure
 */
public class eStargate extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected StargatePK stargatePK;
    private SystemPK systemSystemPK;
    private SystemPK systemTo_systemPK;
    private long to_stargate;
    private java.lang.String name;
    private double x;
    private double y;
    private double z;
    private boolean isconstellationborder;
    private boolean isregionborder;
    private java.sql.Date downloaddate;
	  
    public static final String table = "stargate";
	  
    public String getFieldname(short fieldconstant) {
        return IStargate.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IStargate.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eStargate.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eStargate.connectionpool;
    }
    
    /**
     * 
     * @return table name for Stargate
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Stargate class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Stargate entity
     */
    public eStargate() {
    }

    /**
     * Constructor
     * build an empty Stargate entity with initialized field values
     */
    public eStargate(long id) {
        this.stargatePK = new StargatePK(id);
    }
  
    /**
     * Constructor
     * build an empty Stargate entity with initialized Primarykey parameter
     * @param stargatePK: Stargate Primarykey
     */
    public eStargate(StargatePK stargatePK) {
        this.stargatePK = stargatePK;
    }

    /**
     * @return is Stargate Empty ?
     */
    public boolean isEmpty() {
        return this.stargatePK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.stargatePK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.stargatePK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(IStargate.SYSTEM, this.systemSystemPK.getId());

        updates.put(IStargate.TO_SYSTEM, this.systemTo_systemPK.getId());

        updates.put(IStargate.TO_STARGATE, to_stargate);
        updates.put(IStargate.NAME, name);
        updates.put(IStargate.X, x);
        updates.put(IStargate.Y, y);
        updates.put(IStargate.Z, z);
        updates.put(IStargate.ISCONSTELLATIONBORDER, isconstellationborder);
        updates.put(IStargate.ISREGIONBORDER, isregionborder);
        updates.put(IStargate.DOWNLOADDATE, downloaddate);
        return getAllFields();
    }
	
    /**
     * @return StargatePK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return StargatePK
     */
    @Override
    public StargatePK getPrimaryKey() {
        return this.stargatePK;
    }

    /**
     * 
     * @return to_stargate value
     */
    public long getTo_stargate() {
        return this.to_stargate;
    }

    /**
     * set to_stargate value
     * @param to_stargate: new value
     */
    public void initTo_stargate(long to_stargate) {
        this.to_stargate = to_stargate;
    }

    /**
     * set to_stargate value
     * @param to_stargate: new value
     */
    public void setTo_stargate(long to_stargate) {
        updates.put(IStargate.TO_STARGATE, to_stargate);
        this.to_stargate = to_stargate;
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
            updates.put(IStargate.NAME, name);
        }
        this.name = name;
    }

    /**
     * 
     * @return x value
     */
    public double getX() {
        return this.x;
    }

    /**
     * set x value
     * @param x: new value
     */
    public void initX(double x) {
        this.x = x;
    }

    /**
     * set x value
     * @param x: new value
     */
    public void setX(double x) {
        updates.put(IStargate.X, x);
        this.x = x;
    }

    /**
     * 
     * @return y value
     */
    public double getY() {
        return this.y;
    }

    /**
     * set y value
     * @param y: new value
     */
    public void initY(double y) {
        this.y = y;
    }

    /**
     * set y value
     * @param y: new value
     */
    public void setY(double y) {
        updates.put(IStargate.Y, y);
        this.y = y;
    }

    /**
     * 
     * @return z value
     */
    public double getZ() {
        return this.z;
    }

    /**
     * set z value
     * @param z: new value
     */
    public void initZ(double z) {
        this.z = z;
    }

    /**
     * set z value
     * @param z: new value
     */
    public void setZ(double z) {
        updates.put(IStargate.Z, z);
        this.z = z;
    }

    /**
     * 
     * @return isconstellationborder value
     */
    public boolean getIsconstellationborder() {
        return this.isconstellationborder;
    }

    /**
     * set isconstellationborder value
     * @param isconstellationborder: new value
     */
    public void initIsconstellationborder(boolean isconstellationborder) {
        this.isconstellationborder = isconstellationborder;
    }

    /**
     * set isconstellationborder value
     * @param isconstellationborder: new value
     */
    public void setIsconstellationborder(boolean isconstellationborder) {
        updates.put(IStargate.ISCONSTELLATIONBORDER, isconstellationborder);
        this.isconstellationborder = isconstellationborder;
    }

    /**
     * 
     * @return isregionborder value
     */
    public boolean getIsregionborder() {
        return this.isregionborder;
    }

    /**
     * set isregionborder value
     * @param isregionborder: new value
     */
    public void initIsregionborder(boolean isregionborder) {
        this.isregionborder = isregionborder;
    }

    /**
     * set isregionborder value
     * @param isregionborder: new value
     */
    public void setIsregionborder(boolean isregionborder) {
        updates.put(IStargate.ISREGIONBORDER, isregionborder);
        this.isregionborder = isregionborder;
    }

    /**
     * 
     * @return downloaddate value
     */
    public java.sql.Date getDownloaddate() {
        return this.downloaddate;
    }

    /**
     * set downloaddate value
     * @param downloaddate: new value
     */
    public void initDownloaddate(java.sql.Date downloaddate) {
        this.downloaddate = downloaddate;
    }

    /**
     * set downloaddate value
     * @param downloaddate: new value
     */
    public void setDownloaddate(java.sql.Date downloaddate) {
	if(downloaddate==null && downloaddate!=this.downloaddate || downloaddate!=null && !downloaddate.equals(this.downloaddate)) {
            updates.put(IStargate.DOWNLOADDATE, downloaddate);
        }
        this.downloaddate = downloaddate;
    }

    /**
     * 
     * @return foreign key systemPK1, instance of SystemPK
     */
    public SystemPK getSystemsystemPK() {
        return this.systemSystemPK;
    }

    /**
     * set foreign key system
     * @param systemPK: instance of SystemPK
     */
    public void initSystemsystemPK(ISystemPK systemSystemPK) {
        this.systemSystemPK = (SystemPK)systemSystemPK;
    }

    /**
     * set foreign key system
     * @param systemPK: instance of SystemPK
     */
    public void setSystemsystemPK(ISystemPK systemSystemPK) {
	if(systemSystemPK==null && systemSystemPK!=this.systemSystemPK || systemSystemPK!=null) {
            if(systemSystemPK==null) {
                updates.put(IStargate.SYSTEM, null);
            } else {
                updates.put(IStargate.SYSTEM, systemSystemPK.getId());
            }
        }
        this.systemSystemPK = (SystemPK)systemSystemPK;
    }

    /**
     * 
     * @return foreign key systemPK, instance of SystemPK
     */
    public SystemPK getSystemto_systemPK() {
        return this.systemTo_systemPK;
    }

    /**
     * set foreign key system
     * @param systemPK: instance of SystemPK
     */
    public void initSystemto_systemPK(ISystemPK systemTo_systemPK) {
        this.systemTo_systemPK = (SystemPK)systemTo_systemPK;
    }

    /**
     * set foreign key system
     * @param systemPK: instance of SystemPK
     */
    public void setSystemto_systemPK(ISystemPK systemTo_systemPK) {
	if(systemTo_systemPK==null && systemTo_systemPK!=this.systemTo_systemPK || systemTo_systemPK!=null) {
            if(systemTo_systemPK==null) {
                updates.put(IStargate.TO_SYSTEM, null);
            } else {
                updates.put(IStargate.TO_SYSTEM, systemTo_systemPK.getId());
            }
        }
        this.systemTo_systemPK = (SystemPK)systemTo_systemPK;
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
