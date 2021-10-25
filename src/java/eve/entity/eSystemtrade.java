/*
 * eSystemtrade.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2021 15:16
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
import eve.interfaces.logicentity.ISystemtrade;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Systemtrade
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Systemtrade Entity
 * 
 * @author Franky Laseure
 */
public class eSystemtrade extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected SystemtradePK systemtradePK;
    private double profit;
    private double total_cargo_volume;
    private int jumps;
	  
    public static final String table = "systemtrade";
	  
    public String getFieldname(short fieldconstant) {
        return ISystemtrade.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ISystemtrade.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eSystemtrade.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eSystemtrade.connectionpool;
    }
    
    /**
     * 
     * @return table name for Systemtrade
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Systemtrade class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Systemtrade entity
     */
    public eSystemtrade() {
    }

    /**
     * Constructor
     * build an empty Systemtrade entity with initialized field values
     */
    public eSystemtrade(long sell_system, long buy_system) {
        this.systemtradePK = new SystemtradePK(sell_system, buy_system);
    }
  
    /**
     * Constructor
     * build an empty Systemtrade entity with initialized Primarykey parameter
     * @param systemtradePK: Systemtrade Primarykey
     */
    public eSystemtrade(SystemtradePK systemtradePK) {
        this.systemtradePK = systemtradePK;
    }

    /**
     * @return is Systemtrade Empty ?
     */
    public boolean isEmpty() {
        return this.systemtradePK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.systemtradePK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.systemtradePK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(ISystemtrade.PROFIT, profit);
        updates.put(ISystemtrade.TOTAL_CARGO_VOLUME, total_cargo_volume);
        updates.put(ISystemtrade.JUMPS, jumps);
        return getAllFields();
    }
	
    /**
     * @return SystemtradePK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return SystemtradePK
     */
    @Override
    public SystemtradePK getPrimaryKey() {
        return this.systemtradePK;
    }

    /**
     * 
     * @return profit value
     */
    public double getProfit() {
        return this.profit;
    }

    /**
     * set profit value
     * @param profit: new value
     */
    public void initProfit(double profit) {
        this.profit = profit;
    }

    /**
     * set profit value
     * @param profit: new value
     */
    public void setProfit(double profit) {
        updates.put(ISystemtrade.PROFIT, profit);
        this.profit = profit;
    }

    /**
     * 
     * @return total_cargo_volume value
     */
    public double getTotal_cargo_volume() {
        return this.total_cargo_volume;
    }

    /**
     * set total_cargo_volume value
     * @param total_cargo_volume: new value
     */
    public void initTotal_cargo_volume(double total_cargo_volume) {
        this.total_cargo_volume = total_cargo_volume;
    }

    /**
     * set total_cargo_volume value
     * @param total_cargo_volume: new value
     */
    public void setTotal_cargo_volume(double total_cargo_volume) {
        updates.put(ISystemtrade.TOTAL_CARGO_VOLUME, total_cargo_volume);
        this.total_cargo_volume = total_cargo_volume;
    }

    /**
     * 
     * @return jumps value
     */
    public int getJumps() {
        return this.jumps;
    }

    /**
     * set jumps value
     * @param jumps: new value
     */
    public void initJumps(int jumps) {
        this.jumps = jumps;
    }

    /**
     * set jumps value
     * @param jumps: new value
     */
    public void setJumps(int jumps) {
        updates.put(ISystemtrade.JUMPS, jumps);
        this.jumps = jumps;
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
