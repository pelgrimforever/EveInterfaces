/*
 * eTradecombined.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 11.4.2022 9:13
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
import eve.interfaces.logicentity.ITradecombined;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Tradecombined
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Tradecombined Entity
 * 
 * @author Franky Laseure
 */
public class eTradecombined extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected TradecombinedPK tradecombinedPK;
    private int jumps;
    private int jumpslowsec;
    private int jumpsnullsec;
	  
    public static final String table = "tradecombined";
	  
    public String getFieldname(short fieldconstant) {
        return ITradecombined.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ITradecombined.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eTradecombined.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eTradecombined.connectionpool;
    }
    
    /**
     * 
     * @return table name for Tradecombined
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Tradecombined class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Tradecombined entity
     */
    public eTradecombined() {
    }

    /**
     * Constructor
     * build an empty Tradecombined entity with initialized field values
     */
    public eTradecombined(long sell_system, long buy_system, long evetype) {
        this.tradecombinedPK = new TradecombinedPK(sell_system, buy_system, evetype);
    }
  
    /**
     * Constructor
     * build an empty Tradecombined entity with initialized Primarykey parameter
     * @param tradecombinedPK: Tradecombined Primarykey
     */
    public eTradecombined(TradecombinedPK tradecombinedPK) {
        this.tradecombinedPK = tradecombinedPK;
    }

    /**
     * @return is Tradecombined Empty ?
     */
    public boolean isEmpty() {
        return this.tradecombinedPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.tradecombinedPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.tradecombinedPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(ITradecombined.JUMPS, jumps);
        updates.put(ITradecombined.JUMPSLOWSEC, jumpslowsec);
        updates.put(ITradecombined.JUMPSNULLSEC, jumpsnullsec);
        return getAllFields();
    }
	
    /**
     * @return TradecombinedPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return TradecombinedPK
     */
    @Override
    public TradecombinedPK getPrimaryKey() {
        return this.tradecombinedPK;
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
        updates.put(ITradecombined.JUMPS, jumps);
        this.jumps = jumps;
    }

    /**
     * 
     * @return jumpslowsec value
     */
    public int getJumpslowsec() {
        return this.jumpslowsec;
    }

    /**
     * set jumpslowsec value
     * @param jumpslowsec: new value
     */
    public void initJumpslowsec(int jumpslowsec) {
        this.jumpslowsec = jumpslowsec;
    }

    /**
     * set jumpslowsec value
     * @param jumpslowsec: new value
     */
    public void setJumpslowsec(int jumpslowsec) {
        updates.put(ITradecombined.JUMPSLOWSEC, jumpslowsec);
        this.jumpslowsec = jumpslowsec;
    }

    /**
     * 
     * @return jumpsnullsec value
     */
    public int getJumpsnullsec() {
        return this.jumpsnullsec;
    }

    /**
     * set jumpsnullsec value
     * @param jumpsnullsec: new value
     */
    public void initJumpsnullsec(int jumpsnullsec) {
        this.jumpsnullsec = jumpsnullsec;
    }

    /**
     * set jumpsnullsec value
     * @param jumpsnullsec: new value
     */
    public void setJumpsnullsec(int jumpsnullsec) {
        updates.put(ITradecombined.JUMPSNULLSEC, jumpsnullsec);
        this.jumpsnullsec = jumpsnullsec;
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
