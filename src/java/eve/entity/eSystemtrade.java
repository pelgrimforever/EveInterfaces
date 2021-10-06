/*
 * eSystemtrade.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 6.9.2021 16:29
 *
 */

package eve.entity;

import data.interfaces.db.AbstractEntity;
import data.interfaces.db.EntityInterface;
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

/**
 * Entity class Systemtrade
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Systemtrade Entity
 * 
 * @author Franky Laseure
 */
public class eSystemtrade extends AbstractEntity implements EntityInterface {

    protected SystemtradePK systemtradePK;
    private double profit;
    private double total_cargo_volume;
    private int jumps;
	  
    public static final String table = "systemtrade";
    public static final String SQLWhere1 = "sell_system = :systemtrade.sell_system: and buy_system = :systemtrade.buy_system:";
    public static final String SQLSelect1 = "select systemtrade.* from systemtrade where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from systemtrade where " + SQLWhere1;
    public static final String SQLSelectAll = "select systemtrade.* from systemtrade";
	  
    public String getFieldname(short fieldconstant) {
        return ISystemtrade.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ISystemtrade.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Systemtrade
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Systemtrade (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Systemtrade (=Primarykey)
     */
    public String getSQLSelect1() { return SQLSelect1; };

    /**
     * @return Select statement for Primary key, with count field as result
     * count = 1: exists
     * count = 0: not found
     */
    public String getSQLPKExcists() { return SQLSelectPKexists; };
    
    /**
     * 
     * @return SQL select statement for all Systemtrades
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

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
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.systemtradePK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.systemtradePK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
        updates.put(ISystemtrade.PROFIT, profit);
        updates.put(ISystemtrade.TOTAL_CARGO_VOLUME, total_cargo_volume);
        updates.put(ISystemtrade.JUMPS, jumps);
        return getAllFields();
    }
	
    /* (non-Javadoc)
     * @see .interfaces.db.EntityInterface#getKey()
     */
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return Primary Key Object
     */
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
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
