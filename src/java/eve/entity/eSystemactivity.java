/*
 * eSystemactivity.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 5.3.2022 17:21
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
import eve.interfaces.logicentity.ISystemactivity;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;
import static eve.entity.eAlliance.table;

/**
 * Entity class Systemactivity
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Systemactivity Entity
 * 
 * @author Franky Laseure
 */
public class eSystemactivity extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected SystemactivityPK systemactivityPK;
    private long ship_jumps;
    private long npc_kills;
    private long ship_kills;
    private long pod_kills;
	  
    public static final String table = "systemactivity";
	  
    public String getFieldname(short fieldconstant) {
        return ISystemactivity.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ISystemactivity.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return connectionpool;
    }

    /**
     * 
     * @return Systemactivity class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    @Override
    public String getTable() { return table; }
    
    /** 
     * Constructor
     * Creates an empty Systemactivity entity
     */
    public eSystemactivity() {
    }

    /**
     * Constructor
     * build an empty Systemactivity entity with initialized field values
     */
    public eSystemactivity(long systemid, java.sql.Timestamp timeslot) {
        this.systemactivityPK = new SystemactivityPK(systemid, timeslot);
    }
  
    /**
     * Constructor
     * build an empty Systemactivity entity with initialized Primarykey parameter
     * @param systemactivityPK: Systemactivity Primarykey
     */
    public eSystemactivity(SystemactivityPK systemactivityPK) {
        this.systemactivityPK = systemactivityPK;
    }

    /**
     * @return is Systemactivity Empty ?
     */
    public boolean isEmpty() {
        return this.systemactivityPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.systemactivityPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.systemactivityPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(ISystemactivity.SHIP_JUMPS, ship_jumps);
        updates.put(ISystemactivity.NPC_KILLS, npc_kills);
        updates.put(ISystemactivity.SHIP_KILLS, ship_kills);
        updates.put(ISystemactivity.POD_KILLS, pod_kills);
        return getAllFields();
    }
	
    /**
     * @return SystemactivityPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return SystemactivityPK
     */
    @Override
    public SystemactivityPK getPrimaryKey() {
        return this.systemactivityPK;
    }

    /**
     * 
     * @return ship_jumps value
     */
    public long getShip_jumps() {
        return this.ship_jumps;
    }

    /**
     * set ship_jumps value
     * @param ship_jumps: new value
     */
    public void initShip_jumps(long ship_jumps) {
        this.ship_jumps = ship_jumps;
    }

    /**
     * set ship_jumps value
     * @param ship_jumps: new value
     */
    public void setShip_jumps(long ship_jumps) {
        updates.put(ISystemactivity.SHIP_JUMPS, ship_jumps);
        this.ship_jumps = ship_jumps;
    }

    /**
     * 
     * @return npc_kills value
     */
    public long getNpc_kills() {
        return this.npc_kills;
    }

    /**
     * set npc_kills value
     * @param npc_kills: new value
     */
    public void initNpc_kills(long npc_kills) {
        this.npc_kills = npc_kills;
    }

    /**
     * set npc_kills value
     * @param npc_kills: new value
     */
    public void setNpc_kills(long npc_kills) {
        updates.put(ISystemactivity.NPC_KILLS, npc_kills);
        this.npc_kills = npc_kills;
    }

    /**
     * 
     * @return ship_kills value
     */
    public long getShip_kills() {
        return this.ship_kills;
    }

    /**
     * set ship_kills value
     * @param ship_kills: new value
     */
    public void initShip_kills(long ship_kills) {
        this.ship_kills = ship_kills;
    }

    /**
     * set ship_kills value
     * @param ship_kills: new value
     */
    public void setShip_kills(long ship_kills) {
        updates.put(ISystemactivity.SHIP_KILLS, ship_kills);
        this.ship_kills = ship_kills;
    }

    /**
     * 
     * @return pod_kills value
     */
    public long getPod_kills() {
        return this.pod_kills;
    }

    /**
     * set pod_kills value
     * @param pod_kills: new value
     */
    public void initPod_kills(long pod_kills) {
        this.pod_kills = pod_kills;
    }

    /**
     * set pod_kills value
     * @param pod_kills: new value
     */
    public void setPod_kills(long pod_kills) {
        updates.put(ISystemactivity.POD_KILLS, pod_kills);
        this.pod_kills = pod_kills;
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
