/*
 * eStock.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.11.2021 14:51
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
import eve.interfaces.logicentity.IStock;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Stock
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Stock Entity
 * 
 * @author Franky Laseure
 */
public class eStock extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected StockPK stockPK;
    private long amount;
	  
    public static final String table = "stock";
	  
    public String getFieldname(short fieldconstant) {
        return IStock.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IStock.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eStock.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eStock.connectionpool;
    }
    
    /**
     * 
     * @return table name for Stock
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Stock class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Stock entity
     */
    public eStock() {
    }

    /**
     * Constructor
     * build an empty Stock entity with initialized field values
     */
    public eStock(java.lang.String username, long evetype) {
        this.stockPK = new StockPK(username, evetype);
    }
  
    /**
     * Constructor
     * build an empty Stock entity with initialized Primarykey parameter
     * @param stockPK: Stock Primarykey
     */
    public eStock(StockPK stockPK) {
        this.stockPK = stockPK;
    }

    /**
     * @return is Stock Empty ?
     */
    public boolean isEmpty() {
        return this.stockPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.stockPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.stockPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(IStock.AMOUNT, amount);
        return getAllFields();
    }
	
    /**
     * @return StockPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return StockPK
     */
    @Override
    public StockPK getPrimaryKey() {
        return this.stockPK;
    }

    /**
     * 
     * @return amount value
     */
    public long getAmount() {
        return this.amount;
    }

    /**
     * set amount value
     * @param amount: new value
     */
    public void initAmount(long amount) {
        this.amount = amount;
    }

    /**
     * set amount value
     * @param amount: new value
     */
    public void setAmount(long amount) {
        updates.put(IStock.AMOUNT, amount);
        this.amount = amount;
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
